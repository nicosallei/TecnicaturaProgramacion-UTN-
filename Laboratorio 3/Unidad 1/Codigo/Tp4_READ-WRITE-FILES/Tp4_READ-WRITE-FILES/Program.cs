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

            app.writeFile(0);
            //transaccion.RunSqlTransaction(0);

            transaccion.insertar(); // PROBANDO subir el dato a la base de dato
            Console.WriteLine("el codigo se encontro? :"+ app.buscarCodigo("7792798012923"));

            //for (int i=0; i<1; i++) {


            //    //app.writeFile(x);
            //    //transaccion.RunSqlTransaction(x);

            //    //string[][] arreglo = app.readFile(x);

            //    //for(int j=0; j<arreglo.Length; j++)
            //    //{
            //    //    Console.WriteLine(arreglo[j][0]+" - "+ arreglo[j][1] + " - " + arreglo[j][2] + arreglo[j][3] + " - " + arreglo[j][4] + " - " + arreglo[j][5]);

            //    //}


            //    x = x + 50;
        //}
            



        }
    }
}
