package com.example.negocio;

public class Persona {
	
private String nombre;
private int edad;




public Persona() {
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
@Override
public String toString() {
	return "persona [nombre=" + nombre + ", edad=" + edad + "]";
}


	
	
}
