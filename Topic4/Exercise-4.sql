INSERT INTO final (note, student_id, course_id)
values
(4, 1, 4),
(2, 2, 4),
(8, 3, 4),
(6, 4, 4),
(7, 5, 5),
(2, 6, 5),
(3, 7, 5),
(10, 8, 5),
(9, 9, 5),
(6, 1, 5),
(9, 10, 5),
(10, 11, 6),
(5, 11, 5),
(4, 14, 6),
(7, 2, 6),
(2, 3, 5)

--Students that passed
SELECT
((select count(id) from final where note > 4 AND course_id = 6) / COUNT(id)) * 100 as total
FROM
final f
WHERE f.course_id = 6


--Students that failed
SELECT
((select count(id) from final where note <= 4 AND course_id = 5) / COUNT(id)) * 100 as total
FROM
final f
WHERE f.course_id = 5
