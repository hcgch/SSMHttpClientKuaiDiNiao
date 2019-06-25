package com.suoron.ssm.dao.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order_detail")
public class TbOrderDetail {
    @Id
    private Integer id;

    @Column(name = "goods_date")
    private Date goodsDate;

    @Column(name = "o_orderid")
    private Integer oOrderid;

    private Integer goodsid;

    private String goodsname;

    private Double goodsprice;

    @Column(name = "goods_description")
    private String goodsDescription;

    private Integer goodsnum;

    private String goodspic;

    @Column(name = "goods_total_price")
    private Double goodsTotalPrice;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return goods_date
     */
    public Date getGoodsDate() {
        return goodsDate;
    }

    /**
     * @param goodsDate
     */
    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
    }

    /**
     * @return o_orderid
     */
    public Integer getoOrderid() {
        return oOrderid;
    }

    /**
     * @param oOrderid
     */
    public void setoOrderid(Integer oOrderid) {
        this.oOrderid = oOrderid;
    }

    /**
     * @return goodsid
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * @param goodsid
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * @return goodsname
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * @param goodsname
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * @return goodsprice
     */
    public Double getGoodsprice() {
        return goodsprice;
    }

    /**
     * @param goodsprice
     */
    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    /**
     * @return goods_description
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /**
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription == null ? null : goodsDescription.trim();
    }

    /**
     * @return goodsnum
     */
    public Integer getGoodsnum() {
        return goodsnum;
    }

    /**
     * @param goodsnum
     */
    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    /**
     * @return goodspic
     */
    public String getGoodspic() {
        return goodspic;
    }

    /**
     * @param goodspic
     */
    public void setGoodspic(String goodspic) {
        this.goodspic = goodspic == null ? null : goodspic.trim();
    }

    /**
     * @return goods_total_price
     */
    public Double getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    /**
     * @param goodsTotalPrice
     */
    public void setGoodsTotalPrice(Double goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }
}