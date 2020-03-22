package com.powercoder.evaluation.dao;

import com.powercoder.evaluation.entity.PictureDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/8 23:22
 * @description：图片详情Mapper
 */
@Mapper
public interface PictureDetailMapper {

  /**
   * 查找图片信息数量的方法
   *
   * @param pictureDetail 图片的检索信息
   * @return 图片信息数量
   */
  public int findRows(PictureDetail pictureDetail);

  /**
   * 通过页面模板 查找图片信息集合
   *
   * @param module 页面模板
   * @return 图片信息集合
   */
  List<PictureDetail> selectByModule(int module);

  /**
   * 分页显示图片信息
   *
   * @param offset 开始位置
   * @param limit 显示个数
   * @return
   */
  List<PictureDetail> selectAll(
      int offset, int limit, int module, int used, int synchronizeToMoving, String title);

  /**
   * 通过id删除图片
   *
   * @param id 主键
   * @return 删除个数
   */
  int deleteById(int id, int version);

  /**
   * 添加图片详情(修改图片进行删除后添加的操作)
   *
   * @param pictureDetail 图片信息类
   * @return 添加个数
   */
  int insertPicture(PictureDetail pictureDetail);

  /**
   * 修改图片启用状态
   *
   * @param id 主键
   * @return 修改个数
   */
  int updateUsedById(int id, int used);

  /**
   * 通过id主键查找图片详情
   *
   * @param id 主键
   * @return
   */
  PictureDetail selectById(int id);
}
