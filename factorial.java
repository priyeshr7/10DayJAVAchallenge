public class factorial {
    public static void main(String[] args) {
        int num = 7;
        int result = 1;
       result = fact(num);
        System.out.println(result);
    }
    public static int fact(int num) 
    {
        int value = 1;
        for(int i=1;i<=num;i++)
        {
            value = value * i;
        }
        return value ;
    }

}

    
