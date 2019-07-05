using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hurtownia
{
    public class Product
    {

        string productName = "";
        string group = "";
        DateTime validDate = DateTime.Today.AddMonths(6);
        string lotNumber = "";
        int stockAmount = 1;
        string package = "";
        bool isBestseller = false;
        string description;
        public string ProductName { get { return productName; } set { productName = value; } }
        public string Group { get { return group; } set { group = value; } }
        public DateTime ValidDate { get { return validDate; } set { validDate = value; } }
        public string LotNumber { get { return lotNumber; } set { lotNumber = value; } }
        public int StockAmount { get { return stockAmount; } set { stockAmount = value; } }
        public string Package { get { return package; } set { package = value; } }
        public bool IsBestseller { get { return isBestseller; } set { isBestseller = value; } }
        public string Description { get { return description; } set { description = value; } }

    }
}
