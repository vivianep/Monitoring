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
	public String message;

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
		
		message = input.getInput().getAttributeValue("message");
		
        String valores[] = message.split("-");
        System.out.println(valores[2]);
        secretariaTransporte.atualizar(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]), valores[2]);
        message=valores[2];
		return null;
	}

}
