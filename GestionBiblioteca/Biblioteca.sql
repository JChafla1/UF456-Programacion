CREATE TABLE Autor (
    -- el "id" sera incrementado cada vez que se use, para que no se repita
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    cognom VARCHAR(50)
);

CREATE TABLE Llibre (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titol VARCHAR(100),
    anyPublicacio INT,
    autorId INT,
    -- El "autorID" de esta tabla se coge del "id" de la tabla autor
    FOREIGN KEY (autorId) REFERENCES Autor(id)
);


-- Añadir autors
INSERT INTO Autor (nom, cognom) VALUES ('Gabriel', 'García Márquez');
INSERT INTO Autor (nom, cognom) VALUES ('J.K.', 'Rowling');

-- Añadir llibres
INSERT INTO Llibre (titol, anyPublicacio, autorId) VALUES ('Cien años de soledad', 1967, 1);
INSERT INTO Llibre (titol, anyPublicacio, autorId) VALUES ('Harry Potter y la piedra filosofal', 1997, 2);
