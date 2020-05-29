package lucky.restapi.controller;


import lucky.restapi.model.Departments;
import lucky.restapi.repository.DepartmentInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@Controller
@RestController
@RequestMapping("/departments")
public class DepartmentController
{
    @Inject
    DepartmentInterface departmentInterface;

    @GetMapping("/all")
    public List<Departments> getAllDepartments()
    {
        List<Departments> allDepartments = (List<Departments>) departmentInterface.findAll();
        return allDepartments;
    }


}
