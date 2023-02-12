package be.contactsdirectory.frontend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import be.contactsdirectory.model.Employee;

@RepositoryRestResource(path = "employees", collectionResourceRel = "contacts")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
