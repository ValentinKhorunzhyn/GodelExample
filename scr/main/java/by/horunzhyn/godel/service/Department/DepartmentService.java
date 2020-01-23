package by.horunzhyn.godel.service.Department;

import by.horunzhyn.godel.dao.DepartmentRepository;
import by.horunzhyn.godel.entity.Department;
import by.horunzhyn.godel.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends BaseServiceImpl<Department,DepartmentRepository> {

    @Autowired
    private DepartmentRepository DepartmentRepository;

    @Override
    protected DepartmentRepository getRepository(){

        return DepartmentRepository;
    }


}
