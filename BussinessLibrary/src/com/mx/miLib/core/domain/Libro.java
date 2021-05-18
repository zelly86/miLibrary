package com.mx.miLib.core.domain;

/**
 * 
 * @author Ana Lilia Palma
 * 14/05/2021
 *
 */
public class Libro {

	private String codigoLibro;
	private String autor;
	private String titulo;
	private String editorial;
	private String categoria;
	private double precio;
	private int cantidadTotal;
	public int getCantidadTotal() {
		return cantidadTotal;
	}
	public void setCantidadTotal(int cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}
	private Sucursal sucursal;
	
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public String getCodigoLibro() {
		return codigoLibro;
	}
	public void setCodigoLibro(String codigoLibro) {
		this.codigoLibro = codigoLibro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
