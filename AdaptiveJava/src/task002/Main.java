package task002;

import java.util.ArrayList;
import java.util.List;

public class Main {

  static List<Department> departments = new ArrayList<>();

  public static void main(String[] args) {
    Department depExec = new Department("Executive", "000-exec");
    Department depAcc = new Department("Accounting", "111-acc");
    Department depIt = new Department("IT", "111-it");
    Department depOther = new Department("Other", "888-other");

    departments.add(depExec);
    departments.add(depAcc);
    departments.add(depIt);
    departments.add(depOther);

    depExec.getEmployees().add(new Employee("Casey", 25000L));
    depExec.getEmployees().add(new Employee("John", 20000L));

    depAcc.getEmployees().add(new Employee("Ann", 12000L));
    depAcc.getEmployees().add(new Employee("Lora", 12000L));
    depAcc.getEmployees().add(new Employee("Peter", 12000L));

    depIt.getEmployees().add(new Employee("Michael", 20000L));
    depIt.getEmployees().add(new Employee("Sergey", 20000L));
    depIt.getEmployees().add(new Employee("Robert", 20000L));
    depIt.getEmployees().add(new Employee("Sarah", 20000L));

    System.out.println(calcNumberOfEmployees(departments, 15000L));

  }

  public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
    return departments.stream()
        .filter((dep) -> dep.getCode().startsWith("111-"))
        .flatMap(dep -> dep.getEmployees().stream())
        .filter((e) -> e.getSalary() > threshold)
        .count();
        //.mapToLong(Employee::getSalary)
        //.sum();
  }

  //---

  static class Department {
    String name;
    String code;
    List<Employee> employees;

    public Department(String name, String code) {
      this.name = name;
      this.code = code;
      employees = new ArrayList<>();
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getCode() {
      return code;
    }

    public void setCode(String code) {
      this.code = code;
    }

    public List<Employee> getEmployees() {
      return employees;
    }

    public void setEmployees(List<Employee> employees) {
      this.employees = employees;
    }
  }

  //---

  static class Employee {
    String name;
    Long salary;

    public Employee(String name, Long salary) {
      this.name = name;
      this.salary = salary;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Long getSalary() {
      return salary;
    }

    public void setSalary(Long salary) {
      this.salary = salary;
    }
  }

}
