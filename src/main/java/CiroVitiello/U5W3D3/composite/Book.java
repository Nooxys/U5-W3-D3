package CiroVitiello.U5W3D3.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class Book implements BookBody {
    private List<BookSection> bookSections;
    private List<Author> authors;
    private double price;

    @Override
    public int countPages() {
        return bookSections.stream().map(bookSection -> bookSection.countPages()).mapToInt(num -> num).sum();
    }

    @Override
    public String print() {
        return this.bookSections.stream().map(bookSection -> bookSection.print()).collect(Collectors.joining(", "));
    }
}
