package pl.springmvc.pu.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface OrderService {

    @Transactional
    void processOrder(Long productId, Long productNo);

}
