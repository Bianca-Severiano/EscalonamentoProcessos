package controller;

import model.Fila;
import model.Processo;

public class EscalonadorController {

	public EscalonadorController() {
		super();
	}

	public void Escalonador(Fila<Processo> f) {
		
		if (f.isEmpty()) {
			System.err.println("Fila Vazia");
		} else {
			Processo p;
			do {
				try {
					p = f.remove();
					System.out.print(p + " --> ");
					if (p.QtdeRetorno > 1) {
						p.QtdeRetorno--;
						System.out.println(p);
						f.insert(p);
					} else{
						System.out.println("FINALIZADO");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			} while (!f.isEmpty());

		}
	}

}
