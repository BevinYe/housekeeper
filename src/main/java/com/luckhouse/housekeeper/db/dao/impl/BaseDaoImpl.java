package com.luckhouse.housekeeper.db.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luckhouse.housekeeper.db.dao.BaseDao;

@Repository("baseDao")
public  class BaseDaoImpl<T> implements  BaseDao<T>{
	@Autowired
    private SessionFactory sessionFactory;
	
	protected Class<T> clazz;
	
    @SuppressWarnings("unchecked")
	public BaseDaoImpl() {
        ParameterizedType type = (ParameterizedType) this.getClass()
                .getGenericSuperclass();
        this.clazz = (Class<T>) type.getActualTypeArguments()[0];
    }

	
	@Override
	public Integer add(T t) {
		 return (Integer) sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void update(T t) {
		 sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public void delete(T t) {
		sessionFactory.getCurrentSession().delete(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getById(int id) {
		return  (T) sessionFactory.getCurrentSession().get(this.clazz, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		 return sessionFactory.getCurrentSession().createQuery("from " + this.clazz.getSimpleName()).list();
	}
}
