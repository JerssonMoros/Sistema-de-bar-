/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Modelo.PersonaDAO;
import config.MDfive;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabfl
 */
public class Validar extends HttpServlet {

    PersonaDAO personadao = new PersonaDAO();
    Persona persona = new Persona();
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        System.out.println("Accion "+accion);
        if(accion.equals("Salir")){
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if(accion.equals("Ingresar")){
            String user = request.getParameter("txtuser");
            String pass = request.getParameter("txtpass");
            String passEncripted = MDfive.getMD5(pass);
            persona = personadao.validar(user, passEncripted);
            System.out.println(persona.getApellidos());
            if(persona.getUserName() !=null && persona.getIdPerfil() == 1){
                request.setAttribute("usuario", persona);
                request.getRequestDispatcher("Controlador?perfil=admin&accion=inicio&sucursal=0").forward(request, response);
            }else if(persona.getUserName() !=null && persona.getIdPerfil() == 2){
                request.setAttribute("usuario", persona);
                request.getRequestDispatcher("Controlador?perfil=cajero&accion=inicio").forward(request, response);
            }else if(persona.getUserName() !=null && persona.getIdPerfil() == 3){
                request.setAttribute("usuario", persona);
                request.getRequestDispatcher("Controlador?perfil=mesero&accion=inicio&sucursal="+persona.getIdSucursal()).forward(request, response);
            }else if(persona.getUserName() == null){
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
