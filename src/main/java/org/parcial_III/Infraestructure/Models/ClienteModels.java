package org.parcial_III.Infraestructure.Models;

import java.util.Date;

public class ClienteModels {

    public int IdCliente;
    public Integer IdPersona;
    public Date FechaIngreso;
    public String Clasificacion;
    public String Estado;

    public ClienteModels(int IdCliente, Integer IdPersona, Date FechaIngreso, String Clasificacion, String Estado) {
        this.IdCliente = IdCliente;
        this.IdPersona = IdPersona;
        this.FechaIngreso = FechaIngreso;
        this.Clasificacion = Clasificacion;
        this.Estado = Estado;
    }
    
    public ClienteModels(){
        
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public Integer getIdPersona() {
        return IdPersona;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public void setIdPersona(Integer IdPersona) {
        this.IdPersona = IdPersona;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
