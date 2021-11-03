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
public class DistribuidorDAO {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta;
    
    public List listar(){
        String sql = "SELECT * FROM distribuidor";
        List<Distribuidor>lista = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Distribuidor dis = new Distribuidor();
                dis.setId(rs.getInt(1));
                dis.setNombre(rs.getString(2));
                dis.setDireccion(rs.getString(3));
                dis.setTelefono(rs.getString(4));
                dis.setCorreo(rs.getString(5));
                dis.setIdEstado(rs.getInt(6));
                lista.add(dis);
            }
        }catch(Exception e){
            System.out.println("Exception listar "+e);
        }
        return lista;
    }
    
}
