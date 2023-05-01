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
@Table(name="recargassaldo")
public class RecargasSaldo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecarga;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name="ValorRecargo")
    private String valorRecargo;
    @Column(name="fechaRecarga")
    private Calendar fechaRecarga;

    public int getIdRecarga() {
        return idRecarga;
    }

    public void setIdRecarga(int idRecarga) {
        this.idRecarga = idRecarga;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getValorRecargo() {
        return valorRecargo;
    }

    public void setValorRecargo(String valorRecargo) {
        this.valorRecargo = valorRecargo;
    }

    public Calendar getFechaRecarga() {
        return fechaRecarga;
    }

    public void setFechaRecarga(Calendar fechaRecarga) {
        this.fechaRecarga = fechaRecarga;
    }
    
    
}

