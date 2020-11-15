package com.example.demo.models;

public class Clientes {
	private int idClientes;
	private String nombre;
	private String Apellidos;
	private long numero;
	private String email;
	private String direccion;
	public int getIdClientes() {
		return idClientes;
	}
	public void setIdClientes(int idClientes) {
		this.idClientes = idClientes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Clientes(int idClientes, String nombre, String apellidos, long numero, String email, String direccion) {
		super();
		this.idClientes = idClientes;
		this.nombre = nombre;
		this.Apellidos = apellidos;
		this.numero = numero;
		this.email = email;
		this.direccion = direccion;
	}
	

}
