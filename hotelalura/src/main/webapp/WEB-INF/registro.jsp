
<%@page= "language="java" contentType="text/html; pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
    <head>
`       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <form action="ResgistroControlerSvlet" method="POST">
            <p><label>Nombre </label> <input type="text" name="nombre"> </p>
            <p><label>Apellido </label> <input type="text" name="apellido"></p>
            <p><label>Fecha nacimiento </label> <input type="date" name="fecha_nacimiento"></p>
            <p><label>Nacionalidad </label> <input type="text" name="nacionalidad"></p>
            <p><label>Telefono </label> <input type="text" name="telefono"></p>
            <p><label>Email </label> <input type="text" name="email"></p>
            <p><label>Contrasena </label> <input type="text" name="contrasena"></p>
            <button type="submit">Resgistrar</button>
        </form>
    </body>
</html>