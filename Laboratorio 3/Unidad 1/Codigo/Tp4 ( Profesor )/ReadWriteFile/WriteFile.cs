using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace RWFiles
{
    class WriteFile
    {
        public  void archivo()
        {
            try
            {
                StreamWriter writer = new StreamWriter(@"C:\Users\nicos\Desktop\Archivos de git\TecnicaturaProgramacion-UTN-\Laboratorio 3\Unidad 1\Codigo\Tp4 ( Profesor )\temp.txt");
                int filas = 25;
                int columnas = 10;
                StringBuilder buffer = new StringBuilder();
                for(int f = 0; f < filas; f++)
                {
                    for (int c = 0; c < columnas; c++)
                    {
                        buffer.Append("Fila " + f + " Columna " + c);
                        buffer.Append("\t");//separador de columnas
                        
                    }
                    buffer.Append("\n");//separador de filas
                }
                writer.Write(buffer.ToString());
                writer.Close();
                /*
                 La diferencia entre el método Write y WriteLine, es que el segundo inserta un salto de línea 
                 * al final de los datos ingresados, haciendo que la próxima vez que se quiera insertar, 
                 * se hará en la siguiente línea.
                 */
            }
            catch(Exception ex) {
                Console.Write(ex.Message);
            }
        }
    }
}
