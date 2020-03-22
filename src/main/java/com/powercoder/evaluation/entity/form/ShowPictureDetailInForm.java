package com.powercoder.evaluation.entity.form;

import com.powercoder.evaluation.entity.Page;
import com.powercoder.evaluation.entity.PictureDetail;

/**
 * @author ：Done
 * @date ：Created in 2020/3/13 22:46
 * @description：1
 */
public class ShowPictureDetailInForm {
  private Page page;
  private PictureDetail pictureDetail;

  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public PictureDetail getPictureDetail() {
    return pictureDetail;
  }

  public void setPictureDetail(PictureDetail pictureDetail) {
    this.pictureDetail = pictureDetail;
  }

  @Override
  public String toString() {
    return "ShowPictureDetailInForm{" + "page=" + page + ", pictureDetail=" + pictureDetail + '}';
  }
}
