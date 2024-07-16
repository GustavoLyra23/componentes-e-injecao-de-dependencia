package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShipingService {

    public Double shipment(Order order) {
        if (order.getBasicValue() < 100) {
            return 20.0;
        }
        if (order.getBasicValue() <= 200 && order.getBasicValue() >= 100) {
            return 12.0;
        }
        return 0.0;
    }

}
