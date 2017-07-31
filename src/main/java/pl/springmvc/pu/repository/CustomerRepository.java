package pl.springmvc.pu.repository;

import org.springframework.data.repository.CrudRepository;
import pl.springmvc.pu.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
