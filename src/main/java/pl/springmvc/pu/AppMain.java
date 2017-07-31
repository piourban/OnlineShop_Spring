package pl.springmvc.pu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;
import pl.springmvc.pu.domain.Customer;
import pl.springmvc.pu.domain.Product;
import pl.springmvc.pu.repository.CustomerRepository;
import pl.springmvc.pu.repository.ProductRepository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

/**
 * Created by Admin on 13.07.2017.
 */
@Component
public class AppMain extends ContextStartedEvent {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerRepository customerRepository;

    public AppMain(ApplicationContext source) {
        super(source);
    }


    @PostConstruct
    public void init() {
        productRepository.save(new Product("Lenovo z51-70",new BigDecimal(2690),"The new series - Z Lenovo laptop. Must have for the best developers", "Lenovo", "Laptop", 198l, 2l, true, "good"));
        productRepository.save(new Product("Iphone 7 Plus",new BigDecimal(3899),"The newest smartphone from Apple. Enhanced version 7 Plus provide more features and possibilities", "Apple", "Smartphone", 19l, 1l, true, "good"));

        customerRepository.save(new Customer("Adam", "Nawałka", "adamnawalka@gmail.com", "Woronicza 17, Warszawa", 4l));
        customerRepository.save(new Customer("Wojtek", "Nowak", "wojteknowak@gmail.com", "Woronicza 17, Warszawa", 14l));
    }
}
