

import java.util.*;
public class checkVowel {
    //Method to check vowel
    public static boolean isVowel(char input){
        if(input =='a'|| input =='e'||input=='i'||input=='o'||input=='u'
        || input =='A'|| input =='E'||input=='I'||input=='O'||input=='U'){
            return true;
        }
        else

        return false;

    }
     // Main Method
    public static void main(String[] args) {
        int count =0;
        Scanner console = new Scanner(System.in); 
        System.out.println("Enter a word"); 
        String inp = console.next();
        for(int i= 0; i<inp.length();i++){
            char pos = inp.charAt(i);
            if(isVowel(pos)==true){
                count++;
                
            }}
            System.out.println("Number of vowels ="+count);
        
    }
    
}
