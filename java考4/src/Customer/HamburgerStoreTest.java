package Customer;
import hamburger.*;
import store.*;
public class HamburgerStoreTest {	 
	public static void main(String[] args) {
		//实例化汉堡店并为其创建对象hamburgerStore 
		HamburgerStore hamburgerStore = new NYHamburgerStore();
		//为汉堡店添加汉堡对象hamburger1
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
