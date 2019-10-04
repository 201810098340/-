package IngredientFactory;

import Ingredient.*;
//定义具体的原料工厂(ChicagoHamburgerIngredientFactory)并实现原料工厂接口
public class ChicagoHamburgerIngredientFactory implements HamburgerIngredientFactory {
	 //实现原料接口定义的方法,并返回相对应的原料
	public Cheese createCheese() {
		return new ChicagoCheese();
	}
 
	public Dough createDough() {
		return new ChicagoDough();
	}
 
	public Sauce createSauce() {
		return new ChicagoSauce();
	}
	public Veggie createVeggie() {
		return new BlackOlives();
	}
 
}
