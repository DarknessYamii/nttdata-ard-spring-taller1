package com.nttdata.spring.persistence;

import org.springframework.stereotype.Component;
/**
 * Componente Person
 * @author DarknessYamii
 *
 */
@Component
public class NttDataPerson {

	private String name, surName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	@Override
	public String toString() {
		return "NttDataPerson [name=" + name + ", surName=" + surName + "]";
	}
}
