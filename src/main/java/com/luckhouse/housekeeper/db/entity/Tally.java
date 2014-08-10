package com.luckhouse.housekeeper.db.entity;

// Generated Mar 29, 2014 11:15:14 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tally generated by hbm2java
 */
@Entity
@Table(name = "tally", catalog = "housekeeper")
public class Tally implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5347211042966421892L;
	private Integer id;
	private Date payDate;
	private String description;
	private Integer totalExpenses;
	private boolean isFromDormitoryFee;
	private String comment;
	private User payer;
	private Date createDate;
	private Date updateDate;
	private Integer createBy;
	private Integer updateBy;
	private Set<Participant> participants = new HashSet<Participant>(0);

	public Tally() {
	}

	public Tally(boolean isFromDormitoryFee) {
		this.isFromDormitoryFee = isFromDormitoryFee;
	}

	public Tally(Date payDate, String description, Integer totalExpenses,
			boolean isFromDormitoryFee, String comment, User payer,
			Date createDate, Date updateDate, Integer createBy,
			Integer updateBy, Set<Participant> participants) {
		this.payDate = payDate;
		this.description = description;
		this.totalExpenses = totalExpenses;
		this.isFromDormitoryFee = isFromDormitoryFee;
		this.comment = comment;
		this.payer = payer;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.participants = participants;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "payDate", length = 10)
	public Date getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "totalExpenses")
	public Integer getTotalExpenses() {
		return this.totalExpenses;
	}

	public void setTotalExpenses(Integer totalExpenses) {
		this.totalExpenses = totalExpenses;
	}

	@Column(name = "isFromDormitoryFee", nullable = false)
	public boolean getIsFromDormitoryFee() {
		return this.isFromDormitoryFee;
	}

	public void setIsFromDormitoryFee(boolean isFromDormitoryFee) {
		this.isFromDormitoryFee = isFromDormitoryFee;
	}

	@Column(name = "comment")
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payerId", nullable = false)
	public User getPayer() {
		return this.payer;
	}

	public void setPayer(User payer) {
		this.payer = payer;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateDate", length = 19)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "createBy")
	public Integer getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	@Column(name = "updateBy")
	public Integer getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tally")
	public Set<Participant> getParticipants() {
		return this.participants;
	}

	public void setParticipants(Set<Participant> participants) {
		this.participants = participants;
	}

}
