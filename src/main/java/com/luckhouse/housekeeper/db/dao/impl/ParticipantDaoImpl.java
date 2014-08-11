package com.luckhouse.housekeeper.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.luckhouse.housekeeper.db.dao.ParticipantDao;
import com.luckhouse.housekeeper.db.entity.Participant;

@Repository("participantDao")
public class ParticipantDaoImpl extends BaseDaoImpl<Participant> implements ParticipantDao {

}
