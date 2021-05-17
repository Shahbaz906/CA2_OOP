

/**
 *
 * @author shahb
 */
public class Bigc extends Depot{
    
    
	private int depotNo;
	private double price = 500;
	private String produceC = "Ice Cream";

	Bigc()
	{

	}//default
	Bigc(int depotNo,int nativeProductStock,int externalProductStock,double cashBalance)
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
	void setProduceC(String produceC)
	{
		this.produceC = produceC;
	}//setProduceB
	String getProduceC()
	{
		return produceC;
	}//getProduceB
	double getPrice()
	{
		return this.price;
	}//getPrice

	public String toString()
	{
		return " DepotNo = "+this.getDepotNo()+" , "+super.toString();
	}//toString
}//class
    
