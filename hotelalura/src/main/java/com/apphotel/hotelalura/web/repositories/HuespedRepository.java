package com.apphotel.hotelalura.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apphotel.hotelalura.web.models.Huesped;

@Repository
public interface HuespedRepository extends JpaRepository<Huesped, Integer> {

}
