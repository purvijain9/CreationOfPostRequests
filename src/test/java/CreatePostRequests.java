
import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import lombok.Setter;
import static io.restassured.RestAssured.given;

@Getter
@Setter
public class CreatePostRequests {
    private String name;
    private String email;
    private String  password;
    private  String job;

    public RequestSpecification createUser(String name, String job)
    {
        RequestSpecification request = given()
                .body("{\n" +
                        "    \"name\":"+name+ ",\n" +
                        "    \"job\":"+job +
                        "\n}");
        System.out.println("{\n" + "\"name\":"+name+ ",\n" + "\"job\":"+job + "\n}");
        return request;

    }

    public RequestSpecification createUser(String email,String password,String job)
    {
        RequestSpecification request = given().body("{\n" +
                "    \"email\":" + email +",\n" +
                "    \"password\":"+password+"\n" +
                "    \"job\":"+job+ "\n}");
        System.out.println("{\n" +
                "    \"email\":" + email +",\n" +
                "    \"password\":"+password+"\n" +
                "    \"job\":"+job+ "\n}");
        return request;
    }

    public RequestSpecification createUser(String email,String password,String name,String job)
    {
        RequestSpecification request = given().body("{\n" +
                "    \"email\":" + email +",\n" +
                "    \"password\":" + password +",\n" +
                "    \"name\":" + name +",\n" +
                "    \"job\":"+job+ "\n}");
        System.out.println("{\n" +
                "    \"email\":" + email +",\n" +
                "    \"password\":" + password +",\n" +
                "    \"name\":" + name +",\n" +
                "    \"job\":"+job+ "\n}");
        return request;
    }
}

