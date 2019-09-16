package club.dafty.springcloud.hystrix;

import club.dafty.springcloud.pojo.Dept;
import club.dafty.springcloud.service.DeptService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Hystrix熔断器工厂类
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/9/16 14:17
 */
@Component
public class DeptServiceFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                Dept dept = new Dept();
                dept.setDname("查询失败哦（断路器）");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
