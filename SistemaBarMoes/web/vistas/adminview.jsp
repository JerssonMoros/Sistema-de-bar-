<%-- 
    Document   : adminview
    Created on : 29-oct-2021, 19:42:32
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
        <div class="m-4" style="height:550px;">
            <iframe style="height:100%;width: 100%;" name="myFrame"></iframe>
        </div>               
                       
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
        
    </body>
</html>
