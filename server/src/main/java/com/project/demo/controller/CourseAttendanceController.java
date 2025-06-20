package com.project.demo.controller;

import com.project.demo.entity.CourseAttendance;
import com.project.demo.service.CourseAttendanceService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 课程考勤：(CourseAttendance)表控制层
 *
 */
@RestController
@RequestMapping("/course_attendance")
public class CourseAttendanceController extends BaseController<CourseAttendance, CourseAttendanceService> {

    /**
     * 课程考勤对象
     */
    @Autowired
    public CourseAttendanceController(CourseAttendanceService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
