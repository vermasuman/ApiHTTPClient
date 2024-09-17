package day34;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class ApiTestingDemo {
@Test
public void apitesting() throws ClientProtocolException, IOException {
	int count=1;
	while(count!=10) {
	String endPoint="https://jsonplaceholder.typicode.com/todos/"+count;
	HttpGet request = new HttpGet(endPoint);
	CloseableHttpClient client =HttpClients.createDefault();
	CloseableHttpResponse response =client.execute(request);
	HttpEntity entity = response.getEntity();
	String result = EntityUtils.toString(entity);
	System.out.println(result);
	count++;
	}
	}
}
