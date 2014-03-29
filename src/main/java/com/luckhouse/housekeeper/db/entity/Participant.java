package com.luckhouse.housekeeper.db.entity;

// Generated Mar 29, 2014 11:15:14 PM by Hibernate Tools 3.4.0.CR1

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
	private User user;
	private Tally tally;
	private boolean isPayer;

	public Participant() {
	}

	public Participant(User user, Tally tally, boolean isPayer) {
		this.user = user;
		this.tally = tally;
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
	@JoinColumn(name = "user_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "spending_id", nullable = false)
	public Tally getTally() {
		return this.tally;
	}

	public void setTally(Tally tally) {
		this.tally = tally;
	}

	@Column(name = "isPayer", nullable = false)
	public boolean isIsPayer() {
		return this.isPayer;
	}

	public void setIsPayer(boolean isPayer) {
		this.isPayer = isPayer;
	}

}
