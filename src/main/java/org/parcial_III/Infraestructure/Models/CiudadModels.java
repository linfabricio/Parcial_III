package org.parcial_III.Infraestructure.Models;

public class CiudadModels {

    public int Id;
    public String Ciudad;
    public String Departamento;
    public Integer Postal_Code;

    public CiudadModels(int Id, String Ciudad, String Departamento, Integer Postal_Code) {
        this.Id = Id;
        this.Ciudad = Ciudad;
        this.Departamento = Departamento;
        this.Postal_Code = Postal_Code;
    }
    
    
    public CiudadModels() {
    }

    public int getId() {
        return Id;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public Integer getPostal_Code() {
        return Postal_Code;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public void setPostal_Code(Integer Postal_Code) {
        this.Postal_Code = Postal_Code;
    }

}
