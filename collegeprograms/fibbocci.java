class fibbocci{
    public static void main(String[] args)
    {
        int a=0,b=1,c=0,n=5;
        System.out.println(a+" "+b+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
}