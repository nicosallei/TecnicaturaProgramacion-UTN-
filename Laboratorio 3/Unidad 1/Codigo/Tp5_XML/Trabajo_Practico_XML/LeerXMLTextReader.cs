using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace Trabajo_Practico_XML
{
    class LeerXMLTextReader
    {

        static void Main(string[] args)
        {

            using (XmlReader readerXML = XmlReader.Create("C:\\prueba\\EjB.xml"))
            {
                while (readerXML.Read())
                {
                    if (readerXML.IsStartElement())
                    {
                        switch (readerXML.Name)
                        {
                            case "empleados":
                                Console.WriteLine("<empleados>");
                                break;
                            case "listado":
                                Console.WriteLine("\t<listado>");
                                break;
                            case "empleado":
                                Console.WriteLine("\t\t<empleado>");
                                break;
                            case "id":
                                Console.WriteLine("\t\t\t<id>" + readerXML.ReadString() + "</id");
                                break;
                            case "nombreCompleto":
                                Console.WriteLine("\t\t\t<nombreCompleto>" + readerXML.ReadString() + "</nombreCompleto>");
                                break;
                            case "cuil":
                                Console.WriteLine("\t\t\t<cuil>" + readerXML.ReadString() + "</cuil");

                                break;
                            case "sector":
                                Console.Write("\t\t\t<sector ");
                                string denominacion = readerXML["denominacion"];
                                string id = readerXML["id"];
                                string valorSemaforo = readerXML["valorSemaforo"];
                                string colorSemaforo = readerXML["colorSemaforo"];

                                if (denominacion != null && id != null && valorSemaforo != null && colorSemaforo != null)
                                {
                                    Console.WriteLine(
                                        "denominacion: " + denominacion +
                                        " id: " + id +
                                        " valorSemaforo: " + valorSemaforo +
                                        " colorSemaforo: " + colorSemaforo + "></sector");
                                }
                                break;
                            case "cupoAsignado":
                                Console.WriteLine("\t\t\t<cupoAsignado>" + readerXML.ReadString() + "</cupoAsignado>");
                                break;
                            case "cupoConsumido":
                                Console.WriteLine("\t\t\t<cupoConsumido>" + readerXML.ReadString() + "</cupoConsumido>");
                                Console.WriteLine("\t\t</empleado>");
                                Console.WriteLine(" ");
                                break;
                            case "subsectores":
                                Console.WriteLine("\t</listado>");
                                Console.WriteLine("\t<subsectores>" + readerXML.ReadString() + "</subsectores>");
                                break;
                            case "totalCupoAsignadoSector":
                                Console.WriteLine("\t<totalCupoAsignadoSector>" + readerXML.ReadString() + "</totalCupoAsignadoSector>");
                                break;
                            case "totalCupoConsumidoSector":
                                Console.WriteLine("\t<totalCupoConsumidoSector>" + readerXML.ReadString() + "</totalCupoConsumidoSector>");
                                break;
                            case "valorDial":
                                Console.WriteLine("\t<valorDial>" + readerXML.ReadString() + "</valorDial>");
                                Console.WriteLine("</empleados>");
                                break;
                        }
                    }
                }
            }
        }


    }
}
