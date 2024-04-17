package CiroVitiello.U5W3D3.chainofresponsibility;

public class LieutenantFilter extends Filter{
    @Override
    public void check(Officer officer) {
        if(officer.getSalary() >= 1000) callNext(officer);
        else System.out.println("You are a civil!");

    }
}
