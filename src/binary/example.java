import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        
        char letter[]  = {'c','e', 'g','j'};   
        int start=2;
        System.out.println("the length is:"+letter.length);
        char ans = letter[start%letter.length];
        System.out.println(ans);
     
    }
}
