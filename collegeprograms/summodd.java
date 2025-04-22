class summodd{
    public static void main(String[] args){
        int i=0,sum=0;
        while(i<=3){
            i++;
            if(i%2==0)
                continue;
            else
                sum=sum+i; 
                System.out.println(i);          
        }
        System.out.println("the sum of odd number is:"+sum);
    }
}