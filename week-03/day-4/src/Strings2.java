public class Strings2 {
    public static void main (String[] args){

        // Given a string, compute recursively a new string where all the 'x' chars have been removed.

        System.out.println (stringie("Mxxasxsachxusxxetxtxxs", "x", 0));
    }

    public static String stringie (String word, String former, int n){
        int count = word.length();
        String cut = word.substring(n, n+1);
        String changed = "";
        if(n == count - 1){
            return "";
        } else {
            return cut.replace(former,changed) + stringie(word,former,n + 1);
        }

    }
}
