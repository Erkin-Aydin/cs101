public class Lab04c {
    public static void main(String[] args)
    {
        double d;
    d = 0.1;
    while ( d < 1.0 )
    {
        System.out.println( d);
        d = d + 0.1;
    }
    System.out.println( d + " <- final value after loop!");
    }
}

/* Prediction: I don't know.
   Reality: Computers use a format called binary, and it can not represent 
   represent numbers like 0.1 , 0.3 accurately*/