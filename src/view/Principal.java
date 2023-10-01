package view;

import controller.EscalonadorController;
import model.Fila;
import model.Processo;

public class Principal {

	public static void main(String[] args) {
		Fila<Processo> f = new Fila<>();
		EscalonadorController ec = new EscalonadorController();		
		String vet[] = {"notepad.exe;14","write.exe;35","chrome.exe;27","acrobat.exe;52","firefox.exe;18","word.exe;25"};
		
		for (String string : vet) {
			Processo P = new Processo();
			String[] textoSeparado = string.split(";");
			P.nome = textoSeparado[0];
			P.QtdeRetorno = Integer.parseInt(textoSeparado[1]);
			f.insert(P);
		}

		ec.Escalonador(f);
	}

}
