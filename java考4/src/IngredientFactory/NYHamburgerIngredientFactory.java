package IngredientFactory;
import Ingredient.*;
//定义具体的原料工厂(NYHamburgerIngredientFactory)并实现原料工厂接口
public class NYHamburgerIngredientFactory implements HamburgerIngredientFactory {
	 //实现原料接口定义的方法,并返回相对应的原料
	public Cheese createCheese() {
		return new NYCheese();
	}
 
	public Dough createDough() {
		return new NYDough();
	}
 
	public Sauce createSauce() {
		return new NYSauce();
	}
    public Veggie createVeggie() {
    	return new Eggplant();
	}
}
