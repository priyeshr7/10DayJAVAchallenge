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
            value = value * i; // this program did not run well first time and it keept retuning 1 , coz i have written 1 in place of i , so the value * 1 = 1 . XD... 
        }
        return value ;
    }

}

    
