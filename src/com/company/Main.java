package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
    Address a1 = new Address("Misk", "Olshevskogo", 34);
    Address a2 = new Address("Misk", "Glebki", 39);
    Address a3 = new Address("Misk", "Timiryazeva", 95);
    Address a4 = new Address("Misk", "Angarskaya", 13);
    Address a5 = new Address("Misk", "Pobediteley", 5);

	Person p1 = new Person("Nick", "Dobrinskiy", a1);
	Person p2 = new Person("Maks", "Besanskiy", a2);
	Person p3 = new Person("Vitaly", "Klichko", a3);
	Person p4 = new Person(null, "Maslov", a4);
	Person p5 = new Person("Mishanya", null, a5);
	Person p6 = new Person("Nick", "Dobrinskiy", null);

        List <Person> personList = List.of(p1, p2, p3, p4, p5, p6);


        personList.stream().filter(Objects::nonNull)
                .filter(person -> person.getFirstName() != null)
                .filter(person -> person.getSecondName() != null)
                .filter(person -> person.getAddress() != null)
                .sorted(Comparator.comparing(person -> person.getAddress().getHome()))
                .map(Objects::toString)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
