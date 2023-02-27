package com.wetech.zhy.controller;

import com.wetech.zhy.entity.BuildingZhy;
import com.wetech.zhy.service.BuildingZhyService;
import com.wetech.zhy.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BuildingZhy")
public class BuildingZhyController {

    @Autowired
    private BuildingZhyService buildingZhyService;

    @CrossOrigin
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public JsonResult save(@RequestBody BuildingZhy buildingZhy){
        JsonResult<Void> result = new JsonResult<>();

        // 测试用代码
        {
            System.out.println(buildingZhy);
            buildingZhyService.save(buildingZhy);
        }

        return result;
    };
}
