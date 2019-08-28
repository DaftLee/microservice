package club.dafty.springcloud.control;

import club.dafty.springcloud.pojo.Dept;
import club.dafty.springcloud.service.impl.DeptServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    private static final Logger logger = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptServiceImpl service;

    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id ){
        return service.getById(id);
    }
    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Dept> get(){
        List<Dept> list = service.getAll();
        logger.info("查询dept list结果:"+list);
        return service.getAll();
    }
}
