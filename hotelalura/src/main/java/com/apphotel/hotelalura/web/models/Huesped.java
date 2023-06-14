package com.apphotel.hotelalura.web.models;

import java.sql.Date;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Huesped")
public class Huesped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer huesped_id;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_nacimiento;

    @NotNull
    private String nacionalidad;

    @NotNull
    private String telefono;

    @NotNull
    private String contrasena;

    @NotNull
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;
}
