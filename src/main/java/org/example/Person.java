package org.example;

public class Person {
    // İstenilen 3 temel değişken
    String firstname;
    String lastName;
    int age;

    // Kendi eklediğimiz 3 ekstra değişken
    double salary;
    boolean isMarried;
    String job;

    // Sadece 3 parametre alan Constructor
    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    // Tüm parametreleri alan Constructor (Overloading ve Constructor Chaining)
    public Person(String firstname, String lastName, int age, double salary, boolean isMarried, String job) {
        this(firstname, lastName, age); // Constructor chaining ile diğerini çağırıyoruz
        this.salary = salary;
        this.isMarried = isMarried;
        this.job = job;
    }

    // Metotlar
    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}