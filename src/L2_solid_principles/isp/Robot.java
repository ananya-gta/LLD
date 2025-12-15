package L2_solid_principles.isp;

/*
public class Robot implements Worker{
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
    @Override
    public void eat() {
        // Not applicable for Robot
        throw new UnsupportedOperationException("Robots do not eat");
    }
}
*/


public class Robot implements Workable{
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}
