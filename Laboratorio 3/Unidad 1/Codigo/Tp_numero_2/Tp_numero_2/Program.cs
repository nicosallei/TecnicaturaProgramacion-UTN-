
using Tp_numero_2;

class Program
{
    static void Main()
    {
        try
        {
            Fraccion fraccion1 = new Fraccion(3, 2);
            Fraccion fraccion2 = new Fraccion(4,2);

            int sumar =fraccion1.Sumar();
            int resta = fraccion2.Restar();
            int multiplicar = fraccion1.Multiplicar();
             int dividir = fraccion2.Dividir();


            Console.WriteLine("Fracción 1: " + fraccion1);
            Console.WriteLine("Fracción 2: " + fraccion2);
            Console.WriteLine("Suma: " + sumar);
            Console.WriteLine("Resta: " + resta);
            Console.WriteLine("Multiplicación: " + multiplicar);
            Console.WriteLine("División: " + dividir);
            
        }
        catch (FraccionException ex)
        {
            Console.WriteLine("Error: " + ex.Message);
        }
    }
}