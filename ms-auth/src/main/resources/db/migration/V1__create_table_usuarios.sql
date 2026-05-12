DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
                          id BIGINT NOT NULL AUTO_INCREMENT,
                          username VARCHAR(255) NOT NULL,
                          password VARCHAR(255) NOT NULL,
                          PRIMARY KEY (id),
                          UNIQUE (username)
) ENGINE=InnoDB;

INSERT INTO usuarios (username, password) VALUES ('admin', '1234');