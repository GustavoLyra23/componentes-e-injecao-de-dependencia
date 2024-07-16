package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShipingService shipingService;

    public Double total(Order order) {
        var discount = shipingService.shipment(order);
        var total = order.getBasicValue() + discount;
        order.setDiscount(discount);
        return total;
    }


}
