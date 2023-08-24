using D._7_Herencia_Polimorfismo;
using System.Drawing;

class Program
{
    static void Main()
    {
        List<Figura> figuras = new List<Figura>();

        figuras.Add(new Rectangulo());
        figuras.Add(new Figura());
        figuras.Add(new Circulo());
        figuras.Add(new Figura());
        figuras.Add(new Triangulo());
        figuras.Add(new Figura());

        foreach (Figura figura in figuras)
        {
            figura.Dibujar();
        }
    }
}