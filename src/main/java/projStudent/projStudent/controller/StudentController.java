package projStudent.projStudent.controller;

import java.util.List;

import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import projStudent.projStudent.entity.Student;
import projStudent.projStudent.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired 
	StudentService studentService;
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void create(@RequestBody Student student){
		System.out.print(student);
		studentService.create(student);
	}
	
	@RequestMapping(value="/update",method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public void update(@RequestBody Student student){
		studentService.update(student);
	}
	
	@RequestMapping(value="/students",method = RequestMethod.GET)
	@ResponseBody 
	public List<Student> getAll(){
		return studentService.getAll();
	}
	
	@RequestMapping(value="/student/id/{id}",method = RequestMethod.GET)
	@ResponseBody 
	public Student getById(@PathVariable("id") long id){
		return studentService.getById(id);
	}
	
}
