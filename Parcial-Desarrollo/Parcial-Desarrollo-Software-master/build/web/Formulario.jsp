<%-- 
    Document   : Formulario
    Created on : 22/03/2019, 09:32:20 PM
    Author     : Orlando Castilla
--%>

<%@page import="java.awt.TrayIcon.MessageType"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Connect.db.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>FORMULARIO JSP & MYSQL</title>
    </head>
    <body>  
        <div class="container">
            <h1>Agregar Registro</h1>
            <hr>
            <form action="" method="post" class="form-control" style="width: 500px; height: 400px">
                Name:
                <input style="width: 200px; height: 15px"  type="text" name="txtName" class="form-control"/><br>
                <p></p>
                Last Name:
                <input type="text" name="txtLastName" class="form-control" style="width: 170px; height: 15px"/><br>
                <p></p>
                Email:
                <input style="width: 210px; height: 15px" type="text" name="txtBirth" class="form-control"/>
                <p></p>
                Lenguaje de Preferencia:
                <select>
                 <option value="Python">Python</option>
                 <option value="JS">JS</option>
                 <option value="Java">Java</option>
                 <option value="C++">C++</option>   
                </select>
                <p></p>
                <form action="/action_page.php">
                <input type="checkbox" name="Leer" value="Leer">Leer<br>
                <input type="checkbox" name="Ecribir" value="Escribir" checked>Escribir<br>
                <input type="checkbox" name="Programar" value="Programar">Programar<br>
                <input type="checkbox" name="Correr" value="Correr">Correr<br>
                </form>
                <input type="submit" value="Guardar" class="btn btn-primary btn-lg"/>
        </div>
    
    </body>
</html>
