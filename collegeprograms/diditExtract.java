public class diditExtract{
    public static void main(String[] args)
    {
        int num=456;
        int digit=0,sum=0;
        while(num>0)
        {
            
            digit=num%10;
            sum=sum+digit;
            
            num=num/10;
        }
        System.out.println("sum of digit : "+sum);
    }

}