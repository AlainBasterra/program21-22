.open C:\\Users\\basterra.alain\\Documents\\Programazioa\\Git\\program21-22\\HiztegiaSQLite\\db\\Hiztegia.db

DROP TABLE Terminoak;
CREATE TABLE Terminoak(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    euskearaz VARCHAR(20),
    gazteleraz VARCHAR(20)
);
INSERT INTO Terminoak VALUES (null, "sagarra", "manzana");
INSERT INTO Terminoak VALUES (euskearaz, gazteleraz) VALUES("madaria", "pera");
INSERT INTO Terminoak VALUES (euskearaz, gazteleraz) VALUES("marrubia", "fresa");