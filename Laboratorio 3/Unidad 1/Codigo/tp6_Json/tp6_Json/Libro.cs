using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace tp6_Json
{
    internal class Libro
    {
        public string nombre { get; set; }
        public int anioPublicacion { get; set; }
        public string editorial { get; set; }

        public Libro(string nombre, int anioPublicacion, string editorial)
        {


            this.nombre = nombre;
            this.anioPublicacion = anioPublicacion;
            this.editorial = editorial;
        }
    }
}
