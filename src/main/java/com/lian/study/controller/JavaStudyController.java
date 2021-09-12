package com.lian.study.controller;

import com.lian.study.service.JavaStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ted
 * @version 1.0
 * @date 2021/9/12 12:41
 */
@Controller
@RequestMapping("/javaStudy")
public class JavaStudyController {


    @Autowired
    private JavaStudyService javaStudyService;


    /**
     * 查询java学习步骤
     * @return
     */
    @GetMapping("/findJavaStep")
    @ResponseBody
    public List<HashMap> findDepartmentList(String stepValue) {
        List<HashMap> javaStudySteps = javaStudyService.findJavaStudySteps(stepValue);
        return javaStudySteps;
    }

}
