package org.parcial_III.Infraestructure.Models;

import java.util.Date;

public class CuentasModels {

    public int Id;
    public Integer IdCliente;
    public String NroCuenta;
    public Date FechaAlta;
    public String TipoCuenta;
    public String Estado;
    public double Saldo;
    public String NroContrato;
    public double CostoMantenimiento;
    public String PromedioAcreditacion;
    public String Moneda;

    public CuentasModels(int Id, Integer IdCliente, String NroCuenta, Date FechaAlta, String TipoCuenta, String Estado, double Saldo, String NroContrato, double CostoMantenimiento, String PromedioAcreditacion, String Moneda) {
        this.Id = Id;
        this.IdCliente = IdCliente;
        this.NroCuenta = NroCuenta;
        this.FechaAlta = FechaAlta;
        this.TipoCuenta = TipoCuenta;
        this.Estado = Estado;
        this.Saldo = Saldo;
        this.NroContrato = NroContrato;
        this.CostoMantenimiento = CostoMantenimiento;
        this.PromedioAcreditacion = PromedioAcreditacion;
        this.Moneda = Moneda;
    }
    
    public CuentasModels(){
        
    }

    public int getId() {
        return Id;
    }

    public Integer getIdCliente() {
        return IdCliente;
    }

    public String getNroCuenta() {
        return NroCuenta;
    }

    public Date getFechaAlta() {
        return FechaAlta;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public String getEstado() {
        return Estado;
    }

    public double getSaldo() {
        return Saldo;
    }

    public String getNroContrato() {
        return NroContrato;
    }

    public double getCostoMantenimiento() {
        return CostoMantenimiento;
    }

    public String getPromedioAcreditacion() {
        return PromedioAcreditacion;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setIdCliente(Integer IdCliente) {
        this.IdCliente = IdCliente;
    }

    public void setNroCuenta(String NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    public void setFechaAlta(Date FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void setNroContrato(String NroContrato) {
        this.NroContrato = NroContrato;
    }

    public void setCostoMantenimiento(double CostoMantenimiento) {
        this.CostoMantenimiento = CostoMantenimiento;
    }

    public void setPromedioAcreditacion(String PromedioAcreditacion) {
        this.PromedioAcreditacion = PromedioAcreditacion;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

}
