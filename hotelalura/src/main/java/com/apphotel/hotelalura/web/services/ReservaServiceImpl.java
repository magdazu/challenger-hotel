package com.apphotel.hotelalura.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apphotel.hotelalura.web.models.Reserva;
import com.apphotel.hotelalura.web.repositories.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    public ReservaRepository reservaRepository;

    @Override
    public Reserva guardarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public String actualizarReserva(Reserva reserva) {
        Boolean existe = reservaRepository.existsById(reserva.getReserva_id());

        if (existe) {
            reservaRepository.save(reserva);
            return "Reserva encontrada";
        }

        return "No se encuentra la reserva";
    }

    public Reserva obtenerReserva(Integer id) {
        Boolean existe = reservaRepository.existsById(id);
        if (existe) {
            Reserva reserva = reservaRepository.findById(id).get();
            return reserva;
        }
        return null;
    }

    public String eliminarReserva(Integer id) {
        Boolean existe = reservaRepository.existsById(id);
        if (existe) {
            reservaRepository.deleteById(id);
        } else {
            return "No se encuentra reserva";
        }

        existe = reservaRepository.existsById(id);
        if (existe) {
            return "Reserva no eliminada";
        }

        return "La reserva fue elimianda con éxito";
    }

    public List<Reserva> listaReserva() {
        return reservaRepository.findAll();
    }
}
