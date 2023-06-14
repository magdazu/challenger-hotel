package com.apphotel.hotelalura.web.services;

import java.util.List;

import com.apphotel.hotelalura.web.models.Reserva;

public interface ReservaService {
    public Reserva guardarReserva(Reserva Reserva);

    public String actualizarReserva(Reserva reserva);

    public Reserva obtenerReserva(Integer id);

    public List<Reserva> listaReserva();
}
