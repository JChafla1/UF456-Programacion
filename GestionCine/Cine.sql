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
