public class ToDoPrint {
    public static void main(String... args){
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String todoText = " - Buy milk";

        StringBuilder add = new StringBuilder(todoText);
        add.insert(0, "My todo:\n");
        add.append("\n - Download games\n\t - Diablo");

        System.out.println(add);
    }
}