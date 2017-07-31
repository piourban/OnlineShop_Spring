package pl.springmvc.pu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.springmvc.pu.domain.Product;
import pl.springmvc.pu.repository.ProductRepository;
import pl.springmvc.pu.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void processOrder(Long productId, Long productNo) {

        Product byId = productRepository.findOne(productId);

        if (byId.getUnitsInStock() < productNo) {
            throw new IllegalArgumentException("Zbyt malo towaru");
        }
        byId.setUnitsInStock(byId.getUnitsInStock() - productNo);
    }
}
