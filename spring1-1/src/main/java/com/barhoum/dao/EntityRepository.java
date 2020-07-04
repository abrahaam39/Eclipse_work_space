package com.barhoum.dao;

import java.util.List;

    public interface EntityRepository<T>{

	public T save(T p);
	public List<T> findall();
	public List<T> findmc(String mc);
	public T findone(Long id);
	public T update(T p);
	public void delete(Long id);



}
