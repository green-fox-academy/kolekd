public class Card {

    int id;
    String type;

    public Card(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public Card() {
    }

    public String getNameOfCard (int number){
        String[] names = new String[13];
        names[0] = "2";
        names[1] = "3";
        names[2] = "4";
        names[3] = "5";
        names[4] = "6";
        names[5] = "7";
        names[6] = "8";
        names[7] = "9";
        names[8] = "10";
        names[9] = "J";
        names[10] = "Q";
        names[11] = "K";
        names[12] = "A";

        return names[number];
    }

}
