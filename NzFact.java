
/**
 * Write a description of class NzFact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NzFact
{
    static int findTrailingZeros(int n)
    {
        int count = 0;
 
        for (int i=5; n/i>=1; i *= 5)
            count += n/i;
 
        return count;
    }
    
    public static void main (String[] args) 
    {
        int n = 25;
        System.out.println("Cuenta de zeros en la cola "+ n +"! is "
                                    + findTrailingZeros(n));
    }

}
