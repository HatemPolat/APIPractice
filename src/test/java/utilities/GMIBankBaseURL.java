package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class GMIBankBaseURL {

    protected RequestSpecification spec01;
//bunu yeni atiyorum.
    @Before
    public void setUp(){

        spec01 = new RequestSpecBuilder().setBaseUri("https://www.gmibank.com/api/").build();
    }
}