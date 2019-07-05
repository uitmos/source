namespace Hurtownia
{
    partial class ProductForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.btSave = new System.Windows.Forms.Button();
            this.btClose = new System.Windows.Forms.Button();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabProductData = new System.Windows.Forms.TabPage();
            this.cxBestseller = new System.Windows.Forms.CheckBox();
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.label7 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.numericUpDown1 = new System.Windows.Forms.NumericUpDown();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.dateTimePicker1 = new System.Windows.Forms.DateTimePicker();
            this.cbGroup = new System.Windows.Forms.ComboBox();
            this.txProductName = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.tabNotes = new System.Windows.Forms.TabPage();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.productBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.tabControl1.SuspendLayout();
            this.tabProductData.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDown1)).BeginInit();
            this.tabNotes.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.productBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // btSave
            // 
            this.btSave.Location = new System.Drawing.Point(141, 361);
            this.btSave.Name = "btSave";
            this.btSave.Size = new System.Drawing.Size(75, 23);
            this.btSave.TabIndex = 1;
            this.btSave.Text = "Zapisz";
            this.btSave.UseVisualStyleBackColor = true;
            this.btSave.Click += new System.EventHandler(this.btSave_Click);
            // 
            // btClose
            // 
            this.btClose.Location = new System.Drawing.Point(241, 361);
            this.btClose.Name = "btClose";
            this.btClose.Size = new System.Drawing.Size(75, 23);
            this.btClose.TabIndex = 2;
            this.btClose.Text = "Zmknij";
            this.btClose.UseVisualStyleBackColor = true;
            this.btClose.Click += new System.EventHandler(this.btClose_Click);
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabProductData);
            this.tabControl1.Controls.Add(this.tabNotes);
            this.tabControl1.Location = new System.Drawing.Point(12, 12);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(426, 305);
            this.tabControl1.TabIndex = 0;
            // 
            // tabProductData
            // 
            this.tabProductData.Controls.Add(this.cxBestseller);
            this.tabProductData.Controls.Add(this.comboBox1);
            this.tabProductData.Controls.Add(this.label7);
            this.tabProductData.Controls.Add(this.label6);
            this.tabProductData.Controls.Add(this.numericUpDown1);
            this.tabProductData.Controls.Add(this.textBox1);
            this.tabProductData.Controls.Add(this.dateTimePicker1);
            this.tabProductData.Controls.Add(this.cbGroup);
            this.tabProductData.Controls.Add(this.txProductName);
            this.tabProductData.Controls.Add(this.label5);
            this.tabProductData.Controls.Add(this.label4);
            this.tabProductData.Controls.Add(this.label3);
            this.tabProductData.Controls.Add(this.label2);
            this.tabProductData.Controls.Add(this.label1);
            this.tabProductData.Location = new System.Drawing.Point(4, 22);
            this.tabProductData.Name = "tabProductData";
            this.tabProductData.Padding = new System.Windows.Forms.Padding(3);
            this.tabProductData.Size = new System.Drawing.Size(418, 279);
            this.tabProductData.TabIndex = 1;
            this.tabProductData.Text = "Dane produktu";
            this.tabProductData.UseVisualStyleBackColor = true;
            // 
            // cxBestseller
            // 
            this.cxBestseller.AutoSize = true;
            this.cxBestseller.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.productBindingSource, "IsBestseller", true));
            this.cxBestseller.Location = new System.Drawing.Point(147, 200);
            this.cxBestseller.Name = "cxBestseller";
            this.cxBestseller.Size = new System.Drawing.Size(15, 14);
            this.cxBestseller.TabIndex = 13;
            this.cxBestseller.UseVisualStyleBackColor = true;
            // 
            // comboBox1
            // 
            this.comboBox1.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.productBindingSource, "Package", true));
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Location = new System.Drawing.Point(147, 169);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(121, 21);
            this.comboBox1.TabIndex = 12;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(16, 200);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(51, 13);
            this.label7.TabIndex = 11;
            this.label7.Text = "bestseller";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(16, 172);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(67, 13);
            this.label6.TabIndex = 10;
            this.label6.Text = "Opakowanie";
            // 
            // numericUpDown1
            // 
            this.numericUpDown1.DataBindings.Add(new System.Windows.Forms.Binding("Value", this.productBindingSource, "StockAmount", true));
            this.numericUpDown1.Location = new System.Drawing.Point(148, 141);
            this.numericUpDown1.Name = "numericUpDown1";
            this.numericUpDown1.Size = new System.Drawing.Size(120, 20);
            this.numericUpDown1.TabIndex = 9;
            // 
            // textBox1
            // 
            this.textBox1.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.productBindingSource, "LotNumber", true));
            this.textBox1.Location = new System.Drawing.Point(148, 109);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(120, 20);
            this.textBox1.TabIndex = 8;
            // 
            // dateTimePicker1
            // 
            this.dateTimePicker1.DataBindings.Add(new System.Windows.Forms.Binding("Value", this.productBindingSource, "ValidDate", true));
            this.dateTimePicker1.Location = new System.Drawing.Point(148, 77);
            this.dateTimePicker1.Name = "dateTimePicker1";
            this.dateTimePicker1.Size = new System.Drawing.Size(200, 20);
            this.dateTimePicker1.TabIndex = 7;
            // 
            // cbGroup
            // 
            this.cbGroup.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.productBindingSource, "Group", true));
            this.cbGroup.FormattingEnabled = true;
            this.cbGroup.Location = new System.Drawing.Point(148, 48);
            this.cbGroup.Name = "cbGroup";
            this.cbGroup.Size = new System.Drawing.Size(121, 21);
            this.cbGroup.TabIndex = 6;
            // 
            // txProductName
            // 
            this.txProductName.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.productBindingSource, "ProductName", true));
            this.txProductName.Location = new System.Drawing.Point(148, 17);
            this.txProductName.Name = "txProductName";
            this.txProductName.Size = new System.Drawing.Size(121, 20);
            this.txProductName.TabIndex = 5;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(16, 143);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(75, 13);
            this.label5.TabIndex = 4;
            this.label5.Text = "Ilość na stanie";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(16, 112);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(73, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Numer seryjny";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(16, 83);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(92, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Data przydatności";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(16, 51);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(36, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Grupa";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(16, 20);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(85, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Nazwa produktu";
            // 
            // tabNotes
            // 
            this.tabNotes.Controls.Add(this.textBox2);
            this.tabNotes.Location = new System.Drawing.Point(4, 22);
            this.tabNotes.Name = "tabNotes";
            this.tabNotes.Padding = new System.Windows.Forms.Padding(3);
            this.tabNotes.Size = new System.Drawing.Size(418, 279);
            this.tabNotes.TabIndex = 0;
            this.tabNotes.Text = "Notatki";
            this.tabNotes.UseVisualStyleBackColor = true;
            // 
            // textBox2
            // 
            this.textBox2.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.productBindingSource, "Description", true));
            this.textBox2.Location = new System.Drawing.Point(0, 6);
            this.textBox2.Multiline = true;
            this.textBox2.Name = "textBox2";
            this.textBox2.Size = new System.Drawing.Size(412, 267);
            this.textBox2.TabIndex = 0;
            // 
            // productBindingSource
            // 
            this.productBindingSource.DataSource = typeof(Hurtownia.Product);
            // 
            // ProductForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(443, 400);
            this.Controls.Add(this.tabControl1);
            this.Controls.Add(this.btClose);
            this.Controls.Add(this.btSave);
            this.Name = "ProductForm";
            this.Text = "ProductForm";
            this.tabControl1.ResumeLayout(false);
            this.tabProductData.ResumeLayout(false);
            this.tabProductData.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDown1)).EndInit();
            this.tabNotes.ResumeLayout(false);
            this.tabNotes.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.productBindingSource)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btSave;
        private System.Windows.Forms.Button btClose;
        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage tabProductData;
        private System.Windows.Forms.CheckBox cxBestseller;
        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.NumericUpDown numericUpDown1;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.DateTimePicker dateTimePicker1;
        private System.Windows.Forms.ComboBox cbGroup;
        private System.Windows.Forms.TextBox txProductName;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TabPage tabNotes;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.BindingSource productBindingSource;
    }
}

