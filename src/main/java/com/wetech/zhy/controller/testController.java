package com.wetech.zhy.controller;

import com.wetech.zhy.entity.CollateralProviderZhy;
import com.wetech.zhy.entity.KoJinJoHoZhy;
import com.wetech.zhy.service.CollateralProviderZhyService;
import com.wetech.zhy.service.KoJinJoHoZhyService;
import com.wetech.zhy.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testController")
public class testController {


    @CrossOrigin
    @RequestMapping(value = "/save_test", method = RequestMethod.POST)
    public JsonResult save(@RequestBody CollateralProviderZhy collateralProviderZhy){
        System.out.println( collateralProviderZhy);
        return null;
    }

    @CrossOrigin
    @RequestMapping(value = "/save_test2", method = RequestMethod.POST)
    public JsonResult save2(@RequestBody KoJinJoHoZhy koJinJoHoZhy){
        System.out.println( koJinJoHoZhy);
        return null;
    }
}
