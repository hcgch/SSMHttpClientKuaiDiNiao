package com.suoron.ssm.dao.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order")
public class TbOrder {
    @Id
    private Integer id;

    @Column(name = "o_sendtype")
    private String oSendtype;

    @Column(name = "o_paytype")
    private String oPaytype;

    @Column(name = "o_paycount")
    private Double oPaycount;

    @Column(name = "o_orderdate")
    private Date oOrderdate;

    @Column(name = "o_checkstate")
    private Integer oCheckstate;

    @Column(name = "o_checkdate")
    private Date oCheckdate;

    @Column(name = "o_checkperson")
    private String oCheckperson;

    private Integer userid;

    @Column(name = "o_shperson")
    private String oShperson;

    @Column(name = "o_shphone")
    private String oShphone;

    @Column(name = "o_shaddress")
    private String oShaddress;

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
     * @return o_sendtype
     */
    public String getoSendtype() {
        return oSendtype;
    }

    /**
     * @param oSendtype
     */
    public void setoSendtype(String oSendtype) {
        this.oSendtype = oSendtype == null ? null : oSendtype.trim();
    }

    /**
     * @return o_paytype
     */
    public String getoPaytype() {
        return oPaytype;
    }

    /**
     * @param oPaytype
     */
    public void setoPaytype(String oPaytype) {
        this.oPaytype = oPaytype == null ? null : oPaytype.trim();
    }

    /**
     * @return o_paycount
     */
    public Double getoPaycount() {
        return oPaycount;
    }

    /**
     * @param oPaycount
     */
    public void setoPaycount(Double oPaycount) {
        this.oPaycount = oPaycount;
    }

    /**
     * @return o_orderdate
     */
    public Date getoOrderdate() {
        return oOrderdate;
    }

    /**
     * @param oOrderdate
     */
    public void setoOrderdate(Date oOrderdate) {
        this.oOrderdate = oOrderdate;
    }

    /**
     * @return o_checkstate
     */
    public Integer getoCheckstate() {
        return oCheckstate;
    }

    /**
     * @param oCheckstate
     */
    public void setoCheckstate(Integer oCheckstate) {
        this.oCheckstate = oCheckstate;
    }

    /**
     * @return o_checkdate
     */
    public Date getoCheckdate() {
        return oCheckdate;
    }

    /**
     * @param oCheckdate
     */
    public void setoCheckdate(Date oCheckdate) {
        this.oCheckdate = oCheckdate;
    }

    /**
     * @return o_checkperson
     */
    public String getoCheckperson() {
        return oCheckperson;
    }

    /**
     * @param oCheckperson
     */
    public void setoCheckperson(String oCheckperson) {
        this.oCheckperson = oCheckperson == null ? null : oCheckperson.trim();
    }

    /**
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return o_shperson
     */
    public String getoShperson() {
        return oShperson;
    }

    /**
     * @param oShperson
     */
    public void setoShperson(String oShperson) {
        this.oShperson = oShperson == null ? null : oShperson.trim();
    }

    /**
     * @return o_shphone
     */
    public String getoShphone() {
        return oShphone;
    }

    /**
     * @param oShphone
     */
    public void setoShphone(String oShphone) {
        this.oShphone = oShphone == null ? null : oShphone.trim();
    }

    /**
     * @return o_shaddress
     */
    public String getoShaddress() {
        return oShaddress;
    }

    /**
     * @param oShaddress
     */
    public void setoShaddress(String oShaddress) {
        this.oShaddress = oShaddress == null ? null : oShaddress.trim();
    }
}