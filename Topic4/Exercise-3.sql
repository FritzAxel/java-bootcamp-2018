SELECT
	c.name AS nameCourse,
	t.last_name AS lastNameTeacher,
	t.first_name AS firstNameTeacher,
	s.last_name AS lastNameStudent,
    s.first_name AS firstNameStudent
FROM 
course c
INNER JOIN teacher t ON c.teacher_id = t.id
INNER JOIN student_x_course sxc ON sxc.course_id = c.id
INNER JOIN student s ON s.registration_number = sxc.registration_number
ORDER BY c.name,s.last_name ASC