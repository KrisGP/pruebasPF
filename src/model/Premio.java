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
@Table(name="articulos")
public class Premio implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPremios;
    @Column(name="nombrePremio", length=45)
    private String nombrePremio;
    @Column(name="valorAproximadoPremio")
    private int valorAproximadoPremio;
    @Column(name="puestoObtenerPremio", length=45)
    private String puestoObtenerPremio;
    @Column(name="haSidoEntregado")
    private boolean haSidoEntregado;

    public int getIdPremios() {
        return idPremios;
    }

    public void setIdPremios(int idPremios) {
        this.idPremios = idPremios;
    }

    public String getNombrePremio() {
        return nombrePremio;
    }

    public void setNombrePremio(String nombrePremio) {
        this.nombrePremio = nombrePremio;
    }

    public int getValorAproximadoPremio() {
        return valorAproximadoPremio;
    }

    public void setValorAproximadoPremio(int valorAproximadoPremio) {
        this.valorAproximadoPremio = valorAproximadoPremio;
    }

    public String getPuestoObtenerPremio() {
        return puestoObtenerPremio;
    }

    public void setPuestoObtenerPremio(String puestoObtenerPremio) {
        this.puestoObtenerPremio = puestoObtenerPremio;
    }

    public boolean isHaSidoEntregado() {
        return haSidoEntregado;
    }

    public void setHaSidoEntregado(boolean haSidoEntregado) {
        this.haSidoEntregado = haSidoEntregado;
    }
    
    
}
