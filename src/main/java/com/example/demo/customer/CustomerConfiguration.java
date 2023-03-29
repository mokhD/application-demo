package com.example.demo.customer;

import com.example.demo.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;

    @Value("${info.company.name}")
    private String company;

    @Autowired
    private Environment environment;

    @Bean
    CommandLineRunner commandLineRunner(InfoApp infoApp){
        return args -> {
           // System.out.println("cmd tough guy");
            System.out.println(company);
            System.out.println(environment.getProperty("info.app.version"));
            System.out.println(infoApp);
        };
    }

    //@Bean
    CustomerRepo customerRepo(){
        System.out.println("use = "+ useFakeCustomerRepo);
        return new CustomerFakeRepo() ;
    }
}
