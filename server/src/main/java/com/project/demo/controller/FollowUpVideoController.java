package com.project.demo.controller;

import com.project.demo.entity.FollowUpVideo;
import com.project.demo.service.FollowUpVideoService;
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
 * 跟练视频：(FollowUpVideo)表控制层
 *
 */
@RestController
@RequestMapping("/follow_up_video")
public class FollowUpVideoController extends BaseController<FollowUpVideo, FollowUpVideoService> {

    /**
     * 跟练视频对象
     */
    @Autowired
    public FollowUpVideoController(FollowUpVideoService service) {
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
