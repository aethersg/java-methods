
class Person
    {
    String name;
    int age;

    void speak()
        {
        System.out.println(
                "My Name is : " + name + " and i am " + age + "years old");
        }

    void sayHello()
        {
        System.out.println("Hello");
        }
    }

public class Application
    {
    public static void main(String[] args)
        {
        Person person1 = new Person();
        person1.name = "Joe Bloggins";
        person1.age = 37;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "sarah smith";
        person2.age = 20;
        person2.speak();
        person2.sayHello();
        }
    }
