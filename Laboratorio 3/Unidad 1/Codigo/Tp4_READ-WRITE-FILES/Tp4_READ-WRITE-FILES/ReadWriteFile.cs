
using MySqlConnector;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.PortableExecutable;
using System.Text;
using System.Threading.Tasks;

namespace Tp4_READ_WRITE_FILES
{
    internal class ReadWriteFile : Conexion
    {

        public void crearArchivo() {

            StreamWriter writer = new StreamWriter(@"C:\Users\nicos\Desktop\Archivos de git\TecnicaturaProgramacion-UTN-\Laboratorio 3\Unidad 1\Codigo\archivo.txt");
            string header = "id\techaAlta\tcodigo\tdenominacion\tprecio\tpublicado\n";
            writer.WriteLine(header);
            writer.Close();

        }
        public void readFile(int x)
        {

            
            string sql = "SELECT * FROM articulo LIMIT " + x + ", 50;";

            try
            {
                StreamReader reader = new StreamReader(@"C:\Users\nicos\Desktop\Archivos de git\TecnicaturaProgramacion-UTN-\Laboratorio 3\Unidad 1\Codigo\archivo.txt");
                string linea = reader.ReadLine();  //leo hasta el salto de linea
                while (linea != null)  // Lee líneas mientras haya lineas (mientras sean !=null)
                {
                    Console.WriteLine(linea);
                    string[] split = linea.Split('\t');//separo las columnas de la fila
                   
                    
                    
                    //foreach (string s in split)
                    //{
                    //    if (s.Trim() != "")
                    //        Console.WriteLine(s);
                    //}


                    linea = reader.ReadLine();//leo siguiente linea si existe
                }
                reader.Close();
            }
            catch (Exception ex)
            {
                Console.Write(ex.Message);
            }
        }



        public void writeFile(int x)
        {
            
            MySqlDataReader reader ;
            string sql = "SELECT * FROM articulo LIMIT "+x+", 50;";

            try
            {
             
                StreamWriter archivo = File.AppendText(@"C:\Users\nicos\Desktop\Archivos de git\TecnicaturaProgramacion-UTN-\Laboratorio 3\Unidad 1\Codigo\archivo.txt");
                StringBuilder buffer = new StringBuilder();


                MySqlConnection conexionBD = base.conexion();
                conexionBD.Open();
                MySqlCommand comando = new MySqlCommand(sql, conexionBD);
                reader = comando.ExecuteReader();
              

                while(reader.Read())
                   
                    {
                       
                   buffer.Append(reader[0].ToString()+"\t"+ reader[1].ToString() + "\t" + reader[2].ToString() + "\t" + reader[3].ToString() + "\t" + reader[4].ToString() + "\t" + reader[5].ToString());
                    
                    buffer.Append("\n");//separador de filas
                }
                   
                
                archivo.Write(buffer.ToString());
                archivo.Close();
                
                /*
                 La diferencia entre el método Write y WriteLine, es que el segundo inserta un salto de línea 
                 * al final de los datos ingresados, haciendo que la próxima vez que se quiera insertar, 
                 * se hará en la siguiente línea.
                 */
            }
            catch (Exception ex)
            {
                Console.Write(ex.Message);
            }
        }




    }
}
