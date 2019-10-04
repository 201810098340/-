package store;

import IngredientFactory.*;
import hamburger.*;
//定义一个具体的汉堡店类ChicagoHamburgerStore继承HamburgerStore汉堡店
public class NYHamburgerStore extends HamburgerStore {
	//实现父类HamburgerStore中的createHamburger方法，用equals判断参数与汉堡种类是否一样，返回对应的汉堡类型。
	Hamburger createHamburger(String type) {
		Hamburger hamburger = null;
		HamburgerIngredientFactory hamburgerIngredientFactory = new NYHamburgerIngredientFactory();
		if(type.equals("cheese")){
			hamburger = new CheeseHamburger(hamburgerIngredientFactory);
		}else if(type.equals("veggle")){
			hamburger = new VeggleHamburger(hamburgerIngredientFactory);
		}
		return hamburger;
	}
 
}