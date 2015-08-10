package projStudent.projStudent.dao;

import java.util.List;

import javax.sql.DataSource;

import projStudent.projStudent.entity.Student;


public interface StudentDAO {
	
	
	void create(Student student);
	void update(Student student);
	void delete(long id);
	List<Student> getAll();
	Student getById(long id);
}
