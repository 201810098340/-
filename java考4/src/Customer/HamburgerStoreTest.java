package Customer;
import hamburger.*;
import store.*;
public class HamburgerStoreTest {	 
	public static void main(String[] args) {
		//ʵ���������겢Ϊ�䴴������hamburgerStore 
		HamburgerStore hamburgerStore = new NYHamburgerStore();
		//Ϊ��������Ӻ�������hamburger1
		Hamburger hamburger = hamburgerStore.orderHamburger("cheese");
		System.out.println("---");	
		hamburger = hamburgerStore.orderHamburger("veggle");
		System.out.println("---");		
		hamburgerStore = new ChicagoHamburgerStore();
		hamburger = hamburgerStore.orderHamburger("cheese");
		System.out.println("---");		
		hamburger = hamburgerStore.orderHamburger("veggle");
		System.out.println("---");		
	}	
}
