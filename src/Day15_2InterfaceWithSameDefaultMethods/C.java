package Day15_2InterfaceWithSameDefaultMethods;

public class C implements A,B{

    @Override
    public void fun() {
        A.super.fun();
    }
}
