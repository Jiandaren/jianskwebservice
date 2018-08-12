package cn.jiansk;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*********************************************************
 * 文件名称：JianskwebserviceServletInitializer
 * 系统名称：交易银行系统V1.2
 * 模块名称：cn.jiansk 
 * 功能说明：
 * 开发人员：jiansk20361
 * 开发时间：2018-08-04 16:34
 * 修改记录：程序版本    修改日期    修改人员    修改单号    修改说明
 *********************************************************/
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
