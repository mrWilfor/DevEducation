package HomeWork.HW_8_07_05_2020.daoObject;

import HomeWork.HW_8_07_05_2020.object.Book;

public class DaoBook implements IDaoBook {
    private static Book[] listOfBooks = new Book[0];

    @Override
    public long create(Book book) {
        if (book == null) {
            return -1;
        }

        if (listOfBooks.length == 0) {
            listOfBooks = new Book[1];
            listOfBooks[0] = book;
        } else {
            Book[] arrayOfBook = new Book[listOfBooks.length + 1];

            for (int i = 0; i < listOfBooks.length; i++) {
                arrayOfBook[i] = listOfBooks[i];
            }
            arrayOfBook[arrayOfBook.length - 1] = book;
            listOfBooks = arrayOfBook;
        }
        return book.getId();
    }

    @Override
    public Book[] readAll() {
        return listOfBooks;
    }

    @Override
    public Book[] readByAuthor(String author) {
        if (author == null || author.equals("")) {
            return new Book[0];
        }
        Book[] listOfBookByAuthor = new Book[0];

        for (int i = 0; i < listOfBooks.length; i++) {
            if (author.equals(listOfBooks[i].getAuthors())) {
                if (listOfBookByAuthor.length == 0) {
                    listOfBookByAuthor = new Book[1];
                    listOfBookByAuthor[0] = listOfBooks[i];
                } else {
                    Book[] newListOfBookByAuthor = new Book[listOfBookByAuthor.length + 1];

                    for (int j = 0; j < listOfBookByAuthor.length; j++) {
                        newListOfBookByAuthor[j] = listOfBookByAuthor[j];
                    }
                    newListOfBookByAuthor[newListOfBookByAuthor.length - 1] = listOfBooks[i];
                    listOfBookByAuthor = newListOfBookByAuthor;
                }
            }
        }
        return listOfBookByAuthor;
    }

    @Override
    public Book[] readByPublishingHouse(String publishingHouse) {
        if (publishingHouse == null || publishingHouse.equals("")) {
            return new Book[0];
        }
        Book[] listOfBookByPublishingHouse = new Book[0];

        for (int i = 0; i < listOfBooks.length; i++) {
            if (publishingHouse.equals(listOfBooks[i].getPublishingHouse())) {
                if (listOfBookByPublishingHouse.length == 0) {
                    listOfBookByPublishingHouse = new Book[1];
                    listOfBookByPublishingHouse[0] = listOfBooks[i];
                } else {
                    Book[] newListOfBookByPublishingHouse = new Book[listOfBookByPublishingHouse.length + 1];

                    for (int j = 0; j < listOfBookByPublishingHouse.length; j++) {
                        newListOfBookByPublishingHouse[j] = listOfBookByPublishingHouse[j];
                    }
                    newListOfBookByPublishingHouse[newListOfBookByPublishingHouse.length - 1] = listOfBooks[i];
                    listOfBookByPublishingHouse = newListOfBookByPublishingHouse;
                }
            }
        }
        return listOfBookByPublishingHouse;
    }

    @Override
    public Book[] readByAfterAgePublishing(long agePublishing) {
        if (agePublishing == 0) {
            return new Book[0];
        }
        Book[] listOfBookByAgePublishing = new Book[0];

        for (int i = 0; i < listOfBooks.length; i++) {
            if (agePublishing < listOfBooks[i].getAgePublishing()) {
                if (listOfBookByAgePublishing.length == 0) {
                    listOfBookByAgePublishing = new Book[1];
                    listOfBookByAgePublishing[0] = listOfBooks[i];
                } else {
                    Book[] newListOfBookByAgePublishing = new Book[listOfBookByAgePublishing.length + 1];

                    for (int j = 0; j < listOfBookByAgePublishing.length; j++) {
                        newListOfBookByAgePublishing[j] = listOfBookByAgePublishing[j];
                    }
                    newListOfBookByAgePublishing[newListOfBookByAgePublishing.length - 1] = listOfBooks[i];
                    listOfBookByAgePublishing = newListOfBookByAgePublishing;
                }
            }
        }
        return listOfBookByAgePublishing;
    }

    @Override
    public void remove(long id) {
        int index = -1;

        for (int i = 0; i < listOfBooks.length; i++) {
            if (id == listOfBooks[i].getId()) {
                index = i;
            }
        }

        if (index != -1) {
            Book[] newListOfBooks = new Book[listOfBooks.length - 1];

            for (int j = 0; j < index; j++) {
                newListOfBooks[j] = listOfBooks[j];
            }

            for (int h = index + 1; h < listOfBooks.length; h++) {
                newListOfBooks[h - 1] = listOfBooks[h];
            }
            listOfBooks = newListOfBooks;
        }
    }

    @Override
    public void update(Book book) {
        for (int i = 0; i < listOfBooks.length; i++) {
            if (book.getId() == listOfBooks[i].getId()) {
                listOfBooks[i] = book;
            }
        }
    }

    @Override
    public void clear() {
        listOfBooks = new Book[0];
    }
}
