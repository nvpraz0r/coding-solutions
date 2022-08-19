package hackerrank.solutions;

public class Pangrams {
    public static String pangrams(String s){
        return s.replaceAll("[^A-Za-z]+", "").toLowerCase().chars().distinct().count() == 26 ? "pangram" : "not pangram";
    }
}
