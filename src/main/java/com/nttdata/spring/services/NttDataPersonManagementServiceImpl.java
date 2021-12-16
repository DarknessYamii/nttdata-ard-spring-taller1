package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NttDataPerson;
import com.nttdata.spring.persistence.NttDataPersonDaoI;
/**
 * Implementacion Servicio
 * @author DarknessYamii
 *
 */
@Service
public class NttDataPersonManagementServiceImpl implements NttDataPersonManagementServiceI {

	@Autowired
	private NttDataPersonDaoI personDao;
	
	@Override
	public void insert(NttDataPerson person) {
		personDao.insert(person);
	}

	@Override
	public List<NttDataPerson> searchAll() {
		return personDao.searchAll();
	}

	@Override
	public List<NttDataPerson> searchByFullName(String name, String surName) {
		return  personDao.searchByFullName(name, surName);
	}

}
