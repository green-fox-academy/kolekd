public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(){
        this("unknown","unknown","unknown");
    }

    public PostIt (String backgroundColor, String text, String textColor){
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public void printPost(){
        System.out.println("This post has " + backgroundColor + " background, " + textColor +
                "-coloured text and says: \"" + "\".");
    }

    public static void main (String[] args){

        PostIt post = new PostIt("orange","Idea 1","blue");
        PostIt post2 = new PostIt();

    }
}
