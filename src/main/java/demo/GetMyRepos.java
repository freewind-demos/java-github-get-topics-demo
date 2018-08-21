package demo;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.RepositoryService;

import java.io.IOException;

public class GetMyRepos {

    public static void main(String[] args) throws IOException {
        GitHubClient client = new GitHubClient();
        client.setOAuth2Token(Helper.readGithubToken());

        System.out.println("---------------- my public repos --------------");
        System.out.println("(this request may be slow since it will get a lot of data if you have a lot of repos)");

        RepositoryService service = new RepositoryService(client);
        for (Repository repo : service.getRepositories()) {
            System.out.println(repo.getOwner().getLogin() + " / " + repo.getName());
        }
    }

}

