using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace Trabajo_Practico_XML
{
    class EscribirXML
    {

        static void Main(string[] args)
        {

            try
            {
                XElement empleados = new XElement("empleados");

                XElement listado = new XElement("listado");

                XElement empleado = new XElement("empleado");

                XElement id = new XElement("id", "4884");
                empleado.Add(id);
                XElement nombreCompleto = new XElement("nombreCompleto", "Rodriguez, Victor");
                empleado.Add(nombreCompleto);
                XElement cuil = new XElement("cuil", "20103180326");
                empleado.Add(cuil);
                XElement sector = new XElement("sector");
                XAttribute denominacion = new XAttribute("denominacion", "Gerencia Recursos Humanos");
                XAttribute idAtributo = new XAttribute("id", "137");
                XAttribute valorSemaforo = new XAttribute("valorSemaforo", "130.13");
                XAttribute colorSemaforo = new XAttribute("colorSemaforo", "VERDE");

                sector.Add(denominacion);
                sector.Add(idAtributo);
                sector.Add(valorSemaforo);
                sector.Add(colorSemaforo);
                empleado.Add(sector);
                XElement cupoAsignado = new XElement("cupoAsignado", "1837.15");
                empleado.Add(cupoAsignado);
                XElement cupoConsumido = new XElement("cupoConsumido", "658.02");
                empleado.Add(cupoConsumido);

                listado.Add(empleado);

                empleado = new XElement("empleado");

                id = new XElement("id", "1225");
                empleado.Add(id);
                nombreCompleto = new XElement("nombreCompleto", "Sanchez, Juan Ignacio");
                empleado.Add(nombreCompleto);
                cuil = new XElement("cuil", "20103180326");
                empleado.Add(cuil);
                sector = new XElement("sector");
                denominacion = new XAttribute("denominacion", "Gerencia Operativa");
                idAtributo = new XAttribute("id", "44");
                valorSemaforo = new XAttribute("valorSemaforo", "130.13");
                colorSemaforo = new XAttribute("colorSemaforo", "ROJO");

                sector.Add(denominacion);
                sector.Add(idAtributo);
                sector.Add(valorSemaforo);
                sector.Add(colorSemaforo);
                empleado.Add(sector);

                cupoAsignado = new XElement("cupoAsignado", "750.87");
                empleado.Add(cupoAsignado);
                cupoConsumido = new XElement("cupoConsumido", "625.46");
                empleado.Add(cupoConsumido);



                listado.Add(empleado);


                empleados.Add(listado);

                XElement subsectores = new XElement("subsectores", "5");
                XElement totalCupoAsignadoSector = new XElement("totalCupoAsignadoSector", "4217.21");
                XElement totalCupoConsumidoSector = new XElement("totalCupoConsumidoSector", "1405.88");
                XElement valorDial = new XElement("valorDial", "33.34");

                empleados.Add(subsectores);
                empleados.Add(totalCupoAsignadoSector);
                empleados.Add(totalCupoConsumidoSector);
                empleados.Add(valorDial);

                XDeclaration declaration = new XDeclaration("1.0", "utf-8", "yes");
                XDocument miXML = new XDocument(declaration, empleados);



                String path = "C:\\prueba\\";
                string archivoXML = path + "EjA.xml";
                miXML.Save(@archivoXML);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

    }
}
