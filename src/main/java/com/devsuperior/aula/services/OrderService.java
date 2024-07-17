package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShipingService shipingService;

    public Double total(Order order) {
        var discontValue = order.getBasicValue() - (order.getBasicValue() * (order.getDiscount() / 100));
        discontValue += shipingService.shipment(order);
        return discontValue;
    }


}
