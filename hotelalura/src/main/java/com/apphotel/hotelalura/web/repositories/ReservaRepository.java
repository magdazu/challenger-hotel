package com.apphotel.hotelalura.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apphotel.hotelalura.web.models.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
