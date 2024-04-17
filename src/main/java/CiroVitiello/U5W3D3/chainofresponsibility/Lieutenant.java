package CiroVitiello.U5W3D3.chainofresponsibility;

public class Lieutenant extends Officer{

    private Captain responsible;

    public Lieutenant( Captain responsible) {
        super(1000);
        this.responsible = responsible;
    }
}
