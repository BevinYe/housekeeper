package com.luckhouse.housekeeper.service;

import java.util.List;

import com.luckhouse.housekeeper.db.entity.Tally;

public interface TallyService {
	Tally addTally(Tally tally);
	void updateTally(Tally tally);
	void deleteTally(Tally tally);
	Tally getTallyById(int id);
	List<Tally> getAllTallys();
}
