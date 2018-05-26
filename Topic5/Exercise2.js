db.student.find(
  {
    registrationNumber: {
      $in: db.note.distinct( 'student_id', {course_id: 1, score: {$gt: 4}} )
    }
  }
); localField: 'student_id', foreignField: 'registrationNumber', as: 'STUDENT'}}])