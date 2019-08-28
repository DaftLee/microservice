package club.dafty.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer - 标注启动该组件技术相关注解标签
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_App.class,args);
    }
}
