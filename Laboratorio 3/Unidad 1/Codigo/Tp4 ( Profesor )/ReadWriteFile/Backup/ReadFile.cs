using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace RWFiles
{
    class ReadFile
    {

        static void Main(string[] args)
        {
            try{
                StreamReader reader = new StreamReader(@"D:\temp.txt");
                string linea = reader.ReadLine();//leo hasta el salto de linea
                while (linea != null)// Lee líneas mientras haya lineas (mientras sean !=null)
                { 
                    Console.WriteLine(linea);
                    string[] split = linea.Split('\t');//separo las columnas de la fila
                    foreach (string s in split)
                    {
                        if (s.Trim() != "")
                            Console.WriteLine(s);
                    }
                    linea = reader.ReadLine();//leo siguiente linea si existe
                }
                reader.Close();
            }
            catch(Exception ex) {
                Console.Write(ex.Message);
            }
        }

    }
}
