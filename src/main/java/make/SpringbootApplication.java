package make;

import make.config.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringbootApplication {

    /**
     * 添加Filter
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean<MyFilter> myFilter() {
        FilterRegistrationBean<MyFilter> register = new FilterRegistrationBean<MyFilter>();
        MyFilter f = new MyFilter();
        register.setFilter(f);
        return register;
    }

    public static void main(String[] args) {
//        String a = null;
//        Assert.notNull(a, "a is not allow null");

        SpringApplication.run(SpringbootApplication.class, args);
    }

}
