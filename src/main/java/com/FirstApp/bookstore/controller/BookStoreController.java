package com.FirstApp.bookstore.controller;


import com.FirstApp.bookstore.dto.BookOrderRequest;
import com.FirstApp.bookstore.model.Order;
import com.FirstApp.bookstore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/bookstore")
public class BookStoreController {

    private final OrderService orderService;

    public BookStoreController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("hello World 2");
    }

    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest){
             Order order = orderService.putAndOrder(bookOrderRequest.getBookIdList(),bookOrderRequest.getUserName());

             return ResponseEntity.ok(order);
    }
}
