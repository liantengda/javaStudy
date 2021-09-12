package com.lian.study.mapper;

import com.lian.study.model.JavaStep;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ted
 * @version 1.0
 * @date 2021/9/12 12:41
 */
public interface JavaStudyMapper extends Mapper<JavaStep> {

    /**
     * 根据学习步骤等级查询该等级对应的学习步骤集合
     * @return
     */
    List<HashMap> findStudyStep(@Param("stepValue")String stepValue);

}
