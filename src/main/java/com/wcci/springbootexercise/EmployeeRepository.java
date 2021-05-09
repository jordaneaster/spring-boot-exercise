package com.wcci.springbootexercise;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepository {

    Map<String, Employee> employeeList = new HashMap<>();

    public EmployeeRepository(){

        Address jordansAddress = new Address("123 main st.","cleveland","ohio");


        Employee jordan = new Employee("1","jordan","erik","easter",
                "none",jordansAddress);
        Employee nick = new Employee("2","nick","david","bill",
                "none",jordansAddress);
        Employee alicia = new Employee("3","alicia","maria","sanders",
                "none",jordansAddress);
        Employee kit = new Employee("4","kit","nmn","sidhu",
                "none",jordansAddress);
        Employee ty = new Employee("5","ty","nmn","jackson",
                "none",jordansAddress);

        employeeList.put(jordan.getEmployeeId(), jordan);
        employeeList.put(nick.getEmployeeId(), nick);
        employeeList.put(alicia.getEmployeeId(), alicia);
        employeeList.put(kit.getEmployeeId(), kit);
        employeeList.put(ty.getEmployeeId(), ty);
    }

    public Collection<Employee> getAllEmployees(){
        return employeeList.values();
    }

}
