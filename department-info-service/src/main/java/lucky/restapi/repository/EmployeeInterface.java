package lucky.restapi.repository;

import lucky.restapi.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeInterface extends JpaRepository<Employees, Integer>
{

}
