package lucky.restapi.repository;


import lucky.restapi.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentInterface extends JpaRepository<Departments, String>
{

}
