package io.github.dgautier.github.api.client;

import io.github.dgautier.github.api.client.api.ReposApi;
import io.github.dgautier.github.api.client.model.FullRepository;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
public class ReposApiTest {

    @RestClient
    @Inject
    ReposApi reposApi;

    @Test
    public void getRepository(){
        String owner = "dgautier";
        String repositoryName = "github-quarkus-client";
        FullRepository repository = reposApi.reposGet(owner, repositoryName);
        assertThat(repository).isNotNull();
    }
}
