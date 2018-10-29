public class Animal  {

    private String name;
    private int hungerVal;
    private int thirstVal;


    public Animal(String name, int hungerVal, int thirstVal){
        this.name = name;
        this.hungerVal = 50;
        this.thirstVal = 50;
    }

    public void eat(){
        hungerVal -= 1;
    }

    public void drink(){
        thirstVal -= 1;
    }

    public void play(){
        hungerVal += 1;
        thirstVal += 1;
    }

    public static void main(String[] args){

        Animal dog = new Animal("Joey",50,50);

        for (int i = 0; i < 2; i++) {
            dog.eat();
            dog.drink();
        }

        dog.play();

        System.out.println("Name: " + dog.name + "   Hunger: " + dog.hungerVal + "   Thirst: " + dog.thirstVal);

    }

}
