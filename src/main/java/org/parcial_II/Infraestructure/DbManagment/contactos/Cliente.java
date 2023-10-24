package org.parcial_II.Infraestructure.DbManagment.contactos;

import org.parcial_II.Infraestructure.Conections.Conexiones;
import org.parcial_II.Infraestructure.Models.ClienteModels;

import java.sql.SQLException;

public class Cliente {

    private Conexiones conexion;

    public Cliente(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCliente(ClienteModels cliente) {

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlCliente = "INSERT INTO Cliente ("
                    + "IdCliente, "
                    + "IdPersona, "
                    + "FechaIngreso, "
                    + "Clasificacion, "
                    + "Estado) "
                    + "VALUES ("
                    + cliente.IdCliente + ", "
                    + cliente.IdPersona + ", "
                    + "'" + cliente.FechaIngreso + "', "
                    + "'" + cliente.Clasificacion + "', "
                    + "'" + cliente.Estado + "')";
            boolean execute = conexion.getQuerySQL().execute(sqlCliente);
            conexion.conexionDB().close();
            return "El cliente " + cliente.IdCliente + " fue registrado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarCliente(ClienteModels cliente) {

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlUpdateCliente = "UPDATE Cliente SET "
                    + "IdPersona = " + cliente.IdPersona + ", "
                    + "FechaIngreso = '" + cliente.FechaIngreso + "', "
                    + "Clasificacion = '" + cliente.Clasificacion + "', "
                    + "Estado = '" + cliente.Estado + "' "
                    + "WHERE IdCliente = " + cliente.IdCliente;
            boolean execute = conexion.getQuerySQL().execute(sqlUpdateCliente);
            conexion.conexionDB().close();
            return "Los datos de la ciudad " + cliente.IdCliente + " fue modificado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String eliminarCliente(ClienteModels cliente) {
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            String sqlDelete = "DELETE FROM Cliente WHERE IdCliente = " + cliente.IdCliente;
            boolean execute = conexion.getQuerySQL().execute(sqlDelete);
            conexion.conexionDB().close();
            return "El registro del cliente con IdCliente " + cliente.IdCliente + " ha sido eliminado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ClienteModels consultarCliente(Integer id) {
        ClienteModels cliente = new ClienteModels();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from cliente where IdCliente = " + id));
            if (conexion.getResultadoQuery().next()) {
                cliente.IdPersona = conexion.getResultadoQuery().getInt("IdPersona");
                cliente.FechaIngreso = conexion.getResultadoQuery().getDate("FechaIngreso");

                return cliente;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
