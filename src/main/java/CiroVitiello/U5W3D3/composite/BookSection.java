package CiroVitiello.U5W3D3.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class BookSection implements BookBody{

    private List<BookSubSection> subSections;
    private List<Page> pages;

    @Override
    public int countPages() {
        int  numOfSubSections = subSections.stream().map(bookSubSection -> bookSubSection.countPages()).mapToInt(num ->num).sum();
        int numOfPages = pages.size();
        return  numOfPages + numOfSubSections;
    }
    @Override
    public String print() {
        String secprint = this.subSections.stream().map(subSections -> subSections.print()).collect(Collectors.joining(", "));
        String pageprint =  this.pages.stream().map(page -> page.print()).collect(Collectors.joining(", "));
        return secprint + " | " + pageprint;
    }
}
