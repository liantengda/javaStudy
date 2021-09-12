package com.lian.study.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ted
 * @version 1.0
 * @date 2021/9/12 12:42
 */
public interface JavaStudyService {

    /**
     * 根据步骤重要程度查询对应步骤的集合
     * @param stepValue
     * @return
     */
    List<HashMap> findJavaStudySteps(String stepValue);
}
