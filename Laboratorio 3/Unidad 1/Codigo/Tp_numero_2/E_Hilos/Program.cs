class Program
{
    static void Main()
    {
        // Crear e iniciar un hilo para ejecutar "ejecutarHiloCincoSeg"
        Thread hiloCincoSeg = new Thread(ejecutarHiloCincoSeg);
        hiloCincoSeg.Start();

        // Crear e iniciar un hilo para ejecutar "ejecutarHiloDiezSeg"
        Thread hiloDiezSeg = new Thread(ejecutarHiloDiezSeg);
        hiloDiezSeg.Start();

        // Mantener la aplicación en ejecución para que los hilos puedan funcionar
        Console.WriteLine("Presione Enter para salir.");
        Console.ReadLine();
    }

    static void ejecutarHiloCincoSeg()
    {
        while (true)
        {
            Console.WriteLine("HILO EJECUTADO 5");
            Thread.Sleep(5000); // Pausa de 5 segundos
        }
    }

    static void ejecutarHiloDiezSeg()
    {
        while (true)
        {
            Console.WriteLine("HILO EJECUTADO 10");
            Thread.Sleep(10000); // Pausa de 10 segundos
        }
    }
}