package com.ibanheiz.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ibanheiz.notafiscal.NotaFiscal;
import com.ibanheiz.parameters.NotaFiscalMock;

public class TestUtils {

	public static NotaFiscal converterMockNotaFiscal(NotaFiscalMock notaFiscalMock) {
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.setNumero(notaFiscalMock.getNumero());
		notaFiscal.setCliente(notaFiscalMock.getCliente());
		notaFiscal.setDestinatario(notaFiscalMock.getDestinatario());
		try {
			notaFiscal.setDataEntrega((Date) new SimpleDateFormat("dd/MM/yyyy").parse(notaFiscalMock.getDataEntrega()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return notaFiscal;
	}

}
