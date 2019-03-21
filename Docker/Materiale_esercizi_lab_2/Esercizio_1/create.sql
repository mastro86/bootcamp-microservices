CREATE DATABASE boot_db;

\c boot_db;

------------------
--SCHEMA
------------------
CREATE SCHEMA boot_schema;

CREATE TABLE boot_schema.boot_table
(
   KEY VARCHAR(10) PRIMARY KEY,
   VALUE VARCHAR(255) NOT NULL
);

INSERT INTO boot_schema.boot_table (KEY, VALUE) values ('title', 'Docker Bootcamp');
INSERT INTO boot_schema.boot_table (KEY, VALUE) values ('user', 'Reply people');