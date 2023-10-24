package org.parcial_I.Infraestructure.DbManagment.contactos;

import org.parcial_I.Infraestructure.Conections.Conexiones;
import org.parcial_I.Infraestructure.Models.MovimientosModels;

import java.sql.SQLException;

public class Movimientos {

    private Conexiones conexion;

    public Movimientos(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarMovimientos(MovimientosModels movimientos) {

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlMovimiento = "INSERT INTO Movimientos ("
                    + "IdCuenta, "
                    + "FechaMovimiento, "
                    + "TipoMovimiento, "
                    + "SaldoAnterior, "
                    + "SaldoActual, "
                    + "MontoMovimiento, "
                    + "CuentaOrigen, "
                    + "CuentaDestino, "
                    + "Canal) "
                    + "VALUES ("
                    + movimientos.IdCuenta + ", "
                    + "'" + movimientos.FechaMovimiento + "', "
                    + "'" + movimientos.TipoMovimiento + "', "
                    + movimientos.SaldoAnterior + ", "
                    + movimientos.SaldoActual + ", "
                    + movimientos.MontoMovimiento + ", "
                    + movimientos.CuentaOrigen + ", "
                    + movimientos.CuentaDestino + ", "
                    + movimientos.Canal + ")";
            boolean execute = conexion.getQuerySQL().execute(sqlMovimiento);
            conexion.conexionDB().close();
            return "El movimiento " + movimientos.IdMovimiento + " fue registrado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarMovimientos(MovimientosModels movimientos) {

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE Movimientos SET "
                    + "IdCuenta = " + movimientos.IdCuenta + ", "
                    + "FechaMovimiento = '" + movimientos.FechaMovimiento + "', "
                    + "TipoMovimiento = '" + movimientos.TipoMovimiento + "', "
                    + "SaldoAnterior = " + movimientos.SaldoAnterior + ", "
                    + "SaldoActual = " + movimientos.SaldoActual + ", "
                    + "MontoMovimiento = " + movimientos.MontoMovimiento + ", "
                    + "CuentaOrigen = " + movimientos.CuentaOrigen + ", "
                    + "CuentaDestino = " + movimientos.CuentaDestino + ", "
                    + "Canal = " + movimientos.Canal + " "
                    + "WHERE IdMovimiento = " + movimientos.IdMovimiento);
            conexion.conexionDB().close();
            return "Los datos del movimiento con Id " + movimientos.IdMovimiento + " fueron modificados correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String eliminarMovimientos(MovimientosModels movimientos) {
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlDelete = "DELETE FROM movimientos WHERE IdMovimiento = " + movimientos.IdMovimiento;
            boolean execute = conexion.getQuerySQL().execute(sqlDelete);
            conexion.conexionDB().close();
            return "El registro del movimiento con Id " + movimientos.IdMovimiento + " ha sido eliminado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public MovimientosModels consultarMovimientos(Integer id) {
        MovimientosModels movimientos = new MovimientosModels();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from movimientos where IdMovimiento = " + id));
            if (conexion.getResultadoQuery().next()) {
                movimientos.IdMovimiento = conexion.getResultadoQuery().getInt("IdMovimiento");
                movimientos.IdCuenta = conexion.getResultadoQuery().getInt("IdCuenta");
                movimientos.FechaMovimiento = conexion.getResultadoQuery().getDate("FechaMovimiento");
                movimientos.TipoMovimiento = conexion.getResultadoQuery().getString("TipoMovimiento");
                movimientos.MontoMovimiento = conexion.getResultadoQuery().getInt("MontoMovimiento");

                return movimientos;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
