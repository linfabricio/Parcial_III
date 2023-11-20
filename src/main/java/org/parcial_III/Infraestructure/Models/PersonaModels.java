package org.parcial_III.Infraestructure.Models;

public class PersonaModels {

    public int Id;
    public Integer IdCiudad;
    public String Nombre;
    public String Apellido;
    public String TipoDocumento;
    public String NroDocumento;
    public String Direccion;
    public String Celular;
    public String Email;
    public String Estado;

    public PersonaModels(int Id, Integer IdCiudad, String Nombre, String Apellido, String TipoDocumento, String NroDocumento, String Direccion, String Celular, String Email, String Estado) {
        this.Id = Id;
        this.IdCiudad = IdCiudad;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.TipoDocumento = TipoDocumento;
        this.NroDocumento = NroDocumento;
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.Email = Email;
        this.Estado = Estado;
    }

    public PersonaModels() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Integer getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(Integer IdCiudad) {
        this.IdCiudad = IdCiudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNroDocumento() {
        return NroDocumento;
    }

    public void setNroDocumento(String NroDocumento) {
        this.NroDocumento = NroDocumento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
