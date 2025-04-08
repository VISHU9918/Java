package inheritance.Person;

class Person {
    String name;
    int age;

    void setData(String name) {
        this.name = name;
    }

    void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getData() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}