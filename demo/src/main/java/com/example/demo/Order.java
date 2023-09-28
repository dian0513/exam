package com.example.demo;

public class Order {
        String OrderID;
        String MemberID;
        Integer Price;
        String PayStatus;

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getMemberID() {
        return MemberID;
    }

    public void setMemberID(String memberID) {
        MemberID = memberID;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public String getPayStatus() {
        return PayStatus;
    }

    public void setPayStatus(String payStatus) {
        PayStatus = payStatus;
    }
}
