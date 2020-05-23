package practice.practic_11_22_05_2020.Book.Interface;

import practice.practic_11_22_05_2020.Book.Reader;

public interface Library {
    Reader[] getListOfReader();

    void addReader(Reader reader);

    void deleteReader(Reader reader);


}
