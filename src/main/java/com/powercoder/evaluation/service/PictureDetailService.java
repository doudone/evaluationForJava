package com.powercoder.evaluation.service;

import com.powercoder.evaluation.dao.PictureDetailMapper;
import com.powercoder.evaluation.entity.Page;
import com.powercoder.evaluation.entity.PictureDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/9 8:24
 * @description：图片信息的服务
 */
@Service
public class PictureDetailService {

  /* 图片详情Mapper */
  @Autowired private PictureDetailMapper pictureDetailMapper;

  /**
   * 查找图片信息的数量的方法(完成)
   *
   * @param pictureDetail 图片的检索信息
   * @return 总数
   */
  public int findRows(PictureDetail pictureDetail) {
    System.out.println(pictureDetail);
    return pictureDetailMapper.findRows(pictureDetail);
  }

  /**
   * 展示轮播图片的方法（实行中）
   *
   * @param module 页面的模型
   * @return 图片信息List
   */
  public List<PictureDetail> showPicture(int module) {
    List<PictureDetail> pictureDetails = pictureDetailMapper.selectByModule(module);
    return pictureDetails;
  }

  /**
   * 展示图片详细信息的方法
   *
   * @param page 分页信息
   * @return 图片信息List
   */
  public List<PictureDetail> showPictureDetail(Page page, PictureDetail pictureDetail) {
    List<PictureDetail> list =
        pictureDetailMapper.selectAll(
            page.getOffset(),
            page.getLimit(),
            pictureDetail.getModule(),
            pictureDetail.getUsed(),
            pictureDetail.getSynchronizeToMoving(),
            pictureDetail.getTitle());
    return list;
  }

  /**
   * 批量删除图片信息
   *
   * @param ids
   */
  public boolean deletePictureDetails(List<Integer> ids) {
    int count = 0;
    for (int id : ids) {
      count = pictureDetailMapper.deleteById(id, 0);
    }
    if (count > 0) {
      return true;
    }
    return false;
  }

  /**
   * 删除图片信息
   *
   * @param pictureDetail 图片信息
   */
  public int deletePictureDetail(PictureDetail pictureDetail) {
    return pictureDetailMapper.deleteById(pictureDetail.getId(), 0);
  }

  /**
   * 插入图片信息
   *
   * @param pictureDetail 图片信息
   * @return 个数
   */
  public int insertPictureDetail(PictureDetail pictureDetail) {
    pictureDetail.setCreateDateTime(new Date());
    int count = pictureDetailMapper.insertPicture(pictureDetail);
    return count;
  }

  /**
   * 更新图片的启用状态
   *
   * @param id 主键
   * @return 个数
   */
  public int updatePictureUsed(int id, int used) {
    int count = 0;
    if (used == 1) {
      count = pictureDetailMapper.updateUsedById(id, 2);
    } else {
      count = pictureDetailMapper.updateUsedById(id, 1);
    }
    return count;
  }

  /**
   * 更新图片信息 通过删除 新增的方式
   *
   * @param newPicture 新版本图片信息
   * @return
   */
  public int updatePicture(PictureDetail newPicture) {
    // 删除旧的图片信息
    int count = pictureDetailMapper.deleteById(newPicture.getId(), newPicture.getVersion());
    // TODO 旧的图片删除失败的处理
    if (count == 0) {
      newPicture.setVersion(0);
    } else {
      newPicture.setVersion(newPicture.getVersion() + 1);
    }
    // 设置属性值
    // 是否同步移动端
    if (newPicture.getSynchronizeToMoving() == 1) {
      // 同步移动端，则两个String相同   进行处理
      newPicture.setMovingPicture(newPicture.getPicture());
    }
    newPicture.setCreateUser(newPicture.getCreateUser());
    newPicture.setCreateDateTime(newPicture.getCreateDateTime());
    int i = pictureDetailMapper.insertPicture(newPicture);
    System.out.println("修改图片情况" + i);
    return i;
  };

  /**
   * 通过id查找图片信息
   *
   * @param id 主键
   * @return 图片信息
   */
  public PictureDetail findById(int id) {
    return pictureDetailMapper.selectById(id);
  }
}
