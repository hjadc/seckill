package cn.codingxiaxw.service.impl;

import cn.codingxiaxw.entity.Employee;
import cn.codingxiaxw.service.MyPredicate;

public class FilterEmplloyeeBySalary implements MyPredicate<Employee> {

    /**
     * 根据工资来过滤的具体实现策略
     *
     * @param employee
     * @return
     */
    @Override
    public boolean filter(Employee employee) {
        return employee.getSalary() >= 5000;
    }
}
