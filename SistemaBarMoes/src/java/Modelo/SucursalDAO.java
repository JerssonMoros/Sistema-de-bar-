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
public class SucursalDAO {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta;
    
    public Sucursal buscar(int id){
        Sucursal sucu = new Sucursal();
        String sql = "SELECT * FROM sucursal WHERE idSucursal="+id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                sucu.setId(rs.getInt(1));
                sucu.setNombre(rs.getString(2));
                sucu.setDireccion(rs.getString(3));
                sucu.setEstado(rs.getInt(4));
            }
        } catch (Exception e) {
            System.out.println("Error Cliente Buscar");
        }
        return sucu;
    }
    
    public List listar(){
        String sql = "SELECT * FROM sucursal where ORDER BY estado";
        List<Sucursal> lista = new ArrayList();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Sucursal sucu = new Sucursal();
                sucu.setId(rs.getInt(1));
                sucu.setNombre(rs.getString(2));
                sucu.setDireccion(rs.getString(3));
                sucu.setEstado(rs.getInt(4));
                lista.add(sucu);
            }
        } catch(Exception e){
            System.out.println("Error listar sucursal "+e);
        }
        return lista;
    } 
}
