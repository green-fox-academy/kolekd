import javafx.geometry.Pos;

public class Page {
    public static void main (String[] args){


        PostIt post = new PostIt("orange","Idea 1","blue");
        PostIt post2 = new PostIt("pink","Awesome","black");
        PostIt post3 = new PostIt("yellow","Superb!","green");

        post.printPost();
        post2.printPost();
        post3.printPost();

    }
}
