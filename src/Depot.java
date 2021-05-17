

/**
 *
 * @author shahb
 */
public class Depot {
    
    private int nativeProductStock;
	private int externalProductStock;
	private double cashBalance;

	Depot(){

	}//default cons.

	Depot(int nativeProductStock,int externalProductStock , double cashBalance){

		//super(productName,productPrice);
		if(nativeProductStock>=15&&nativeProductStock<=50){

			this.nativeProductStock = nativeProductStock;

		}//if

		if(externalProductStock>=3&&externalProductStock<=40){

			this.externalProductStock = externalProductStock;

		}//if

		if(cashBalance >= 50 && cashBalance <= 100){

			this.cashBalance = cashBalance;

		}//if
		
	}//overloaded cons

	//setter getter
	void setNativeProductStock(int nativeProductStock){

		this.nativeProductStock = nativeProductStock;
		
	}//setNativeProuct

	void setExternalProductStock(int externalProductStock){

		this.externalProductStock = externalProductStock;
		
	}//setExternalProduct	

	void setCashBalance(double cashBalance) {

		this.cashBalance = cashBalance;

	}//setterCashBalance

	int getNativeProductStock(){

		return this.nativeProductStock;

	}//getNativeProduct

	int getExternalProductStock(){

		return externalProductStock;

	}//getExternalProduct

	double getCashBalance(){

		return cashBalance;

	}//getterCashBalance

	public String toString(){

		return " Native Product = "+this.getNativeProductStock()+" ,  External Product = "+this.getExternalProductStock()+" , Cash Balance = "+this.getCashBalance();
	}//toString
}//class

