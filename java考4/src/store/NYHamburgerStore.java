package store;

import IngredientFactory.*;
import hamburger.*;
//����һ������ĺ�������ChicagoHamburgerStore�̳�HamburgerStore������
public class NYHamburgerStore extends HamburgerStore {
	//ʵ�ָ���HamburgerStore�е�createHamburger��������equals�жϲ����뺺�������Ƿ�һ�������ض�Ӧ�ĺ������͡�
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