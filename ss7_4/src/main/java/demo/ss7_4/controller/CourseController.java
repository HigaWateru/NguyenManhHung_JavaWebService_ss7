package demo.ss7_4.controller;

import demo.ss7_4.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/{id}")
    public String getCourse(@PathVariable Long id) {
        return courseService.findCourseById(id);
    }
}