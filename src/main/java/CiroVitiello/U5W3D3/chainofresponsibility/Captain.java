package CiroVitiello.U5W3D3.chainofresponsibility;

public class Captain extends Officer{
private Higher responsible;

    public Captain( Higher responsible) {
        super(2000);
        this.responsible = responsible;
    }
}
