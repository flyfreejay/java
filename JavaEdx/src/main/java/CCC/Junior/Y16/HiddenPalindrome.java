package CCC.Junior.Y16;
import java.util.*;

public class HiddenPalindrome {
    public static void main(String[] args) {

        //Variables
        String word;

        //objects
        Scanner input = new Scanner(System.in);

        word = input.nextLine();

        for(int i = word.length(); i > 0; i--){
            if(slicePalindrome(word, i)){
                System.out.println(i);
                break;
            }
        }

    }

    public static boolean isPalindrome(String word){
        int i =0, j=word.length()-1;

        while(i < j){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean slicePalindrome(String word, int length){

        int end;
        for(int start = 0; start<(word.length()-length)+1; start++){
            end = start+length;

            if(isPalindrome(word.substring(start, end))){
                return true;
            }
        }
        return false;
    }
}
