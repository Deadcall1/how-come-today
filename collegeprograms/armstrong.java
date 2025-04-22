import java.util.*;
class armstrong{
    public static void main(String[] args)
    {
        int num,digit=55,sum=0;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        int temp =num;
        while(num>0)
        {
            digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        if(sum==temp){
            System.out.println("it is the armstrong");
        }
        else{
            System.out.println("it is not");
        }
    }
}