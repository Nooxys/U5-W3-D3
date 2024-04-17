package CiroVitiello.U5W3D3.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Page page1 = new Page("insane1");
        Page page2 = new Page("insane2");
        Page page3 = new Page("insane3");
        Page page4 = new Page("insane4");
        Page page5 = new Page("insane5");
        Page page6 = new Page("insane6");
        Page page7 = new Page("insane7");
        Page page8 = new Page("insane8");
        Page page9 = new Page("insane9");
        Page page10= new Page("insane10");
        Page page11 = new Page("insane11");
        Page page12 = new Page("insane12");
        Page page13 = new Page("insane13");
        Page page14 = new Page("insane14");


        List<Page> pList = new ArrayList<>();
        List<Page> pList2 = new ArrayList<>();
        List<Page> pList3 = new ArrayList<>();
        List<Page> pList4 = new ArrayList<>();
        pList.add(page1);
        pList.add(page2);
        pList.add(page3);
        pList.add(page4);
        pList2.add(page5);
        pList2.add(page6);
        pList2.add(page7);
        pList2.add(page8);
        pList3.add(page9);
        pList3.add(page10);
        pList3.add(page11);
        pList3.add(page12);
        pList4.add(page13);
        pList4.add(page14);



        BookSubSection sub1 = new BookSubSection(pList);
        BookSubSection sub2 = new BookSubSection(pList2);
        BookSubSection sub3 = new BookSubSection(pList3);

        List<BookSubSection> subSections = new ArrayList<>();
        subSections.add(sub1);
        subSections.add(sub2);
        subSections.add(sub3);

        BookSection sec1 = new BookSection(subSections, pList4);

        List<BookSection> sections = new ArrayList<>();
        sections.add(sec1);

        Author auth1 = new Author("kayn blue", 25);
        Author auth2 = new Author("kayn rosso", 29);

        List<Author> authors = new ArrayList<>();

        authors.add(auth1);
        authors.add(auth2);

        Book book = new Book(sections, authors, 29.99);
        System.out.println("EXERCISE 2");
        System.out.println(book.countPages());
        System.out.println(book.print());
    }
}
