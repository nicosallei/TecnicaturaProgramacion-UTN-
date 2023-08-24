class Program
{
    static void Main()
    {
        Console.Write("Ingrese el número de filas: ");
        int filas = int.Parse(Console.ReadLine());

        Console.Write("Ingrese el número de columnas: ");
        int columnas = int.Parse(Console.ReadLine());

        
        int valorX = filas + columnas;

        int[,] matriz = new int[filas, columnas];

        Console.WriteLine("Matriz resultante:");

        for (int i = 0; i < filas; i++)
        {
            for (int j = 0; j < columnas; j++)
            {
                int sumaFilaColumna = i + 1 + j + 1; // Suma de la posición de la celda

                if (sumaFilaColumna == valorX)
                {
                    matriz[i, j] = valorX;
                }
                else
                {
                    matriz[i, j] = 0;
                }

                Console.Write(matriz[i, j] + " ");
            }
            Console.WriteLine();
        }
    }
}