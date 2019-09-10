package club.dafty.springcloud.service;

import club.dafty.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);
    public Dept getById(Long id);
    public List<Dept> getAll();
}
