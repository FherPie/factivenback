package com.componente.factinven.dto;

import java.io.Serializable;

import com.componente.factinven.entidades.Producto;

public class ProductoResponse implements Serializable {

	private static final long serialVersionUID = 1703147611246372118L;
	private Integer idProducto;
	private String nombre;
	private Double precioUnitario;
	private Integer stock;
	private Double precioCompra;
	
		
	public ProductoResponse() {

	}

	public  ProductoResponse (Producto producto) {
		this.idProducto= producto.getIdProducto();
		this.nombre= producto.getNombre();
		this.precioCompra= producto.getPrecioCompra();
		this.precioUnitario= producto.getPrecioUnitario();
		this.stock= producto.getStock();
	}
	
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}
	

}
