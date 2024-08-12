package com.ecommerce.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ordenes")

public class orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private Date fechacreacion;
    private Date fecharecibida;

    private double total;

    @ManyToOne
    private usuario usuario;

    @OneToOne(mappedBy = "orden")
    private detalleorden detalle;

    public orden() {
    }

    public orden(Integer id, String numero, Date fechacreacion, Date fecharecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechacreacion = fechacreacion;
        this.fecharecibida = fecharecibida;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFecharecibida() {
        return fecharecibida;
    }

    public void setFecharecibida(Date fecharecibida) {
        this.fecharecibida = fecharecibida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public detalleorden getDetalle() {
        return detalle;
    }

    public void setDetalle(detalleorden detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "orden [id=" + id + ", numero=" + numero + ", fechacreacion=" + fechacreacion + ", fecharecibida="
                + fecharecibida + ", total=" + total + "]";
    }

}
