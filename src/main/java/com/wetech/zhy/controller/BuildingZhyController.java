package com.wetech.zhy.controller;

import com.wetech.zhy.entity.BuildingZhy;
import com.wetech.zhy.service.BuildingZhyService;
import com.wetech.zhy.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BuildingZhy")
public class BuildingZhyController {

    @Autowired
    private BuildingZhyService buildingZhyService;

    public JsonResult save(BuildingZhy buildingZhy){
        JsonResult<Void> result = new JsonResult<>();
        buildingZhyService.save(buildingZhy);
        return result;
    };
}
