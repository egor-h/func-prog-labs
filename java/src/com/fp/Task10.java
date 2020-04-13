package com.fp;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {

    private static class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

    List<Person> sortPersons(List<Person> persons) {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var persons = List.of(new Person("Ivan", "Ivanov"),
                new Person("Ivan", "Andreev"),
                new Person("Andrey", "Ivanov"),
                new Person("Gurbanguly", "Berdimuhamedow")
        );
        System.out.println(persons);
        System.out.println(new Task10().sortPersons(persons));

    }
}
