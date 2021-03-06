package com.chillax.dto;

import java.math.BigDecimal;
import java.util.Date;

public class Orderdetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.orderdetailid
     *
     * @mbg.generated
     */
    private Long orderdetailid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.orderdetailsum
     *
     * @mbg.generated
     */
    private BigDecimal orderdetailsum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.orderdetailcontent
     *
     * @mbg.generated
     */
    private String orderdetailcontent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.orderdetailflag
     *
     * @mbg.generated
     */
    private Integer orderdetailflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.wxid
     *
     * @mbg.generated
     */
    private String wxid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.shopname
     *
     * @mbg.generated
     */
    private String shopname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.shopphone
     *
     * @mbg.generated
     */
    private String shopphone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.orderdetailstate
     *
     * @mbg.generated
     */
    private String orderdetailstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.ordertime
     *
     * @mbg.generated
     */
    private Date ordertime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.addressid
     *
     * @mbg.generated
     */
    private Integer addressid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.id
     *
     * @return the value of orderdetail.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.id
     *
     * @param id the value for orderdetail.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.orderdetailid
     *
     * @return the value of orderdetail.orderdetailid
     *
     * @mbg.generated
     */
    public Long getOrderdetailid() {
        return orderdetailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.orderdetailid
     *
     * @param orderdetailid the value for orderdetail.orderdetailid
     *
     * @mbg.generated
     */
    public void setOrderdetailid(Long orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.orderdetailsum
     *
     * @return the value of orderdetail.orderdetailsum
     *
     * @mbg.generated
     */
    public BigDecimal getOrderdetailsum() {
        return orderdetailsum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.orderdetailsum
     *
     * @param orderdetailsum the value for orderdetail.orderdetailsum
     *
     * @mbg.generated
     */
    public void setOrderdetailsum(BigDecimal orderdetailsum) {
        this.orderdetailsum = orderdetailsum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.orderdetailcontent
     *
     * @return the value of orderdetail.orderdetailcontent
     *
     * @mbg.generated
     */
    public String getOrderdetailcontent() {
        return orderdetailcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.orderdetailcontent
     *
     * @param orderdetailcontent the value for orderdetail.orderdetailcontent
     *
     * @mbg.generated
     */
    public void setOrderdetailcontent(String orderdetailcontent) {
        this.orderdetailcontent = orderdetailcontent == null ? null : orderdetailcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.orderdetailflag
     *
     * @return the value of orderdetail.orderdetailflag
     *
     * @mbg.generated
     */
    public Integer getOrderdetailflag() {
        return orderdetailflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.orderdetailflag
     *
     * @param orderdetailflag the value for orderdetail.orderdetailflag
     *
     * @mbg.generated
     */
    public void setOrderdetailflag(Integer orderdetailflag) {
        this.orderdetailflag = orderdetailflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.wxid
     *
     * @return the value of orderdetail.wxid
     *
     * @mbg.generated
     */
    public String getWxid() {
        return wxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.wxid
     *
     * @param wxid the value for orderdetail.wxid
     *
     * @mbg.generated
     */
    public void setWxid(String wxid) {
        this.wxid = wxid == null ? null : wxid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.shopname
     *
     * @return the value of orderdetail.shopname
     *
     * @mbg.generated
     */
    public String getShopname() {
        return shopname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.shopname
     *
     * @param shopname the value for orderdetail.shopname
     *
     * @mbg.generated
     */
    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.shopphone
     *
     * @return the value of orderdetail.shopphone
     *
     * @mbg.generated
     */
    public String getShopphone() {
        return shopphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.shopphone
     *
     * @param shopphone the value for orderdetail.shopphone
     *
     * @mbg.generated
     */
    public void setShopphone(String shopphone) {
        this.shopphone = shopphone == null ? null : shopphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.orderdetailstate
     *
     * @return the value of orderdetail.orderdetailstate
     *
     * @mbg.generated
     */
    public String getOrderdetailstate() {
        return orderdetailstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.orderdetailstate
     *
     * @param orderdetailstate the value for orderdetail.orderdetailstate
     *
     * @mbg.generated
     */
    public void setOrderdetailstate(String orderdetailstate) {
        this.orderdetailstate = orderdetailstate == null ? null : orderdetailstate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.ordertime
     *
     * @return the value of orderdetail.ordertime
     *
     * @mbg.generated
     */
    public Date getOrdertime() {
        return ordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.ordertime
     *
     * @param ordertime the value for orderdetail.ordertime
     *
     * @mbg.generated
     */
    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.addressid
     *
     * @return the value of orderdetail.addressid
     *
     * @mbg.generated
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.addressid
     *
     * @param addressid the value for orderdetail.addressid
     *
     * @mbg.generated
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }
}