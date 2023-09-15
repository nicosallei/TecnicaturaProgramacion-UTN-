using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace Trabajo_Practico_XML
{
    class EscribirXMLTextWriter
    {

        static void Main(string[] args)
        {
            XmlTextWriter myXmlTextWriter = new XmlTextWriter("C:\\prueba\\EjB.xml", null);
            myXmlTextWriter.Formatting = Formatting.Indented;
            myXmlTextWriter.WriteStartDocument(false);

            myXmlTextWriter.WriteStartElement("empleados");
            myXmlTextWriter.WriteStartElement("listado");
            myXmlTextWriter.WriteStartElement("empleado", null);
            myXmlTextWriter.WriteElementString("id", null, "4884");
            myXmlTextWriter.WriteElementString("nombreCompleto", null, "Rodriguez, Victor");
            myXmlTextWriter.WriteElementString("cuil", null, "20103180326");

            myXmlTextWriter.WriteStartElement("sector");
            myXmlTextWriter.WriteAttributeString("denominacion", "Gerencia Recursos Humanos");
            myXmlTextWriter.WriteAttributeString("id", "137");
            myXmlTextWriter.WriteAttributeString("valorSemaforo", "130.13");
            myXmlTextWriter.WriteAttributeString("colorSemaforo", "VERDE");
            myXmlTextWriter.WriteEndElement();

            myXmlTextWriter.WriteElementString("cupoAsignado", "1837.15");
            myXmlTextWriter.WriteElementString("cupoConsumido", "658.02");
            myXmlTextWriter.WriteEndElement();

            myXmlTextWriter.Flush();

            myXmlTextWriter.WriteStartElement("empleado", null);
            myXmlTextWriter.WriteElementString("id", null, "1225");
            myXmlTextWriter.WriteElementString("nombreCompleto", null, "Sanchez, Juan Ignacio");
            myXmlTextWriter.WriteElementString("cuil", null, "20271265817");

            myXmlTextWriter.WriteStartElement("sector");
            myXmlTextWriter.WriteAttributeString("denominacion", "Gerencia Operativa");
            myXmlTextWriter.WriteAttributeString("id", "44");
            myXmlTextWriter.WriteAttributeString("valorSemaforo", "130.13");
            myXmlTextWriter.WriteAttributeString("colorSemaforo", "ROJO");
            myXmlTextWriter.WriteEndElement();

            myXmlTextWriter.WriteElementString("cupoAsignado", "750.87");
            myXmlTextWriter.WriteElementString("cupoConsumido", "625.46");
            myXmlTextWriter.WriteEndElement();
            myXmlTextWriter.WriteEndElement();
            myXmlTextWriter.WriteElementString("subsectores", null, "5");
            myXmlTextWriter.WriteElementString("totalCupoAsignadoSector", null, "4217.21");
            myXmlTextWriter.WriteElementString("totalCupoConsumidoSector", null, "1405.88");
            myXmlTextWriter.WriteElementString("valorDial", null, "33.34");

            myXmlTextWriter.Flush();
            myXmlTextWriter.Close();
        }


    }
}
