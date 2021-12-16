package com.nttdata.spring.persistence;

import java.util.List;

public interface NttDataPersonDaoI {
	/* Insert Person */
	public void insert(NttDataPerson person);
	/* Search every attribute of Person */
	public List<NttDataPerson> searchAll();
	/* Search only the Person equals our constructor attributes */
	public List<NttDataPerson> searchByFullName(String name, String surName);
}
