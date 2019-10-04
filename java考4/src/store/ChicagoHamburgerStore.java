package store;

import IngredientFactory.*;
import hamburger.*;
//����һ������ĺ�������ChicagoHamburgerStore�̳�HamburgerStore������
public class ChicagoHamburgerStore extends HamburgerStore {
	 //ʵ�ָ���HamburgerStore�е�createHamburger��������equals�жϲ����뺺�������Ƿ�һ�������ض�Ӧ�ĺ������͡�
	Hamburger createHamburger(String type) {
		Hamburger hamburger = null;
		ChicagoHamburgerIngredientFactory chicagoHamburgerIngredientFactory = new ChicagoHamburgerIngredientFactory();
		if(type.equals("cheese")){
			hamburger = new CheeseHamburger(chicagoHamburgerIngredientFactory);
		}else if(type.equals("veggle")){
			hamburger= new VeggleHamburger(chicagoHamburgerIngredientFactory);
		}
		return hamburger;
	}
 
}