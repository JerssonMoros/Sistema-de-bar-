<%-- 
    Document   : distribuidorPanel
    Created on : 31-oct-2021, 12:52:06
    Author     : fabfl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Moe's Bar Panel de administracion</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-secondary ">
            <div class="container-fluid">
                <div class="collapse navbar-collapse " id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active text-white" aria-current="page" href="#">
                                <img src="https://www.universalstudioshollywood.com/tridiondata/ush/en/us/files/assets/logos/universal-moes-logo-new.png?imwidth=250" alt="30" width="80" />
                            </a>
                        </li>
                        <li class="nav-item my-auto ms-4">
                            <a class="btn btn-outline-light fw-bold" href="#">Panel de Administrador
                              <svg xmlns="http://www.w3.org/2000/svg" width="22" height="22" fill="currentColor" class="bi bi-hammer ms-4" viewBox="0 0 16 16">
                                  <path d="M9.972 2.508a.5.5 0 0 0-.16-.556l-.178-.129a5.009 5.009 0 0 0-2.076-.783C6.215.862 4.504 1.229 2.84 3.133H1.786a.5.5 0 0 0-.354.147L.146 4.567a.5.5 0 0 0 0 .706l2.571 2.579a.5.5 0 0 0 .708 0l1.286-1.29a.5.5 0 0 0 .146-.353V5.57l8.387 8.873A.5.5 0 0 0 14 14.5l1.5-1.5a.5.5 0 0 0 .017-.689l-9.129-8.63c.747-.456 1.772-.839 3.112-.839a.5.5 0 0 0 .472-.334z"/>
                              </svg>
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="dropdown ">
                    <button style="border:none;" class="btn  dropdown-toggle btn-outline-light me-4" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                       ${usuario.getNombres()} ${usuario.getApellidos()}
                    </button>
                    <ul class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton1">
                        <li>
                            <a class="dropdown-item" href="#">
                                <img src="https://cdn.pixabay.com/photo/2020/07/01/12/58/icon-5359553_960_720.png" alt="60" width="60"/>
                            </a>
                        </li>
                       <li><a class="dropdown-item" href="#">${usuario.getUserName()}</a></li>
                       <li><a class="dropdown-item" href="#">${usuario.getUserName()}@gmail.com</a></li>
                       <li><a class="dropdown-item" href="#">Administrador</a></li>
                       <li><hr class="dropdown-divider"></li>
                       <form action="Validar" method="POST">
                           <button name="accion" value="Salir" class="dropdown-item" >Salir</button>
                       </form>
                    </ul>
                </div>
        </nav>
        <div class="container p-4">
            <div class="card">
                <div class="card-body bg-secondary text-center text-white fs-5 fw-bold" style="--bs-bg-opacity: .5;">
                    Distribuidores
                </div>
            </div>
            <div class="d-flex">
                <div class="card col-sm-4">
                    <div class="card-body">
                        <form action="ControladorAdmin?menu=distribuidor" method="POST">
                            <div class="form-group">
                                <label class="form-label">Nombre distribuidor</label>
                                <input value="${distribuidor.getNombre()}" type="text" name="txtNombre" class="form-control"/>
                            </div>
                            <div class="form-group">
                                <label class="form-label">Direccion</label>
                                <input value="${distribuidor.getDireccion()}" type="text" name="txtDireccion" class="form-control"/>
                            </div>
                            <div class="form-group">
                                <label class="form-label">Telefono</label>
                                <input value="${distribuidor.getTelefono()}" type="number" name="txtTelefono" class="form-control"/>
                            </div>
                            <div class="form-group">
                                <label class="form-label">Correo</label>
                                <input value="${distribuidor.getCorreo()}" type="email" name="txtCorreo" class="form-control"/>
                            </div>
                            <div class="form-group">
                                <label class="form-label">Estado</label>
                                <input value="${distribuidor.getEstado()}" type="text" name="txtEstado" class="form-control"/>
                            </div>
                            <input type="submit" name="accion" value="Agregar" class="btn btn-primary" style="margin-top: 10px;"/>
                            <input type="submit" name="accion" value="Actualizar" class="btn btn-success" style="margin-top: 10px;"/>
                        </form>
                    </div>
                </div>
                <div class="col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRE</th>
                                <th>DIRECCION</th>
                                <th>TELEFONO</th>
                                <th>CORREO</th>
                                <th>ESTADO</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="dis" items="${distribuidores}">
                                <tr>
                                    <td>${cl.getId()}</td>
                                    <td>${cl.getDni()}</td>
                                    <td>${cl.getNombres()}</td>
                                    <td>${cl.getDireccion()}</td>
                                    <td>${cl.getEstado()}</td>
                                    <td>
                                        <a class="btn btn-warning" href="Controlador?menu=Cliente&accion=Editar&id=${cl.getId()}">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pen" viewBox="0 0 16 16">
                                                <path d="m13.498.795.149-.149a1.207 1.207 0 1 1 1.707 1.708l-.149.148a1.5 1.5 0 0 1-.059 2.059L4.854 14.854a.5.5 0 0 1-.233.131l-4 1a.5.5 0 0 1-.606-.606l1-4a.5.5 0 0 1 .131-.232l9.642-9.642a.5.5 0 0 0-.642.056L6.854 4.854a.5.5 0 1 1-.708-.708L9.44.854A1.5 1.5 0 0 1 11.5.796a1.5 1.5 0 0 1 1.998-.001zm-.644.766a.5.5 0 0 0-.707 0L1.95 11.756l-.764 3.057 3.057-.764L14.44 3.854a.5.5 0 0 0 0-.708l-1.585-1.585z"/>
                                            </svg>
                                        </a>
                                        <a class="btn btn-danger" href="Controlador?menu=Cliente&accion=Borrar&id=${cl.getId()}">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
                                                <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
                                                <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
                                              </svg>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>               
    </body>
</html>
