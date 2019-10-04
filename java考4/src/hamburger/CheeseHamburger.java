package hamburger;

import IngredientFactory.*;
//定义子类CheeseHamburger继承Hamburger
public class CheeseHamburger extends Hamburger {
 
	private HamburgerIngredientFactory hamburgerIngredientFactory;//声明汉堡原材料工厂接口变量 
	public CheeseHamburger(HamburgerIngredientFactory hamburgerIngredientFactory){//编写构造方法为该变量传递参数
		this.hamburgerIngredientFactory = hamburgerIngredientFactory;
	}
	//实现该接口变量方法
	public void prepare(){
		dough = hamburgerIngredientFactory.createDough();
		sauce = hamburgerIngredientFactory.createSauce();
		cheese =hamburgerIngredientFactory.createCheese();
		veggie=hamburgerIngredientFactory.createVeggie();
	}
	//创建新的cut方法替代父类中的cut方法
	public void cut(){
		System.out.println("cut it into Cheesehamburger slices");
	}
}