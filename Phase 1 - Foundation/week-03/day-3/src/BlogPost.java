public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(){
        this("unknown","unknown","unknown","unknown");
    }

    public BlogPost(String authorName, String title, String publicationDate, String text){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public void printBlog(){
        System.out.println(title + " titled by " + authorName + " posted at \"" + publicationDate + "\"" + "\n" + text);
    }

}
