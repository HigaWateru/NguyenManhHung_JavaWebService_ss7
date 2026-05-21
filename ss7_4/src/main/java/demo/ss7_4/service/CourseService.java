package demo.ss7_4.service;

import demo.ss7_4.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    public String findCourseById(Long id) {
        if (id != 1) throw new ResourceNotFoundException("Không tìm thấy khóa học");
        return "Spring Boot Master Class";
    }
}