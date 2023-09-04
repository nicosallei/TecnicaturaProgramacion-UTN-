
using MySqlConnector;
using System;
using System.Collections.Generic;
using System.Globalization;
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
        public  string[][] readFile(int filaInicio)
        {


            List<string[]> filasLeidas = new List<string[]>();

            try
            {
                StreamReader reader = new StreamReader(@"C:\Users\nicos\Desktop\Archivos de git\TecnicaturaProgramacion-UTN-\Laboratorio 3\Unidad 1\Codigo\archivo.txt");
                string linea = reader.ReadLine();  //leo hasta el salto de linea
                
                int contadorFilas = -1;
                // Leer y descartar las filas hasta llegar a la fila de inicio
                while (contadorFilas < filaInicio && (linea = reader.ReadLine()) != null)
                {
                    contadorFilas++;
                }

                while (contadorFilas < filaInicio + 50 && (linea = reader.ReadLine()) != null)
                {
                   //Console.WriteLine(linea);

                    string[] split = linea.Split('\t');
                    filasLeidas.Add(split);
                    contadorFilas++;
                }

                reader.Close();
                return filasLeidas.ToArray();
                
            }
            catch (Exception ex)
            {
                
                Console.Write(ex.Message);
                return null;
            }
            
        }

        public void prueba(List<string[]> filasLeidas)
        {
            for (int i = 0; i < 50; i++)
            {
                Console.WriteLine(filasLeidas[i][0].ToString() + "-" + filasLeidas[i][1].ToString() + filasLeidas[i][2].ToString() + "-" + filasLeidas[i][3].ToString());
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

                    DateTime fechaHora = DateTime.ParseExact(reader[1].ToString(), "MM/dd/yyyy HH:mm:ss", CultureInfo.InvariantCulture);
                    string fechaHoraFormateada = fechaHora.ToString("yyyy-MM-dd HH:mm:ss"); // transformo la fecha en un orden YYYY-MM-DD HH:mm:ss, ya que la base de dato estan en ese formato.




                    buffer.Append(reader[0].ToString()+"\t"+ fechaHoraFormateada + "\t" + reader[2].ToString() + "\t" + reader[3].ToString() + "\t" + reader[4].ToString() + "\t" + reader[5].ToString());
                    
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

        public bool buscarCodigo(string codigo) {

            string sql = "SELECT codigo FROM articulo_copy WHERE codigo='"+codigo+"'";
            MySqlDataReader reader;

            try
            {
                MySqlConnection conexionBD = base.conexion();
                conexionBD.Open();
                MySqlCommand comando = new MySqlCommand(sql, conexionBD);
                reader= comando.ExecuteReader();

                if (reader.HasRows)
                {

                    return true;
                }
                else { 
                return false;
                }

            }
            catch (Exception ex)
            {
                Console.Write(ex.Message);
                return false;
            }
        }
        
    }
}
