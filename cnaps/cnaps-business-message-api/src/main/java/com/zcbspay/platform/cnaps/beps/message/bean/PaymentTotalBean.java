package com.zcbspay.platform.cnaps.beps.message.bean;

import java.io.Serializable;

/**
 * 代收明细主键 Class Description
 *
 * @author guojia
 * @version
 * @date 2017年2月23日 下午4:43:52
 * @since
 */
public class PaymentTotalBean implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 723772656404937124L;
	/**
	 * 付款人名称
	 */
	private String debtorName;
	/**
	 * 付款人账号
	 */
	private String debtorAccountNo;
	/**
	 * 付款清算行行号
	 */
	private String debtorAgentCode;
	/**
	 * 付款行行号
	 */
	private String debtorBranchCode;
	/**
	 * 收款清算行行号
	 */
	private String creditorAgentCode;
	/**
	 * 总金额
	 */
	private String totalAmount;
	/**
	 * 业务类型编码
	 */
	private String categoryPurposeCode;
	/**
	 * 收款人数目
	 */
	private String creditorNumber;
	/**
	 * 原代付批次号
	 */
	private String batchNo;
	public String getDebtorName() {
		return debtorName;
	}
	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}
	public String getDebtorAccountNo() {
		return debtorAccountNo;
	}
	public void setDebtorAccountNo(String debtorAccountNo) {
		this.debtorAccountNo = debtorAccountNo;
	}
	public String getDebtorAgentCode() {
		return debtorAgentCode;
	}
	public void setDebtorAgentCode(String debtorAgentCode) {
		this.debtorAgentCode = debtorAgentCode;
	}
	public String getDebtorBranchCode() {
		return debtorBranchCode;
	}
	public void setDebtorBranchCode(String debtorBranchCode) {
		this.debtorBranchCode = debtorBranchCode;
	}
	public String getCreditorAgentCode() {
		return creditorAgentCode;
	}
	public void setCreditorAgentCode(String creditorAgentCode) {
		this.creditorAgentCode = creditorAgentCode;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getCategoryPurposeCode() {
		return categoryPurposeCode;
	}
	public void setCategoryPurposeCode(String categoryPurposeCode) {
		this.categoryPurposeCode = categoryPurposeCode;
	}
	public String getCreditorNumber() {
		return creditorNumber;
	}
	public void setCreditorNumber(String creditorNumber) {
		this.creditorNumber = creditorNumber;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	
	
}
