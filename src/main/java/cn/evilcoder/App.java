package cn.evilcoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
public class App 
{
    @RequestMapping(value = "/")
    String home(){
        return "homePage";
    }
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
