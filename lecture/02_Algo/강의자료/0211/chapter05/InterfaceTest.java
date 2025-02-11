package chapter05;


/**
 * interface 
 * - 상수와 추상 메서드로만 구성되어 있다. 
 *   => 딱시 선언하지 않아도 속성은 public static final로 선언이 되고 
 *      메서드는 public abstract으로 선언된다.
 *       
 * - 다중 상속이 됨.   => 다형성을 위해 다중 상속이 됨.  
 * 선언] 
 *    [public] interface 인터페이스명 [extends super인터페이스명1, ....]{ }
 *    
 * 구현]
 *    [modifiers] class 클래스명 [extends super클래스]
 *      					   [implements super인터페이스명1, ....]{ 
 *      
 *    }
 *    
 * 추상 메서드 :
 * - 메서드의 선언부만 작성하고 구현을 하지 않음 
 * - sub class(상속 받는 클래스, 자식 클래스)에서 추상 메서드를 반드시 Override 하도록 위임 
 *   => sub class에서 추상 메서드를 Override하지 않으면 컴파일 에러 발생     
 *    
 */

interface Flyer extends Cloneable{
	void fly();
}

class Human{
	String name;
	public void start() {
		System.out.println("걸어 봅시다.");
	}
}

class SuperMan extends Human implements Flyer{
	public SuperMan(String name) {
		this.name = name;
	}
	public void fly() {
		System.out.println("하늘을 날아서 지구를 구해야지");
	}
	public void stop() {
		System.out.println("그만 움직이고 쉬어야징!!");
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
	}
}





