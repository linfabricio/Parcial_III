package org.parcial_I.Services.Contactos;

import org.parcial_I.Infraestructure.DbManagment.contactos.Movimientos;
import org.parcial_I.Infraestructure.Models.MovimientosModels;

public class MovimientosService {

    Movimientos movimientosDB;

    public MovimientosService(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        movimientosDB = new Movimientos(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarMovimientos(MovimientosModels Movimientos) {
        if (validarDatos(Movimientos)) {
            return movimientosDB.registrarMovimientos(Movimientos);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public String modificarMovimientos(MovimientosModels Movimientos) {
        if (validarDatos(Movimientos)) {
            return movimientosDB.modificarMovimientos(Movimientos);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public String eliminarMovimientos(MovimientosModels Movimientos) {
        if (validarDatos(Movimientos)) {
            return movimientosDB.eliminarMovimientos(Movimientos);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public MovimientosModels consultarMovimientosPorId(int id) {
        return movimientosDB.consultarMovimientos(id);
    }

    private boolean validarDatos(MovimientosModels Movimientos) {
        try {

            if (Movimientos.IdCuenta == null) {
                throw new Exception("El id de la cuenta es requerido");
            }
            if (Movimientos.TipoMovimiento.isEmpty()) {
                throw new Exception("El tipo de movimiento es requerido");
            }
            if (Movimientos.MontoMovimiento < 0) {
                throw new Exception("El monto del movimiento no debe ser menor a 0");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }

}
