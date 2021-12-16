package com.nttdata.spring.persistence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class NttDataPersonDaoImpl implements NttDataPersonDaoI {

	NttDataEdificie edificie;

	public NttDataPersonDaoImpl() {
		this.edificie = new NttDataEdificie();
	}
/**
 * Insert person
 */
	@Override
	public void insert(NttDataPerson person) {
		/* Busca posiciones libres en el array de edificie e inserta Person */
		for (int i = 0; i < edificie.floors; i++) {
			for (int j = 0; j < edificie.rooms; j++) {
				if (edificie.getEdificie()[i][j] == null) {
					edificie.getEdificie()[i][j] = person;
					return;
				}
			}

		}

	}
	/**
	 * Search All
	 * @return Print a List<NttDataPerson>
	 */
	@Override
	public List<NttDataPerson> searchAll() {
		return List.of(edificie.getEdificie()).stream()
				.flatMap(room -> Arrays.stream(room).filter(person -> person != null)).collect(Collectors.toList());
	}
	/**
	 * Search by full name
	 * @return Print a List<NttDataPerson>
	 */
	@Override
	public List<NttDataPerson> searchByFullName(String name, String surName) {
		return List.of(edificie.getEdificie()).stream().flatMap(
				room -> Arrays.stream(room).filter(person -> person != null && person.getName().equals(name) && person.getSurName().equals(surName))).collect(Collectors.toList());
				
	}
}
