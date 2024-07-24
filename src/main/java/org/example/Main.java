package org.example;

public class Main {
    public static void main(String[] args) {



        Person person = new Person("John", "Doe", 18);
        Person person2 = new Person("Ali", "Sadeler", 30, 183.0, 94, "Ankara" );
//        System.out.println(person2.toString());
//        System.out.println(person.toString());

//        System.out.println("Firstname: " + person.getFirstName());
//       System.out.println("LastName: " + person.getLastName());
//       System.out.println("Age: " + person.getAge());
//       System.out.println("Age: " + person.isTeen());

        Wall wall1 = new Wall(5,4);
      //  wall1.setHeight(100);
        System.out.println(wall1.toString());
    }
}
