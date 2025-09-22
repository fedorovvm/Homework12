public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Лондон", "Джэк");
        Author author2 = new Author("Шолохов", "Михаил");
        Book book1 = new Book("Мартин Иден", author1, 1909);
        Book book2 = new Book("Судьба человека", author2, 1956);
        System.out.println("Книга 1 : " + book1.getBookTitle()+". Автор 1: "+author1.getSurName()+" "+author1.getName()+". Год публикации "+ book1.getYearPublication()+".");
        System.out.println("Книга 2 : " + book2.getBookTitle()+". Автор 2: "+author2.getSurName()+" "+author2.getName()+". Год публикации "+ book2.getYearPublication()+".");
        book1.setYearPublication(2020);
        System.out.println("Книга 1 : " + book1.getBookTitle()+". Автор 1: "+author1.getSurName()+" "+author1.getName()+". Год переиздания "+ book1.getYearPublication()+".");
        System.out.println("Книга 1 : "+book1);
        System.out.println("Книга 2 : "+book2);
        System.out.println("У обеих книг один автор = " + author1.equals(author2));
        System.out.println("Обе книги одинаковые = " + book1.equals(book2));
        System.out.println("Хэш-код автора 1 = " + author1.hashCode());
        System.out.println("Хэш-код автора 2 = " + author2.hashCode());
        System.out.println("Хэш-код книги 1 = " + book1.hashCode());
        System.out.println("Хэш-код книги 2 = " + book2.hashCode());
    }
}
