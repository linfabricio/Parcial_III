package org.parcial_II.Infraestructure.DbManagment.contactos;

import org.parcial_II.Infraestructure.Conections.Conexiones;
import org.parcial_II.Infraestructure.Models.CuentasModels;

import java.sql.SQLException;

public class Cuentas {

    private Conexiones conexion;

    public Cuentas(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCuentas(CuentasModels cuenta) {
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlCuenta = "INSERT INTO Cuentas ("
                    + "IdCliente, "
                    + "NroCuenta, "
                    + "FechaAlta, "
                    + "TipoCuenta, "
                    + "Estado, "
                    + "Saldo, "
                    + "nroContrato, "
                    + "CostoMantenimiento, "
                    + "PromedioAcreditacion, "
                    + "Moneda) "
                    + "VALUES ("
                    + cuenta.IdCliente + ", "
                    + "'" + cuenta.NroCuenta + "', "
                    + "'" + cuenta.FechaAlta + "', "
                    + "'" + cuenta.TipoCuenta + "', "
                    + "'" + cuenta.Estado + "', "
                    + cuenta.Saldo + ", "
                    + "'" + cuenta.NroContrato + "', "
                    + cuenta.CostoMantenimiento + ", "
                    + "'" + cuenta.PromedioAcreditacion + "', "
                    + "'" + cuenta.Moneda + "')";
            boolean execute = conexion.getQuerySQL().execute(sqlCuenta);
            conexion.conexionDB().close();
            return "La cuenta " + cuenta.NroCuenta + " fue registrada correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarCuentas(CuentasModels cuenta) {
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlUpdateCuenta = "UPDATE Cuentas SET "
                    + "IdCliente = " + cuenta.IdCliente + ", "
                    + "FechaAlta = '" + cuenta.FechaAlta + "', "
                    + "TipoCuenta = '" + cuenta.TipoCuenta + "', "
                    + "Estado = '" + cuenta.Estado + "', "
                    + "Saldo = " + cuenta.Saldo + ", "
                    + "nroCuenta = '" + cuenta.NroCuenta + "', "
                    + "nroContrato = '" + cuenta.NroContrato + "', "
                    + "CostoMantenimiento = " + cuenta.CostoMantenimiento + ", "
                    + "PromedioAcreditacion = '" + cuenta.PromedioAcreditacion + "', "
                    + "Moneda = '" + cuenta.Moneda + "' "
                    + "WHERE Id  = " + cuenta.Id;
            boolean execute = conexion.getQuerySQL().execute(sqlUpdateCuenta);
            conexion.conexionDB().close();
            return "Los datos de la cuenta " + cuenta.Id + " fueron modificados correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String eliminarCuentas(CuentasModels cuenta) {
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlDelete = "DELETE FROM Cuentas WHERE Id = " + cuenta.Id;
            boolean execute = conexion.getQuerySQL().execute(sqlDelete);
            conexion.conexionDB().close();
            return "El registro de la cuenta con IdCuenta " + cuenta.Id + " ha sido eliminado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public CuentasModels consultarCuentas(Integer id) {
        CuentasModels cuenta = new CuentasModels();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from cuentas where Id = " + id));
            if (conexion.getResultadoQuery().next()) {
                cuenta.IdCliente = conexion.getResultadoQuery().getInt("IdCliente");
                cuenta.NroCuenta = conexion.getResultadoQuery().getString("NroCuenta");
                cuenta.FechaAlta = conexion.getResultadoQuery().getDate("FechaAlta");
                cuenta.TipoCuenta = conexion.getResultadoQuery().getString("TipoCuenta");
                cuenta.NroContrato = conexion.getResultadoQuery().getString("NroContrato");

                return cuenta;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
