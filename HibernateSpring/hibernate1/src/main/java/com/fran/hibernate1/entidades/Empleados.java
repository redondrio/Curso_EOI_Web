package com.fran.hibernate1.entidades;

// default package
// Generated 14 dic 2022 19:29:43 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Empleados generated by hbm2java
 */
@Entity
@Table(name = "empleados", catalog = "eoi2")
public class Empleados implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int num;
	private String nombre;
	private int edad;
	private int departamento;
	private int categoria;
	private Date contrato;

	public Empleados() {
	}
	
	public Empleados(String nombre, int edad, int departamento, int categoria, Date contrato) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
		this.categoria = categoria;
		this.contrato = contrato;
	}
	
	public Empleados(int num, String nombre, int edad, int departamento, int categoria, Date contrato) {
		this.num = num;
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
		this.categoria = categoria;
		this.contrato = contrato;
	}

	@Id

	@Column(name = "num", unique = true, nullable = false)
	public int getNum() {
		return this.num;
	}

	

	public void setNum(int num) {
		this.num = num;
	}

	@Column(name = "nombre", nullable = false, length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "edad", nullable = false)
	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Column(name = "departamento", nullable = false)
	public int getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	@Column(name = "categoria", nullable = false)
	public int getCategoria() {
		return this.categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "contrato", nullable = false, length = 10)
	public Date getContrato() {
		return this.contrato;
	}

	public void setContrato(Date contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "Empleados [num=" + num + ", nombre=" + nombre + ", edad=" + edad + ", departamento=" + departamento
				+ ", categoria=" + categoria + ", contrato=" + contrato + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		return num == other.num;
	}

	
	

}
