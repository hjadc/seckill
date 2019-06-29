package cn.codingxiaxw.test;

import cn.codingxiaxw.entity.Employee;
import cn.codingxiaxw.service.MyPredicate;
import cn.codingxiaxw.service.impl.FilterEmplloyeeByAge;
import cn.codingxiaxw.service.impl.FilterEmplloyeeBySalary;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99),
            new Employee("李四", 38, 5555.99),
            new Employee("王五", 50, 6666.66),
            new Employee("赵六", 16, 3333.33),
            new Employee("田七", 8, 7777.77)
    );

    /**
     * 策略设计模式
     */
    @Test
    public void test1() {
        List<Employee> employees = filterEmployee(this.employees, new FilterEmplloyeeByAge());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("---------------------------");

        List<Employee> employees2 = filterEmployee(this.employees, new FilterEmplloyeeBySalary());
        for (Employee employee : employees2) {
            System.out.println(employee);
        }

    }

    /**
     * 具体的实现工具类
     *
     * @param list
     * @param mp
     * @return
     */
    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> mp) {

        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : list) {
            if (mp.filter(employee)) {
                employeeList.add(employee);
            }
        }

        return employeeList;
    }
}
