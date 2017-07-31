package pl.springmvc.pu.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.springmvc.pu.service.OrderService;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/orders/{productId}/{productNo}")
    public String process(@PathVariable Long productId, @PathVariable Long productNo){
        orderService.processOrder(productId, productNo);
        return "redirect:/products";
    }

}
