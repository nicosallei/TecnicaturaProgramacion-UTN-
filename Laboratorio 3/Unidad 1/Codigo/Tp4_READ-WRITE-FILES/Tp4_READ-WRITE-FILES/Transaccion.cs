using Microsoft.VisualBasic;
using MySqlConnector;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using System.Transactions;
using Tp4_READ_WRITE_FILES;

namespace Tp4_READ_WRITE_FILES
{
    internal class Transaccion : Conexion
    {


        public void insertar(String[][] arreglo, int contador)
        {
            ReadWriteFile app = new ReadWriteFile();
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
            String prueba = "";
            try
            {
                for (int i = 0; i < contador; i++)
                {
                    string fechaString = arreglo[i][1];
                    DateTime fecha = DateTime.Parse(fechaString);
                    string fechaMySQL = fecha.ToString("yyyy-MM-dd HH:mm:ss");
                    string precio = arreglo[i][4].Replace(',', '.');
                    string denominacion = arreglo[i][3].Replace("'", " ");
                     //prueba = "INSERT INTO articulo_copy (id,fechaAlta,codigo,denominacion,precio,publicado) VALUES ('" + arreglo[i][0] + "','" + fechaMySQL + "','" + arreglo[i][2] + "','" + denominacion + "'," + precio + ",'" + arreglo[i][5] + "')";

                    if (app.buscarCodigo(arreglo[i][2]))
                    {
                        myCommand.CommandText = "UPDATE articulo_copy SET id='" + arreglo[i][0] + "',fechaAlta='" + fechaMySQL + "',codigo='" + arreglo[i][2] + "',denominacion='" + denominacion + "',precio=" + precio + ",publicado='" + arreglo[i][5] + "'Where id= '" + arreglo[i][0] + "';";
                        myCommand.ExecuteNonQuery();
                    }
                    else
                    {
                        myCommand.CommandText = "INSERT INTO articulo_copy (id,fechaAlta,codigo,denominacion,precio,publicado) VALUES ('" + arreglo[i][0] + "','" + fechaMySQL + "','" + arreglo[i][2] + "','" + denominacion + "'," + precio + ",'" + arreglo[i][5] + "')";
                        myCommand.ExecuteNonQuery();
                    }
                }

                myTrans.Commit();
                //Console.WriteLine("Se insertaron 50 registros en la base.");
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
                //Console.WriteLine(prueba);
                }
            finally
            {
                myConnection.Close();
            }
        }
    }
    
}
