package cn.jiansk.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*********************************************************
 * 文件名称：HomeController
 * 系统名称：交易银行系统V1.2
 * 模块名称：cn.jiansk.web 
 * 功能说明：
 * 开发人员：jiansk20361
 * 开发时间：2018-08-12 18:07
 * 修改记录：程序版本    修改日期    修改人员    修改单号    修改说明
 *********************************************************/
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/home/login")
    public String login(){
        return "/home/login";
    }

    @GetMapping("/home/regist")
    public String regist(){
        return "/home/regist";
    }
}
