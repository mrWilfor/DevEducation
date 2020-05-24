package practice.practic_11_22_05_2020.book;

public class Library implements practice.practic_11_22_05_2020.book.interfaceBook.Library {
    Reader[] listOfReader;

    public Library() {

    }

    public Library(Reader... readers) {
        this.listOfReader = readers;
    }

    @Override
    public Reader[] getListOfReader() {
        return listOfReader;
    }

    @Override
    public void addReader(Reader reader) {
        if (listOfReader == null) {
            listOfReader = new Reader[1];
            listOfReader[0] = reader;
        } else {
            Reader[] newListOfReader = new Reader[listOfReader.length + 1];

            for (int i = 0; i < listOfReader.length; i++) {
                newListOfReader[i] = listOfReader[i];
            }

            newListOfReader[newListOfReader.length - 1] = reader;
            listOfReader = newListOfReader;
        }
    }

    @Override
    public void deleteReader(Reader reader) {
        int index = -1;

        if (listOfReader != null) {
            for (int i = 0; i < listOfReader.length; i++) {
                if (listOfReader[i].equals(reader)) {
                    index = i;
                }
            }

            if (index != -1) {
                Reader[] newListOfReader = new Reader[listOfReader.length - 1];

                for (int i = 0; i < index; i++) {
                    newListOfReader[i] = listOfReader[i];
                }

                for (int i = index + 1; i < listOfReader.length; i++) {
                    newListOfReader[i - 1] = listOfReader[i];
                }
                listOfReader = newListOfReader;
            }
        }
    }
}
