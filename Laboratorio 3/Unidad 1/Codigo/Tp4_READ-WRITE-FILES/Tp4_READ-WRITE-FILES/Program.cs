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

            ReadWriteFile archivo = new ReadWriteFile();

            archivo.crearArchivo();
            int x = 0;
            for (int i=0; i<296; i++) {
                
                
                archivo.writeFile(x);
                archivo.readFile(x);
                x = x + 50;
            }

            
          

        }
    }
}
