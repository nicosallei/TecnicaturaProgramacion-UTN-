using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;

namespace Tp_numero_2
{
    internal class Fraccion{
       
        private int numerador;
        private int denominador;


        public Fraccion(int numerador, int denominador){
            if (denominador == 0)
            {
                throw new FraccionException("El denominador no puede ser cero");
            }

            this.numerador = numerador;
            this.denominador = denominador;
        }



        //public int GetNumerador() { 
        
        //return numerador;
        //}
        //public void SetNumerador(int numerador)
        //{
        //    this.numerador = numerador;
        //}

        //public int GetDenominador()
        //{

        //    return denominador;
        //}
        //public void SetDenominador(int denominador)
        //{
        //    this.denominador = denominador;
        //}

        public int Sumar() {
         
            return (numerador + denominador);
        }
        public int Restar() {

            return(numerador-denominador);
        }
        public int Multiplicar() { 
        return (numerador * denominador);
        }
        public int Dividir() { 

            return (numerador/denominador);
        }






    }
}
