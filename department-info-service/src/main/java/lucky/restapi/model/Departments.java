package lucky.restapi.model;

import javax.persistence.*;

@Entity
@Table(name = "departments", schema = "employees")
public class Departments
{
    @Id
    @Column(name = "dept_no", nullable = false, columnDefinition = "VARCHAR(4)")
    private String dept_No;

    @Column(name = "dept_name", unique = true, columnDefinition = "VARCHAR(40)")
    private String dept_Name;

    public Departments() {
    }

    public Departments(String dept_no, String dept_Name)
    {
        this.dept_Name = dept_Name;
        this.dept_No = dept_no;
    }

    public String getDept_No() {
        return dept_No;
    }

    public void setDept_No(String dept_No) {
        this.dept_No = dept_No;
    }

    public String getDept_Name() {
        return dept_Name;
    }

    public void setDept_Name(String dept_Name) {
        this.dept_Name = dept_Name;
    }
}
