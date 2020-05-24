package practice.practic_11_22_05_2020.book.interfaceBook;

import practice.practic_11_22_05_2020.book.Reader;

public interface Library {
    Reader[] getListOfReader();

    void addReader(Reader reader);

    void deleteReader(Reader reader);


}
