import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostRequestsTest {
    @Test
    public void sendMultiplePostRequestWithDiffParameters(){
        RequestSpecification request = new CreatePostRequests().createUser("XYZ","Testing");
        Response response =request.post("https://reqres.in/api/users");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(),201);
        String ID=response.jsonPath().get("id");
        Assert.assertNotNull(ID,"ID is not null");

        RequestSpecification request1= new CreatePostRequests().createUser("abc@gmail.com","12345","Testing");
        Response response1= request1.post("https://reqres.in/api/users");
        System.out.println(response1.getBody().asString());
        System.out.println(response1.getStatusCode());
        Assert.assertEquals(response1.getStatusCode(),201);
        String ID1=response.jsonPath().get("id");
        Assert.assertNotNull(ID1,"ID is not null");

        RequestSpecification request2 = new CreatePostRequests().createUser("abc@gmail.com","12345","ravi","Testing");
        Response response2 =request2.post("https://reqres.in/api/users");
        System.out.println(response2.getBody().asString());
        System.out.println(response2.getStatusCode());
        Assert.assertEquals(response2.getStatusCode(),201);
        String ID2=response.jsonPath().get("id");
        Assert.assertNotNull(ID2,"ID is not null");



    }
}
