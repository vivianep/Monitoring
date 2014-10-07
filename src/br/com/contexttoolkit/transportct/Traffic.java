package br.com.contexttoolkit.transportct;

import javax.swing.JFrame;

import br.com.contexttoolkit.GUI.MainScreen;
import br.com.contexttoolkit.app.SecretariaTransporteApplication;
import br.com.contexttoolkit.services.Monitoramento;
import br.com.contexttoolkit.services.MonitoramentoAcidente;
import br.com.contexttoolkit.services.MonitoramentoTraffic;

public class Traffic {
	
	
	public Traffic() {
		
	}

	public static void main(String[] args) {
		
		new Traffic();
		JFrame main_frame=  new MainScreen();
		main_frame.setVisible(true);
		

		
	}

}
