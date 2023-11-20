package org.parcial_III.Infraestructure.Models;

import java.util.Date;

public class MovimientosModels {

    public int IdMovimiento;
    public Integer IdCuenta;
    public Date FechaMovimiento;
    public String TipoMovimiento;
    public double SaldoAnterior;
    public double SaldoActual;
    public double MontoMovimiento;
    public double CuentaOrigen;
    public double CuentaDestino;
    public double Canal;

    public MovimientosModels(int IdMovimiento, Integer IdCuenta, Date FechaMovimiento, String TipoMovimiento, double SaldoAnterior,
            double SaldoActual, double MontoMovimiento, double CuentaOrigen, double CuentaDestino, double Canal) {
        this.IdMovimiento = IdMovimiento;
        this.IdCuenta = IdCuenta;
        this.FechaMovimiento = FechaMovimiento;
        this.TipoMovimiento = TipoMovimiento;
        this.SaldoAnterior = SaldoAnterior;
        this.SaldoActual = SaldoActual;
        this.MontoMovimiento = MontoMovimiento;
        this.CuentaOrigen = CuentaOrigen;
        this.CuentaDestino = CuentaDestino;
        this.Canal = Canal;
    }

    public MovimientosModels() {

    }

    public int getIdMovimiento() {
        return IdMovimiento;
    }

    public void setIdMovimiento(int IdMovimiento) {
        this.IdMovimiento = IdMovimiento;
    }

    public Integer getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(Integer IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

    public Date getFechaMovimiento() {
        return FechaMovimiento;
    }

    public void setFechaMovimiento(Date FechaMovimiento) {
        this.FechaMovimiento = FechaMovimiento;
    }

    public String getTipoMovimiento() {
        return TipoMovimiento;
    }

    public void setTipoMovimiento(String TipoMovimiento) {
        this.TipoMovimiento = TipoMovimiento;
    }

    public double getSaldoAnterior() {
        return SaldoAnterior;
    }

    public void setSaldoAnterior(double SaldoAnterior) {
        this.SaldoAnterior = SaldoAnterior;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public double getMontoMovimiento() {
        return MontoMovimiento;
    }

    public void setMontoMovimiento(double MontoMovimiento) {
        this.MontoMovimiento = MontoMovimiento;
    }

    public double getCuentaOrigen() {
        return CuentaOrigen;
    }

    public void setCuentaOrigen(double CuentaOrigen) {
        this.CuentaOrigen = CuentaOrigen;
    }

    public double getCuentaDestino() {
        return CuentaDestino;
    }

    public void setCuentaDestino(double CuentaDestino) {
        this.CuentaDestino = CuentaDestino;
    }

    public double getCanal() {
        return Canal;
    }

    public void setCanal(double Canal) {
        this.Canal = Canal;
    }

}
