import java.util.Objects;
public class Author {
    private String surName;
    private String name;
    public Author(String surName, String name) {
        this.surName = surName;
        this.name = name;
    }
    public String getSurName() {
        return this.surName;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return "Автор: " + this.surName+ " " + this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(surName, author.surName) &&
                Objects.equals(name, author.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(surName, name);
    }
}
