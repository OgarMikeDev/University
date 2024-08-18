package org.example.serveices;

import org.example.dto.CourseDto;
import org.example.dto.StudentDto;
import org.example.entitys.Course;
import org.example.entitys.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService implements CRUDService<StudentDto>{
    @Override
    public StudentDto getById(Integer id) {
        return null;
    }

    @Override
    public Collection<StudentDto> getAll() {
        return null;
    }

    @Override
    public void create(StudentDto studentDto) {

    }

    @Override
    public void update(StudentDto studentDto) {

    }

    @Override
    public void deleteById(Integer id) {

    }
    public static StudentDto mapToDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setListCoursesId(
                student.getCourses()
                        .stream()
                        .map(CourseService::mapToDto)
                        .map(courseDto -> courseDto.getId())
                        .toList());
        return studentDto;
    }
}
