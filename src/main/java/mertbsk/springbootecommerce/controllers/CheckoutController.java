package mertbsk.springbootecommerce.controllers;

import mertbsk.springbootecommerce.dto.Purchase;
import mertbsk.springbootecommerce.dto.PurchaseResponse;
import mertbsk.springbootecommerce.services.CheckoutService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

	private final CheckoutService checkoutService;

	public CheckoutController(CheckoutService checkoutService) {
		this.checkoutService = checkoutService;
	}

	@PostMapping("/purchase")
	public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
		return checkoutService.placeOrder(purchase);
	}
}
