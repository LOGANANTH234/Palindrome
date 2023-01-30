import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number or Character : ");
        String name=input.next();

        int count=0;
        int i=0;
        for(i =0;i<name.length()/2;i++){
            if(name.charAt(i)==name.charAt(name.length()-1-i)){

            }
            else
              count++;

        }
        if(count==0){
            System.out.println(name+" is a Palindrome");
        }
        else System.out.println(name+" is a Not a Palindrome");
    }
}