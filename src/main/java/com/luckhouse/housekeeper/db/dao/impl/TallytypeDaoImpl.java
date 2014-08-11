package com.luckhouse.housekeeper.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.luckhouse.housekeeper.db.dao.BaseDao;
import com.luckhouse.housekeeper.db.dao.TallytypeDao;
import com.luckhouse.housekeeper.db.entity.Tallytype;

@Repository("tallytypeDao")
public class TallytypeDaoImpl extends BaseDaoImpl<Tallytype> implements TallytypeDao {

}
