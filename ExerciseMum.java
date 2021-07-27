
public class ExerciseMum {
public static void main(String[] args) {
        
        nextSquared(5);
        
    }
    static int nextSquared(int a)
    {
        int squ=0;
        for (int i=1; squ<a; i++)
        {
            squ=i*i;
        }    
        System.out.println(squ);
        return squ;
        
    }
}


