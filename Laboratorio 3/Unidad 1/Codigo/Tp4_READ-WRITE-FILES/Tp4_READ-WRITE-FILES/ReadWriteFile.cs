
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
                string header = "id\techaAlta\tcodigo\tdenominacion\tprecio\tpublicado";
                writer.WriteLine(header);
                writer.Close();

            }
        public  void readFile()
        {

            Transaccion transaccion = new Transaccion();
            List<string[]> filasLeidas = new List<string[]>();   
            int contador = 0;
            int contadorFilas = 0;
            int bandera = 0;
            bool primeraFila=true;
            try
            {
                    //aca cuento la cantidad de filas que tiene el archivo txt
                    StreamReader contadorFila = new StreamReader(@"C:\Users\nicos\Desktop\Archivos de git\TecnicaturaProgramacion-UTN-\Laboratorio 3\Unidad 1\Codigo\archivo.txt");
                    while (contadorFila.ReadLine() != null) { 
                    contador++;           
                    } 
                    contadorFila.Close();
                
               
                    StreamReader reader = new StreamReader(@"C:\Users\nicos\Desktop\Archivos de git\TecnicaturaProgramacion-UTN-\Laboratorio 3\Unidad 1\Codigo\archivo.txt");
                    string linea = reader.ReadLine();  //leo hasta el salto de linea
                    

                while (linea  != null)
                {

                    if (primeraFila)
                    {
                        linea = reader.ReadLine();
                        primeraFila = false;
                        contador--;
                        continue;
                    }

                    string[] split = linea.Split('\t');
                        filasLeidas.Add(split);
                        linea = reader.ReadLine();
                        contadorFilas++;
                        contador--;
                    
                    if (contadorFilas == 50 || contador== 0) {
                        
                        transaccion.insertar(filasLeidas.ToArray(),contadorFilas);
                        bandera = bandera + contadorFilas;
                        contadorFilas = 0;
                        Console.WriteLine(bandera.ToString());
                        filasLeidas.Clear();                   
                    }                

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
                    conexionBD.Close();
                
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
                MySqlConnection conexionBD = base.conexion();
                conexionBD.Open();
                try
                {
                
                    MySqlCommand comando = new MySqlCommand(sql, conexionBD);
                    reader = comando.ExecuteReader();

                    if (reader.HasRows)
                    {

                        return true;
                    }
                    else
                    {
                        return false;
                    }

                }
                catch (Exception ex)
                {
                    Console.Write(ex.Message);
                    return false;
                }
                finally { 
                conexionBD.Close() ;
                }
        }
        
    }
}
