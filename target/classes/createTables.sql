use librarySystem;

CREATE TABLE patrons (
    first varchar(25) NOT NULL,
    last varchar(25) NOT NULL,
    id int NOT NULL AUTO_INCREMENT,
    pin INT NOT NULL,
    numBooks int DEFAULT 0,
    fines FLOAT DEFAULT 0,
    PRIMARY KEY (id)
);

CREATE TABLE librarians(
    id int NOT NULL AUTO_INCREMENT,
    pin VARCHAR(8) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE books (
    isbn int NOT NULL,
    title varchar(25) NOT NULL,
    author varchar(25) NOT NULL,
    numBooks int DEFAULT 3,
    PRIMARY KEY (isbn)
);
