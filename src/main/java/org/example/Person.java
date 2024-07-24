package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;

    double height;
    double weight;
    String city;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double height, double weight, String city) {
        this(firstName, lastName, age);
        this.height = height;
        this.weight = weight;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (13 < age && age < 19) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Height: " + height + "\n" +
                "weight: " + weight + "\n" +
                "city: " + city;
    }
}
