package by.horunzhyn.godel.service.employee;

import by.horunzhyn.godel.dao.EmployeeRepository;
import by.horunzhyn.godel.entity.Employee;
import by.horunzhyn.godel.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends BaseServiceImpl<Employee,EmployeeRepository> {

    @Autowired
    private EmployeeRepository EmployeeRepository;

    @Override
    protected EmployeeRepository getRepository(){
        return EmployeeRepository;
    }
}
