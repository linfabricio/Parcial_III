package org.parcial_I.Services.Contactos;

import org.parcial_I.Infraestructure.DbManagment.contactos.Cliente;
import org.parcial_I.Infraestructure.Models.ClienteModels;

public class ClienteService {

    Cliente clienteDB;

    public ClienteService(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        clienteDB = new Cliente(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCliente(ClienteModels cliente) {
        if (validarDatos(cliente)) {
            return clienteDB.registrarCliente(cliente);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public String modificarCliente(ClienteModels cliente) {
        if (validarDatos(cliente)) {
            return clienteDB.modificarCliente(cliente);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }
    
        public String eliminarCliente(ClienteModels cliente) {
        if (validarDatos(cliente)) {
            return clienteDB.eliminarCliente(cliente);
        }
        return "Ocurrió algún error, favor verificar los datos o comunicar con administrador";
    }

    public ClienteModels consultarClientePorId(int id) {
        return clienteDB.consultarCliente(id);
    }

    private boolean validarDatos(ClienteModels cliente) {
        try {

            if (cliente.IdPersona == null) {
                throw new Exception("El id de la persona es requerido");
            }
            if (cliente.Clasificacion.isEmpty()) {
                throw new Exception("La calificacion es requerido");
            }
            if (cliente.Estado.isEmpty()) {
                throw new Exception("El estado del cliente es requerido");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }

}
