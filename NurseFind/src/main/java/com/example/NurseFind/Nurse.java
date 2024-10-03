package com.example.NurseFind;

	public class Nurse extends NurseController{
		private String nombre;
		
		public Nurse (String nombre) {
			this.nombre=nombre;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
