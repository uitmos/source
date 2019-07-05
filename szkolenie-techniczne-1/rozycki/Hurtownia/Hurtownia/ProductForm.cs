using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Hurtownia
{
    public partial class ProductForm : Form
    {
        private Product data = new Product();
        public ProductForm()
        {
            //data.Group = "TEST";
            //data.ProductName = "Nazwa prodktu";
            InitializeComponent();
            productBindingSource.DataSource = data;
        }
               
        private void btClose_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btSave_Click(object sender, EventArgs e)
        {
            StringBuilder sb = new StringBuilder();
            sb.AppendLine("Nazwa produktu: " + data.ProductName);
            sb.AppendLine("Grupa: " + data.Group);
            sb.AppendLine("Data ważności: " + data.ValidDate.ToShortDateString());
            sb.AppendLine("Numer seryjny: " + data.LotNumber.ToString());
            sb.AppendLine("Stan na magazynie: " + data.StockAmount);
            sb.AppendLine("Opakowanie: " + data.Package);
            sb.AppendLine("Bestseller: " + (data.IsBestseller == true ? "TAK" : "Nie"));
            sb.AppendLine("Opis produktu: " + data.Description);
            MessageBox.Show(sb.ToString());
            
        }
    }
}
