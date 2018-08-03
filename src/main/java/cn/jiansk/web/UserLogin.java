package cn.jiansk.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*********************************************************
 * 文件名称：UserLogin
 * 系统名称：交易银行系统V1.2
 * 模块名称：cn.jiansk.web 
 * 功能说明：
 * 开发人员：jiansk20361
 * 开发时间：2018-07-09 0:54
 * 修改记录：程序版本    修改日期    修改人员    修改单号    修改说明
 *********************************************************/
@Controller
public class UserLogin {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
