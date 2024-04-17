package CiroVitiello.U5W3D3.chainofresponsibility;

public class Colonel extends Officer{

    private General responsible;

    public Colonel( General responsible) {
        super(4000);
        this.responsible = responsible;
    }
}
