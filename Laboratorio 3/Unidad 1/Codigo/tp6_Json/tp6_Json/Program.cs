using MySqlConnector;
using Newtonsoft.Json;
using System.Collections.Generic;
using System;
using System.IO;

namespace tp6_Json
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string conexionString = "Server=localhost;Port=3306;Database=Json;Uid=root;password=123456";
            MySqlConnection conexion = new MySqlConnection(conexionString);

            try
            {
                conexion.Open();
            }
            catch (MySqlException e)
            {
                Console.WriteLine(e.Message);
            }


            MySqlCommand obtenerCampos = new MySqlCommand();

            obtenerCampos.Connection = conexion;
            obtenerCampos.CommandText = $"SELECT * FROM Escritor";

            List<Escritor> arregloCampos = new List<Escritor>();

            using (var reader = obtenerCampos.ExecuteReader())
            {
                while (reader.Read())
                {

                    Escritor campo = new Escritor(Convert.ToInt32(reader[0]), Convert.ToString(reader[1]), Convert.ToString(reader[2]), Convert.ToInt32(reader[3]), new List<Libro>());
                    arregloCampos.Add(campo);


                }
            }

            for (int i = 0; i < arregloCampos.Count; i++)
            {
                MySqlCommand obtenerLibros = new MySqlCommand();
                obtenerLibros.Connection = conexion;

                obtenerLibros.CommandText = $"SELECT * FROM Libro WHERE idEscritor='{arregloCampos[i].id}'";
                using (var reader2 = obtenerLibros.ExecuteReader())
                {

                    while (reader2.Read())
                    {

                        Libro libro = new Libro(Convert.ToString(reader2[0]), Convert.ToInt32(reader2[1]), Convert.ToString(reader2[2]));
                        arregloCampos[i].libros.Add(libro);


                    }
                }
            }


            EscribirJsonFile(arregloCampos, "C:\\prueba\\JSONFile.json");

        }
        public static void EscribirJsonFile(List<Escritor> campos, string pathFile)
        {

            string jsonFile = JsonConvert.SerializeObject(campos.ToArray(), Newtonsoft.Json.Formatting.Indented);

            File.WriteAllText(pathFile, jsonFile);


        }
    }
}
