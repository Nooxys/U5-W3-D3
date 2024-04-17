package CiroVitiello.U5W3D3.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class BookSubSection implements BookBody{
    private List<Page> pages;

    @Override
    public int countPages() {
        return this.pages.size();
    }

    @Override
    public String print() {
        return this.pages.stream().map(page -> page.print()).collect(Collectors.joining(", "));
    }
}
