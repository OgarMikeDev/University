package org.example.serveices;

import org.example.dto.CourseDto;
import org.example.entitys.Course;
import org.example.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CourseService implements CRUDService<CourseDto> {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseDto getById(Integer id) {

        return null;
    }

    @Override
    public Collection<CourseDto> getAll() {
        return null;
    }

    @Override
    public void create(CourseDto course) {

    }

    @Override
    public void update(CourseDto course) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    public static CourseDto mapToDto(Course course) {
        CourseDto courseDto = new CourseDto();
        courseDto.setId(course.getId());
        courseDto.setName(course.getName());
        courseDto.setListIdStudents(
                course.getStudents()
                        .stream()
                        .map(StudentService::mapToDto)
                        .map(studentDto -> studentDto.getId())
                        .toList());
        return courseDto;
    }
    public static Course mapToEntity(CourseDto courseDto) {
        Course course = new Course();
        course.setId(courseDto.getId());
        course.setName(courseDto.getName());
        //hello
//        List<Course> listCourses =
//        course.setStudents(
//                courseDto.getListIdStudents()
//                        .stream()
//                        .map(StudentService::mapToEntity)
//                        .toList());
        return course;
    }
}
