package org.techiekernel.backbone.service;

import java.sql.Time;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.techiekernel.backbone.model.Student;
import org.techiekernel.backbone.repository.Repository;

import static org.techiekernel.backbone.repository.Repository.STUDENTS_REPO;

@Controller
@RequestMapping("/student")
public class StudentService {
	@RequestMapping(value = "/{studentId}", method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public Student getStudent(@PathVariable int studentId,
			HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		for (Student student : STUDENTS_REPO) {
			if (student.getId() == studentId)
				return student;
		}
		return null;

	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public Set<Student> getStudents(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return STUDENTS_REPO;
	}

	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json", produces = { "application/json" }, consumes = { "application/json" })
	@ResponseBody
	public boolean createStudent(@RequestBody Student student,
			HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		int prevSize = STUDENTS_REPO.size();
		student.setId(Repository.getId());
		STUDENTS_REPO.add(student);
		return (STUDENTS_REPO.size() == prevSize + 1);
	}

	@RequestMapping(value = "/{studentId}", method = RequestMethod.PUT, headers = "Accept=application/json", produces = { "application/json" }, consumes = { "application/json" })
	@ResponseBody
	public boolean editStudent(@RequestBody Student student,
			@PathVariable int studentId, HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		STUDENTS_REPO.add(student);
		return true;
	}

	@RequestMapping(value = "/{studentId}", method = RequestMethod.DELETE, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public boolean deleteStudent(@PathVariable int studentId,
			HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		Iterator<Student> students = STUDENTS_REPO.iterator();
		while (students.hasNext()) {
			if (students.next().getId() == studentId) {
				students.remove();
				return true;
			}
		}
		return false;
	}

}
