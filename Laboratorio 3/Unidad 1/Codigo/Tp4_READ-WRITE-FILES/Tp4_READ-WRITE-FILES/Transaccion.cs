using MySqlConnector;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using System.Transactions;

namespace Tp4_READ_WRITE_FILES
{
    internal class Transaccion : Conexion
    {

       
       public void RunSqlTransaction(int x)
        {
            MySqlConnection myConnection = base.conexion();
            myConnection.Open();
            MySqlCommand myCommand = myConnection.CreateCommand();
            MySqlTransaction myTrans;
            // Start a local transaction
            myTrans = myConnection.BeginTransaction();
            // Must assign both transaction object and connection
            // to Command object for a pending local transaction
            myCommand.Connection = myConnection;
            myCommand.Transaction = myTrans;
            
            try
            {
                ReadWriteFile app = new ReadWriteFile();
                string[][] arreglo = app.readFile(x);
                

                for (int i = 0; i < 50; i++)
                {

                    if (app.buscarCodigo(arreglo[i][2]))
                    {
                        myCommand.CommandText = "UPDATE articulo_copy SET id='" + arreglo[i][0] + "',fechaAlta='" + arreglo[i][1] + "',codigo='" + arreglo[i][2] + "',denominacion='" + arreglo[i][3] + "',precio='" + arreglo[i][4] + "',publicado='" + arreglo[i][5] +"'";
                        myCommand.ExecuteNonQuery();
                    }
                    else {

                        myCommand.CommandText = "INSERT INTO articulo_copy (id,fechaAlta,codigo,denominacion,precio,publicado) VALUES ('" + arreglo[i][0] + "','" + arreglo[i][1] + "','" + arreglo[i][2] + "','" + arreglo[i][3] + "','" + arreglo[i][4] + "','" + arreglo[i][5] + "')";
                        myCommand.ExecuteNonQuery();

                    }
                }  
                myTrans.Commit();
                Console.WriteLine("Se insertaron 50 registros en la base.");
            }
            catch (Exception e)
            {
                try
                {
                    myTrans.Rollback();
                }
                catch (MySqlException ex)
                {
                    if (myTrans.Connection != null)
                    {
                        Console.WriteLine("Exception de tipo " + ex.GetType() +
                        " al ejecutar el roll back de la transaction.");
                    }
                }
                Console.WriteLine("Exception de tipo " + e.GetType() +
                " mientras se insertaban los datos.");
            }
            finally
            {
                myConnection.Close();
            }
        }



        public void insertar()
        {
           
            ReadWriteFile archivo = new ReadWriteFile();
            string[][] arreglo = archivo.readFile(0);
            Console.WriteLine(arreglo[5][0] + "','" + arreglo[5][1] + "','" + arreglo[5][2] + "','" + arreglo[5][3] + "','" + arreglo[5][4] + "','" + arreglo[5][5] + "-");
            string sql="INSERT INTO articulo_copy (id,fechaAlta,codigo,denominacion,precio,publicado) VALUES ('" + arreglo[5][0] + "','" + arreglo[5][1] + "','" + arreglo[5][2] + "','" + arreglo[5][3] + "','" + double.Parse(arreglo[5][4]) + "','" + arreglo[5][5] + "')";
            

            try
            {
                MySqlConnection conexionBD = base.conexion();
                conexionBD.Open();
                MySqlCommand comando = new MySqlCommand(sql, conexionBD);
                comando.ExecuteNonQuery();

            }
            catch (MySqlException ex)
            {
                Console.WriteLine(ex.Message.ToString());
                
            }
            


        }

    }

    
}
