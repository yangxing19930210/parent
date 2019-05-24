package com.sekorm.smprog.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 关联ON的查询条件
 *
 * @author polite_lu
 * @aate 2019-01-18
 */
public class OnProgramSearchVO {

    private String brandName;

    private String productWire;

    private String orderNumber;

    private Integer spId;

    private Integer categoryId;

    private List<Integer> operateType = new ArrayList<>();

    private List<Integer> ecmOperateType = new ArrayList<>();

    private List<Integer> verifyStatus = new ArrayList<>();

    private List<Integer> associateStatus = new ArrayList<>();

    private Integer associateType ;

    private Integer iDisplayStart;

    private Integer iDisplayLength;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductWire() {
        return productWire;
    }

    public void setProductWire(String productWire) {
        this.productWire = productWire;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public List<Integer> getOperateType() {
        return operateType;
    }

    public void setOperateType(List<Integer> operateType) {
        this.operateType = operateType;
    }

    public List<Integer> getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(List<Integer> verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public List<Integer> getAssociateStatus() {
        return associateStatus;
    }

    public void setAssociateStatus(List<Integer> associateStatus) {
        this.associateStatus = associateStatus;
        if (associateStatus != null) {
            if (associateStatus.containsAll(Arrays.asList(0, 1))) {
                //全部条件，等同于
                associateType = 2;
            }
            if (associateStatus.size() == 1 && associateStatus.contains(1)) {
                associateType = 1;
            }
            if (associateStatus.size() == 1 && associateStatus.contains(0)) {
                associateType = 0;
            }
        }else {
            //全部条件
            associateType = null;
        }
    }

    public Integer getAssociateType() {
        return associateType;
    }

    public void setAssociateType(Integer associateType) {
        this.associateType = associateType;
    }

    public List<Integer> getEcmOperateType() {
        return ecmOperateType;
    }

    public void setEcmOperateType(List<Integer> ecmOperateType) {
        this.ecmOperateType = ecmOperateType;
    }

    public Integer getiDisplayStart() {
        return iDisplayStart;
    }

    public void setiDisplayStart(Integer iDisplayStart) {
        this.iDisplayStart = iDisplayStart;
    }

    public Integer getiDisplayLength() {
        return iDisplayLength;
    }

    public void setiDisplayLength(Integer iDisplayLength) {
        this.iDisplayLength = iDisplayLength;
    }
}
