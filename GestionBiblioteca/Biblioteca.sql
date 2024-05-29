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
