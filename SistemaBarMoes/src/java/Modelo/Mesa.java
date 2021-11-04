/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author fabfl
 */
public class Mesa {
    int id, num, idSucursal,ocupada;
    String EstadoLetra;

    public String getEstadoLetra() {
        return EstadoLetra;
    }

    public void setEstadoLetra() {
        if(this.ocupada==0){
            this.EstadoLetra = "Libre";
        }else{
            this.EstadoLetra = "Ocupada";
        }
    }

    public Mesa() {
    }

    public Mesa(int id, int num, int idSucursal, int ocupada) {
        this.id = id;
        this.num = num;
        this.idSucursal = idSucursal;
        this.ocupada = ocupada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public int getOcupada() {
        return ocupada;
    }

    public void setOcupada(int ocupada) {
        this.ocupada = ocupada;
    }
    
    
}
