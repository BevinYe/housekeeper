package com.luckhouse.housekeeper.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.luckhouse.housekeeper.db.dao.UserDao;
import com.luckhouse.housekeeper.db.entity.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
