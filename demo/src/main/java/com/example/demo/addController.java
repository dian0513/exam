package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class addController {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    @PostMapping("/addproduct")
    public String insert(@RequestBody Product product){

        String sql = "Insert into product(ProductID,ProductName,Price,Quantity) VALUE (:productID, :ProductName, :Price, :Quantity)";

        Map<String,Object> map = new HashMap<>();
        map.put("productID",product.getProductID());
        map.put("ProductName",product.getProductName());
        map.put("Price",product.getPrice());
        map.put("Quantity",product.getQuantity());
        namedParameterJdbcTemplate.update(sql,map);
        return "新增產品";
    }

        @PostMapping("/addorder")
    public String insert(@RequestBody Order order){
        DateFormat dateFormat = new SimpleDateFormat("YYYYMMDD");
        Date date = new Date();
        int uniqueId = (int) (System.currentTimeMillis() & 0xfffffff);
        String uniqueId_s = String.valueOf(uniqueId);

        String orderID = "Ms"+dateFormat.format(date) +  uniqueId_s.substring(4,9);
        String sql = "Insert into `order` VALUE ('"+orderID+"', :memberID, :price, :payStatus)";

        Map<String,Object> map = new HashMap<>();
        map.put("memberID",order.getMemberID());
        map.put("price",order.getPrice());
        map.put("payStatus",order.getPayStatus());
        System.out.println(order.getPayStatus());
        namedParameterJdbcTemplate.update(sql,map);
        return "New order";
    }

    @GetMapping("/queryproduct")
    public List<Product> select(){
        String sql = "SELECT PRODUCTID,PRODUCTNAME,PRICE,QUANTITY FROM PRODUCT WHERE QUANTITY>0";
        Map<String,Object> map = new HashMap<>();

        List<Product> list = namedParameterJdbcTemplate.query(sql,map,new ProductRowMapper());
        return list;

    }
}
