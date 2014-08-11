package com.luckhouse.housekeeper.service;

import java.sql.Date;
import java.util.List;

import com.luckhouse.housekeeper.db.entity.Participant;
import com.luckhouse.housekeeper.db.entity.Tallytype;
import com.luckhouse.housekeeper.db.entity.User;

public interface ParticipantService {
	
	List<User> getAllUsers();
	List<Tallytype> getAllCategries();
	List<Participant> getParticipantsByUser(User user);
	List<Participant> getParticipantsByUserAndDate(User user, Date date);
	List<Participant> getParticipantsByUserAndTallytype(User user, Tallytype tallytype);
	
	Participant saveParticipant();
	Participant updateParticipant();
	
}
