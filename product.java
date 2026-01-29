class Product {
    int pcode;
    String pname;
    double price;


    Product(int pcode,String pname,double price) {
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
public static void main(String[] args) {
    Product p1=new Product(1,"mouse",110);
    Product p2=new Product(2, "keyboard", 250);
    Product p3=new Product(3, "monitor",1000);
      
  Product lowest=p1;
  if(p2.price < lowest.price)
  {
    lowest=p2;
  }
  if(p3.price < lowest.price)
    {
        lowest=p3;
    
    }
System.out.println("product with lowest price:");
System.out.println(lowest.pcode +""+ lowest.pname +""+ lowest.price);
}
}        
