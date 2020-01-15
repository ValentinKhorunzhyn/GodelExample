DROP SCHEMA IF EXISTS public CASCADE;
CREATE SCHEMA public;

GRANT ALL ON SCHEMA public TO godel_user;
GRANT ALL ON SCHEMA public TO public;

CREATE TABLE department
(
    id serial primary key,
    title varchar(32)
);

CREATE TABLE job_title
(
    id serial primary key,
    title varchar(32)
);

CREATE TABLE employee
(
    id serial primary key,
    first_name varchar(32),
    last_name varchar(32),
    department_id int references department(id) on delete cascade,
    job_title_id int references job_title(id) on delete cascade,
    gender varchar(32),
    date_of_birth date
);




