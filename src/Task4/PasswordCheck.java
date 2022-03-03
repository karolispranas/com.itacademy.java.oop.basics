package Task4;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        if (lengthCheck(password) == false){
            System.out.println("Password is invalid! A password must have at least ten characters");
        }else if (characterCheck(password) == false){
            System.out.println("Password is invalid! A password must contain different types of symbols");
        }else if (digitCheck(password) == false){
            System.out.println("Password is invalid! must contain at least two digits");
        }


    }

    static boolean lengthCheck(String password){
        if (password.length() < 10){
            return false;
        }else
            return true;
    }

    static boolean characterCheck(String password){
        int letters=0, numbers=0, symbols=0;
        char[] characters = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            characters[i] = password.charAt(i);
            if ((int)characters[i]>48 && (int)characters[i]<57){
                numbers++;
            }else if (((int)characters[i]>65 && (int)characters[i]<90)||((int)characters[i]>97 && (int)characters[i]<122)){
                letters++;
            }else symbols++;
        }
        System.out.println(letters+" "+numbers+" "+symbols);
        if (letters == password.length() || numbers == password.length() || symbols == password.length()){
            return false;
        }else return true;
    }

    static boolean digitCheck(String password){
        int digits = 0;
        char[] characters = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            if ((int)characters[i]>(-1) && (int)characters[i]<10){
                digits++;
            }
        }
        System.out.println(digits);
        if (digits<=2){
            return false;
        }else return true;
    }
}
