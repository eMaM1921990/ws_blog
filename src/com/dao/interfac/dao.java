package com.dao.interfac;

import java.util.List;

public interface dao<T> {
	public String Presist(T o);

	public List<T> FindAll();

	public List<T> FindByParentId(int parentID);
}
