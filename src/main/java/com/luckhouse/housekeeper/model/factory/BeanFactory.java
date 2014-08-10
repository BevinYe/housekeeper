package com.luckhouse.housekeeper.model.factory;

import java.util.ArrayList;
import java.util.List;

import com.luckhouse.housekeeper.db.entity.Participant;
import com.luckhouse.housekeeper.db.entity.Tally;
import com.luckhouse.housekeeper.db.entity.User;
import com.luckhouse.housekeeper.model.TallyBean;

public class BeanFactory {
	private BeanFactory(){
	}
	public static TallyBean createTallyBean(Tally tally){
		TallyBean tallyBean = new TallyBean();
		tallyBean.setId(tally.getId());
		tallyBean.setPayDate(tally.getPayDate());
		tallyBean.setTotalExpenses(tally.getTotalExpenses());
		tallyBean.setComment(tally.getComment());
		tallyBean.setDesc(tally.getDescription());
		tallyBean.setTallyType(tally.getTallytype()!=null?tally.getTallytype().getType():"");
		if(tally.getPayer()!=null){
			tallyBean.setPayerName(tally.getPayer().getUsername());
		}
		if(tally.getParticipants()!=null){
			List<String> participants = convertParticipantListToStringList(tally);
			tallyBean.setParticipants(participants);
		}
		return tallyBean;
	}
	private static List<String> convertParticipantListToStringList(Tally tally) {
		List<String> participants = new ArrayList<String>();
		for (Participant participant : tally.getParticipants()) {
			User user = participant.getUser();
			if(user!=null){
				if(user.getDisplayName()!=null){
					participants.add(user.getDisplayName());
				}else{
					participants.add(user.getUsername());
				}
			}
		}
		return participants;
	}
	public static List<TallyBean> createTallyBeanList(List<Tally> tallys ){
		List<TallyBean> tallyBeans = new ArrayList<TallyBean>();
		if(tallys!=null){
			for (Tally tally : tallys) {
				tallyBeans.add(createTallyBean(tally));
			}
		}
		return tallyBeans;
	}
}
