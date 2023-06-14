package com.apphotel.hotelalura.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apphotel.hotelalura.web.models.Huesped;
import com.apphotel.hotelalura.web.services.HuespedServiceImpl;

@RestController
public class HuespedControler {

    @Autowired
    private HuespedServiceImpl huespedServiceImpl;

    @RequestMapping("/eliminar/huesped")
    public String eliminarHuesped(@PathVariable Integer id) {
        return huespedServiceImpl.eliminarHuesped(id);
    }

    @RequestMapping("/actualizar/huesped")
    public String actualizarHuesped(@RequestBody Huesped huesped) {
        if (huesped.getHuesped_id() != null) {
            String mensaje = huespedServiceImpl.actualizarHuesped(huesped);
            return mensaje;
        }
        return "No se actualizara huesped";
    }

    @RequestMapping("/obtener/huesped")
    public Huesped obtenerHuesped(Integer id) {
        return huespedServiceImpl.obtenerHuesped(id);
    }

    @RequestMapping("/guardar/huesped")
    public Huesped guardarHuesped(Huesped huesped) {
        return huespedServiceImpl.guardarHuesped(huesped);
    }
}
