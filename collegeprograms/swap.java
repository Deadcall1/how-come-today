public class swap{
    static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swappping\na : "+a+"\nb : "+b);
        

    }
    public static void main(String[] args){
        int a=10, b=5;
        System.out.println("before swapping\na:"+a+"\nb:"+b);
        swap(a,b);

    }
}