class Program
{
    static void Main()
    {
        Console.Write("Ingrese una cadena de números separados por coma: ");
        string cadenaNumeros = Console.ReadLine();

        // Usamos el método Split para dividir la cadena en un arreglo de cadenas
        string[] numerosSeparados = cadenaNumeros.Split(',');

        // Inicializamos una variable para la suma total
        int sumaTotal = 0;

        // Recorremos el arreglo y sumamos los valores numéricos
        foreach (string numero in numerosSeparados)
        {
            if (int.TryParse(numero, out int valorNumerico))
            {
                sumaTotal += valorNumerico;
            }
            else
            {
                Console.WriteLine($"'{numero}' no es un número válido y será ignorado.");
            }
        }

        Console.WriteLine($"La suma total de los números es: {sumaTotal}");
    }
}