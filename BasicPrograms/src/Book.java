public class Book{
    private String bookName;
    int bookPrice;
    private String authorName;
    
    public String getName(){
         return bookName;
      }
    public int gebookPrice(){
        return bookPrice;
    }
    public String getauthorName(){
        return authorName;
    }
    
    public void setName(String Name){
        bookName=Name;
        System.out.println("Book Name:"+bookName);
    }
    public void setbookPrice(int Price){
        bookPrice=Price;
        System.out.println("Book Price:"+bookPrice);
    }
    public void setauthorName(String Auname){
        authorName=Auname;
        System.out.println("Author name:"+authorName);
    }
}