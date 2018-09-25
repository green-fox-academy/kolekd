public class TakesLonger {
    public static void main(String... args){

        /// When saving this quote a disk error has occured. Please fix it.
        /// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        /// Using pieces of the quote variable (instead of just redefining the string)

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder always = new StringBuilder(quote);
        always.insert(20," always takes longer than");

        // String fixedquote = quote.replace("you expect","always takes longer than you expect");


        System.out.println(always);
    }
}