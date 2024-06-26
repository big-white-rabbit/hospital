package com.yinwang.yygh.hosp.service;


import com.yinwang.yygh.model.hosp.Hospital;
import com.yinwang.yygh.vo.hosp.HospitalQueryVo;
import com.yinwang.yygh.vo.hosp.HospitalSetQueryVo;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface HospitalService {
    void save(Map<String, Object> paramMap);

    Hospital getByHoscode(String hoscode);

    //医院列表分页查询
    Page<Hospital> selectHospPage(Integer page, Integer limit, HospitalQueryVo hospitalQueryVo);

    //更新医院上线状态
    void updateStatus(String id, Integer status);

    //医院详情信息
    Map<String, Object> getHospById(String id);

    //根据医院编号获取医院名称
    String getHospName(String hoscode);

    //根据医院名称查询
    List<Hospital> findByHosname(String hosname);

    //根据医院编号获取预约挂号详情
    Map<String, Object> item(String hoscode);
}
