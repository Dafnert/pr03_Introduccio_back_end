package com.example.NurseFind;

public class Nurse {
	private String nombre;
	private String color;
	private int edad;
	private String profesionalidad;

	public Nurse(String nombre, String color,int edad, String profesionalidad) {
		this.nombre = nombre;
		this.color = color;
		this.edad=edad;
		this.profesionalidad=profesionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSector() {
		return profesionalidad;
	}

	public void setSector(String profesionalidad) {
		this.profesionalidad = profesionalidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
