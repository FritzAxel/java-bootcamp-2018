CREATE database high_school;
USE high_school;
CREATE USER axel IDENTIFIED BY 'admin';

CREATE TABLE `student` (
	registration_number INT NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(25),
	last_name VARCHAR(25),
	date_of_birth date,
	PRIMARY KEY (registration_number) 
);

CREATE TABLE `teacher` (
	id INT NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(25),
	last_name VARCHAR(25),
	date_of_birth date,
	PRIMARY KEY (teacher_id)
);

CREATE TABLE `course` (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(30),
	teacher_id INT NOT NULL,
	hours_by_week INT UNSIGNED,
	PRIMARY KEY (course_id),
	FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);

CREATE TABLE `day` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE);


CREATE TABLE `course_x_day` (
	course_id INT NOT NULL,
	day_id INT NOT NULL,
	start VARCHAR(5),
	finish VARCHAR(5),
	FOREIGN KEY (course_id) REFERENCES course(id),
	FOREIGN KEY (day) REFERENCES day(id)
);

CREATE TABLE `student_x_course` (
	registration_number INT NOT NULL,
	course_id INT NOT NULL,
	year INT,
	FOREIGN KEY (registration_number) REFERENCES student(registration_number),
	FOREIGN KEY (course_id) REFERENCES course(id)
);

CREATE TABLE `partial` (
	id INT NOT NULL AUTO_INCREMENT,
	number INT NOT NULL,
	description VARCHAR(80),
	course_id INT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (course_id) REFERENCES course(id)
);

CREATE TABLE `partial_x_student` (
	id INT NOT NULL AUTO_INCREMENT,
	partial_id INT NOT NULL,
	student_id INT NOT NULL,
	note FLOAT UNSIGNED,
	PRIMARY KEY (id),
	FOREIGN KEY (partial_id) REFERENCES partial(id),
	FOREIGN KEY (student_id) REFERENCES student(registration_number)
);

CREATE TABLE `final` (
	id INT NOT NULL AUTO_INCREMENT,
	note FLOAT UNSIGNED,
	student_id INT NOT NULL,
	course_id INT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (student_id) REFERENCES student(registration_number),
	FOREIGN KEY (course_id) REFERENCES course(id)
);

