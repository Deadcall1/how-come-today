class strongnumber{
    static int fact(int n)
    {
        if(n==0 | n==1)
            return 1;
        return n*fact(n-1);

    }
    public static void main(String[] args) {
        int n=145,temp=n,sum=0;
        while(n>0)
        {
            int digit=n%10;
            System.out.println("the fact of "+digit+" is :"+fact(digit));
            sum=sum+fact(digit);
            n=n/10;
        }
        if(temp==sum)
            System.out.println("it is a strong number");
        else
            System.out.println("it is not a strong number");
    }
}