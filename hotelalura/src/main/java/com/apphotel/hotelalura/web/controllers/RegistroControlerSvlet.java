package com.apphotel.hotelalura.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

@Controller
@WebServlet(name = "RegistroControladorSvlet", urlPatterns = { "/RegistroControladorSvlet" })
public class RegistroControlerSvlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fecha_nacimiento = request.getParameter("fecha_nacimiento");
        String nacionalidad = request.getParameter("nacionalidad");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        String contrasena = request.getParameter("contrasena");

        response.sendRedirect("registro.jsp");
    }

}
