public class Person {
    String name;
    int age;
    String gender;
    String nationality;

    public Person(String name, int age, String gender, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }
    public void sayHello(){
        System.out.println("Hello, I'm " + name + "and " + age + " years old.");
    }
}
