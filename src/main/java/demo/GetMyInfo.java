package demo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.UserService;

import java.io.IOException;

public class GetMyInfo {

    public static void main(String[] args) throws IOException {
        GitHubClient client = new GitHubClient();
        client.setOAuth2Token(Helper.readGithubToken());

        UserService userService = new UserService(client);
        User user = userService.getUser();

        System.out.println("My login name: " + user.getLogin());
        System.out.println("------------- details ----------------");
        System.out.println(new ReflectionToStringBuilder(user, ToStringStyle.MULTI_LINE_STYLE).build());
    }

}

