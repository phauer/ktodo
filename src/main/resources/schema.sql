DROP TABLE IF EXISTS todos;

CREATE TABLE todos
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    title       VARCHAR(250) NOT NULL,
    done        BOOLEAN      NOT NULL,
    dateCreated timestamp DEFAULT NULL,
    dateDone    timestamp DEFAULT NULL
);
