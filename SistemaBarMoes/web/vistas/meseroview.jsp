<%-- 
    Document   : meseroview
    Created on : 29-oct-2021, 23:00:26
    Author     : fabfl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Moe's Bar</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-secondary text-center">
            <div class="container-fluid">
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                      <li class="nav-item">
                          <a class="nav-link active text-white" aria-current="page" href="#">
                              <img src="https://www.universalstudioshollywood.com/tridiondata/ush/en/us/files/assets/logos/universal-moes-logo-new.png?imwidth=250" alt="30" width="80" />
                          </a>
                      </li>
                        <li class="nav-item my-auto ms-4">
                            <a class="btn btn-outline-light fw-bold" href="#">Panel de Mesero
                              <svg xmlns="http://www.w3.org/2000/svg" width="22" height="22" fill="currentColor" class="bi bi-cart3 ms-4" viewBox="0 0 16 16">
                                <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .49.598l-1 5a.5.5 0 0 1-.465.401l-9.397.472L4.415 11H13a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l.84 4.479 9.144-.459L13.89 4H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
                              </svg>
                            </a>
                        </li>                      
                </div>
                <div class="dropdown ">
                    <button style="border:none;" class="btn  dropdown-toggle btn-outline-light  me-4" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
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
                       <li><a class="dropdown-item" href="#">Mesero</a></li>
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
