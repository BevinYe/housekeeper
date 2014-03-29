package com.luckhouse.housekeeper.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.luckhouse.housekeeper.db.dao.TallyDao;
import com.luckhouse.housekeeper.db.entity.Tally;

@Repository("tallyDao")
public class TallyDaoImpl extends BaseDaoImpl<Tally> implements TallyDao{
	
}
