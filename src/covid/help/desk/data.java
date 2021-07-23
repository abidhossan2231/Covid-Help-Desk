
package covid.help.desk;

public class data {
    private String name, number, pop;
    private byte[] picture1,picture2;
    
    public data(String name,String number, String pop,byte[]image1,byte[]image2){
        
        this.name = name;
        this.number = number;
        this.pop = pop;
        this.picture1 = image1;
        this.picture2 = image2;
    }
    public String getname(){
        return name;
    }
     public String getnumber(){
        return number;
    }
     public String getpop(){
        return pop;
    }
     public byte[]getImage1(){
        return picture1;
    }
     public byte[]getImage2(){
        return picture2;
    }
  
}
