public class Main {
    public static void main(String[] args) {

        Rabbit rabbit=new Rabbit("zaes",2);
        System.out.println(rabbit);
        rabbit.eat();



        Wolf wolf=new Wolf("Karyshkyr",4,rabbit);
        System.out.println(wolf);
        wolf.hunt();




    }
}