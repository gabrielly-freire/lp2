CREATE DATABASE library_db;
USE library_db;

CREATE TABLE books (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
     genre ENUM(
        'ACTION', 'ADVENTURE', 'COMEDY', 'CRIME', 'DRAMA', 'FANTASY', 'HISTORICAL', 'HORROR', 'MYSTERY', 
        'PHILOSOPHICAL', 'POLITICAL', 'ROMANCE', 'SAGA', 'SATIRE', 'SCIENCE_FICTION', 'THRILLER', 
        'URBAN', 'WESTERN'
    ) NOT NULL,
    publication_year INT NOT NULL,
    isbn VARCHAR(20) NOT NULL UNIQUE,
    is_available BOOLEAN DEFAULT TRUE
);

CREATE TABLE users (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phone_number VARCHAR(15)
);

CREATE TABLE loans (
    id BIGINT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    book_id BIGINT NOT NULL,
    loan_date DATE NOT NULL,
    due_date DATE NOT NULL,
    return_date DATE,
    is_returned BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (book_id) REFERENCES books(id)
);
