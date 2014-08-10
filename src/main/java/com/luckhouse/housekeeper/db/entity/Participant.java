package com.luckhouse.housekeeper.db.entity;

// Generated 2014-8-10 16:26:15 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Participant generated by hbm2java
 */
@Entity
@Table(name = "participant", catalog = "housekeeper")
public class Participant implements java.io.Serializable {

	private static final long serialVersionUID = -7093683145808937963L;
	private Integer id;
	private Tally tally;
	private User user;
	private boolean isPayer;

	public Participant() {
	}

	public Participant(Tally tally, User user, boolean isPayer) {
		this.tally = tally;
		this.user = user;
		this.isPayer = isPayer;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tallyId", nullable = false)
	public Tally getTally() {
		return this.tally;
	}

	public void setTally(Tally tally) {
		this.tally = tally;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "isPayer", nullable = false)
	public boolean isIsPayer() {
		return this.isPayer;
	}

	public void setIsPayer(boolean isPayer) {
		this.isPayer = isPayer;
	}

}
