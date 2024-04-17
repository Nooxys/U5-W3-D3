package CiroVitiello.U5W3D3.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Page implements BookBody{
    private String cont;

    @Override
    public int countPages() {
        return 1;
    }

    @Override
    public String print() {
        return this.cont;
    }
}
