package club.dafty.springcloud;

import club.dafty.ribbon.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
// 指定调用方法，自定义负载均衡规则，但MyRule不能在@ComponentScan包及其子包下
@RibbonClient(name="MICROSERVICE-PROVIDER",configuration = MyRule.class)
public class DeptConsumer_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_App.class,args);
    }
}
