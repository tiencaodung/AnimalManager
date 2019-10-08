package imic;

public class App {
    public static void main(String[] args) {
        animal a1 = new animal();
        a1.eat();
        dog d = new dog();
        d.eat();
        d.sochan = "4";
        d.animailName= "Messi";
        System.out.println(d.animailName + " có " + d.sochan + " ăn " );
        d.eat();
        d.bak();
        a1.eat();
    }
}
