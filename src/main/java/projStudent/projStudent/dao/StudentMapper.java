package projStudent.projStudent.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import projStudent.projStudent.entity.Student;

public class StudentMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getLong("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		student.setMarks(rs.getInt("marks"));
		return student;
	}
	
}
