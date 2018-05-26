use "high_school"

db.createCollection("students", {
   validator: {
      $jsonSchema: {
         bsonType: "object",
         required: [ "firstName","lastName","registrationNumber"],
         properties: {
            firstName: {
               bsonType: "string",
               description: "First name of the student must be a string and is required"
            },
            lastName: {
            	bsonType: "string",
            	description: "Last name of the student must be a string and is required"
            },
            registrationNumber: {
            	bsonType: "int",
            	description: "Student's identifier"
            },
            dateOfBirth: {
            	bsonType: "date",
            	description: "Student's birth. Is required"
            },
         }
      }
   }
})

db.student.insert([
   {"firstName": "Axel", "lastName": "Fritz", "registrationNumber": 1, "dateOfBirth": new Date("1995-08-26") },
   {"firstName": "Matias", "lastName": "Lopez", "registrationNumber": 2, "dateOfBirth": new Date("1984-05-30")},
   {"firstName": "Facundo", "lastName": "Moreyra", "registrationNumber": 3, "dateOfBirth": new Date("1996-07-20")},
   {"firstName": "Gonzalo", "lastName": "Rocha","registrationNumber": 4, "dateOfBirth": new Date("1998-02-25")},
   {"firstName": "Ricardo", "lastName": "Darin","registrationNumber": 5, "dateOfBirth": new Date("1986-06-05")},
   {"firstName": "Victor", "lastName": "Lozano","registrationNumber": 6, "dateOfBirth": new Date("2000-05-04")},
   {"firstName": "Hector", "lastName": "Chale","registrationNumber": 7, "dateOfBirth": new Date("1990-09-09")},
   {"firstName": "Juliana", "lastName": "Izquierdo","registrationNumber": 8, "dateOfBirth": new Date("1989-10-17")},
   {"firstName": "Silvina", "lastName": "Lopez","registrationNumber": 9, "dateOfBirth": new Date("1995-12-12")},
   {"firstName": "Norberto", "lastName": "Azcuenaga","registrationNumber": 10, "dateOfBirth": new Date("1997-01-05")},
])


db.createCollection("teacher", {
	validator: {
      $jsonSchema: {
         bsonType: "object",
         required: [ "firstName", "lastName", "dateOfBirth"],
         properties: {
            firstName: {
               bsonType: "string",
               description: "Teacher's first name, must be a string and is required"
            },
            lastName: {
               bsonType: "string",
               description: "Teacher's last name, must be a string and is required"
            },
            dateOfBirth: {
               bsonType: "date",
               description: "Teacher's date of birth. Must be a date and is required"
            },
         }
      }
   }
})

db.teacher.insert([
   {"firstName": "Matias", "lastName": "Massaccesi", "dateOfBirth": new Date("1996-06-19")},
   {"firstName": "Diego", "lastName": "Gregoracci", "dateOfBirth": new Date("1993-05-18")},
   {"firstName": "Juan Pablo", "lastName": "Araneta", "dateOfBirth": new Date("1994-04-17")},
])


db.createCollection("course", {
   validator: {
      $jsonSchema: {
         bsonType: "object",
         required: ["id", "name", "teacher_id", "hoursByWeek"],
         properties: {
            id: {
               bsonType: "int",
               description: "identifier of the course. Must be an int and is required"
            },
            name: {
               bsonType: "string",
               description: "Name of the course. Must be a string and is required"
            },
            teacher_id: {
               bsonType: "int",
               description: "identifier of the assigned teacher. Must be an int and is required"
            },
            hoursByWeek: {
               bsonType: "int",
               description: "Hours by week. Must be a number and is required."
            },
         }
      }
   }
})

db.course.insert([
   {"id": 1, "name": "Maths", "teacher_id": 1, "hoursByWeek": 4},
   {"id": 2, "name": "Chemistry", "teacher_id": 2, "hoursByWeek": 8},
   {"id": 3, "name": "Physics", "teacher_id": 3, "hoursByWeek": 6},
])

db.createCollection("note", {
   validator: {
      $jsonSchema: {
         bsonType: "object",
         required: ["type", "score","course_id","student_id"],
         properties: {
            type: {
               enum: ["Partial","Final"],
               description: "This is the kind of test. Is required"
            },
            score: {
               bsonType: "double",
               minimum: 1,
               maximum: 10,
               exclusiveMaximum: false,
               description: "Student's score. Is required"
            },
            course_id: {
               bsonType: "int",
               description: "Course's identifier. Is required"
            },
            student_id: {
               bsonType: "int",
               description: "Student's identifier"
            },
         }
      }
   }
})

db.note.insert([
   {"type": "Partial", "score": 6, "course_id": 1, "student_id": 1},
   {"type": "Partial", "score": 2, "course_id": 2, "student_id": 1},
   {"type": "Partial", "score": 6, "course_id": 1, "student_id": 2},
   {"type": "Partial", "score": 1, "course_id": 2, "student_id": 2},
   {"type": "Partial", "score": 8, "course_id": 1, "student_id": 3},
   {"type": "Final", "score": 6, "course_id": 2, "student_id": 3},
   {"type": "Partial", "score": 10, "course_id": 2, "student_id": 3},
   {"type": "Final", "score": 5  , "course_id": 3, "student_id": 1},
   {"type": "Final", "score": 6, "course_id": 1, "student_id": 6},
   {"type": "Partial", "score": 8, "course_id": 3, "student_id": 2},
   {"type": "Partial", "score": 6, "course_id": 1, "student_id": 10},
   {"type": "Final", "score": 9, "course_id": 3, "student_id": 3},
   {"type": "Partial", "score": 8, "course_id": 1, "student_id": 4},
   {"type": "Partial", "score": 5, "course_id": 1, "student_id": 4},
   {"type": "Partial", "score": 5, "course_id": 1, "student_id": 4},
   {"type": "Partial", "score": 8, "course_id": 1, "student_id": 5},
   {"type": "Partial", "score": 5, "course_id": 1, "student_id": 5},
   {"type": "Partial", "score": 5, "course_id": 1, "student_id": 5},
   {"type": "Partial", "score": 5, "course_id": 1, "student_id": 6},
   {"type": "Partial", "score": 8, "course_id": 1, "student_id": 6},
   {"type": "Partial", "score": 5, "course_id": 1, "student_id": 6},
   {"type": "Partial", "score": 5, "course_id": 2, "student_id": 7},
   {"type": "Partial", "score": 5, "course_id": 2, "student_id": 7},
   {"type": "Final", "score": 5, "course_id": 2, "student_id": 7},
   {"type": "Final", "score": 8, "course_id": 2, "student_id": 8},
   {"type": "Final", "score": 5, "course_id": 2, "student_id": 8},
   {"type": "Final", "score": 8, "course_id": 2, "student_id": 9},
   {"type": "Final", "score": 5, "course_id": 2, "student_id": 9},
   {"type": "Final", "score": 8, "course_id": 2, "student_id": 2},
   {"type": "Final", "score": 5, "course_id": 2, "student_id": 10},
   {"type": "Final", "score": 8, "course_id": 2, "student_id": 1},
])

