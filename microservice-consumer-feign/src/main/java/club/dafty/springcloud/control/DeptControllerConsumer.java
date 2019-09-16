package club.dafty.springcloud.control;

import club.dafty.springcloud.pojo.Dept;
import club.dafty.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptControllerConsumer {

    @Autowired
    DeptService deptService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return deptService.add(dept);
    }
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return deptService.get(id);
    }
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }

}
