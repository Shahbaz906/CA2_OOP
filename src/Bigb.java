

/**
 *
 * @author shahb
 */
public class Bigb extends Depot{
    
        private int depotNo;
	private double price = 100;
	private String produceB = "Biscuit";
	
	Bigb()
	{

	}//default
	Bigb(int depotNo,  int nativeProductStock,int externalProductStock,double cashBalance)
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
	void setProduceB(String produceB)
	{
		this.produceB = produceB;
	}//setProduceB
	String getProduceB()
	{
		return produceB;
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
    

