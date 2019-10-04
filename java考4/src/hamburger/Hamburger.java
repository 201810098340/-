package hamburger;

import Ingredient.*;
//定义抽象汉堡类作为父类
public abstract class Hamburger {
	 
	String name;	//名称
	Dough dough;	//面团类型
	Sauce sauce;	//酱料类型
	Cheese cheese;  //奶酪类型
	Veggie veggie;  //蔬菜类型
	//为抽象类声明一个抽象方法
	public abstract void prepare();
 //定义具体的方法
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut() {
		System.out.println("Cutting the hamburger into diagonal slices");
	}
 
	public void box() {
		System.out.println("Hamburger in offical HamburgerStrore box");
	}
	
	public String getName(){
		return name;
	}
}