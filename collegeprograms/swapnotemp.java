class swwapnotemp{
    public static void main(String[] args)
    {
        int a=10,b=20;
        System.out.println("before swap \na:"+a+"\nb:"+b);
        /*a=a^b; // exclusive operator
        b=a^b;
        a=a^b;*/

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap \na:"+a+"\nb:"+b);

    }
}