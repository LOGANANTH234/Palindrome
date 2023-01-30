public class Numberpalindrome {
    public static void main(String[] args) {
        int number=121;
        int sum=0;
        int temp=number;
        for(int i=0;temp!=0;i++){

            int digit=temp%10;
            sum=sum*10+digit;
            temp=temp/10;
            }
        if(sum==number){
            System.out.println(number+" is a Palindrome");
        }
        else {
            System.out.println(number+" is a Not Palindrome");
        }
        }

}
