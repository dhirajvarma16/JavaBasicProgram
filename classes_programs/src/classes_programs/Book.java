public class Book{
    private String bookName;
    private int bookPrice;
    private String authorName;
    
    public String getBookName(){
        return bookName;
    }
    
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    
    public int getBookPrice(){
        return bookPrice;
    }
    
    public void setBookPrice(int bookPrice){
        this.bookPrice=bookPrice;
    }
     public String getAuthorName(){
        return authorName;
    }
    
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public Book(String bookName,int bookPrice,String authorName){
        this.bookName=bookName;
        this.bookPrice=bookPrice;
        this.authorName=authorName;
    }
    public void display(){
        System.out.println("Book Name :" + bookName);
        System.out.println("Book Price :" +bookPrice);
        System.out.println("Author Name :" + authorName);
        
    } 
    }