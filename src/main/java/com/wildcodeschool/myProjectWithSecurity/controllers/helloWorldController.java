package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class helloWorldController {

    @GetMapping("/")
    public String hello(){
        return  "Welcome to the SHIELD";
    }


    @GetMapping("/avengers/assemble")
    public String avenger() {return "Avengers... Assemble" ;}

    @GetMapping("/secret-bases")
    public List<String> secret()
    {
        List<String> wildSchoolList = new ArrayList<>();
        wildSchoolList.add("Biarritz");
        wildSchoolList.add("Bordeaux");
        wildSchoolList.add("La Loupe");
        wildSchoolList.add("Lille");
        wildSchoolList.add("Lyon");
        wildSchoolList.add("Marseille");
        wildSchoolList.add("Nantes");
        wildSchoolList.add("Worldwide");

        return wildSchoolList.stream().collect(Collectors.toList());}
}