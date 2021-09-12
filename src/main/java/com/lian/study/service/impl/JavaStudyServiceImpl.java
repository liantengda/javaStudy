package com.lian.study.service.impl;

import com.lian.study.mapper.JavaStudyMapper;
import com.lian.study.service.JavaStudyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ted
 * @version 1.0
 * @date 2021/9/12 12:42
 */
@Service
public class JavaStudyServiceImpl implements JavaStudyService {

    @Resource
    private JavaStudyMapper javaStudyMapper;

    @Override
    public List<HashMap> findJavaStudySteps(String stepValue) {
        List<HashMap> studyStep = javaStudyMapper.findStudyStep(stepValue);
        return studyStep;
    }
}
