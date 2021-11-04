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

/**
 *
 * @author fabfl
 */
public class PersonaDAO {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta;
    
    public Persona validar(String user, String contra){
        Persona per = new Persona();
        String sql = "select * from personal where nombreUsuario=? and contrasena=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, contra);
            rs = ps.executeQuery();
            while(rs.next()){
                per.setId(rs.getInt("idPersonal"));
                per.setDni(rs.getString("numeroIdentificacion"));
                per.setNombres(rs.getString("nombres"));
                per.setApellidos(rs.getString("apellidos"));
                per.setCelular(rs.getString("numeroCelular"));
                per.setUserName(rs.getString("nombreUsuario"));
                per.setContrasena(rs.getString("contrasena"));
                per.setIdEstado(rs.getInt("idEstado"));
                per.setIdSucursal(rs.getInt("idSucursal"));
                per.setIdPerfil(rs.getInt("idPerfil"));
            }
        } catch (Exception e) {
            System.out.println("Validar" + e);
        }
        return per;
    }
    public Persona buscar(int id){
        Persona per = new Persona();
        String sql = "select * from personal where idPersonal="+id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                per.setId(rs.getInt("idPersonal"));
                per.setDni(rs.getString("numeroIdentificacion"));
                per.setNombres(rs.getString("nombres"));
                per.setApellidos(rs.getString("apellidos"));
                per.setCelular(rs.getString("numeroCelular"));
                per.setUserName(rs.getString("nombreUsuario"));
                per.setContrasena(rs.getString("contrasena"));
                per.setIdEstado(rs.getInt("idEstado"));
                per.setIdSucursal(rs.getInt("idSucursal"));
                per.setIdPerfil(rs.getInt("idPerfil"));
            }
        }
        catch(Exception e){
            System.out.println("Exception Listar "+e);
        }
        return per;
    }
    
}
