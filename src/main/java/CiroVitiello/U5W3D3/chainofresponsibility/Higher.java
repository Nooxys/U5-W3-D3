package CiroVitiello.U5W3D3.chainofresponsibility;

public class Higher extends Officer{
    private Colonel responsible;

    public Higher( Colonel responsible) {
        super(3000);
        this.responsible = responsible;
    }
}
