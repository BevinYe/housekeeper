package com.luckhouse.housekeeper.service.impl;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luckhouse.housekeeper.db.dao.TallytypeDao;
import com.luckhouse.housekeeper.db.dao.UserDao;
import com.luckhouse.housekeeper.db.entity.Participant;
import com.luckhouse.housekeeper.db.entity.Tallytype;
import com.luckhouse.housekeeper.db.entity.User;
import com.luckhouse.housekeeper.service.ParticipantService;

@Service("participantServiceImpl")
@Transactional
public class ParticipantServiceImpl implements ParticipantService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	TallytypeDao tallytypeDao;

	@Override
	public List<User> getAllUsers() {
		return userDao.getAll();
	}

	@Override
	public List<Tallytype> getAllCategries() {
		return tallytypeDao.getAll();
	}

	@Override
	public List<Participant> getParticipantsByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Participant> getParticipantsByUserAndDate(User user, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Participant> getParticipantsByUserAndTallytype(User user, Tallytype tallytype) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Participant saveParticipant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Participant updateParticipant() {
		// TODO Auto-generated method stub
		return null;
	}

}
