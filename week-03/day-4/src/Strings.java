public class Strings {
    public static void main (String[] args){

    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

        System.out.println (stringie("XxXxXxXxX", "x","y", 1));
    }

    public static String stringie (String word, String former, String changed, int n){
        word.length();
        if(n == 0){
            return "";
        } else {
            System.out.println(word);
            return word.replace(former,changed) + stringie(word,former,changed,n - 1);
        }
    }

}
