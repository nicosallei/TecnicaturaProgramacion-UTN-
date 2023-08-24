using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace D._7_Herencia_Polimorfismo
{
    internal class Triangulo : Figura
    {
        public override void Dibujar()
        {
            Console.WriteLine("Dibuja Triángulo");
        }
    }
}
