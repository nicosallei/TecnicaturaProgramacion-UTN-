
using MySqlConnector;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tp4_READ_WRITE_FILES
{
    internal class Conexion
    {

        public  MySqlConnection conexion()
        {

            string servidor = "localhost";
            string bd = "utn";
            string usuario = "root";
            string password = "123456";

            string cadenaConexion = "Database=" + bd + "; Data Source=" +
                servidor + "; User Id= " + usuario + "; Password=" +
                password + "";


            try
            {
                 MySqlConnection conexionBD = new MySqlConnection(cadenaConexion);

                return conexionBD;
            }
            catch (MySqlException ex)
            {
                Console.WriteLine("Error: " + ex.Message);
                return null;
            }



        }


    }
}
