CREATE SCHEMA hotel;

USE hotel;

CREATE TABLE Reserva(
reserva_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
fecha_entrada DATE,
fecha_salida DATE,
valor DECIMAL,
formato_pago VARCHAR(20)
);

CREATE TABLE Huesped(
huesped_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
nombre VARCHAR(25),
apellido VARCHAR(25),
fecha_nacimiento DATE,
nacionalidad VARCHAR(25),
telefono VARCHAR(15),
reserva_id INTEGER,
FOREIGN KEY (reserva_id) REFERENCES Reserva (reserva_id)
);

ALTER TABLE Huesped ADD email VARCHAR (20);

INSERT INTO Reserva (fecha_entrada, fecha_salida, valor, formato_pago) VALUES ('2023-10-03','2023-10-06',25.000,"Tarjeta de crédito");

INSERT INTO Huesped (nombre, apellido, fecha_nacimiento, nacionalidad, telefono, reserva_id)
VALUES ("Carmen", "Correa", "1990-04-15", "Chilena", "944867813", 1 );

SELECT * FROM Huesped;



