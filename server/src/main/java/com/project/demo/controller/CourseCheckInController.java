package com.project.demo.controller;

import com.project.demo.entity.CourseCheckIn;
import com.project.demo.service.CourseCheckInService;
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
 * 课程签到：(CourseCheckIn)表控制层
 *
 */
@RestController
@RequestMapping("/course_check_in")
public class CourseCheckInController extends BaseController<CourseCheckIn, CourseCheckInService> {

    /**
     * 课程签到对象
     */
    @Autowired
    public CourseCheckInController(CourseCheckInService service) {
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
