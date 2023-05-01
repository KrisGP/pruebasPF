/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istrabajo.model;

import java.io.Serializable;
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
@Table(name="regalos")
public class Regalo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRegalo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArticulo;
    @Column(name="fecha")
    private Calendar fecha;
    @Column(name="haSidoEntregado", nullable=true)
    private boolean haSidoEntregado;

    public int getIdRegalo() {
        return idRegalo;
    }

    public void setIdRegalo(int idRegalo) {
        this.idRegalo = idRegalo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public boolean isHaSidoEntregado() {
        return haSidoEntregado;
    }

    public void setHaSidoEntregado(boolean haSidoEntregado) {
        this.haSidoEntregado = haSidoEntregado;
    }
    
    
}
