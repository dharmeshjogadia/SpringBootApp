package projStudent.projStudent.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import projStudent.projStudent.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	public void create(Student student) {
		String SQL = "insert into student(name,age,marks) values(?,?,?)";
		jdbcTemplateObject.update(SQL,
									student.getName(),
									student.getAge(),
									student.getMarks());
		System.out.println("Created "+student);
	}

	public void update(Student student) {
		String SQL = "Update student set "
						+ "name=?,"
						+ "age=?,"
						+ "marks=? "
						+ "where id=?";
		jdbcTemplateObject.update(SQL,
									student.getName(),
									student.getAge(),
									student.getMarks(),
									student.getId());		
				
		System.out.println("Updated "+student);
	}

	public void delete(long id) {
		String SQL = "Delete from student "
						+ "where id=?";
		jdbcTemplateObject.update(SQL,id);
		System.out.println("Deleted Id="+id);
	}

	public List<Student> getAll() {
		String SQL = "Select * from student";
		List<Student> studentList= jdbcTemplateObject.query(SQL, new StudentMapper());
		System.out.println("getAll "+studentList);
		return studentList;
	}

	public Student getById(long id) {
		String SQL = "Select * from student "
				+ "where id=?";
		Student student = jdbcTemplateObject.queryForObject(SQL,new StudentMapper(),id);
		System.out.println("getBy Id:"+id+":"+student);
		return student;
	}

}
