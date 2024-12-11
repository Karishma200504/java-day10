class factorialrecursion{
    int sum(int n)
    {
        if(n==1) return 1;
        return n*sum(n-1);
    }
    public static void main(String args[]){
        factorialrecursion ob=new factorialrecursion();
        int res=ob.sum(10);
        System.out.println(res);
    }
}