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
    }
}
