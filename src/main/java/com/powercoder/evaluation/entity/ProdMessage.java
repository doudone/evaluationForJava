package com.powercoder.evaluation.entity;

/**
 * @author ：huxinyue
 * @date ：Created in 2020/3/10 20:24
 * @description：${description}
 */
public class ProdMessage {

    int prod_id;
    int level2_id;
    String prod_name;
    int prod_price;
    String prod_url;

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public int getLevel2_id() {
        return level2_id;
    }

    public void setLevel2_id(int level2_id) {
        this.level2_id = level2_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public int getProd_price() {
        return prod_price;
    }

    public void setProd_price(int prod_price) {
        this.prod_price = prod_price;
    }

    public String getProd_url() {
        return prod_url;
    }

    public void setProd_url(String prod_url) {
        this.prod_url = prod_url;
    }
}
