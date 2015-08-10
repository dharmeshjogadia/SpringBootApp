package projStudent.projStudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projStudent.projStudent.dao.StudentDAO;
import projStudent.projStudent.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO;
	
	public void create(Student student) {
		studentDAO.create(student);
	}

	public void update(Student student) {
		studentDAO.update(student);
	}

	public void delete(long id) {
		studentDAO.delete(id);
	}

	public List<Student> getAll() {
		return studentDAO.getAll();
	}

	public Student getById(long id) {
		return studentDAO.getById(id);
	}

}
