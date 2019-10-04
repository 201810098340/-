package hamburger;

import IngredientFactory.*;
//��������CheeseHamburger�̳�Hamburger
public class CheeseHamburger extends Hamburger {
 
	private HamburgerIngredientFactory hamburgerIngredientFactory;//��������ԭ���Ϲ����ӿڱ��� 
	public CheeseHamburger(HamburgerIngredientFactory hamburgerIngredientFactory){//��д���췽��Ϊ�ñ������ݲ���
		this.hamburgerIngredientFactory = hamburgerIngredientFactory;
	}
	//ʵ�ָýӿڱ�������
	public void prepare(){
		dough = hamburgerIngredientFactory.createDough();
		sauce = hamburgerIngredientFactory.createSauce();
		cheese =hamburgerIngredientFactory.createCheese();
		veggie=hamburgerIngredientFactory.createVeggie();
	}
	//�����µ�cut������������е�cut����
	public void cut(){
		System.out.println("cut it into Cheesehamburger slices");
	}
}