package br.com.contexttoolkit.transportct;

import javax.swing.JFrame;

import br.com.contexttoolkit.GUI.Principal;
import br.com.contexttoolkit.services.Monitoramento;
import br.com.contexttoolkit.services.MonitoramentoAcidente;
import br.com.contexttoolkit.services.MonitoramentoTraffic;

public class Traffic {
	
	private static MonitoramentoTraffic monitoramentoTraffic;
	private static Monitoramento monitoramentoAccident;
	
	public Traffic() {
		monitoramentoTraffic = new MonitoramentoTraffic();
		monitoramentoAccident = new MonitoramentoAcidente();
	}

	public static void main(String[] args) {
		
		new Traffic();
		JFrame tela_principal= new Principal(monitoramentoTraffic);
		tela_principal.setVisible(true);
		//monitoramentoAccident.atualizarInformacoes("true-1");
	//	monitoramentoAccident.atualizarInformacoes("false-2");
	//monitoramentoAccident.atualizarInformacoes("true-4");
		//monitoramentoTraffic.atualizarInformacoes("1-10");
		//String message = monitoramentoTraffic.trafficService.message;
		//System.out.println(message);
//		monitoramento.atualizarInformacoes("1-5");
//		monitoramento.atualizarInformacoes("2-15");
//		monitoramento.atualizarInformacoes("2-2");
//		monitoramento.atualizarInformacoes("3-10");
//		monitoramento.atualizarInformacoes("4-13");
//		monitoramento.atualizarInformacoes("5-30");
//		monitoramento.atualizarInformacoes("4-2");
//		monitoramento.atualizarInformacoes("3-20");
		
	}

}
