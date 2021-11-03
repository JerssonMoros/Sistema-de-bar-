package org.apache.jsp.vistas.panelControl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class distribuidorPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Moe's Bar Panel de administracion</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-secondary \">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"collapse navbar-collapse \" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active text-white\" aria-current=\"page\" href=\"#\">\n");
      out.write("                                <img src=\"https://www.universalstudioshollywood.com/tridiondata/ush/en/us/files/assets/logos/universal-moes-logo-new.png?imwidth=250\" alt=\"30\" width=\"80\" />\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item my-auto ms-4\">\n");
      out.write("                            <a class=\"btn btn-outline-light fw-bold\" href=\"#\">Panel de Administrador\n");
      out.write("                              <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"22\" height=\"22\" fill=\"currentColor\" class=\"bi bi-hammer ms-4\" viewBox=\"0 0 16 16\">\n");
      out.write("                                  <path d=\"M9.972 2.508a.5.5 0 0 0-.16-.556l-.178-.129a5.009 5.009 0 0 0-2.076-.783C6.215.862 4.504 1.229 2.84 3.133H1.786a.5.5 0 0 0-.354.147L.146 4.567a.5.5 0 0 0 0 .706l2.571 2.579a.5.5 0 0 0 .708 0l1.286-1.29a.5.5 0 0 0 .146-.353V5.57l8.387 8.873A.5.5 0 0 0 14 14.5l1.5-1.5a.5.5 0 0 0 .017-.689l-9.129-8.63c.747-.456 1.772-.839 3.112-.839a.5.5 0 0 0 .472-.334z\"/>\n");
      out.write("                              </svg>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown \">\n");
      out.write("                    <button style=\"border:none;\" class=\"btn  dropdown-toggle btn-outline-light me-4\" type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getApellidos()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </button>\n");
      out.write("                    <ul class=\"dropdown-menu text-center\" aria-labelledby=\"dropdownMenuButton1\">\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                <img src=\"https://cdn.pixabay.com/photo/2020/07/01/12/58/icon-5359553_960_720.png\" alt=\"60\" width=\"60\"/>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                       <li><a class=\"dropdown-item\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUserName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                       <li><a class=\"dropdown-item\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUserName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("@gmail.com</a></li>\n");
      out.write("                       <li><a class=\"dropdown-item\" href=\"#\">Administrador</a></li>\n");
      out.write("                       <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                       <form action=\"Validar\" method=\"POST\">\n");
      out.write("                           <button name=\"accion\" value=\"Salir\" class=\"dropdown-item\" >Salir</button>\n");
      out.write("                       </form>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container p-4\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-body bg-secondary text-center text-white fs-5 fw-bold\" style=\"--bs-bg-opacity: .5;\">\n");
      out.write("                    Distribuidores\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"d-flex\">\n");
      out.write("                <div class=\"card col-sm-4\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <form action=\"ControladorAdmin?menu=distribuidor\" method=\"POST\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"form-label\">Nombre distribuidor</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${distribuidor.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"txtNombre\" class=\"form-control\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"form-label\">Direccion</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${distribuidor.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"txtDireccion\" class=\"form-control\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"form-label\">Telefono</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${distribuidor.getTelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"number\" name=\"txtTelefono\" class=\"form-control\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"form-label\">Correo</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${distribuidor.getCorreo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"email\" name=\"txtCorreo\" class=\"form-control\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"form-label\">Estado</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${distribuidor.getEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" name=\"txtEstado\" class=\"form-control\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"btn btn-primary\" style=\"margin-top: 10px;\"/>\n");
      out.write("                            <input type=\"submit\" name=\"accion\" value=\"Actualizar\" class=\"btn btn-success\" style=\"margin-top: 10px;\"/>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <table class=\"table table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>DNI</th>\n");
      out.write("                                <th>NOMBRES</th>\n");
      out.write("                                <th>DIRECCION</th>\n");
      out.write("                                <th>ESTADO</th>\n");
      out.write("                                <th>ACCIONES</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <c:forEach var=\"cl\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientes}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cl.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cl.getDni()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cl.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cl.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cl.getEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <a class=\"btn btn-warning\" href=\"Controlador?menu=Cliente&accion=Editar&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cl.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-pen\" viewBox=\"0 0 16 16\">\n");
      out.write("                                                <path d=\"m13.498.795.149-.149a1.207 1.207 0 1 1 1.707 1.708l-.149.148a1.5 1.5 0 0 1-.059 2.059L4.854 14.854a.5.5 0 0 1-.233.131l-4 1a.5.5 0 0 1-.606-.606l1-4a.5.5 0 0 1 .131-.232l9.642-9.642a.5.5 0 0 0-.642.056L6.854 4.854a.5.5 0 1 1-.708-.708L9.44.854A1.5 1.5 0 0 1 11.5.796a1.5 1.5 0 0 1 1.998-.001zm-.644.766a.5.5 0 0 0-.707 0L1.95 11.756l-.764 3.057 3.057-.764L14.44 3.854a.5.5 0 0 0 0-.708l-1.585-1.585z\"/>\n");
      out.write("                                            </svg>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a class=\"btn btn-danger\" href=\"Controlador?menu=Cliente&accion=Borrar&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cl.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-trash\" viewBox=\"0 0 16 16\">\n");
      out.write("                                                <path d=\"M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z\"/>\n");
      out.write("                                                <path fill-rule=\"evenodd\" d=\"M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z\"/>\n");
      out.write("                                              </svg>\n");
      out.write("                                        </a>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </c:forEach>\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>               \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
