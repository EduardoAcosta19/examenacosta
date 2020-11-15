package com.example.demo.models;

public class Tickets {
	private int idTickets;
	private int idVentas;
	private int noSerie;
	private int cantidad;
	private int precio;
	public int getIdTickets() {
		return idTickets;
	}
	public void setIdTickets(int idTickets) {
		this.idTickets = idTickets;
	}
	public int getIdVentas() {
		return idVentas;
	}
	public void setIdVentas(int idVentas) {
		this.idVentas = idVentas;
	}
	public int getNoSerie() {
		return noSerie;
	}
	public void setNoSerie(int noSerie) {
		this.noSerie = noSerie;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Tickets(int idTickets, int idVentas, int noSerie, int cantidad, int precio) {
		super();
		this.idTickets = idTickets;
		this.idVentas = idVentas;
		this.noSerie = noSerie;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
}
