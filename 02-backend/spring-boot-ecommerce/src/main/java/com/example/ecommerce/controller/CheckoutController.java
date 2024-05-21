package com.example.ecommerce.controller;

import com.example.ecommerce.dto.Purchase;
import com.example.ecommerce.dto.PurchaseResponse;
import com.example.ecommerce.service.CheckoutService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("http://localhost:4220")
@RestController
@RequestMapping("/api/checkout")
@Component
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }
}
