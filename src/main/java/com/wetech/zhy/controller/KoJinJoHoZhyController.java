package com.wetech.zhy.controller;

import com.wetech.zhy.entity.KoJinJoHoZhy;
import com.wetech.zhy.service.KoJinJoHoZhyService;
import com.wetech.zhy.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ko-jin-jo-ho-zhy")
public class KoJinJoHoZhyController {
    @Autowired
    private KoJinJoHoZhyService koJinJoHoZhyService;

    @CrossOrigin
    @RequestMapping(value="/save", method = RequestMethod.POST)
    public JsonResult save(@RequestBody KoJinJoHoZhy koJinJoHoZhy){
        JsonResult<Void> result = new JsonResult<>();
        koJinJoHoZhyService.save(koJinJoHoZhy);
        return result;
    }
}
