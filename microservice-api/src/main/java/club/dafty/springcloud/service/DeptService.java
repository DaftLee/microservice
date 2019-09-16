package club.dafty.springcloud.service;

import club.dafty.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/9/16 9:17
 */
@FeignClient(value = "MICROSERVICE-PROVIDER")
public interface DeptService {
    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept);

    @RequestMapping(value = "dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id );
    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Dept> list();

}
