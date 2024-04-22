package com.emmanuelpapa.user.controller;

import com.emmanuelpapa.user.VO.ResponseTemplateVO;
import com.emmanuelpapa.user.entity.Userr;
import com.emmanuelpapa.user.service.UserrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserrController {



    @Autowired
    private UserrService userrService;

    @PostMapping("/userr")
    public Userr saveUserr(@RequestBody Userr userr){
        return userrService.saveUserr(userr);

    }

    @GetMapping("userr/{userrId}")
    public ResponseTemplateVO getUserById(@PathVariable("userrId") Long userrdId){
        return userrService.getUserById(userrdId);
    }
}
