package com.ibanheiz.conhecimento;

import java.util.ArrayList;
import java.util.List;

import com.ibanheiz.notafiscal.NotaFiscal;

public class Conhecimento {

	private int numero;
	private List<NotaFiscal> listaNotaFiscal;
	
	public Conhecimento() {
		listaNotaFiscal = new ArrayList<NotaFiscal>();
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the listaNotaFiscal
	 */
	public List<NotaFiscal> getListaNotaFiscal() {
		return listaNotaFiscal;
	}

	/**
	 * @param listaNotaFiscal the listaNotaFiscal to set
	 */
	public void setListaNotaFiscal(List<NotaFiscal> listaNotaFiscal) {
		this.listaNotaFiscal = listaNotaFiscal;
	}

	public void adicionarNotaFiscal(NotaFiscal notaFiscal) {
		listaNotaFiscal.add(notaFiscal);
	}

	public NotaFiscal getPrimeiraNotaFiscal() throws NullPointerException{
		return listaNotaFiscal.get(0);
	}

}
