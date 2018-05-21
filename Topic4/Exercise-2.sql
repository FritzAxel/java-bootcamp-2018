INSERT INTO `teacher` (first_name, last_name, date_of_birth)
values 
('Gonzalo', 'Rocha', 20/08/1985),
('Axel' , 'Fritz', 26/08/1995),
('Matias' , 'Massaccesi', 20/04/1996);

INSERT INTO course (name, teacher_id, hours_by_week)
values 
('Maths', 4, 4), 
('Chemistry', 5, 4), 
('Physics', 6, 8);

INSERT INTO student (first_name, last_name, date_of_birth)
values 
('Matias','Lopez', 20/09/1991),
('Domingo','Peron', 10/04/1984),
('Brian','Gancitano', 02/01/1991),
('Ricardo','Darin', 01/07/1986),
('Jose','Neuer', 04/09/1979),
('Faustino','Sarmiento', 02/06/1994),
('Fabian' , 'Moreyra', 03/03/1993),
('Izquierdo','Gonzalez', 08/11/1990),
('Manuela','Dominguez', 22/02/1992),
('Sebastian','Riquelme', 18/05/1995),
('Rigoberto','Sandes', 22/09/1993),
('Silvina','Gonzalez', 30/08/1994),
('Oscar','Scioli', 07/07/1987),
('Manuel', 'Sanchez', 01/01/1991),
('Esteban', 'Rosco', 05/05/1995),
('Carla', 'Lopez', 24/06/1986);

INSERT INTO `student_x_course` (registration_number , course_id)
values
(4,4),
(1,4),
(2,4),
(13,4),
(11,4),
(3,4),
(16,4),
(5,4),
(8,4),
(12,4),
(1,5),
(2,5),
(3,5),
(4,5),
(5,5),
(6,5),
(7,5),
(8,5),
(9,5),
(10,5),
(11,6),
(12,6),
(13,6),
(14,6),
(15,6),
(16,6),
(3,6),
(5,6),
(6,6),
(7,6);

