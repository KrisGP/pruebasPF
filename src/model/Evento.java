/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istrabajo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author cris9
 */
@Entity
@Table(name="eventos")
public class Evento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvento;
    @Column(name="nombreEvento", length=45)
    private String nombreEvento;
    @Column(name="descripcion", length=200)
    private String descripcion;
    @Column(name="costePapeletasTotal")
    private BigDecimal costePapeletasTotal;
    @Column(name="costePapeletasSinIva", nullable=true)
    private BigDecimal costePapeletasSinIva;
    @Column(name="sePuedeRepetirNumero", nullable=true)
    private boolean sePuedeRepetirNumero;
    @Column(name="fechaInicio")
    private Calendar fechaInicio;
    @Column(name="fechaFinalizacion")
    private Calendar fechaFinalizacion;

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getCostePapeletasTotal() {
        return costePapeletasTotal;
    }

    public void setCostePapeletasTotal(BigDecimal costePapeletasTotal) {
        this.costePapeletasTotal = costePapeletasTotal;
    }

    public BigDecimal getCostePapeletasSinIva() {
        return costePapeletasSinIva;
    }

    public void setCostePapeletasSinIva(BigDecimal costePapeletasSinIva) {
        this.costePapeletasSinIva = costePapeletasSinIva;
    }

    public boolean isSePuedeRepetirNumero() {
        return sePuedeRepetirNumero;
    }

    public void setSePuedeRepetirNumero(boolean sePuedeRepetirNumero) {
        this.sePuedeRepetirNumero = sePuedeRepetirNumero;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Calendar fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
    
    
}
