package hamburger;

import Ingredient.*;
//������󺺱�����Ϊ����
public abstract class Hamburger {
	 
	String name;	//����
	Dough dough;	//��������
	Sauce sauce;	//��������
	Cheese cheese;  //��������
	Veggie veggie;  //�߲�����
	//Ϊ����������һ�����󷽷�
	public abstract void prepare();
 //�������ķ���
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