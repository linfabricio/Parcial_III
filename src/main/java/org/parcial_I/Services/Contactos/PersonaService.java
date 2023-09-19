package org.parcial_I.Services.Contactos;

import org.parcial_I.Infraestructure.DbManagment.contactos.Persona;
import org.parcial_I.Infraestructure.Models.PersonaModels;

public class PersonaService {

    Persona personasDB;

    public PersonaService(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        personasDB = new Persona(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(PersonaModels persona) {
        if (validarDatos(persona)) {
            return personasDB.registrarPersona(persona);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public String modificarPersona(PersonaModels persona) {
        if (validarDatos(persona)) {
            return personasDB.modificarPersona(persona);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public String eliminarPersona(PersonaModels persona) {
        if (validarDatos(persona)) {
            return personasDB.eliminarPersona(persona);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public PersonaModels consultarPersonaPorId(int id) {
        return personasDB.consultarPersona(id);
    }

    private boolean validarDatos(PersonaModels persona) {
        try {

            if (persona.IdCiudad == null) {
                throw new Exception("El id de la ciudad no debe estar vacío");
            }
            if (persona.Nombre.isEmpty()) {
                throw new Exception("El nombre es requerido");
            }
            if (persona.Apellido.isEmpty()) {
                throw new Exception("El apellido es requerido");
            }
            if (persona.TipoDocumento.isEmpty()) {
                throw new Exception("El tipo de documento es requerido");
            }
            if (persona.NroDocumento.isEmpty()) {
                throw new Exception("El numero del documento es requerido");
            }
            if (persona.Direccion.isEmpty()) {
                throw new Exception("La direccion es requerido");
            }
            if (persona.Celular.isEmpty()) {
                throw new Exception("El numero del telefono es requerido");
            }
            if (persona.Email.isEmpty()) {
                throw new Exception("El email es requerido");
            }
            if (persona.Estado.isEmpty()) {
                throw new Exception("El estado es requerido");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }

}
