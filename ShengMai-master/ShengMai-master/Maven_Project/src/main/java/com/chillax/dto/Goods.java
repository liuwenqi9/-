package com.chillax.dto;

import java.math.BigDecimal;

public class Goods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goodid
     *
     * @mbg.generated
     */
    private Integer goodid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.pic
     *
     * @mbg.generated
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.sold
     *
     * @mbg.generated
     */
    private Integer sold;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goodflag
     *
     * @mbg.generated
     */
    private Integer goodflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goodtypeid
     *
     * @mbg.generated
     */
    private String goodtypeid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goodid
     *
     * @return the value of goods.goodid
     *
     * @mbg.generated
     */
    public Integer getGoodid() {
        return goodid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goodid
     *
     * @param goodid the value for goods.goodid
     *
     * @mbg.generated
     */
    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.name
     *
     * @return the value of goods.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.name
     *
     * @param name the value for goods.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.pic
     *
     * @return the value of goods.pic
     *
     * @mbg.generated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.pic
     *
     * @param pic the value for goods.pic
     *
     * @mbg.generated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.sold
     *
     * @return the value of goods.sold
     *
     * @mbg.generated
     */
    public Integer getSold() {
        return sold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.sold
     *
     * @param sold the value for goods.sold
     *
     * @mbg.generated
     */
    public void setSold(Integer sold) {
        this.sold = sold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.price
     *
     * @return the value of goods.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.price
     *
     * @param price the value for goods.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goodflag
     *
     * @return the value of goods.goodflag
     *
     * @mbg.generated
     */
    public Integer getGoodflag() {
        return goodflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goodflag
     *
     * @param goodflag the value for goods.goodflag
     *
     * @mbg.generated
     */
    public void setGoodflag(Integer goodflag) {
        this.goodflag = goodflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goodtypeid
     *
     * @return the value of goods.goodtypeid
     *
     * @mbg.generated
     */
    public String getGoodtypeid() {
        return goodtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goodtypeid
     *
     * @param goodtypeid the value for goods.goodtypeid
     *
     * @mbg.generated
     */
    public void setGoodtypeid(String goodtypeid) {
        this.goodtypeid = goodtypeid == null ? null : goodtypeid.trim();
    }
}