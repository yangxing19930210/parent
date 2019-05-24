package com.sekorm.spms.ismprog.dubbo.beans;

import java.io.Serializable;

public class OnProgCategoryDI implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4430890731734765697L;

	/** 服务商ID **/
	private Integer spId;
	
	/** ON **/
	private String orderNumber;
	
	/** 类别ID **/
	private Integer categoryId;
	
	/** 审核状态  0待审核  1 通过  2 拒绝 **/
	private Integer verifyStatus;
	
	/** 拒绝理由 **/
	private String verifyDesc;
	/** ecm上架状态 */
	private Integer ecmOperateType;

	public Integer getSpId() {
		return spId;
	}

	public void setSpId(Integer spId) {
		this.spId = spId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getVerifyStatus() {
		return verifyStatus;
	}

	public void setVerifyStatus(Integer verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public String getVerifyDesc() {
		return verifyDesc;
	}

	public void setVerifyDesc(String verifyDesc) {
		this.verifyDesc = verifyDesc;
	}

	public Integer getEcmOperateType() {
		return ecmOperateType;
	}

	public void setEcmOperateType(Integer ecmOperateType) {
		this.ecmOperateType = ecmOperateType;
	}
}
