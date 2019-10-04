package IngredientFactory;

import Ingredient.*;
//��������ԭ�Ϲ���(ChicagoHamburgerIngredientFactory)��ʵ��ԭ�Ϲ����ӿ�
public class ChicagoHamburgerIngredientFactory implements HamburgerIngredientFactory {
	 //ʵ��ԭ�Ͻӿڶ���ķ���,���������Ӧ��ԭ��
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
