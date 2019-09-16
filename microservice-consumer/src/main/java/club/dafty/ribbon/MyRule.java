package club.dafty.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡规则
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/9/10 21:39
 */
@Configuration
public class MyRule {
    @Bean
    public IRule myselfRule(){
        return new RandomRule();
    }
}
