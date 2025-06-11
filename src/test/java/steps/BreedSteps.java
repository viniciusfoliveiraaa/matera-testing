package steps;

import constants.Constants;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.response.Response;
import org.junit.Assert;
import requests.BreedRequest;

public class BreedSteps {

    private Response response;

    @Dado("que eu esteja com a requisicao")
    public void queEuEstejaComARequisicao() {
        response = BreedRequest.get(Constants.LIMIT_VALID);
        System.out.println(response.asString());
    }

    @Dado("que eu esteja com a requisicao com um valor invalido")
    public void queEuEstejaComARequisicaoComUmValorInvalido() {
        response = BreedRequest.getWithInvalidValue();
    }

    @Entao("validar o status code igual a {int}")
    public void validarOStatusCodeIgualA(int statusCode) {
        Assert.assertEquals(statusCode, response.statusCode());
    }
}
