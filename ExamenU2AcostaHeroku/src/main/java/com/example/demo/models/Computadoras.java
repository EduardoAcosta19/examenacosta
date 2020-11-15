package com.example.demo.models;

public class Computadoras {
	private int noSerie;
	private String marca;
	private String procesador;
	private String SistemaOperativo;
	private int Ram;
	private int noNucleos;
	public int getNoSerie() {
		return noSerie;
	}
	public void setNoSerie(int noSerie) {
		this.noSerie = noSerie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getSistemaOperativo() {
		return SistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		SistemaOperativo = sistemaOperativo;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public int getNoNucleos() {
		return noNucleos;
	}
	public void setNoNucleos(int noNucleos) {
		this.noNucleos = noNucleos;
	}
	public Computadoras(int noSerie, String marca, String procesador, String sistemaOperativo, int ram, int noNucleos) {
		super();
		this.noSerie = noSerie;
		this.marca = marca;
		this.procesador = procesador;
		this.SistemaOperativo = sistemaOperativo;
		this.Ram = ram;
		this.noNucleos = noNucleos;
	}
	
	
	
	
	
	
}
