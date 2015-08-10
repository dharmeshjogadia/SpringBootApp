package projStudent.projStudent.service;

import java.util.List;



import projStudent.projStudent.entity.Student;

public interface StudentService {
	
	void create(Student student);
	void update(Student student);
	void delete(long id);
	List<Student> getAll();
	Student getById(long id);
}
