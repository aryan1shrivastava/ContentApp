CREATE TABLE IF NOT EXISTS Content (
    id INTEGER AUTO_INCREMENT,
    title varchar(255) NOT NULL,
    desc text,
    status varchar(255) NOT NULL,
    content_type varchar(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255),
    primary key (id)
);

INSERT INTO Content (title, desc, status, content_type, date_created)
VALUES ('My First Springboot Blog', 'This is the text for my first blog', 'IN_PROGRESS', 'VIDEO', CURRENT_TIMESTAMP())