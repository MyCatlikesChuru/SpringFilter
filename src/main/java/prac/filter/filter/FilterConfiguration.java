package prac.filter.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<FirstFilter> firstFilterRegister(){
        FilterRegistrationBean<FirstFilter> registrationBean = new FilterRegistrationBean<>(new FirstFilter());
        registrationBean.setOrder(1); // 순서를 정하기 낮은거부터 실행됨
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<SecoundFilter> secondFilterRegister(){
        FilterRegistrationBean<SecoundFilter> registrationBean = new FilterRegistrationBean<>(new SecoundFilter());
        registrationBean.setOrder(2);
        return registrationBean;
    }

}
