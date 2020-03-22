package com.powercoder.evaluation.entity;

import java.util.List;

/**
 * @author ：Done
 * @date ：Created in 2020/3/19 22:00
 * @description：辅助批量删除操作的实体类
 */
public class PrictureIds {
  private List<String> id;

  public List<String> getId() {
    return id;
  }

  public void setId(List<String> id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "PrictureIds{" + "id=" + id + '}';
  }
}
