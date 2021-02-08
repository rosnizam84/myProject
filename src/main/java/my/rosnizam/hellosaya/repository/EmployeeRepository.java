package my.rosnizam.hellosaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.rosnizam.hellosaya.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
