package com.wetech.zhy.controller;

import com.wetech.zhy.entity.CollateralProviderZhy;
import com.wetech.zhy.service.CollateralProviderZhyService;
import com.wetech.zhy.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CollateralProviderZhy")
public class CollateralProviderZhyController {

    @Autowired
    private CollateralProviderZhyService collateralProviderZhyService;

    @CrossOrigin
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public JsonResult save(@RequestBody CollateralProviderZhy collateralProviderZhy){
        // 返却されるオブジェクト
        JsonResult<Void> result = new JsonResult<>();

//        // 保存を試し
//        try {
//            collateralProviderZhyService.save(collateralProviderZhy);
//            //成功した場合、ステータスを200に設定する
//            result.setState(200);
//            System.out.println("success");
//        } catch (Exception e){
//            //失敗した場合は、ステータスを4000に設定。
//            result.setState(4000);
//            //エラーメッセージの書き込み
//            result.setMessage("异常发生");
//            System.out.println("fail");
//        }

        System.out.println(collateralProviderZhy);
        collateralProviderZhyService.save(collateralProviderZhy);
        return result;
    }

}
