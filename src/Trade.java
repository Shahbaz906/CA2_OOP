

/**
 *
 * @author shahb
 */
public class Trade {
    
    Biga biga_object = new Biga();
	Bigb bigb_object = new Bigb();
	Bigc bigc_object = new Bigc();

	//Trade Method of BigA
	String  tradeOf_A(){
		return " , Trade from BIG_B = "+ bigb_object.getProduceB()+" , Price = " +bigb_object.getPrice()+" , Trade from BIG_C = "+bigc_object.getProduceC()+" , Price = "+bigc_object.getPrice();
	}//trade

	//Trade Method of BigB
	String  tradeOf_B(){
		return " , Trade from BIG_A = "+ biga_object.getProduceA()+" , Price = "+biga_object.getPrice()+" , Trade from BIG_C = "+bigc_object.getProduceC()+" , Price = "+bigc_object.getPrice();
	}//trade

	//Trade Method of BigC
	String  tradeOf_C(){
		return " , Trade from BIG_A = "+ biga_object.getProduceA()+" , Price = "+biga_object.getPrice()+" , Trade from BIG_B = "+bigb_object.getProduceB()+" , Price = "+bigb_object.getPrice();
	}//trade

}
