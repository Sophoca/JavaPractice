package Lab7.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog1=new Dog();    Cat cat1=new Cat();    Sheep sheep1=new Sheep();
        Animal dog2=new Dog();  Animal cat2=new Cat(); Animal sheep2=new Sheep();
        System.out.println("non-polymorphism");
        dog1.cry();    cat1.cry();    sheep1.cry();
        System.out.println("\npolymorphism");
        dog2.cry();    cat2.cry();    sheep2.cry();
    }
}
