package com.gTerminal;


import com.gTerminal.Entity.PriorityCity;
import com.gTerminal.Repository.PriorityCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner{

    @Autowired
    private PriorityCityRepository priorityCityRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        priorityCityRepository.deleteAll();
        priorityCityRepository.save(new PriorityCity("65201","Primmary","Columbia","MO","123","456"));
        priorityCityRepository.save(new PriorityCity("65201","Primmary","Columbia","MO","123","456"));
        priorityCityRepository.save(new PriorityCity("65201","Primmary","Columbia","MO","123","456"));
        priorityCityRepository.save(new PriorityCity("65201","Primmary","Columbia","MO","123","456"));

//        System.out.println("Priority found with findAll():");
//        System.out.println("-------------------------------");
//
//        for (PriorityCity p : priorityCityRepository.findAll()) {
//            System.out.println(p);
//        }
//        System.out.println();


        System.out.println("Priority found with findByZipCode():");
        System.out.println("-------------------------------");

        for (PriorityCity p : priorityCityRepository.findByZipCode("65201")) {
            System.out.println(p);
        }
        System.out.println();

    }

}
