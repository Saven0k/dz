package org.example.cart.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
  @GetMapping("/hello")
  public String hello(){
    return "Hello from cart";
  }

}
