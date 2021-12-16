package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.persistence.NttDataPerson;
/**
 * Interface Person
 * @author DarknessYamii
 *
 */
public interface NttDataPersonManagementServiceI {

	/**
	 * Insert person
	 * @param person
	 */
	public void insert(NttDataPerson person);
	/**
	 * Search all
	 * @return
	 */
	public List<NttDataPerson> searchAll();
	/**
	 * Search client by fullname
	 * @param name
	 * @param surName
	 * @return
	 */
	public List<NttDataPerson> searchByFullName(String name, String surName);
}
