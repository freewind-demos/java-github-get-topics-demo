package demo;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;

import java.io.IOException;

public class GetOrgRepos {

    public static void main(String[] args) throws IOException {
        System.out.println("---------- repos of org: github ----------");
        RepositoryService service = new RepositoryService();
        for (Repository repo : service.getRepositories("github")) {
            System.out.println(repo.getOwner().getLogin() + " / " + repo.getName());
        }
    }

}

