package Lesson3;


public class Product {
    private long id;
    private String name;
    private String consist;
    private String data;
    public Product(long id,String name,String consist,String data){
        this.id = id;
        this.name = name;
        this.consist = consist;
        this.data = data;
    }
    public void setId(long i){
        id = i;
    }
    public long getId(){
        return id;
    }
    public void setName(String n){
        name = n;

    }
    public String getName(){
        return name;
    }

    public String toString(){
        return name;
    }
    public void setConsist(String c){
        consist = c;
    }

    public String getConsist() {
        return consist;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

