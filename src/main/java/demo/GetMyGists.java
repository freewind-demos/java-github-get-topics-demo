package demo;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.eclipse.egit.github.core.Gist;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.client.PageIterator;
import org.eclipse.egit.github.core.service.GistService;
import org.eclipse.egit.github.core.service.UserService;

import java.io.IOException;

public class GetMyGists {

    public static void main(String[] args) throws IOException {
        GitHubClient client = new GitHubClient();
        client.setOAuth2Token(Helper.readGithubToken());

        System.out.println("------------- my gists --------------");
        GistService service = new GistService(client);
        PageIterator<Gist> gists = service.pagePublicGists();
        while (gists.hasNext()) {
            for (Gist gist : gists.next()) {
                System.out.println("gist: " + gist.getId());
            }
        }
    }

}

