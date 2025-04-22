
class magicnumber{
    static void magic(int num){
        int digit=0;
        while(num>9){
        
            int sum=0;
            while(num>0)
            {
            digit= num%10;
            sum=sum+digit;
            num=num/10;
            } 
            num=sum;
        }
        if(num==1)
        System.out.println("it is a magic");
        else
        System.out.println(num);
    }
    public static void main(String[] args)
    {
        magic(551);
    }
}