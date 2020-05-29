package lucky.restapi.controller;

import lucky.restapi.model.Employees;
import lucky.restapi.repository.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{
    @Inject
    private EmployeeInterface employeeInterface;

    @RequestMapping("/all")
    public List<Employees> getAllEmployees()
    {
        return employeeInterface.findAll();
    }
}
