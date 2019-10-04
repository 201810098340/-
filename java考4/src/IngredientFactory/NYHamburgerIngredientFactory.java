package IngredientFactory;
import Ingredient.*;
//��������ԭ�Ϲ���(NYHamburgerIngredientFactory)��ʵ��ԭ�Ϲ����ӿ�
public class NYHamburgerIngredientFactory implements HamburgerIngredientFactory {
	 //ʵ��ԭ�Ͻӿڶ���ķ���,���������Ӧ��ԭ��
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
