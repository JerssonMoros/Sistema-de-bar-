/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author fabfl
 */
public class MesaDAO {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta;
    
    public List listar(int sucursal){
        String sql = "SELECT * FROM mesa where idSucursal="+sucursal+" ORDER BY ocupada";
        List<Mesa> lista = new ArrayList();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Mesa mesa = new Mesa();
                mesa.setId(rs.getInt(1));
                mesa.setNum(rs.getInt(2));
                mesa.setIdSucursal(rs.getInt(3));
                mesa.setOcupada(rs.getInt(4));
                mesa.setEstadoLetra();
                lista.add(mesa);
            }
        } catch(Exception e){
            System.out.println("Error listar mesa "+e);
        }
        return lista;
    }
    public Mesa buscar(int id){
        String sql = "SELECT * FROM mesa where idMesa="+id;
        Mesa mesa = new Mesa();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                mesa.setId(rs.getInt(1));
                mesa.setNum(rs.getInt(2));
                mesa.setIdSucursal(rs.getInt(3));
                mesa.setOcupada(rs.getInt(4));
                mesa.setEstadoLetra();
            }
        } catch(Exception e){
            System.out.println("Error listar mesa "+e);
        }
        return mesa;
    }
}
