package com.luckhouse.housekeeper.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luckhouse.housekeeper.db.dao.TallyDao;
import com.luckhouse.housekeeper.db.entity.Tally;
import com.luckhouse.housekeeper.service.TallyService;

@Service("tallyServiceImpl")
@Transactional
public class TallyServiceImpl implements TallyService{

	@Resource 
	TallyDao tallyDao;
	
	@Override
	public Tally addTally(Tally tally) {
		Integer id = tallyDao.add(tally);
		tally.setId(id);
		return tally;
	}

	@Override
	public void updateTally(Tally tally) {
		tallyDao.update(tally);
	}

	@Override
	public void deleteTally(Tally tally) {
		tallyDao.delete(tally);
	}

	@Override
	public Tally getTallyById(int id) {
		return tallyDao.getById(id);
	}

	@Override
	public List<Tally> getAllTallys() {
		return tallyDao.getAll();
	}

}
