using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using RWFiles;

namespace ConsoleApplication1
{
    class Program 
    {
        static void Main(string[] args)
        {
            Console.WriteLine("prueba");
            WriteFile pr = new WriteFile();
            pr.archivo();

        }
    }
}
