//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.03 at 11:53:16 AM CST 
//
package com.ruoyi.yz.wuliu.ydkj.apply;

import com.ruoyi.yz.base.BaseCif;
import com.ruoyi.yz.support.XmlDateSupport;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}orderNo"/>
 *         &lt;element ref="{}declareTime"/>
 *         &lt;element ref="{}receiptTime"/>
 *         &lt;element ref="{}successFlag"/>
 *         &lt;element ref="{}remark"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderNo",
    "declareTime",
    "receiptTime",
    "successFlag",
    "remark"
})
@XmlRootElement(name = "declareResult")
public class YdApplyAsyncDeclareResult extends BaseCif{

    @XmlElement(required = true)
    private String orderNo;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(value = XmlDateSupport.class)
    private Date declareTime;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(value = XmlDateSupport.class)
    private Date receiptTime;
    @XmlElement(required = true)
    private Integer successFlag;
    @XmlElement(required = true)
    private String remark;

    /**
     * @return the orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo the orderNo to set
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return the declareTime
     */
    public Date getDeclareTime() {
        return declareTime;
    }

    /**
     * @param declareTime the declareTime to set
     */
    public void setDeclareTime(Date declareTime) {
        this.declareTime = declareTime;
    }

    /**
     * @return the receiptTime
     */
    public Date getReceiptTime() {
        return receiptTime;
    }

    /**
     * @param receiptTime the receiptTime to set
     */
    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    /**
     * @return the successFlag
     */
    public Integer getSuccessFlag() {
        return successFlag;
    }

    /**
     * @param successFlag the successFlag to set
     */
    public void setSuccessFlag(Integer successFlag) {
        this.successFlag = successFlag;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

}
