package ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3.Homework10Task2;

public class User {
    String name;
    int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
