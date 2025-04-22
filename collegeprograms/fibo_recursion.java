/*class fibo_recursion{
    static int fib(int num)
    {
        if(num<=1)
            return num;
        else
            return fib(num-2)+fib(num-1);
    }
    public static void main(String[] args){
        int inp1=4;
        for(int i=0;i<inp1;i++)
        //int a=fib(inp1);
            System.out.println(fib(i));
    }
}

*/
public class fibo_recursion {
    static int fib(int num) {
        if (num <= 1)
            return num;
        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        int inp1 = 4;
        for (int i = 0; i < inp1; i++)
            System.out.println(fib(i));
    }
}
