using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace video_3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            cargarTabla(null);
        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            string  dato = txtCampo.Text;
            cargarTabla(dato);
        }

        private void cargarTabla(string dato) {

            List<Productos> lista = new List<Productos>();
            CtrlProductos _ctrlProductos = new CtrlProductos();
            dataGridView1.DataSource = _ctrlProductos.consulta(dato);
        }

    }
}
