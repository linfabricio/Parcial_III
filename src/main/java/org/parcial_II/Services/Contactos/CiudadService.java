package org.parcial_II.Services.Contactos;

import org.parcial_II.Infraestructure.DbManagment.contactos.Ciudad;
import org.parcial_II.Infraestructure.Models.CiudadModels;

public class CiudadService {

    Ciudad ciudadDB;

    public CiudadService(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        ciudadDB = new Ciudad(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCiudad(CiudadModels ciudad) {
        if (validarDatos(ciudad)) {
            return ciudadDB.registrarCiudad(ciudad);
        }
        return null;
    }

    public String modificarCiudad(CiudadModels ciudad) {
        if (validarDatos(ciudad)) {
            return ciudadDB.modificarCiudad(ciudad);
        }
        return null;
    }

    public String eliminarCiudad(CiudadModels ciudad) {
        if (validarDatos(ciudad)) {
            return ciudadDB.eliminarCiudad(ciudad);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public CiudadModels consultarCiudadPorId(int id) {
        return ciudadDB.consultarCiudad(id);
    }

    private boolean validarDatos(CiudadModels ciudad) {
        try {

            if (ciudad.Postal_Code == null) {
                throw new Exception("El codigo postal es requerido");
            }
            if (ciudad.Ciudad.isEmpty()) {
                throw new Exception("El nombre de la ciudad es requerido");
            }
            if (ciudad.Departamento.isEmpty()) {
                throw new Exception("El departamento es requerido");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }

}
