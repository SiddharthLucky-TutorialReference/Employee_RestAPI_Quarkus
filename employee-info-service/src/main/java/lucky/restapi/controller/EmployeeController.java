package lucky.restapi.controller;

import lucky.restapi.model.Employees;
import lucky.restapi.repository.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{
    @Autowired
    EmployeeInterface employeeInterface;

    @GetMapping("/all")
    public List<Employees> getAllEmployees()
    {
        return employeeInterface.findAll();
    }

    @GetMapping("/get-employee/{emp_id}")
    public Employees getEmployeeById(@PathVariable ("emp_id") int emp_Id)
    {
        Optional<Employees> employee = employeeInterface.findById(emp_Id);
        if(employee.isPresent()) {
            return employee.get();
        }
        else
        {
            return null;
        }
    }

    @PostMapping("/add-employees")
    public String insertEmployees(@RequestBody Employees employees)
    {
        employeeInterface.save(employees);
        return "Employee values inserted.";
    }

    @DeleteMapping("/remove-employee/{emp_id}")
    public String removeEmployeeFromDb(@PathVariable ("emp_id") int emp_Id)
    {
        employeeInterface.deleteById(emp_Id);
        return "Employee deleted from DB";
    }
}
