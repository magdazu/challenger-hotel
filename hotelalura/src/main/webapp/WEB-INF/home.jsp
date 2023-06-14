<%
@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
!<!DOCTYPE html>
<html lang="es">
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel Alura</title>
    </head>
    <body>
        <h1>Iniciar sesion</h1>
        <form action="home.jsp" method="GET">
            <p>Email: ${huesped.email} <input type="text" placeholder="Username"> </p>
            <p>Contrasena: ${huesped.contrasena} <input type="text" placeholder="Contraseña"> </p>
            <button type="submit">Login</button>
        </form>
    </body>
</html>
