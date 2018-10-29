public class Strings3 {
    public static void main (String[] args){

        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".

        System.out.println (stringie("ABCDEFGHIJ", "*", 0));
    }

    public static String stringie (String word, String separatist, int n){
        int count = word.length();
        if(n == count - 1){
            return word.substring(n);
        } else {
            return  word.substring(n,n+1) + "*" + stringie(word,separatist,n + 1);
        }

    }
}
