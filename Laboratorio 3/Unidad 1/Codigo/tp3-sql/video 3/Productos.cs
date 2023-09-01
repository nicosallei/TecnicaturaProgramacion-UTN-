using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace video_3
{
    internal class Productos
    {
        private int id;
        private string codigo;
        private string nombre;
        private string descripcion;
        private float precio_publico;
        private int existencia;

        public int Id { get => id; set => id = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public string Descripcion { get => descripcion; set => descripcion = value; }
        public float Precio_publico { get => precio_publico; set => precio_publico = value; }
        public int Existencia { get => existencia; set => existencia = value; }
        public string Codigo { get => codigo; set => codigo = value; }
    }
}
