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

        private void btnGuarda_Click(object sender, EventArgs e)
        {
            bool bandera = false;

            Productos _productos = new Productos();
            _productos.Codigo = txtCodigo.Text;
            _productos.Nombre = txtNombre.Text;
            _productos.Descripcion = txtDescripcion.Text;
            _productos.Precio_publico = float.Parse(txtPrecioPublico.Text);
            _productos.Existencia = int.Parse(txtExistencia.Text);

           


            CtrlProductos ctrl  = new CtrlProductos();

            if (txtId.Text != "")
            {
                _productos.Id = int.Parse(txtId.Text);
                bandera = ctrl.actualizar(_productos);
            }
            else
            {
                bandera = ctrl.insertar(_productos);
            }
            if (bandera)
            {
                MessageBox.Show("Registro guardado");
                limpiar();
                cargarTabla(null);
            }
        }


        private void limpiar() {

            txtId.Text = "";
            txtCodigo.Text = "";
            txtNombre.Text = "";
            txtDescripcion.Text = "";
            txtPrecioPublico.Text = "";
            txtExistencia.Text = "";


        }

        private void btnModificar_Click(object sender, EventArgs e)
        {
            txtId.Text = dataGridView1.CurrentRow.Cells[0].Value.ToString();
            txtCodigo.Text = dataGridView1.CurrentRow.Cells[5].Value.ToString();
            txtNombre.Text = dataGridView1.CurrentRow.Cells[1].Value.ToString();
            txtDescripcion.Text = dataGridView1.CurrentRow.Cells[2].Value.ToString();
            txtPrecioPublico.Text = dataGridView1.CurrentRow.Cells[3].Value.ToString();
            txtExistencia.Text = dataGridView1.CurrentRow.Cells[4].Value.ToString();
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            bool bandera = false;
            DialogResult resultado = MessageBox.Show("Seguro que desea eliminar el registro?", "Salir", MessageBoxButtons.YesNoCancel);
            if(resultado == DialogResult.Yes)
            {
                int id =  int.Parse(dataGridView1.CurrentRow.Cells[0].Value.ToString());
                CtrlProductos _ctrl = new CtrlProductos();
                bandera = _ctrl.eliminar(id);

                if (bandera)
                {
                    MessageBox.Show("Registro guardado");
                    limpiar();
                    cargarTabla(null);
                }

            }
        }

        private void btnLimpiar_Click(object sender, EventArgs e)
        {
            limpiar();
        }
    }
}
