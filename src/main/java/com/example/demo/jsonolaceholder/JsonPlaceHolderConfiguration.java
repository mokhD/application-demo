package com.example.demo.jsonolaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonPlaceHolderConfiguration {

    @Bean("jsonplaceholder")
    CommandLineRunner runner(JSONPlaceHolderClient jsonPlaceHolderClient){
        return args -> {
           /* System.out.println("https://jsonplaceholder.typicode.com/posts");
            System.out.println(jsonPlaceHolderClient.getPosts().size());
            System.out.println("https://jsonplaceholder.typicode.com/post/1");
            System.out.println(jsonPlaceHolderClient.getPost(1));*/
        };
    }


}
