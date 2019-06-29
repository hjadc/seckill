package cn.codingxiaxw.service.impl;

import cn.codingxiaxw.entity.Employee;
import cn.codingxiaxw.service.MyPredicate;

public class FilterEmplloyeeByAge implements MyPredicate<Employee> {


    /**
     * 根据年龄来过滤的具体实现策略
     *
     * @param employee
     * @return
     */
    @Override
    public boolean filter(Employee employee) {
        return employee.getAge() > 35;
    }
}
