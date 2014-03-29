package com.luckhouse.housekeeper.db.dao;

import java.util.List;

public interface BaseDao<T> {
	Integer add(T t);
	void update(T t);
	void delete(T t);
	T getById(int id);
	List<T> getAll();
}
