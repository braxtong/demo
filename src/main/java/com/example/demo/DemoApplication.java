package com.example.demo;

import com.example.demo.Model.Person;
import com.example.demo.Model.PersonRes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DemoApplication.class,args);
        com.example.test.PPP.test();
//        Person person1 = new Person(1,"1a",11,"pc1");  //
//        Person person2 = new Person(1,"1b",12,"pc1");  //  1 ['1a','1b'] [11,12] 'pc1'
//        Person person3 = new Person(2,"2a",21,"pc2");  //
//        Person person4 = new Person(2,"2b",22,"pc2");  //  2 ['2a','2b'] [21,22] 'pc2'
//        Person person5 = new Person(3,"3a",31,"pc3");  //
//        Person person6 = new Person(3,"3b",32,"pc3");  //  3 ['3a','3b'] [31,32] 'pc3'
//        List<Person>  personList = new ArrayList<>();
//        personList.add(person1);personList.add(person2);
//        personList.add(person3);personList.add(person4);
//        personList.add(person5);personList.add(person6);
//        String ccc="";
//        System.out.println(ccc.isEmpty());
//        //Group By
//        List<PersonRes> personResList = personList.stream().collect(Collectors.groupingBy(Person::getId))
//                .values().stream().map(DemoApplication::convert).collect(Collectors.toList());
//        personResList.forEach(n-> System.out.println(n.getNames().toString()));
    }
    private static PersonRes convert(List<Person> personList) {
        List<String> nameList = new ArrayList<>();
        List<Integer> codeList = new ArrayList<>();
        for (Person p : personList) {
            nameList.add(p.getName());
            codeList.add(p.getCode());
        }
        return new PersonRes(personList.get(0).getId(), nameList, codeList, personList.get(0).getPc());
    }
}
