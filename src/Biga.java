

/**
 *
 * @author shahb
 */
public class Biga extends Depot {
    private int depotNo;
	private double price = 50;
	private String produceA = "juice";
	
	Biga()
	{

	}
	Biga(int depotNo,int nativeProductStock,int externalProductStock,double cashBalance)
	{
		super(nativeProductStock,externalProductStock,cashBalance);
		this.depotNo = depotNo;
	}//overloaded Cons.
	//setter getter
	void setDepotNo(int depotNo)
	{
		this.depotNo = depotNo;
	}//setDepotNo
	int getDepotNo()
	{
		return this.depotNo;
	}//getDepotNO
	void setProduceA(String produceA)
	{
		this.produceA = produceA;
	}//setProduceB
	String getProduceA()
	{
		return produceA;
	}//getProduceB
	double getPrice()
	{
		return this.price;
	}//getPrice
	
	public String toString()
	{
		return " DepotNo =  "+this.getDepotNo()+" , "+super.toString();
	}//toString
}//class
    

