
abstract class AbsTest implements Testable {
    
}

class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Displaying from ConcreteTest subclass.");
    }
}


