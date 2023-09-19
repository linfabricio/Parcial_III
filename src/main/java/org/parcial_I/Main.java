package org.parcial_I;

import java.sql.Date;
import org.parcial_I.Infraestructure.Models.PersonaModels;
import org.parcial_I.Infraestructure.Models.CiudadModels;
import org.parcial_I.Infraestructure.Models.ClienteModels;
import org.parcial_I.Infraestructure.Models.CuentasModels;
import org.parcial_I.Infraestructure.Models.MovimientosModels;
import org.parcial_I.Services.Contactos.PersonaService;
import org.parcial_I.Services.Contactos.CiudadService;
import org.parcial_I.Services.Contactos.ClienteService;
import org.parcial_I.Services.Contactos.CuentasService;
import org.parcial_I.Services.Contactos.MovimientosService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        /* 
        Ciudad ABM
         */
        
//       CREATE TABLE Ciudad (
//    Id serial PRIMARY KEY,
//    Ciudad VARCHAR(255),
//    Departamento VARCHAR(255),
//    Postal_Code INTEGER
//); 
    
//        CiudadService ciudadService = new CiudadService("postgres", "root", "localhost", "5432", "postgres");
//        CiudadModels ciudad = new CiudadModels();
//        ciudad.Id = 1;
//        ciudad.Ciudad = "Lambare";
//        ciudad.Departamento = "Central";
//        ciudad.Postal_Code = 110721;
//        ciudadService.registrarCiudad(ciudad);
//        ciudadService.modificarCiudad(ciudad);
//        ciudadService.eliminarCiudad(ciudad);
//        ciudad = ciudadService.consultarCiudadPorId(ciudad.Id);
//
//        if (ciudad != null) {
//            System.out.println("Ciudad encontrada:");
//            System.out.println("Nombre de la ciudad: " + ciudad.Ciudad);
//            System.out.println("Departamento: " + ciudad.Departamento);
//        } else {
//            System.out.println("Ciudad no encontrada.");
//        }

        /* 
        Persona ABM
         */
        
//CREATE TABLE Persona (
//    Id serial PRIMARY KEY,
//    IdCiudad INTEGER REFERENCES Ciudad (Id),
//    Nombre VARCHAR(255),
//    Apellido VARCHAR(255),
//    TipoDocumento VARCHAR(50),
//    NroDocumento VARCHAR(20),
//    Direccion VARCHAR(255),
//    Celular VARCHAR(15),
//    Email VARCHAR(255),
//    Estado VARCHAR(20)
//);        
        
//        PersonaService personaService = new PersonaService("postgres", "root", "localhost", "5432", "postgres");
//        PersonaModels persona = new PersonaModels();
//        persona.Id = 1;
//        persona.IdCiudad = 1;
//        persona.Nombre = "Fabricio";
//        persona.Apellido = "Lin";
//        persona.TipoDocumento = "CI";
//        persona.NroDocumento = "5166839";
//        persona.Direccion = "Lambare";
//        persona.Celular = "0984948036";
//        persona.Email = "fabriciolin70@gmail.com";
//        persona.Estado = "Soltero";
//        personaService.registrarPersona(persona);
//        personaService.modificarPersona(persona);
//        personaService.eliminarPersona(persona);
//        persona = personaService.consultarPersonaPorId(persona.Id);
//
//        if (persona != null) {
//            System.out.println("Persona encontrada:");
//            System.out.println("Nombre de la persona: " + persona.Nombre);
//            System.out.println("Apellido de la persona: " + persona.Apellido);
//            System.out.println("TipoDocumento de la persona: " + persona.TipoDocumento);
//            System.out.println("NroDocumento de la persona: " + persona.NroDocumento);
//            System.out.println("Celular de la persona: " + persona.Celular);
//        } else {
//            System.out.println("Persona no encontrada.");
//        }
        /* 
        Cliente ABM
         */
        
//CREATE TABLE Cliente (
//    IdCliente serial PRIMARY KEY,
//    IdPersona INTEGER REFERENCES Persona (Id),
//    FechaIngreso TIMESTAMP,
//    Clasificacion VARCHAR(255),
//    Estado VARCHAR(20)
//);        
        
//        ClienteService clienteService = new ClienteService("postgres", "root", "localhost", "5432", "postgres");
//        ClienteModels cliente = new ClienteModels();
//        cliente.IdCliente = 0;
//        cliente.IdPersona = 1;
//        cliente.FechaIngreso = Date.valueOf("2003-01-06");
//        cliente.Clasificacion = "5 Estrellas";
//        cliente.Estado = "Soltero";
//        clienteService.registrarCliente(cliente);
//        clienteService.modificarCliente(cliente);
//        clienteService.eliminarCliente(cliente);
//        cliente = clienteService.consultarClientePorId(cliente.IdCliente);
//
//        if (cliente != null) {
//            System.out.println("Cliente encontrada:");
//            System.out.println("Id del persona: " + cliente.IdPersona);
//            System.out.println("Fecha de ingreso: " + cliente.FechaIngreso);
//        } else {
//            System.out.println("Cliente no encontrada.");
//        }

        /* 
        Cuentas ABM
         */
        
