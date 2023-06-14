package com.apphotel.hotelalura.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apphotel.hotelalura.web.models.Huesped;
import com.apphotel.hotelalura.web.repositories.HuespedRepository;

@Service
public class HuespedServiceImpl implements HuespedService {

    @Autowired
    public HuespedRepository huespedRepository;

    @Override
    public Huesped guardarHuesped(Huesped huesped) {
        return huespedRepository.save(huesped);
    }

    public String actualizarHuesped(Huesped huesped) {
        Boolean existe = huespedRepository.existsById(huesped.getHuesped_id());

        if (existe) {
            huespedRepository.save(huesped);
            return "Huesped actualizado";
        }
        return "Problemas con la actualizacion del huesped";
    }

    public Huesped obtenerHuesped(Integer id) {
        Boolean existe = huespedRepository.existsById(id);
        if (existe) {
            Huesped huesped = huespedRepository.findById(id).get();
            return huesped;
        }
        return null;
    }

    public String eliminarHuesped(Integer id) {
        boolean existe = huespedRepository.existsById(id);

        if (existe) {
            huespedRepository.deleteById(id);
        } else {
            return "Huesped no existe";
        }

        existe = huespedRepository.existsById(id);
        if (existe) {
            return "Huesped no eliminado";
        }

        return "Huesped fue eliminado";
    }

    public List<Huesped> listaHuesped() {
        return huespedRepository.findAll();
    }
}
