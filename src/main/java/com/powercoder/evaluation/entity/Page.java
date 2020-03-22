package com.powercoder.evaluation.entity;

/**
 * @author ：Done
 * @date ：Created in 2020/3/8 23:19
 * @description：分页用实体类
 */
public class Page {
  /* 当前页码 */
  private int current = 1;
  /* 默认显示数量 */
  private int limit = 10;
  /* 数据总数 */
  private int rows;
  /* 分页的路径（复用分页链接） */
  private String path;

  public int getCurrent() {
    return current;
  }

  public void setCurrent(int current) {
    if (current >= 1) {
      this.current = current;
    }
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    if (limit >= 1 && limit <= 100) {
      this.limit = limit;
    }
  }

  public int getRows() {
    return rows;
  }

  public void setRows(int rows) {
    if (rows >= 0) {
      this.rows = rows;
    }
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  /**
   * 获取当前页码的起始行
   *
   * @return
   */
  public int getOffset() {
    return (current - 1) * limit;
  }

  /**
   * 获取总页数
   *
   * @return
   */
  public int getTotal() {
    int total;
    return total = rows % limit == 0 ? rows / limit : (rows / limit) + 1;
  }

  /**
   * 获取起始页
   *
   * @return
   */
  public int getFrom() {
    int from;
    if (current > getTotal() - 2 && getTotal() > 4) {
      return getTotal() - 4;
    }
    return from = current < 3 ? 1 : current - 2;
  }

  /**
   * 获取结束页
   *
   * @return
   */
  public int getTo() {
    int to;
    if (getFrom() == 1 && getTotal() > 4) {
      return to = 5;
    }
    return to = current > getTotal() - 2 ? getTotal() : current + 2;
  }

  @Override
  public String toString() {
    return "Page{"
        + "current="
        + current
        + ", limit="
        + limit
        + ", rows="
        + rows
        + ", path='"
        + path
        + '\''
        + '}';
  }
}
