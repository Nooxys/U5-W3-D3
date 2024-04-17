package CiroVitiello.U5W3D3.chainofresponsibility;

import lombok.Setter;

@Setter
public abstract class Filter {
    private Filter nextFilter;

    public abstract void check(Officer officer);

    public void callNext(Officer officer){
        if(this.nextFilter != null) this.nextFilter.check(officer);
        else System.out.println("chain ended!");
    }


}
