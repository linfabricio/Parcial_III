package org.parcial_III.Infraestructure.DbManagment.contactos;

import org.parcial_III.Infraestructure.Conections.Conexiones;
import org.parcial_III.Infraestructure.Models.PersonaModels;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persona {

    private Conexiones conexion;

    public Persona(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(PersonaModels persona) {

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sql = "INSERT INTO Persona ("
                    + "IdCiudad, "
                    + "Nombre, "
                    + "Apellido, "
                    + "TipoDocumento, "
                    + "NroDocumento, "
                    + "Direccion, "
                    + "Celular, "
                    + "Email, "
                    + "Estado) "
                    + "VALUES ('"
                    + persona.IdCiudad + "', '"
                    + persona.Nombre + "', '"
                    + persona.Apellido + "', '"
                    + persona.TipoDocumento + "', '"
                    + persona.NroDocumento + "', '"
                    + persona.Direccion + "', '"
                    + persona.Celular + "', '"
                    + persona.Email + "', '"
                    + persona.Estado + "')";
            boolean execute = conexion.getQuerySQL().execute(sql);
            conexion.conexionDB().close();

            return "La persona " + persona.Nombre + " fue registrado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarPersona(PersonaModels persona) {
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE persona SET "
                    + "IdCiudad = '" + persona.IdCiudad + "', "
                    + "Nombre = '" + persona.Nombre + "', "
                    + "Apellido = '" + persona.Apellido + "', "
                    + "TipoDocumento = '" + persona.TipoDocumento + "', "
                    + "NroDocumento = '" + persona.NroDocumento + "', "
                    + "Direccion = '" + persona.Direccion + "', "
                    + "Celular = '" + persona.Celular + "', "
                    + "Email = '" + persona.Email + "', "
                    + "Estado = '" + persona.Estado + "' WHERE Id = " + persona.Id);
            conexion.conexionDB().close();
            return "Los datos de la persona " + persona.Nombre + " fue modificado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String eliminarPersona(PersonaModels persona) {
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlDelete = "DELETE FROM persona WHERE Id = " + persona.Id;
            boolean execute = conexion.getQuerySQL().execute(sqlDelete);
            conexion.conexionDB().close();
            return "El registro con Id " + persona.Id + " ha sido eliminado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public PersonaModels consultarPersona(int id) {
        PersonaModels persona = new PersonaModels();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from persona where Id = " + id));
            if (conexion.getResultadoQuery().next()) {
                return cargarDatosPersona(persona, conexion);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    private PersonaModels cargarDatosPersona(PersonaModels persona, Conexiones conexion) {
        try {
            persona.Nombre = conexion.getResultadoQuery().getString("Nombre");
            persona.Apellido = conexion.getResultadoQuery().getString("Apellido");
            persona.TipoDocumento = conexion.getResultadoQuery().getString("TipoDocumento");
            persona.NroDocumento = conexion.getResultadoQuery().getString("NroDocumento");
            persona.Celular = conexion.getResultadoQuery().getString("Celular");
            return persona;
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
