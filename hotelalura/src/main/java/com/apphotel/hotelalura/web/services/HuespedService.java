package com.apphotel.hotelalura.web.services;

import java.util.List;

import com.apphotel.hotelalura.web.models.Huesped;

public interface HuespedService {
    public Huesped guardarHuesped(Huesped huesped);

    public String actualizarHuesped(Huesped huesped);

    public Huesped obtenerHuesped(Integer id);

    public String eliminarHuesped(Integer id);

    public List<Huesped> listaHuesped();
}
