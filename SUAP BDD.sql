CREATE database SUAP;
use SUAP;
CREATE TABLE `profesores` (
  `idProfesor` integer PRIMARY KEY,
  `nombre` varchar(255),
  `apellido` varchar(255),
  `rfc` varchar(255)
);

CREATE TABLE `asignacion` (
  `idAsignacion` integer PRIMARY KEY,
  `idProfesor` integer,
  `idUDA` integer
);

CREATE TABLE `Unidad_De_Aprendizaje` (
  `idUnidadAprendizaje` integer PRIMARY KEY,
  `nombre` varchar(255),
  `horas_clase` integer,
  `horas_taller` integer,
  `horas_laboratorio` integer
);

ALTER TABLE `asignacion` ADD FOREIGN KEY (`idProfesor`) REFERENCES `profesores` (`idProfesor`);

ALTER TABLE `asignacion` ADD FOREIGN KEY (`idUDA`) REFERENCES `Unidad_De_Aprendizaje` (`idUnidadAprendizaje`);
