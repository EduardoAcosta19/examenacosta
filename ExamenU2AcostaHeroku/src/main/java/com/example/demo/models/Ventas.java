package com.example.demo.models;

public class Ventas {
	private int idVenta;
	private int idUsuario;
	private String fecha;
	private float Subtotal;
	private float iva;
	private float costoEnvio;
	private float total;
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public float getSubtotal() {
		return Subtotal;
	}
	public void setSubtotal(float subtotal) {
		Subtotal = subtotal;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public float getCostoEnvio() {
		return costoEnvio;
	}
	public void setCostoEnvio(float costoEnvio) {
		this.costoEnvio = costoEnvio;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Ventas(int idVenta, int idUsuario, String fecha, float subtotal, float iva, float costoEnvio, float total) {
		super();
		this.idVenta = idVenta;
		this.idUsuario = idUsuario;
		this.fecha = fecha;
		this.Subtotal = subtotal;
		this.iva = iva;
		this.costoEnvio = costoEnvio;
		this.total = total;
	}
}
