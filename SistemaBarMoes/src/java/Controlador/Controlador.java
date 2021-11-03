/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
        String perfil = request.getParameter("perfil");
        String accion = request.getParameter("accion");
        System.out.println("Perfil ="+perfil);
        System.out.println("Accion ="+accion);
        if(perfil.equals("admin")){
            /*if(accion.equals("controlDistri")){
                System.out.println(" Control Distri   asdadasdasd");
                
                request.getRequestDispatcher("../panelControl/distribuidorPanel.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("vistas/adminview.jsp").forward(request, response);
            }*/
            //Opciones de EMPLEADO
            /*if(menu.equals("Empleado")){
                switch(accion){
                    case "Listar":
                        List lista = emdao.listar();
                        request.setAttribute("empleados",lista);
                        break;
                    case "Agregar":
                        String dni = request.getParameter("txtDni");
                        String nombres = request.getParameter("txtNombres");
                        String tel = request.getParameter("txtTelefono");
                        String estado = request.getParameter("txtEstado");
                        String user = request.getParameter("txtUsuario");
                        em.setDni(dni);
                        em.setNombre(nombres);
                        em.setTel(tel);
                        em.setEstado(estado);
                        em.setUser(user);
                        emdao.agregar(em);
                        request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                        break;
                    case "Editar":
                        idEmpleado = Integer.parseInt(request.getParameter("id"));
                        Empleado emedit = emdao.listarId(idEmpleado);
                        request.setAttribute("empleado", emedit);
                        request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                        break;
                    case "Actualizar":
                        String dniActu = request.getParameter("txtDni");
                        String nombresActu = request.getParameter("txtNombres");
                        String telActu = request.getParameter("txtTelefono");
                        String estadoActu = request.getParameter("txtEstado");
                        String userActu = request.getParameter("txtUsuario");
                        em.setDni(dniActu);
                        //if(em.getDni().equals("")){break;}
                        em.setNombre(nombresActu);

                        em.setTel(telActu);
                        em.setEstado(estadoActu);
                        em.setUser(userActu);
                        em.setId(idEmpleado);
                        if(em.getDni().equals("") || em.getNombre().equals("") || em.getTel().equals("")|| em.getEstado().equals("")|| em.getUser().equals("")){
                            System.out.println("Error campos vacios");
                        }else{
                            emdao.editar(em);
                        }
                        request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                        break;
                    case "Borrar":
                        idEmpleado = Integer.parseInt(request.getParameter("id"));
                        emdao.borrar(idEmpleado);
                        request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                        break;
                    default:
                        throw new AssertionError();
                }


                request.getRequestDispatcher("vistas/Usuario.jsp").forward(request, response);

            }*/
        }
        if(perfil.equals("cajero")){
            request.getRequestDispatcher("vistas/cajeroview.jsp").forward(request, response);
        }
        if(perfil.equals("mesero")){
            request.getRequestDispatcher("vistas/meseroview.jsp").forward(request, response);
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
