package org.parcial_I.Services.Contactos;

import org.parcial_I.Infraestructure.DbManagment.contactos.Cuentas;
import org.parcial_I.Infraestructure.Models.CuentasModels;

public class CuentasService {

    Cuentas cuentasDB;

    public CuentasService(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        cuentasDB = new Cuentas(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCuentas(CuentasModels cuentas) {
        if (validarDatos(cuentas)) {
            return cuentasDB.registrarCuentas(cuentas);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public String modificarCuentas(CuentasModels cuentas) {
        if (validarDatos(cuentas)) {
            return cuentasDB.modificarCuentas(cuentas);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }
    
        public String eliminarCuentas(CuentasModels cuentas) {
        if (validarDatos(cuentas)) {
            return cuentasDB.eliminarCuentas(cuentas);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public CuentasModels consultarCuentasPorId(int id) {
        return cuentasDB.consultarCuentas(id);
    }

    private boolean validarDatos(CuentasModels cliente) {
        try {

            if (cliente.IdCliente == null) {
                throw new Exception("El id del cliente es requerido");
            }
            if (cliente.NroCuenta.isEmpty()) {
                throw new Exception("El numero de cuenta es requerido");
            }
            if (cliente.TipoCuenta.isEmpty()) {
                throw new Exception("El tipo de cuenta es requerido");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }

}
