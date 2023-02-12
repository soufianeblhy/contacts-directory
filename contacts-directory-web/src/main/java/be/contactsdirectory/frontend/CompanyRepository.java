package be.contactsdirectory.frontend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import be.contactsdirectory.model.Company;

@RepositoryRestResource(path = "companies", collectionResourceRel = "companies")
public interface CompanyRepository
        extends JpaRepository<Company, Integer> {
    Company findByVatNumber(Long vatNumber);

}
