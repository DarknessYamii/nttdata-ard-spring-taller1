package com.nttdata.spring.persistence;
/**
 * Clase edificie
 * @author DarknessYamii
 *
 */
public class NttDataEdificie {
	
	private NttDataPerson[][] edificie;
	final int floors = 2;
	final int rooms = 2;

	
	/**
	 * Constructor inicial con las plantas y departamentos
	 */
	public NttDataEdificie() {
		this.edificie = new NttDataPerson[floors][rooms];
	}
	
	public NttDataPerson[][] getEdificie() {
		return edificie;
	}
	public void setEdificie(NttDataPerson[][] edificie) {
		this.edificie = edificie;
	}
	
}
