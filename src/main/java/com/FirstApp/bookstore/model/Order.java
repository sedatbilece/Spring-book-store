package com.FirstApp.bookstore.model;


import com.FirstApp.bookstore.model.Book;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table
@Data
@Getter
@Setter
@Builder
@Entity(name="bookOrder")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private  String userName;
    private Double totalPrice;
    private List<Integer> bookList;

}
