public class variablestypes{
    int a=10;//instance varible
    
    void display()//instance method
    {
        System.out.println("hai");

    }
    static int b=20;//satic variable
    static void ddd()
    {
        System.out.println("who are you");

    }
    public static void main(String[] args){
        int c=20000;//local variable
        //System.out.println(a);//non static meaning need to create a object;
        //if no need to create a object just make the instance variable to static;
        variablestypes v1 =new variablestypes();
        System.out.println(v1.a);
        v1.display();
        ddd();
        System.out.println(b);
        System.out.println("\n"+c);

        //garbage collection maethod whic is is static method as System.gc()
    }
}