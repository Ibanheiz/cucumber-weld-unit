package com.ibanheiz.conhecimento;

import java.util.ArrayList;
import java.util.List;

import com.ibanheiz.notafiscal.NotaFiscal;

public class ComposicaoConhecimento {

	private List<Conhecimento> listaConhecimento;
	
	public ComposicaoConhecimento() {
	}

	public void iniciar() {
		listaConhecimento = new ArrayList<Conhecimento>();
		System.out.println("Iniciando a composição automática de CT-e");
	}

	public void adicionarNotaFiscalNaComposicao(NotaFiscal notaFiscal) {
		if (listaConhecimento.isEmpty()) {
			criarNovoConhecimento(notaFiscal);
		} else {
			for (Conhecimento conhecimento : listaConhecimento) {
				NotaFiscal notaFiscalDoCte = conhecimento.getPrimeiraNotaFiscal();
				if (agruparNotasFiscais(notaFiscal, notaFiscalDoCte)) {
					conhecimento.adicionarNotaFiscal(notaFiscal);
					return;
				} else {
					criarNovoConhecimento(notaFiscal);
					return;
				}
			}
		}
	}

	private boolean agruparNotasFiscais(NotaFiscal notaFiscal, NotaFiscal notaFiscalDoCte) {
		return (notaFiscal.equals(notaFiscalDoCte));
	}

	private Conhecimento criarNovoConhecimento(NotaFiscal notaFiscal) {
		Conhecimento conhecimento = new Conhecimento();
		conhecimento.adicionarNotaFiscal(notaFiscal);
		listaConhecimento.add(conhecimento);
		return conhecimento;
	}

	/**
	 * @return the listaConhecimento
	 */
	public List<Conhecimento> getListaConhecimento() {
		return listaConhecimento;
	}

}
