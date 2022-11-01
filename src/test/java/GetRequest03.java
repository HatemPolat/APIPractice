import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class GetRequest03 {

    /* Matchers ile dataları doğrulayınız
             "id": 5,
            "email": "charles.morris@reqres.in",
            "first_name": "Charles",
            "last_name": "Morris",
            "avatar": "https://reqres.in/img/faces/5-image.jpg"
     */
    @Test
    public void  test03(){
        String url = "https://reqres.in/img/faces/5-image.jpg";

        Response response =given().when().get(url);
        response.prettyPrint();












    }
}
