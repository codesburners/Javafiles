class product{
    private int itemno;
    private String name;
    private double price;
    private int qty;
    public int getItemno()
    {
        return itemno;
    }
    public void setItemno(int i){
        itemno=i;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double p)
    {
        price=p;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty)
    {
        this.qty=qty;
    }
    public product(int itemno,String name,double price,int qty)
    {
        setItemno(itemno);
        setName(name);
        setPrice(price);
        setQty(qty);
    }
    public product()
    {

    }
}
class customer{
    private String custid;
    private String name;
    private String address;
    private String phone;
    public String getCutid()
    {
        return custid;
    }
    public String name()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhone ()
    {
        return phone;

    }

    public void setAddress(String address){
        this.address=address;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public customer(String custid,String name,String address,String phone)
    {
        this.custid=custid;
        this.name=name;
        setAddress(address);
        setPhone(phone);
    }
    }
public class cons_prac2 {
    public static void main(String[] args) {
        product p2=new product();
        product p1=new product(1,"A",100,10);
        customer c1=new customer("C1","A","Belgauire","123");
        System.out.println(p1.getItemno()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getQty());
        System.out.println(c1.getCutid()+" "+c1.name()+" "+c1.getAddress()+" "+c1.getPhone());
    }


}
