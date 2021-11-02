use libdb;

--create patron table
CREATE TABLE patrons (
    fname varchar(25) NOT NULL,
    lname varchar(25) NOT NULL,
    userID int NOT NULL AUTO_INCREMENT,
    pin INT NOT NULL,
    numBooks int DEFAULT 0,
    fines FLOAT DEFAULT 0,
    PRIMARY KEY (userID)
);

--create librarian table
CREATE TABLE librarians(
    userID int NOT NULL AUTO_INCREMENT,
    pass VARCHAR(8) NOT NULL
);

--create book table
CREATE TABLE books (
    ISBN int NOT NULL,
    title varchar(25) NOT NULL,
    author varchar(25) NOT NULL,
    numBooks int DEFAULT 3,
    PRIMARY KEY (ISBN)
);
