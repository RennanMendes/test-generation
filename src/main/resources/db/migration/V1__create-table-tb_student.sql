CREATE TABLE tb_student (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    first_semester FLOAT,
    second_semester FLOAT,
    teachers_name VARCHAR(255),
    classroom_number VARCHAR(255)
);