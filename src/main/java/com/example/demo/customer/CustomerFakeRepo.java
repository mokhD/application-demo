package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepo implements CustomerRepo {

    @Override
    public List<Customer> getCustomers(){
     return Arrays.asList(
             new Customer(1L,"sweet johnson", "password", "email@e.com"),
             new Customer(2L, "carl johhnson", "password", "email@e.com")
     );
    }
}
