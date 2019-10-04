package IngredientFactory;

import Ingredient.*;
//���庺��ԭ�Ϲ����ӿ�
public interface HamburgerIngredientFactory {
	//Ϊ�ýӿ��������󷽷�
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
    public Veggie createVeggie() ;	
}
