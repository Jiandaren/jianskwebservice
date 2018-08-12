package cn.jiansk.web.common;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*********************************************************
 * 文件名称：SecurityConfig
 * 系统名称：交易银行系统V1.2
 * 模块名称：cn.jiansk.web.common
 * 功能说明：
 * 开发人员：jiansk20361
 * 开发时间：2018-07-09 0:58
 * 修改记录：程序版本    修改日期    修改人员    修改单号    修改说明
 *********************************************************/
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                        .antMatchers("/", "/favicon.ico", "/home/**").permitAll()
                        .anyRequest().authenticated()
                        .and()
                .formLogin()
                        .loginPage("/login").defaultSuccessUrl("/user")
                        .and()
                .logout()
                        .logoutUrl("/logout").logoutSuccessUrl("/login");
    }

    /**
     * 在内存中创建一个名为 "user" 的用户，密码为 "pwd"，拥有 "USER" 权限
     */
    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("user").password("pwd").roles("USER").build());
        return manager;
    }
}
