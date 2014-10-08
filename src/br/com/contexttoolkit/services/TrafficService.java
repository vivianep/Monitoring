package br.com.contexttoolkit.services;

import br.com.contexttoolkit.app.SAMUApplication;
import br.com.contexttoolkit.app.SecretariaTransporteApplication;
import context.arch.comm.DataObject;
import context.arch.service.Service;
import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.service.helper.ServiceInput;
import context.arch.widget.Widget;

public class TrafficService extends Service {
	
	private SecretariaTransporteApplication secretariaTransporte;
	private SAMUApplication samuApp;
	

	@SuppressWarnings("serial")
	public TrafficService(final Widget widget) {
		super(widget, "TrafficService", 
				new FunctionDescriptions() {
				{ // constructor
				// define function for the service
				add(new FunctionDescription(
						"trafficControl", 
						"quantidade de carros", 
						widget.getNonConstantAttributes()));
				}
		});	
	}
	
	@Override
	public DataObject execute(ServiceInput input) {
		
		secretariaTransporte = SecretariaTransporteApplication.getInstance();
		String message = input.getInput().getAttributeValue("message");
        String valores[] = message.split("-");
        System.out.println("Via "+Integer.parseInt(valores[0]) );
        System.out.println("qtd_carros "+Integer.parseInt(valores[1]) );
        System.out.println("situacao "+valores[2]) ;
        secretariaTransporte.atualizar(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]), valores[2]);
        
		return null;
	}
	
	

}
