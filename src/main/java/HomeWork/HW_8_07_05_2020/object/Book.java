package HomeWork.HW_8_07_05_2020.object;

import java.util.StringJoiner;

public class Book {
    private long id;
    private String name;
    private String authors;
    private String publishingHouse;
    private long agePublishing;
    private long quantityPage;
    private long prise;
    private String binding;

    public Book() {

    }

    public Book(long id, String name, String authors, String publishingHouse, long agePublishing, long quantityPage, long prise, String binding) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.agePublishing = agePublishing;
        this.quantityPage = quantityPage;
        this.prise = prise;
        this.binding = binding;
    }

    public Book(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.authors =b.authors;
        this.publishingHouse = b.publishingHouse;
        this.agePublishing = b.agePublishing;
        this.quantityPage = b.quantityPage;
        this.prise = b.prise;
        this.binding = b.binding;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public long getAgePublishing() {
        return agePublishing;
    }

    public void setAgePublishing(long agePublishing) {
        this.agePublishing = agePublishing;
    }

    public long getQuantityPage() {
        return quantityPage;
    }

    public void setQuantityPage(long quantityPage) {
        this.quantityPage = quantityPage;
    }

    public long getPrise() {
        return prise;
    }

    public void setPrise(long prise) {
        this.prise = prise;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        else if (o == null) {
            return false;
        }
        else if (o instanceof Book) {
            return this.id == ((Book) o).id && this.name.equals(((Book) o).name) &&
                    this.authors.equals(((Book) o).authors) && this.publishingHouse.equals(((Book) o).publishingHouse) &&
                    this.agePublishing == ((Book) o).agePublishing && this.quantityPage == ((Book) o).quantityPage &&
                    this.prise == ((Book) o).prise && this.binding.equals(((Book) o).binding);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31 * id + (name != null ? name.hashCode() : 0) + (authors != null ? authors.hashCode() : 0) +
                (publishingHouse != null ? publishingHouse.hashCode() : 0) + agePublishing + quantityPage + prise +
                (binding != null ? binding.hashCode() : 0));
    }

    @Override
    public String toString() {
        StringJoiner string = new StringJoiner(", ", "[", "]");
        string.add("id=".concat(Long.toString(id)))
                .add("name=".concat(name))
                .add("authors=".concat(authors))
                .add("publishingHouse=".concat(publishingHouse))
                .add("agePublishing=".concat(Long.toString(agePublishing)))
                .add("quantityPage=".concat(Long.toString(quantityPage)))
                .add("prise=".concat(Long.toString(prise)))
                .add("binding=".concat(binding));
        String result = "HomeWork.HW_8_07_05_2020.object.Book@".concat(Integer.toString(hashCode()));
        result = result.concat(string.toString());
        return result;
    }

    public static class Builder {
        private long id;
        private String name;
        private String authors;
        private String publishingHouse;
        private long agePublishing;
        private long quantityPage;
        private long prise;
        private String binding;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder authors(String authors) {
            this.authors = authors;
            return this;
        }

        public Builder publishingHouse(String publishingHouse) {
            this.publishingHouse = publishingHouse;
            return this;
        }

        public Builder agePublishing(long agePublishing) {
            this.agePublishing = agePublishing;
            return this;
        }

        public Builder quantityPage(long quantityPage) {
            this.quantityPage = quantityPage;
            return this;
        }

        public Builder prise(long prise) {
            this.prise = prise;
            return this;
        }

        public Builder binding(String binding) {
            this.binding = binding;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
