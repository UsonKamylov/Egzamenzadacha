public class Wolf extends Animal  implements Hunt{

    public Rabbit rabbit;

    public Wolf(String name, int age, Rabbit rabbit) {
        super(name, age);
        this.rabbit = rabbit;
    }

    public Rabbit getRabbit() {
        return rabbit;
    }

    public void setRabbit(Rabbit rabbit) {
        this.rabbit = rabbit;
    }

    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is huntting the "+rabbit.getName() +" "+ rabbit.getAge());


    }


}
