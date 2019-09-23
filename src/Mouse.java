public class Mouse extends Animal{
    //inheritance

    public Mouse() {
        super();
        System.out.println("Now I'm Jerry, the Mouse!");
    }

    @Override
    public String sleep() {
        return "A Mouse sleeps...";
        //polymorphism
    }

    @Override
    public String eat() {
        return "A Mouse eats...";
        //polymorphism
    }

    public String cook() {
        return "Ratatouille!!!!!";
    }
}
