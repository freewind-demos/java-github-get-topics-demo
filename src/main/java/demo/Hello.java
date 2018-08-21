package demo;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;

import java.io.IOException;

public class Hello {

    private static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) throws IOException {
        Request request = new Request.Builder()
                .url("https://api.github.com/repos/freewind-demos/java-github-get-topics-demo/topics")
                .header("Accept", "application/vnd.github.mercy-preview+json")
                .build();

        Response response = client.newCall(request).execute();
        String body = response.body().string();
        System.out.println(body);
    }

}
