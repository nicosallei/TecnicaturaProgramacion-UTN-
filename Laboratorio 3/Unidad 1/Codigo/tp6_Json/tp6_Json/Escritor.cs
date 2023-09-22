using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace tp6_Json
{
    internal class Escritor
    {
        public int id { get; set; }
        public string apellido { get; set; }
        public string nombre { get; set; }
        public int dni { get; set; }

        public List<Libro> libros { get; set; }


        public Escritor(int id, string apellido, string nombre, int dni, List<Libro> libros)
        {
            this.id = id;
            this.apellido = apellido;
            this.nombre = nombre;
            this.dni = dni;
            this.libros = libros;
        }

        public Escritor()
        {
        }
    }
}
