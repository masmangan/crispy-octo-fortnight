public class Somador
{
    // i = 1, 2, 3, 4, 5, [6]
    // s = 1 + ( 2 + (3 + (4 + (5 + (0)))))
    public static int somar(int i) {
        if (i <= 5000) {
            return i + somar(i + 1);
        } else {
            return 0; 
        }
    }
    
    public static int somarRecursao() {
        return somar(1);
    }
    
    
    public static int somarWhile()
    {
        int i; //        1, 2, 3,  4,  5, [6]
        int s; // s = 0, 1, 3, 6, 10, 15
        i = 1;
        s = 0;
        while (i <= 5000) {
            s = s + i;
            i = i + 1;
        }
        return s;
        // Gauss
        // 1 + 2 + 3 + 4 + 5
        // 5 + 4 + 3 + 2 + 1
        // 1 .. n = n.( n + 1) / 2
    }
}
