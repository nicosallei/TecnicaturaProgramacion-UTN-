using System;
using System.Data;
using System.IO;

using Tp4_READ_WRITE_FILES;

namespace ConexionMySQL
{
    class Program
    {
        static void Main(string[] args)
        {
          
            ReadWriteFile app = new ReadWriteFile();
            Transaccion transaccion = new Transaccion();
            app.crearArchivo();
            int x = 0;
            

            for (int i = 0; i < 297; i++)
            {

                app.writeFile(x);

               
                x = x + 50;
                //Console.WriteLine(x);     
            }
            app.readFile();



        }
    }
}
