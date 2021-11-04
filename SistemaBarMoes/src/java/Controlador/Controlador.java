/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Mesa;
import Modelo.MesaDAO;
import Modelo.Persona;
import Modelo.PersonaDAO;
import Modelo.Sucursal;
import Modelo.SucursalDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabfl
 */
public class Controlador extends HttpServlet {

    Mesa mesa = new Mesa();
    MesaDAO mesadao = new MesaDAO();
    int idMesa;
    int numMesa = 0;
    
    
    Sucursal sucu = new Sucursal();
    SucursalDAO sucudao = new SucursalDAO();
    int idSucu;
    
    PersonaDAO personadao = new PersonaDAO();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String perfil = request.getParameter("perfil");
        String accion = request.getParameter("accion");
        int sucursal = Integer.parseInt(request.getParameter("sucursal"));
        System.out.println("Perfil ="+perfil);
        System.out.println("Accion ="+accion);
        if(perfil.equals("mesero")){
            switch (accion) {
                case "inicio":
                    System.out.println("Hola inicio");
                    List mesas = mesadao.listar(sucursal);
                    request.setAttribute("mesas",mesas);
                    Sucursal sucubuscado = sucudao.buscar(sucursal);
                    request.setAttribute("sucursal",sucubuscado);
                    break;
                case "irmesa":
                    idMesa = Integer.parseInt(request.getParameter("id"));
                    int idMesero = Integer.parseInt(request.getParameter("mesero"));
                    Persona mesero = personadao.buscar(idMesero);
                    request.setAttribute("usuario",mesero);
                    Mesa mesabuscada = mesadao.buscar(idMesa);
                    request.setAttribute("mesa",mesabuscada);
                    sucubuscado = sucudao.buscar(sucursal);
                    request.setAttribute("sucursal",sucubuscado);
                    request.getRequestDispatcher("vistas/mesaview.jsp").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            
        }
        if(perfil.equals("cajero")){
            request.getRequestDispatcher("vistas/cajeroview.jsp").forward(request, response);
        }
        if(perfil.equals("admin")){
            request.getRequestDispatcher("vistas/adminview.jsp").forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
