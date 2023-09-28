package com.example.demo;

public class OrderDetail {
   String OrderItemSN;
   String OrderID;
   String ProductID;

    public String getOrderItemSN() {
        return OrderItemSN;
    }

    public void setOrderItemSN(String orderItemSN) {
        OrderItemSN = orderItemSN;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Integer getStandPrice() {
        return StandPrice;
    }

    public void setStandPrice(Integer standPrice) {
        StandPrice = standPrice;
    }

    public Integer getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        ItemPrice = itemPrice;
    }

    Integer Quantity;
   Integer StandPrice;
   Integer ItemPrice;
}
