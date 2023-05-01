/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istrabajo.model;

import java.io.Serializable;
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
@Table(name="tarjetas")
public class Tarjeta implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjetas;
    @Column(name="tarjetascreditocol", length=16)
    private String tarjetasCreditoCol;
    @Column(name="nombreCompletoTarjeta", length=100)
    private String nombreCompletoTarjeta;

    public int getIdTarjetas() {
        return idTarjetas;
    }

    public void setIdTarjetas(int idTarjetas) {
        this.idTarjetas = idTarjetas;
    }

    public String getTarjetasCreditoCol() {
        return tarjetasCreditoCol;
    }

    public void setTarjetasCreditoCol(String tarjetasCreditoCol) {
        this.tarjetasCreditoCol = tarjetasCreditoCol;
    }

    public String getNombreCompletoTarjeta() {
        return nombreCompletoTarjeta;
    }

    public void setNombreCompletoTarjeta(String nombreCompletoTarjeta) {
        this.nombreCompletoTarjeta = nombreCompletoTarjeta;
    }
}
