package com.yinwang.yygh.cmn.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
@FeignClient(value = "service-cmn")
public interface DictFeignClient {
    //根据dictCode和value查询
    @GetMapping("/admin/cmn/dict/getName/{dictCode}/{value}")
    public String getName(@PathVariable("dictCode") String dictCode, @PathVariable("value") String value);

    //根据value查询
    @GetMapping("/admin/cmn/dict/getName/{value}")
    public String getName(@PathVariable("value") String value);
}
