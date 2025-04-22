class skipneg{
    public static void main(String[] args){
       int a[]={1,-2,-3,4,-1};
       for(int i=0;i<a.length;i++)
       {
        if(a[i]<0)
            continue;
        System.out.println(a[i]);
       }   
    }
}