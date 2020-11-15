package com.example.demo.models;

public class Proveedores {

	private int idProveedor;
	private String NombreCompannia;
	private String NombreContacto;
	private String Email;
	private String RFC;
	private int Telefono;
	private String Direccion;
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNombreCompannia() {
		return NombreCompannia;
	}
	public void setNombreCompannia(String nombreCompannia) {
		NombreCompannia = nombreCompannia;
	}
	public String getNombreContacto() {
		return NombreContacto;
	}
	public void setNombreContacto(String nombreContacto) {
		NombreContacto = nombreContacto;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public Proveedores(int idProveedor, String nombreCompannia, String nombreContacto, String email, String rFC,
			int telefono, String direccion) {
		super();
		this.idProveedor = idProveedor;
		this.NombreCompannia = nombreCompannia;
		this.NombreContacto = nombreContacto;
		this.Email = email;
		this.RFC = rFC;
		this.Telefono = telefono;
		this.Direccion = direccion;
	}
	
	
}
