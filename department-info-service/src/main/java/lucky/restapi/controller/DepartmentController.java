package lucky.restapi.controller;


import lucky.restapi.model.Departments;
import lucky.restapi.repository.DepartmentInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@Controller
@RestController
@RequestMapping("/departments")
public class DepartmentController
{
    @Inject
    DepartmentInterface departmentInterface;

    @RequestMapping("/all")
    public List<Departments> getAllDepartments()
    {
        List<Departments> allDepartments = (List<Departments>) departmentInterface.findAll();
        return allDepartments;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add-departments")
    public String addIntoDepartments(@RequestBody Departments department)
    {
        departmentInterface.save(department);
        return "Value added Successfully";
    }


}
