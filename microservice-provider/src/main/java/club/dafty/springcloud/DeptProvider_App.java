package club.dafty.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_App.class,args);
    }
}
