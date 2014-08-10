package com.luckhouse.housekeeper.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TallyBean implements Serializable{

	private static final long serialVersionUID = 2754970878921712333L;
	private Integer id;
	private Date payDate;
	private String desc;
	private Integer totalExpenses;
	private String tallyType;
	private String comment;
	private String payerName;
	private List<String> participants;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getTotalExpenses() {
		return totalExpenses;
	}
	public void setTotalExpenses(Integer totalExpenses) {
		this.totalExpenses = totalExpenses;
	}
	public String getTallyType() {
		return tallyType;
	}
	public void setTallyType(String tallyType) {
		this.tallyType = tallyType;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPayerName() {
		return payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public List<String> getParticipants() {
		return participants;
	}
	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}
}
