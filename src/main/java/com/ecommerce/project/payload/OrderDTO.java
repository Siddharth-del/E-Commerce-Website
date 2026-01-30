package com.ecommerce.project.payload;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    

    private Long orderId;
    private String email;
    private  List<OrderItemDTO> orderItems;

    private PaymentDTO payment;
    private Double totaleAmount;
    private String orderStatus;

    private Long addressId;

}
