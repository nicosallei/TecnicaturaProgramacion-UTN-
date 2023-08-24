using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace D._6_Objetos
{
    internal class Deposito
    {
        public string nombre, domicilio;

        private ArrayList articulos = new ArrayList();


        public Deposito(string nombre, string domicilio) { 
            this.nombre = nombre;
            this.domicilio = domicilio; 
        
        }

        public void addArticulos(Articulo articulo) { 
        
        articulos.Add(articulo);
        }

        public List<Articulo> ArticulosBajoStock()
        {
            List<Articulo> articulosBajoStock = new List<Articulo>();

            foreach (Articulo articulo in articulos)
            {
                if (articulo.stockTotal <= articulo.stockMinimo)
                {
                    articulosBajoStock.Add(articulo);
                }
            }

            return articulosBajoStock;
        }



    }
}
