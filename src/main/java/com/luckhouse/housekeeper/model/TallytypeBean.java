package com.luckhouse.housekeeper.model;

import com.luckhouse.housekeeper.db.entity.Tally;

public class TallytypeBean {

	private Integer id;
	private String type;
	private Tally tally;

	public TallytypeBean() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Tally getTally() {
		return tally;
	}

	public void setTally(Tally tally) {
		this.tally = tally;
	}

}
