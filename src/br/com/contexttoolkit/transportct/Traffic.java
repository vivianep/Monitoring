package br.com.contexttoolkit.transportct;

import javax.swing.JFrame;

import br.com.contexttoolkit.GUI.Principal;
import br.com.contexttoolkit.services.Monitoramento;
import br.com.contexttoolkit.services.MonitoramentoAcidente;
import br.com.contexttoolkit.services.MonitoramentoTraffic;

public class Traffic {
	
	private static MonitoramentoTraffic monitoramentoTraffic;
	private static MonitoramentoAcidente monitoramentoAccident;
	
	public Traffic() {
		monitoramentoTraffic = new MonitoramentoTraffic();
		monitoramentoAccident = new MonitoramentoAcidente();
	}

	public static void main(String[] args) {
		
		new Traffic();
		JFrame tela_principal= new Principal(monitoramentoTraffic, monitoramentoAccident);
		tela_principal.setVisible(true);
		

		
	}

}
