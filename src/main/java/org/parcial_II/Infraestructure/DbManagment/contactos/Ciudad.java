package org.parcial_II.Infraestructure.DbManagment.contactos;

import org.parcial_II.Infraestructure.Conections.Conexiones;
import org.parcial_II.Infraestructure.Models.CiudadModels;

import java.sql.SQLException;

public class Ciudad {

    private Conexiones conexion;

    public Ciudad(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCiudad(CiudadModels ciudad) {
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlCiudad = "INSERT INTO Ciudad ("
                    + "Ciudad, "
                    + "Departamento, "
                    + "Postal_Code) "
                    + "VALUES ('"
                    + ciudad.Ciudad + "', '"
                    + ciudad.Departamento + "', '"
                    + ciudad.Postal_Code + "')";

            boolean execute = conexion.getQuerySQL().execute(sqlCiudad);
            conexion.conexionDB().close();

            return "La ciudad " + ciudad.Ciudad + " fue registrado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarCiudad(CiudadModels ciudad) {

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE Ciudad SET "
                    + "Ciudad = '" + ciudad.Ciudad + "', "
                    + "Departamento = '" + ciudad.Departamento + "', "
                    + "Postal_Code = '" + ciudad.Postal_Code + "' "
                    + "WHERE Id = " + ciudad.Id);
            conexion.conexionDB().close();
            return "Los datos de la ciudad " + ciudad.Ciudad + " fue modificado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String eliminarCiudad(CiudadModels ciudad) {
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlDelete = "DELETE FROM Ciudad WHERE Id = " + ciudad.Id;
            boolean execute = conexion.getQuerySQL().execute(sqlDelete);
            conexion.conexionDB().close();
            return "El registro de la ciudad con Id " + ciudad.Id + " ha sido eliminado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public CiudadModels consultarCiudad(Integer id) {
        CiudadModels ciudad = new CiudadModels();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from ciudad where Id = " + id));
            if (conexion.getResultadoQuery().next()) {
                ciudad.Ciudad = conexion.getResultadoQuery().getString("Ciudad");
                ciudad.Departamento = conexion.getResultadoQuery().getString("Departamento");
                ciudad.Postal_Code = conexion.getResultadoQuery().getInt("Postal_Code");
                
                return ciudad;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
