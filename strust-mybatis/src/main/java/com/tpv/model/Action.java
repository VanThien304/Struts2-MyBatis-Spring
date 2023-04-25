package com.tpv.model;

import java.util.List;

public interface Action<T, idT> {
	List<T> getList();
	
	T getDetails(idT id);
	
	boolean add(T obj);
	
	boolean update(T obj);
	
	boolean delete(idT id);
}
