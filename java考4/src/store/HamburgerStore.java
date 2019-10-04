package store;

import hamburger.Hamburger;
//定义一个抽象汉堡店类作为父类
public abstract class HamburgerStore {
	 //获取汉堡
	public final Hamburger orderHamburger(String type){
		//创建汉堡对象,调用相对应的方法,最终返回实例化汉堡 
		Hamburger hamburger = createHamburger(type);
		hamburger.prepare();
		hamburger.bake();
		hamburger.cut();
		hamburger.box();
		return hamburger;		
	}
	 //定义抽象汉堡型的制作汉堡方法，参数为汉堡种类
	abstract Hamburger createHamburger(String type);
}