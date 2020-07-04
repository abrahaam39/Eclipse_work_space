package com.barhoum.dao;

import java.util.List;

public interface EntityRepository<T> {
	public T save(T p);
	public List<T> findAll();
	public T findone(Long id);
	public List<T> findbyDesignation(String mc);
	public void remove(Long id);
	public void update(T p);
}
