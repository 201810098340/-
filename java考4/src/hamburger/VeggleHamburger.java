package hamburger;
import IngredientFactory.*;
//��������VeggleHamburger�̳�Hamburger
public class VeggleHamburger extends Hamburger { 
	private HamburgerIngredientFactory hamburgerIngredientFactory;//��������ԭ���Ϲ����ӿڱ���
	public VeggleHamburger(HamburgerIngredientFactory hamburgerIngredientFactory){//��д���췽��Ϊ�ñ������ݲ���
		this.hamburgerIngredientFactory = hamburgerIngredientFactory;
	}
	//ʵ�ָýӿڱ�������
	public void prepare(){
		dough = hamburgerIngredientFactory.createDough();
		sauce = hamburgerIngredientFactory.createSauce();
		cheese =hamburgerIngredientFactory.createCheese();	
	}
	//�����µ�cut������������е�cut����
	public void cut(){
		System.out.println("cut it into VeggleHamburger slices");
	}
}