//CREATE TABLE Cuentas (
//    Id serial PRIMARY KEY,
//    IdCliente INTEGER REFERENCES Cliente (IdCliente),
//    NroCuenta VARCHAR(255),
//    FechaAlta TIMESTAMP,
//    TipoCuenta VARCHAR(255),
//    Estado VARCHAR(20),
//    Saldo DECIMAL,
//    NroContrato VARCHAR(255),
//    CostoMantenimiento DECIMAL,
//    PromedioAcreditacion VARCHAR(255),
//    Moneda VARCHAR(20)
//);        
        
//        CuentasService cuentasService = new CuentasService("postgres", "root", "localhost", "5432", "postgres");
//        CuentasModels cuentas = new CuentasModels();
//        cuentas.Id = 1;
//        cuentas.IdCliente = 0;
//        cuentas.NroCuenta = "1357910";
//        cuentas.FechaAlta = Date.valueOf("2003-01-06");
//        cuentas.TipoCuenta = "Caja ahorro";
//        cuentas.Estado = "Soltero";
//        cuentas.Saldo = 100.1;
//        cuentas.NroContrato = "Soltero";
//        cuentas.CostoMantenimiento = 10.1;
//        cuentas.PromedioAcreditacion = "Prueba";
//        cuentas.Moneda = "Guaranies";
//        cuentasService.registrarCuentas(cuentas);
//        cuentasService.modificarCuentas(cuentas);
//        cuentasService.eliminarCuentas(cuentas);
//        cuentas = cuentasService.consultarCuentasPorId(cuentas.Id);
//
//        if (cuentas != null) {
//            System.out.println("Cuenta encontrada:");
//            System.out.println("Id del cliente de la cuenta: " + cuentas.IdCliente);
//            System.out.println("Numero de la cuenta: " + cuentas.NroCuenta);
//            System.out.println("Fecha de alta: " + cuentas.FechaAlta);
//            System.out.println("Tipo de cuenta: " + cuentas.TipoCuenta);
//            System.out.println("Numero de contrato: " + cuentas.NroContrato);
//        } else {
//            System.out.println("Cuenta no encontrada.");
//        }

        /* 
        Movimientos ABM
         */
        
//CREATE TABLE Movimientos (
//    IdMovimiento serial PRIMARY KEY,
//    IdCuenta INTEGER REFERENCES Cuentas (Id),
//    FechaMovimiento TIMESTAMP,
//    TipoMovimiento VARCHAR(255),
//    SaldoAnterior DECIMAL,
//    SaldoActual DECIMAL,
//    MontoMovimiento DECIMAL,
//    CuentaOrigen DECIMAL,
//    CuentaDestino DECIMAL,
//    Canal DECIMAL
//);        
        
//        MovimientosService movimientosService = new MovimientosService("postgres", "root", "localhost", "5432", "postgres");
//        MovimientosModels movimientos = new MovimientosModels();
//        movimientos.IdMovimiento = 1;
//        movimientos.IdCuenta = 1;
//        movimientos.FechaMovimiento = Date.valueOf("2003-01-06");
//        movimientos.TipoMovimiento = "Ventas";
//        movimientos.SaldoAnterior = 1000.05;
//        movimientos.SaldoActual = 2000.9;
//        movimientos.MontoMovimiento = 100.4;
//        movimientos.CuentaOrigen = 123456789;
//        movimientos.CuentaDestino = 987654321;
//        movimientos.Canal = 123;
//        movimientosService.registrarMovimientos(movimientos);
//        movimientosService.modificarMovimientos(movimientos);
//        movimientosService.eliminarMovimientos(movimientos);
//        movimientos = movimientosService.consultarMovimientosPorId(movimientos.IdMovimiento);
//
//        if (movimientos != null) {
//            System.out.println("Movimiento encontrada:");
//            System.out.println("Id del movimiento: " + movimientos.IdMovimiento);
//            System.out.println("Numero de la cuenta asociada: " + movimientos.IdCuenta);
//            System.out.println("Fecha del movimiento: " + movimientos.FechaMovimiento);
//            System.out.println("Tipo de movimiento: " + movimientos.TipoMovimiento);
//            System.out.println("Monto del movimiento: " + movimientos.MontoMovimiento);
//        } else {
//            System.out.println("Movimiento no encontrada.");
//        }
    }

}
