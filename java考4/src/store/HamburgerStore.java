package store;

import hamburger.Hamburger;
//����һ�����󺺱�������Ϊ����
public abstract class HamburgerStore {
	 //��ȡ����
	public final Hamburger orderHamburger(String type){
		//������������,�������Ӧ�ķ���,���շ���ʵ�������� 
		Hamburger hamburger = createHamburger(type);
		hamburger.prepare();
		hamburger.bake();
		hamburger.cut();
		hamburger.box();
		return hamburger;		
	}
	 //������󺺱��͵�������������������Ϊ��������
	abstract Hamburger createHamburger(String type);
}