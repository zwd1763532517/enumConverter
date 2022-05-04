package com.zwd.enumtest.controller;

import com.zwd.enumtest.constant.GenderEnum;
import com.zwd.enumtest.constant.RequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enum")
public class TestEnumReqController {

    @GetMapping("/add")
    public String getInfo(@RequestParam("genderEnum") GenderEnum dto){
        return dto.getMsg();
    }

    @PostMapping("/add")
    public String  addInfo(@RequestBody RequestDto dto){
        GenderEnum genderEnum = dto.getGenderEnum();
        return genderEnum.getMsg();
    }
}
