package com.aynu.feign;

import com.aynu.eneity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
@FeignClient(value = "provider",fallback = FeignError.class)
//fallback = FeignError.class 降级处理
public interface FeignProviderClient {

    /*声明版接口*/
    @GetMapping("/student/findAll")
    Collection<Student> findAll();
    @GetMapping("/student/index")
    String index();
}
