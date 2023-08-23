using System;
using System.Text;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Ejercicio 1");
        int i;
        Console.WriteLine("Números divisibles entre 2 y 5 (bucle for):");
        for (i = 1; i <= 100; i++)
        {
            if (i % 2 == 0 && i % 5 == 0)
            {
                Console.Write(i + " ");
            }
        }


        Console.WriteLine("\nNúmeros divisibles entre 2 y 5 (bucle while):");
        i = 1;
        while (i <= 100)
        {
            if (i % 2 == 0 && i % 5 == 0)
            {
                Console.Write(i + " ");
            }
            i++;
        }

        Console.WriteLine("\nNúmeros divisibles entre 2 y 5 (bucle do/while):");
        i = 1;
        do
        {
            if (i % 2 == 0 && i % 5 == 0)
            {
                Console.Write(i + " ");
            }
            i++;
        } while (i <= 100);
        /*---------------------------------------------------------------------------------------------*/
        Console.WriteLine("\n\n\n\n\n\n\n");
        Console.WriteLine("Ejercicio 2");
        Ejercicio2();
    }
    static void Ejercicio2()
    {
        Random random = new Random();
        int numeroAleatorio = random.Next(0, 101); // Genera un número aleatorio entre 0 y 100
        int intentos = 0;

        Console.WriteLine("Bienvenido al juego de adivinar el número aleatorio entre 0 y 100.");

        while (true)
        {
            Console.Write("Ingresa un número: ");
            int numeroIngresado = Convert.ToInt32(Console.ReadLine());
            intentos++;

            if (numeroIngresado < numeroAleatorio)
            {
                Console.WriteLine("El número ingresado es menor. Intenta nuevamente.");
            }
            else if (numeroIngresado > numeroAleatorio)
            {
                Console.WriteLine("El número ingresado es mayor. Intenta nuevamente.");
            }
            else
            {
                Console.WriteLine($"¡Felicidades! ¡Has encontrado el número aleatorio {numeroAleatorio} en {intentos} intentos.");
                break;
            }
        }
        Console.WriteLine("\n\n\n\n\n\n\n");
        Console.WriteLine("Ejercicio 3");
        Ejercicio3();
    }
    /*---------------------------------------------------------------------------------------------*/

    static bool esPar(int numero)
    {
        return numero % 2 == 0;
    }

    static void Ejercicio3()
    {
        Console.WriteLine("Bienvenido al programa de verificación de números pares.");

        while (true)
        {
            Console.Write("Ingresa un número (o ingresa 'q' para salir): ");
            string input = Console.ReadLine();

            if (input.ToLower() == "q")
            {
                break;
            }

            if (int.TryParse(input, out int numeroIngresado))
            {
                if (esPar(numeroIngresado))
                {
                    Console.WriteLine($"{numeroIngresado} es un número par.");
                }
                else
                {
                    Console.WriteLine($"{numeroIngresado} no es un número par.");
                }
            }
            else
            {
                Console.WriteLine("Entrada inválida. Ingresa un número válido o 'q' para salir.");
            }
        }
        Console.WriteLine("¡Hasta luego!");
        Console.WriteLine("\n\n\n\n\n\n\n");
        Console.WriteLine("Ejercicio 4");
        Ejercicio4();

    }
    /*---------------------------------------------------------------------------------------------*/
    static decimal Suma(decimal num1, decimal num2)
    {
        return num1 + num2;
    }

    static decimal Resta(decimal num1, decimal num2)
    {
        return num1 - num2;
    }

    static decimal Multiplicacion(decimal num1, decimal num2)
    {
        return num1 * num2;
    }

    static decimal Division(decimal num1, decimal num2)
    {
        if (num2 != 0)
        {
            return num1 / num2;
        }
        else
        {
            throw new DivideByZeroException("No es posible dividir entre cero.");
        }
    }

    static decimal Modulo(decimal num1, decimal num2)
    {
        return num1 % num2;
    }

    static void Ejercicio4()
    {
        Console.WriteLine("Bienvenido al programa de operaciones matemáticas.");

        Console.Write("Ingresa el primer número decimal: ");
        decimal numero1 = Convert.ToDecimal(Console.ReadLine());

        Console.Write("Ingresa el segundo número decimal: ");
        decimal numero2 = Convert.ToDecimal(Console.ReadLine());

        bool operacionValida = false;

        while (!operacionValida)
        {
            Console.WriteLine("Seleccione una operación:");
            Console.WriteLine("a- Suma (+)");
            Console.WriteLine("b- Resta (-)");
            Console.WriteLine("c- Multiplicación (*)");
            Console.WriteLine("d- División (/)");
            Console.WriteLine("e- Modulo (%)");

            char opcion = Console.ReadKey().KeyChar;
            Console.WriteLine();

            switch (opcion)
            {
                case 'a':
                    Console.WriteLine($"Resultado: {Suma(numero1, numero2)}");
                    operacionValida = true;
                    break;
                case 'b':
                    Console.WriteLine($"Resultado: {Resta(numero1, numero2)}");
                    operacionValida = true;
                    break;
                case 'c':
                    Console.WriteLine($"Resultado: {Multiplicacion(numero1, numero2)}");
                    operacionValida = true;
                    break;
                case 'd':
                    try
                    {
                        Console.WriteLine($"Resultado: {Division(numero1, numero2)}");
                        operacionValida = true;
                    }
                    catch (DivideByZeroException ex)
                    {
                        Console.WriteLine(ex.Message);
                    }
                    break;
                case 'e':
                    Console.WriteLine($"Resultado: {Modulo(numero1, numero2)}");
                    operacionValida = true;
                    break;
                default:
                    Console.WriteLine("La opción ingresada no es válida.");
                    break;
            }
        }
        Console.WriteLine("\n\n\n\n\n\n\n");
        Console.WriteLine("Ejercicio 5");
        Ejercicio5();
    }
    /*---------------------------------------------------------------------------------------------*/

    static decimal CalcularSueldo(int horaIngreso, int minutoIngreso, int horaSalida, int minutoSalida)
    {
        const decimal tarifaNormal = 10.0m; // Tarifa por hora en horario diurno
        const decimal tarifaNocturna = tarifaNormal * 1.5m; // Tarifa por hora en horario nocturno

        // Convertir el tiempo laboral en minutos
        int tiempoLaboralMinutos = 0;

        if (horaIngreso < horaSalida || (horaIngreso == horaSalida && minutoIngreso <= minutoSalida))
        {
            tiempoLaboralMinutos = (horaSalida - horaIngreso) * 60 + (minutoSalida - minutoIngreso);
        }
        else
        {
            tiempoLaboralMinutos = ((horaSalida + 24) - horaIngreso) * 60 + (minutoSalida - minutoIngreso);
        }

        // Calcular el sueldo según el horario
        decimal sueldoTotal = 0;

        for (int i = 0; i < tiempoLaboralMinutos; i++)
        {
            int horaActual = (horaIngreso + i / 60) % 24;
            if (horaActual >= 8 && horaActual < 20)
            {
                sueldoTotal += tarifaNormal;
            }
            else
            {
                sueldoTotal += tarifaNocturna;
            }
        }

        return sueldoTotal / 60; // Convertir de minutos a horas
    }

    static void Ejercicio5()
    {
        Console.WriteLine("Calculadora de sueldo basada en horas trabajadas.");

        Console.Write("Hora de ingreso: ");
        int horaIngreso = Convert.ToInt32(Console.ReadLine());

        Console.Write("Minuto de ingreso: ");
        int minutoIngreso = Convert.ToInt32(Console.ReadLine());

        Console.Write("Hora de salida: ");
        int horaSalida = Convert.ToInt32(Console.ReadLine());

        Console.Write("Minuto de salida: ");
        int minutoSalida = Convert.ToInt32(Console.ReadLine());

        if (horaIngreso < 0 || horaIngreso >= 24 ||
            minutoIngreso < 0 || minutoIngreso >= 60 ||
            horaSalida < 0 || horaSalida >= 24 ||
            minutoSalida < 0 || minutoSalida >= 60 ||
            (horaIngreso == horaSalida && minutoIngreso >= minutoSalida))
        {
            Console.WriteLine("Los valores ingresados no son válidos.");
        }
        else
        {
            decimal sueldo = CalcularSueldo(horaIngreso, minutoIngreso, horaSalida, minutoSalida);
            Console.WriteLine($"El sueldo a pagar es: ${sueldo:F2}");
        }
        Console.WriteLine("\n\n\n\n\n\n\n");
        Console.WriteLine("Ejercicio 6");
        Ejercicio6();
    }
    /*---------------------------------------------------------------------------------------------*/
    static long MultiplicacionRecursiva(long numero)
    {
        if (numero > 100000000)
        {
            Console.WriteLine($"Fin Recursión: {numero}");
            return numero;
        }

        long resultado = numero * numero;
        Console.WriteLine($"Iteración => {numero} * {numero} = {resultado}");
        return MultiplicacionRecursiva(resultado);
    }

    static void Ejercicio6()
    {
        Console.Write("Ingresa un número mayor a 1: ");
        long numeroIngresado = Convert.ToInt64(Console.ReadLine());

        if (numeroIngresado <= 1)
        {
            Console.WriteLine("El número ingresado debe ser mayor a 1.");
        }
        else
        {
            Console.WriteLine("Comenzando recursión:");
            MultiplicacionRecursiva(numeroIngresado);
        }
        Console.WriteLine("\n\n\n\n\n\n\n");
        Console.WriteLine("Ejercicio 7");


        /*---------------------------------------------------------------------------------------------*/
        Console.WriteLine("Length: Este método devuelve la longitud de una cadena, es decir, la cantidad de caracteres que contiene.");
        string texto = "Estamos en Laboratorio 3";
        int longitud = texto.Length;
        Console.WriteLine("\n" + longitud);

        Console.WriteLine("\n\nContains: Comprueba si una cadena contiene otra cadena especificada y devuelve un valor booleano.");
        bool contieneLaboratorio = texto.Contains("Laboratorio");
        Console.WriteLine("\n" + contieneLaboratorio);

        Console.WriteLine("\n\nIndexOf: Devuelve la posición de la primera ocurrencia de una subcadena dentro de otra cadena. Si no se encuentra, devuelve -1.");
        int posicionLaboratorio = texto.IndexOf("Laboratorio");
        Console.WriteLine("\n" + posicionLaboratorio);

        Console.WriteLine("\n\nRemove: Elimina una porción de una cadena en función de la posición inicial y la cantidad de caracteres a eliminar.");
        string nuevoTexto = texto.Remove(8, 24);
        Console.WriteLine("\n" + nuevoTexto);

        Console.WriteLine("\n\nReplace: Reemplaza todas las ocurrencias de una subcadena por otra subcadena en una cadena dada.");
        nuevoTexto = texto.Replace("Laboratorio", "Programacion");
        Console.WriteLine("\n" + nuevoTexto);

        Console.WriteLine("\n\nSubstring: Obtiene una subcadena de la cadena original utilizando una posición de inicio y una longitud opcional.");
        string subcadena = texto.Substring(8, 7);
        Console.WriteLine("\n" + subcadena);

        Console.WriteLine("\n\nToUpper y ToLower: Convierten una cadena en mayúsculas o minúsculas, respectivamente.");
        string enMayusculas = texto.ToUpper();
        string enMinusculas = texto.ToLower();
        Console.WriteLine("\n" + enMayusculas);
        Console.WriteLine("\n" + enMinusculas);

        Console.WriteLine("\n\nAppend: Se utiliza en el contexto de la clase StringBuilder para agregar contenido a un StringBuilder.");
        StringBuilder sb = new StringBuilder("Hola");
        sb.Append(", mundo!");
        string resultado = sb.ToString();
        Console.WriteLine("\n" + resultado);






    }
}
