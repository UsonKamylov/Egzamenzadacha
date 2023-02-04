public class Rabbit extends Animal implements Eat{
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"is eating the hay");
    }


}
