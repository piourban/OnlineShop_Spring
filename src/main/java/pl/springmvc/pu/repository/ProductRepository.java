package pl.springmvc.pu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.springmvc.pu.domain.Product;

import java.util.List;

/**
 * Created by Admin on 13.07.2017.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
