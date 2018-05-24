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
])


db.createCollection("teacher", {
	validator: {
      $jsonSchema: {
         bsonType: "object",
         required: [ "id","firstName", "lastName", "dateOfBirth"],
         properties: {
            id: {
               bsonType: "int",
               description: "identifier of the teacher. Must be an int and is required"
            },
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
   {"id": ,"firstName": "", "lastName": "", "dateOfBirth": new Date()}
   {"id": ,"firstName": "", "lastName": "", "dateOfBirth": new Date()}
   {"id": ,"firstName": "", "lastName": "", "dateOfBirth": new Date()}
   {"id": ,"firstName": "", "lastName": "", "dateOfBirth": new Date()}
   {"id": ,"firstName": "", "lastName": "", "dateOfBirth": new Date()}
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

