class Program
{
    static void Main()
    {
        Console.Write("Ingrese la primera cadena de texto: ");
        string cadena1 = Console.ReadLine();

        Console.Write("Ingrese la segunda cadena de texto: ");
        string cadena2 = Console.ReadLine();

        if (cadena1.Contains(cadena2))
        {
            Console.WriteLine("Resultado: ENCONTRADO");
        }
        else
        {
            Console.WriteLine("Resultado: NO ENCONTRADO");
        }
    }
}