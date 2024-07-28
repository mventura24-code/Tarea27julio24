package com.mv.spring.Tarea27jul.persona.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "persona")
@Table(name = "Personas")

public class Persona {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "primer nombre")
    private String firstname;
    
    @Column(name = "segundo nombre")
    private String secondname;

    @Column(name = "primer apellido")
    private String firstapellido;
    
    @Column(name = "segundo apellido")
    private String secondapellido;
    
    @Column(name = "genero")
    private String genero;
    
    @Column(name = "DPI")
    private String DPI;

    @Column(name = "edad")
    private int edad;
    
    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "fecha_nacimiento")
    private java.time.LocalDate fechaNacimiento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public String getFirstapellido() {
		return firstapellido;
	}

	public void setFirstapellido(String firstapellido) {
		this.firstapellido = firstapellido;
	}

	public String getSecondapellido() {
		return secondapellido;
	}

	public void setSecondapellido(String secondapellido) {
		this.secondapellido = secondapellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDPI() {
		return DPI;
	}

	public void setDPI(String dPI) {
		DPI = dPI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public java.time.LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(java.time.LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

    
}


