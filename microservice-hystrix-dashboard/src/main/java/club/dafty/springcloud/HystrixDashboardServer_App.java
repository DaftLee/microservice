package club.dafty.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardServer_App {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardServer_App.class,args);
    }
}
