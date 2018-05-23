SELECT
	t.last_name,
    t.first_name,
    d.name AS nameDay,
    cxd.start,
    cxd.finish,    
	c.name AS courseName
FROM
course_x_day cxd
INNER JOIN course c ON cxd.course_id = c.id
INNER JOIN `day` d ON cxd.day_id = d.id
INNER JOIN teacher t ON c.teacher_id = t.id

WHERE t.id = 5
