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
    // 個人情報の保存
    public JsonResult save(@RequestBody KoJinJoHoZhy koJinJoHoZhy){
        // 返却されるオブジェクト
        JsonResult<Void> result = new JsonResult<>();

        // 個人情報の保存を試し
        try {
            koJinJoHoZhyService.save(koJinJoHoZhy);
            //成功した場合、ステータスを200に設定する
            result.setState(200);
            System.out.println("success");
        } catch (Exception e){
            //失敗した場合は、ステータスを4000に設定。
            result.setState(4000);
            //エラーメッセージの書き込み
            result.setMessage("异常发生");
            System.out.println("fail");
        }
        return result;
    }
}
