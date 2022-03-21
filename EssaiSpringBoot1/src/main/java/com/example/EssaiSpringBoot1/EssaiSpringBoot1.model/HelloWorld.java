package EssaiSpringBoot1.EssaiSpringBoot1.model;

public class HelloWorld{
    //public String value;
    private String value = "Hello World!";

    //HelloWorld value = new HelloWorld("Hello World!");

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    //public String toString(){
       // return value;
    //}
    @Override
    public String toString(){
        return value;
    }
}