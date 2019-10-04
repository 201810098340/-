package IngredientFactory;

import Ingredient.*;
//定义汉堡原料工厂接口
public interface HamburgerIngredientFactory {
	//为该接口声明抽象方法
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
    public Veggie createVeggie() ;	
}
