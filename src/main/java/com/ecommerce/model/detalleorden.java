package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Detalles")

public class detalleorden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;

    @OneToOne
    private orden orden;

    @ManyToOne
    private producto producto;

    public detalleorden() {
    }

    public detalleorden(Integer id, String nombre, double cantidad, double precio, double total) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public orden getOrden() {
        return orden;
    }

    public void setOrden(orden orden) {
        this.orden = orden;
    }

    public producto getProducto() {
        return producto;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "detalleorden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
                + ", total=" + total + "]";
    }

}
