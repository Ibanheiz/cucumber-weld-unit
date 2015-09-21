package com.ibanheiz.conhecimento;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.ibanheiz.parameters.NotaFiscalMock;
import com.ibanheiz.utils.TestUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Singleton
public class ConhecimentoSteps {
	
	@Inject
	private ComposicaoConhecimento composicaoConhecimento;

	@Given("^uma nova composição de CT-e$")
	public void inicadaComposicaoCte() {
		composicaoConhecimento.iniciar();
	}

	@When("^um usuário entra com duas notas fiscais com os mesmos parâmetros:")
	public void composicaoDeDuasNotasFiscais(List<NotaFiscalMock> listaNotafiscal) {
		for (NotaFiscalMock notaFiscal : listaNotafiscal) {
			composicaoConhecimento.adicionarNotaFiscalNaComposicao(TestUtils.converterMockNotaFiscal(notaFiscal));
		}
	}

	@Then("^somente (\\d*) pré-conhecimento deve ser composto$")
	public void somenteUmPreConhecimentoComposto(@Named("quantidade") int quantidade) {
		assertEquals(quantidade, composicaoConhecimento.getListaConhecimento().size());
	}
}
		