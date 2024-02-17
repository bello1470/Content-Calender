--CREATE TABLE IF NOT EXIST Content(
--id INTEGER AUTO_INCREMENT,
--title varchar(255) NOT NULL,
--desc TEXT,
--status VARCHAR(20) NOT NULL,
--content_type VARCHAR(50) NOT NULL,
--date_created TIMESTAMP NOT NULL,
--date_updated TIMESTAMP,
--url VARCHAR(255),
--Primary key(id)
--
--
--);

CREATE TABLE IF NOT EXISTS Content(
id INTEGER AUTO_INCREMENT,
 title varchar(255) NOT NULL,
 desc TEXT, status VARCHAR(20) NOT NULL,
  content_type VARCHAR(50) NOT NULL,
  date_created TIMESTAMP NOT NULL,
  date_updated TIMESTAMP,
  url VARCHAR(255),
  Primary key(id)
  );

--  INSERT INTO Content (title, desc, status, content_type, date_created, date_updated, url)
--  VALUES
--      ('Content for January 1st', 'Description for January 1st', 'IDEA', 'Article', CURRENT_TIMESTAMP()),
--      ('Content for January 2nd', 'Description for January 2nd', 'IDEA', 'Article', CURRENT_TIMESTAMP()),
--      ('Content for January 3rd', 'Description for January 3rd', 'IDEA', 'Article', CURRENT_TIMESTAMP()),
--
--      ('Content for January 31st', 'Description for January 31st', 'Active', CURRENT_TIMESTAMP());

INSERT INTO Content (title, desc, status, content_type, date_created, date_updated, url)
VALUES
    ('Content for January 1st', 'Description for January 1st', 'IDEA', 'Article', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'https://example.com/content1'),
    ('Content for January 2nd', 'Description for January 2nd', 'IDEA', 'Article', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'https://example.com/content2'),
    ('Content for January 3rd', 'Description for January 3rd', 'IDEA', 'Article', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'https://example.com/content3'),

    ('Content for January 31st', 'Description for January 31st', 'Active', 'Article', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'https://example.com/content31');
