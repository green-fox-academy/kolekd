public class Strings2 {
    public static void main (String[] args){

        // Given a string, compute recursively a new string where all the 'x' chars have been removed.

        System.out.println (stringie("Mxxasxsachxusxxetxtxxs", "x"));
    }

    public static String stringie (String word, String former){
        int count = word.length();
        String changed = "";
        if(count == 0){
            return "";
        } else {
            String cut = word.substring(0,1);
            String rest = word.substring(1);
            if (cut.equals("x")){
                cut = "";
            }
            return cut + stringie(rest, former);
        }

    }
}
