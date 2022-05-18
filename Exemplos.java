
public class Exemplos
{
    public static void mostrar(int i)
    {
        if (i > 0) {
            System.out.println(i); 
            mostrar(i - 1);
        }
    }
    
    public static void mostrarRecursao() {
        mostrar(10);
    }
    
    public static void mostrarWhile() {
        int i;
        i = 10;
        while (i > 0) {
            System.out.println(i);
            i = i - 1;
        }
    }
}
