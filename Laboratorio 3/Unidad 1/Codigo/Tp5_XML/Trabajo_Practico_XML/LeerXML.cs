using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace Trabajo_Practico_XML
{
    class LeerXML
    {

        static void Main(string[] args)
        {
            XmlDocument documentoXML = new XmlDocument();
            documentoXML.Load("C:\\prueba\\EjA.xml");

            XmlNodeList empleados = documentoXML.GetElementsByTagName("empleados");
            XmlNodeList listado = documentoXML.GetElementsByTagName("listado");
            XmlNodeList empleado = ((XmlElement)listado[0]).GetElementsByTagName("empleado");
            XmlNodeList subsubsectores = documentoXML.GetElementsByTagName("subsectores");
            XmlNodeList totalCupoAsignadoSector = documentoXML.GetElementsByTagName("totalCupoAsignadoSector");
            XmlNodeList totalCupoConsumidoSector = documentoXML.GetElementsByTagName("totalCupoConsumidoSector");
            XmlNodeList valorDial = documentoXML.GetElementsByTagName("valorDial");

            int i = 0;
            Console.WriteLine("<empleados>");
            Console.WriteLine("\t<listado>");
            foreach (XmlElement nodo in empleado)
            {
                string denominacion = null, idSector = null, valorSemaforo = null, colorSemaforo = null;
                XmlNodeList id = nodo.GetElementsByTagName("id");
                XmlNodeList nombre = nodo.GetElementsByTagName("nombreCompleto");
                XmlNodeList cuil = nodo.GetElementsByTagName("cuil");
                XmlNodeList sector = nodo.GetElementsByTagName("sector");
                XmlNodeList cupoAsignado = nodo.GetElementsByTagName("cupoAsignado");
                XmlNodeList cupoConsumido = nodo.GetElementsByTagName("cupoConsumido");

                foreach (XmlElement nodoSec in sector)
                {
                    denominacion = nodoSec.GetAttribute("denominacion");
                    idSector = nodoSec.GetAttribute("id");
                    valorSemaforo = nodoSec.GetAttribute("valorSemaforo");
                    colorSemaforo = nodoSec.GetAttribute("colorSemaforo");

                }

                Console.WriteLine("\t\t<empleado>");
                Console.WriteLine("\t\t\t<id>" + id[0].InnerText + "</id>");
                Console.WriteLine("\t\t\t<nombreCompleto>" + nombre[0].InnerText + "</nombreCompleto>");
                Console.WriteLine("\t\t\t<cuil>" + cuil[0].InnerText + "</cuil>");
                Console.WriteLine("\t\t\t<sector denominacion=" + denominacion
                    + " id=" + idSector
                    + " valorSemaforo=" + valorSemaforo
                    + " colorSemaforo=" + colorSemaforo
                    + "></sector>"
                );
                Console.WriteLine("\t\t\t<cupoAsignado>" + cupoAsignado[0].InnerText + "</cupoAsignado>");
                Console.WriteLine("\t\t\t<cupoConsumido>" + cupoConsumido[0].InnerText + "</cupoConsumido>");
                Console.WriteLine("\t\t</empleado>");
                i++;
            }
            Console.WriteLine("\t</listado>");
            Console.WriteLine("\t<subsectores>" + subsubsectores[0].InnerText + "<subsectores>");
            Console.WriteLine("\t<totalCupoAsignadoSector>" + totalCupoAsignadoSector[0].InnerText + "<totalCupoAsignadoSector>");
            Console.WriteLine("\t<totalCupoConsumidoSector>" + totalCupoConsumidoSector[0].InnerText + "<totalCupoConsumidoSector>");
            Console.WriteLine("\t<valorDial>" + valorDial[0].InnerText + "<valorDial>");

            Console.WriteLine("</empleados>");



        }

    }
}
