package com.sekorm.smprog.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 可编程ON定制参数 
 *
 * @author polite_lu
 * @date 2019/02/15
 */
public class ProgramElement {
    /**
     * 表单主键
     */
    private Integer id;

    /**
     * ON的id
     */
    private Integer onId;

    /**
     * 模板code  约定好的值
     */
    private Integer templateCode;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 总价
     */
    private BigDecimal totalPrice;

    /**
     * 烧录工时
     */
    private BigDecimal workHours;

    /**
     * 创建人姓名
     */
    private String creatorName;

    /**
     * 创建人ID
     */
    private Integer creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private Integer updator;

    /**
     * 更新人姓名
     */
    private String updateName;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 扩展属性（json格式串 list）
     */
    private String extendTribute;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOnId() {
        return onId;
    }

    public void setOnId(Integer onId) {
        this.onId = onId;
    }

    public Integer getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(Integer templateCode) {
        this.templateCode = templateCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getWorkHours() {
        return workHours;
    }

    public void setWorkHours(BigDecimal workHours) {
        this.workHours = workHours;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdator() {
        return updator;
    }

    public void setUpdator(Integer updator) {
        this.updator = updator;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getExtendTribute() {
        return extendTribute;
    }

    public void setExtendTribute(String extendTribute) {
        this.extendTribute = extendTribute == null ? null : extendTribute.trim();
    }
}