package com.powercoder.evaluation.controller;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.powercoder.evaluation.entity.Page;
import com.powercoder.evaluation.entity.PictureDetail;
import com.powercoder.evaluation.entity.PrictureIds;
import com.powercoder.evaluation.entity.form.ShowPictureDetailInForm;
import com.powercoder.evaluation.service.PictureDetailService;
import com.powercoder.evaluation.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author ：Done
 * @date ：Created in 2020/3/9 7:53
 * @description：图片信息的控制器
 */
@Controller
@ResponseBody
public class PictureDetailController {

  @Autowired private PictureDetailService pictureDetailService;

  @Autowired private Gson gson;

  /** 方法测试 访问 http://localhost:8443/api/banner/test */
  @CrossOrigin
  @RequestMapping(value = "/api/banner/test")
  public String test() {
    System.out.println("成功");
    return "成功";
  }

  /**
   * 展示页面头部信息的方法（完成）
   *
   * @param module 页面模型
   * @return 图片List
   */
  @CrossOrigin
  @GetMapping(value = "/api/banner/showPicture")
  public List<PictureDetail> showPicture(int module) {
    System.out.println(module);
    List<PictureDetail> list = pictureDetailService.showPicture(module);
    return list;
  }

  @CrossOrigin
  @PostMapping(value = "/api/banner/getTotal")
  @ResponseBody
  public int getTotal(@RequestBody String request) {
    PictureDetail pictureDetail =
        gson.fromJson(request, new TypeToken<PictureDetail>() {}.getType());
    System.out.println(pictureDetail);
    return pictureDetailService.findRows(pictureDetail);
  }

  /**
   * 分页显示图片详情（完成）
   *
   * @param request 请求对象
   * @return 图片详情List
   */
  @CrossOrigin
  @PostMapping(value = "/api/banner/showPictureDetail")
  @ResponseBody
  public List<PictureDetail> showPictureDetail(@RequestBody String request) {
    System.out.println(request);
    // 工具类  用来将JSON转换成对象
    //        new GsonBuilder()
    //            .serializeNulls() // 序列化为null对象
    //            .setDateFormat("yyyy-MM-dd") // 设置日期的格式
    //            .disableHtmlEscaping() // 防止对网址乱码 忽略对特殊字符的转换
    //            .create();
    ShowPictureDetailInForm inForm =
        gson.fromJson(request, new TypeToken<ShowPictureDetailInForm>() {}.getType());
    PictureDetail pictureDetail = inForm.getPictureDetail();
    Page page = inForm.getPage();
    System.out.println(pictureDetail);
    System.out.println(page);
    System.out.println(pictureDetail);
    page.setPath("/api/banner/showPictureDetail");
    // 查找数据数量
    page.setRows(pictureDetailService.findRows(pictureDetail));
    System.out.println(page);
    // TODO 数据数量为0的处理

    // 查找数据详情
    List<PictureDetail> list = pictureDetailService.showPictureDetail(page, pictureDetail);
    return list;
  }

  /**
   * 更新是否启用的状态 used：1启用 used:2禁用（成功）
   *
   * @param request 请求对象
   * @return
   */
  @CrossOrigin
  @PostMapping(value = "/api/banner/changeUsed")
  @ResponseBody
  public boolean changeUsed(@RequestBody String request) {
    PictureDetail pictureDetail = JSON.parseObject(request, PictureDetail.class);
    int count =
        pictureDetailService.updatePictureUsed(pictureDetail.getId(), pictureDetail.getUsed());
    boolean changed = false;
    if (count == 1) {
      changed = true;
    } else {
      System.out.println("更新是否生效状态失败");
    }
    return changed;
  }

  /**
   * 插入图片的方法 (完成)
   *
   * @param request 请求对象
   * @return
   */
  @CrossOrigin
  @PostMapping(value = "/api/banner/insertPicture")
  @ResponseBody
  public boolean insertPicture(@RequestBody String request) {
    PictureDetail pictureDetail =
        gson.fromJson(request, new TypeToken<PictureDetail>() {}.getType());
    // 传递的参数合法  不合法参数之后补充
    if (!Objects.isNull(pictureDetail)) {
      int count = pictureDetailService.insertPictureDetail(pictureDetail);
      // 更新成功
      if (count > 0) {
        return true;
      }
    }
    return false;
  }

  /**
   * @param req
   * @return
   */
  @CrossOrigin
  @PostMapping(value = "/api/banner/deletePictures")
  @ResponseBody
  public boolean deletePictures(@RequestBody String req) {
    PrictureIds ids = JSON.parseObject(req, PrictureIds.class);
    System.out.println(ids);
    List<Integer> pricutreIds = new ArrayList<>();
    ids.getId().forEach(a -> pricutreIds.add(Integer.parseInt(a)));
    return pictureDetailService.deletePictureDetails(pricutreIds);
  }

  /**
   * 删除图片的方法 （完成）
   *
   * @param request 请求数据
   * @return
   */
  @CrossOrigin
  @PostMapping(value = "/api/banner/deletePicture")
  @ResponseBody
  public boolean deletePicture(@RequestBody String request) {
    PictureDetail pictureDetail =
        new Gson().fromJson(request, new TypeToken<PictureDetail>() {}.getType());
    System.out.println(pictureDetail);
    int count = pictureDetailService.deletePictureDetail(pictureDetail);
    if (count > 0) {
      // 删除成功
      return true;
    }
    return false;
  }

  /**
   * 修改图片的方法（完成）
   *
   * @param request 新图片信息
   * @return
   */
  @CrossOrigin
  @PostMapping(value = "/api/banner/updatePicture")
  @ResponseBody
  public boolean updatePicture(@RequestBody String request) {
    System.out.println("新图片信息request=" + request);
    PictureDetail pictureDetail = JSON.parseObject(request, PictureDetail.class);
    // PictureDetail pictureDetail = new Gson().fromJson(request, PictureDetail.class);
    System.out.println("pictureDetail=" + pictureDetail);
    int count = pictureDetailService.updatePicture(pictureDetail);
    if (count > 0) {
      // 更新
      return true;
    }
    return false;
  }

  /**
   * 通过主键查找图片信息
   *
   * @param id 主键
   * @return
   */
  @CrossOrigin
  @GetMapping(value = "/api/banner/findById")
  @ResponseBody
  public PictureDetail findById(int id) {
    return pictureDetailService.findById(id);
  }

  @CrossOrigin
  @PostMapping("api/testUpload")
  @ResponseBody
  public String coversUpload(MultipartFile file) throws Exception {
    String folder = "D:\\work\\workspace\\evaluation-vue\\static\\images\\updatePicture";
    String fileName = "";
    File imageFolder = new File(folder);
    File f =
        new File(
            imageFolder,
            StringUtils.getRandomString(6)
                + file.getOriginalFilename().substring(file.getOriginalFilename().length() - 4));
    if (!f.getParentFile().exists()) f.getParentFile().mkdirs();
    try {
      file.transferTo(f);
      fileName = f.getName();
      System.out.println(fileName);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return fileName;
  }
}
