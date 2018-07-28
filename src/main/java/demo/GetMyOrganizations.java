package demo;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.OrganizationService;
import org.eclipse.egit.github.core.service.RepositoryService;

import java.io.IOException;

public class GetMyOrganizations {

    public static void main(String[] args) throws IOException {
        GitHubClient client = new GitHubClient();
        client.setOAuth2Token(Helper.readGithubToken());

        System.out.println("---------------- my public organizations --------------");

        OrganizationService service = new OrganizationService(client);
        for (User user : service.getOrganizations()) {
            System.out.println(user.getLogin());
        }
    }

}

