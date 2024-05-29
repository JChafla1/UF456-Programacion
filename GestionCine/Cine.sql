CREATE TABLE Director (
    id INT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    cognom VARCHAR(255) NOT NULL
);

CREATE TABLE Pelicula (
    id INT PRIMARY KEY,
    titol VARCHAR(255) NOT NULL,
    anyEstrena INT NOT NULL,
    directorId INT,
    -- El "directorId" de esta tabla se coge del "id" de la tabla Director
    FOREIGN KEY (directorId) REFERENCES Director(id)
);


-- Inserción de directores
INSERT INTO Director (id, nom, cognom) VALUES (1, 'Steven', 'Spielberg');
INSERT INTO Director (id, nom, cognom) VALUES (2, 'Christopher', 'Nolan');

-- Inserción de películas
INSERT INTO Pelicula (id, titol, anyEstrena, directorId) VALUES (1, 'Jurassic Park', 1993, 1);
INSERT INTO Pelicula (id, titol, anyEstrena, directorId) VALUES (2, 'Inception', 2010, 2);
INSERT INTO Pelicula (id, titol, anyEstrena, directorId) VALUES (3, 'Interstellar', 2014, 2);
INSERT INTO Pelicula (id, titol, anyEstrena, directorId) VALUES (4, 'Schindler''s List', 1993, 1);
