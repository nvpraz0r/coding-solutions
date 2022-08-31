package kata.solutions;

/**
 * Complementary DNA
 *
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the instructions for the development and functioning of living organisms.
 * In DNA string, symbols "A" and "T" are complements of each other, as "C" and "G".
 * Your function receives one side of the DNA; you need ot return the other complementary side.
 * DNA strand is never empty or there is no DNA at all.
 *
 * EXAMPLE 1:
 * input:   "ATTGC"
 * output:  "TAACG"
 *
 * EXAMPLE 2:
 * input:   "GTAT"
 * output:  "CATA"
 *
 * @see <a href="https://www.codewars.com/kata/554e4a2f232cdd87d9000038/java">Complementary DNA</a>
 */

public class ComplementaryDna {
    public static String makeComplement(String dna){
        //convert string to char array
        char[] ch = dna.toCharArray();

        //loop through array of characters
        for(int i = 0; i < ch.length; i++){
            //set character equal to it's complement
            ch[i] = getComplement(ch[i]);
        }

        //return the new value of DNA
        return String.valueOf(ch);
    }

    private static char getComplement(char c){
        //
        switch(c){
            //intellij wanted the return statement wrapped???
            //not very INTELLIGENT ;D amirite?
            case 'A' -> {return 'T';}
            case 'T' -> {return 'A';}
            case 'G' -> {return 'C';}
            case 'C' -> {return 'G';}
        }
        //return the converted character
        return c;
    }
}
