package Interface;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nissan n = new Nissan();
		n.drive();
		n.turn();
		n.music();
		ICar c = new Nissan();
		c.drive();
		//c.music();

	}

}
