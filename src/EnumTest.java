public class EnumTest {
    public static void main(String[] args) {
        RequestBodyType requestBodyType=RequestBodyType.FORM_DATA;
        if (requestBodyType == RequestBodyType.FORM_DATA){
            System.out.println("hey");
        }
        System.out.println(requestBodyType.toString());
        String s= "{\"Accept\":\"dfgdg\",\"Accept-Language\":\"dfgfg\"}";
    }
}
enum RequestBodyType{
    NONE("none"),
    FORM_DATA("form-data"),
    FORM_ENCODED("x-www-form-urlencoded"),
    RAW("raw"),
    BASIC_AUTH("Basic Auth");
    public final String label;
    private RequestBodyType(String label){
        this.label=label;
    }
}