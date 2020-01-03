package com.jpmc.zitcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

   // private static final Logger log= LoggerFactory.getLogger(Application.class);

    public static void main(String args[])
    {

        SpringApplication.run(Application.class,args);
        System.out.println("print Hello222");

    }

//    @Bean
//    public CommandLineRunner demo(CustomerRepository repository){
//        return (args) -> {
//            repository.save(new Customer("Jack","Bruner"));
//            repository.save(new Customer("Chloe","O'Brian"));
//            repository.save(new Customer("Kim","Bauer"));
//            repository.save(new Customer("David","Palmer"));
//            repository.save(new Customer("Michelle","Dessler"));
//
//            log.info("Find All Customer");
//            log.info("_----------------------------");
//            for(Customer customer:repository.findAll()){
//                log.info(customer.toString());
//            }
//
//        };

    }


