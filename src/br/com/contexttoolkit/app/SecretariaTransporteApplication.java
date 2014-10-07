package br.com.contexttoolkit.app;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import br.com.contexttoolkit.GUI.ModifiedModel;
import br.com.contexttoolkit.GUI.ModifiedModelSAMU;
import br.com.contexttoolkit.services.AtualizacaoAcidente;
import br.com.contexttoolkit.services.AtualizacaoCongestionamento;
import br.com.contexttoolkit.services.Monitoramento;
import br.com.contexttoolkit.services.MonitoramentoAcidente;
import br.com.contexttoolkit.services.MonitoramentoTraffic;

public class SecretariaTransporteApplication extends JPanel implements AtualizacaoCongestionamento, AtualizacaoAcidente {

	private static SecretariaTransporteApplication instance = null;
	private Monitoramento monitoramentoTraffic;
	private String elemento_atual_cb = "1";
	private String via_acidente;
	
	private Monitoramento monitoramentoAcidente;



	private SecretariaTransporteApplication() {
		
		
			initComponents();
			
	}

	public static synchronized SecretariaTransporteApplication getInstance() {
		if (instance == null) {
			instance = new SecretariaTransporteApplication();
		}
		return instance;
	}

	@Override
	public void atualizar(int via, int quantCarros, String situacao) {
		updateLabels(via,
				situacao);

	}

	@Override
	public void atualizar(int via, String situacao) {
		
	}
	private void initComponents() {
		jPanel4 = new javax.swing.JPanel();
		jPanel7 = new javax.swing.JPanel();
		jPanel8 = new javax.swing.JPanel();
		jPanel9 = new javax.swing.JPanel();
		jPanel10 = new javax.swing.JPanel();
		jPanel11 = new javax.swing.JPanel();
		
		jPanel6 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();

		jLabel4.setFont(new java.awt.Font("LuzSans-Book", 0, 30));
		jLabel4.setText("Secretaria de Transportes ");
		
		jLabel6.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
		jLabel6.setText("Livre");
		
		jLabel7.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
		jLabel7.setText("Livre");

		jLabel8.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
		jLabel8.setText("Livre");
		
		jLabel9.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
		jLabel9.setText("Livre");
		
		jLabel10.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
		jLabel10.setText("Livre");
		
		jLabel12.setFont(new java.awt.Font("LuzSans-Book", 0, 16));


		jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Via 4"));

		
		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(
				jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel8Layout.createSequentialGroup().addComponent(jLabel9)
						.addContainerGap(65, Short.MAX_VALUE)));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel8Layout.createSequentialGroup().addGap(39, 39, 39)
						.addComponent(jLabel9)
						.addContainerGap(68, Short.MAX_VALUE)));
		
		jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Via 5"));

		

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(
				jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel9Layout.createSequentialGroup().addComponent(jLabel10)
						.addContainerGap(58, Short.MAX_VALUE)));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel9Layout.createSequentialGroup().addGap(39, 39, 39)
						.addComponent(jLabel10)
						.addContainerGap(68, Short.MAX_VALUE)));

		
		jPanel10.setBackground(new java.awt.Color(255, 255, 255));
		jPanel10.setLayout(new java.awt.GridLayout(1, 0));
		
		jPanel11.setLayout(new java.awt.GridLayout(1, 0));
		jPanel11.add(jPanel8);
		jPanel11.add(jPanel9);
		

		jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Via 1"));
		jPanel4.setFont(new java.awt.Font("LuzSans-Book", 0, 12));
		
		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel4Layout
						.createSequentialGroup()
						.addComponent(jLabel6,
								javax.swing.GroupLayout.PREFERRED_SIZE, 121,
								javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
										.addComponent (jLabel12,javax.swing.GroupLayout.PREFERRED_SIZE, 121,
												javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel4Layout.createSequentialGroup().addGap(31, 31, 31)
						.addComponent(jLabel6)
						.addComponent(jLabel12)
						.addContainerGap(59, Short.MAX_VALUE)));
		
		jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Via 3"));
		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel6Layout.createSequentialGroup().addComponent(jLabel8)
						.addContainerGap(67, Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel6Layout.createSequentialGroup().addGap(31, 31, 31)
						.addComponent(jLabel8)
						.addContainerGap(59, Short.MAX_VALUE)));
		
		jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Via 2"));
		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel7Layout
						.createSequentialGroup()
						.addComponent(jLabel7,
								javax.swing.GroupLayout.PREFERRED_SIZE, 109,
								javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(16, Short.MAX_VALUE)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						jPanel7Layout
						.createSequentialGroup()
						.addGap(25, 25, 25)
						.addComponent(jLabel7,
								javax.swing.GroupLayout.PREFERRED_SIZE, 27,
								javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(58, Short.MAX_VALUE)));

		
		
		this.setBackground(new java.awt.Color(255, 255, 255));
		this.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
			javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
					this);
			this.setLayout(jPanel3Layout);
			jPanel3Layout
			.setHorizontalGroup(jPanel3Layout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(
									jPanel3Layout
									.createSequentialGroup()
									.addGroup(
											jPanel3Layout
											.createParallelGroup(
													javax.swing.GroupLayout.Alignment.LEADING)
													.addGroup(
															jPanel3Layout
															.createSequentialGroup()
															.addContainerGap()
															.addGroup(
																	jPanel3Layout
																	.createParallelGroup(
																			javax.swing.GroupLayout.Alignment.LEADING)
																			.addComponent(
																					jPanel10,
																					javax.swing.GroupLayout.PREFERRED_SIZE,
																					413,
																					javax.swing.GroupLayout.PREFERRED_SIZE)
																					.addComponent(
																							jLabel4)))
																							.addGroup(
																									jPanel3Layout
																									.createSequentialGroup()
																									.addGap(94,
																											94,
																											94)
																											.addComponent(
																													jPanel11,
																													javax.swing.GroupLayout.PREFERRED_SIZE,
																													272,
																													javax.swing.GroupLayout.PREFERRED_SIZE)))
																													.addContainerGap(22, Short.MAX_VALUE)));
			jPanel3Layout
			.setVerticalGroup(jPanel3Layout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(
									jPanel3Layout
									.createSequentialGroup()
									.addContainerGap()
									.addComponent(jLabel4)
									.addPreferredGap(
											javax.swing.LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(
													jPanel10,
													javax.swing.GroupLayout.PREFERRED_SIZE,
													135,
													javax.swing.GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(
															javax.swing.LayoutStyle.ComponentPlacement.RELATED)
															.addComponent(
																	jPanel11,
																	javax.swing.GroupLayout.DEFAULT_SIZE,
																	152, Short.MAX_VALUE)
																.addContainerGap()));
			jPanel10.add(jPanel4);	
			jPanel10.add(jPanel6);
			jPanel10.add(jPanel7);
	}


		private void updateLabels(int elemento_atual_cb, String status) {
			
			switch (elemento_atual_cb) {
			case (1):
				jLabel6.setText(status);
			break;
			case (2):
				jLabel7.setText(status);
			break;
			case (3):
				jLabel8.setText(status);
			break;
			case (4):
				jLabel9.setText(status);
			break;
			case (5):
				jLabel10.setText(status);
			break;
			}

		}

		/**
		 * @param args the command line arguments
		 */
		public static void main(String args[]) {
			/* Set the Nimbus look and feel */
			//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
			/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
			 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
			 */

			try {
				for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
						.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}
			} catch (ClassNotFoundException ex) {
				java.util.logging.Logger.getLogger(SecretariaTransporteApplication.class.getName()).log(
						java.util.logging.Level.SEVERE, null, ex);
			} catch (InstantiationException ex) {
				java.util.logging.Logger.getLogger(SecretariaTransporteApplication.class.getName()).log(
						java.util.logging.Level.SEVERE, null, ex);
			} catch (IllegalAccessException ex) {
				java.util.logging.Logger.getLogger(SecretariaTransporteApplication.class.getName()).log(
						java.util.logging.Level.SEVERE, null, ex);
			} catch (javax.swing.UnsupportedLookAndFeelException ex) {
				java.util.logging.Logger.getLogger(SecretariaTransporteApplication.class.getName()).log(
						java.util.logging.Level.SEVERE, null, ex);
			}
			//</editor-fold>
			//</editor-fold>

			/* Create and display the form */
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					JPanel panel = SecretariaTransporteApplication.getInstance();
					//SjPanel1.add(, jTable1.CENTER_ALIGNMENT);
					
				}
			});
		}

		//GEN-BEGIN:variables
		// Variables declaration - do not modify
	
		// End of variables declaration//GEN-END:variables
		
		private javax.swing.JPanel jPanel10;
		private javax.swing.JPanel jPanel11;
		private javax.swing.JPanel jPanel4;
		private javax.swing.JPanel jPanel6;
		private javax.swing.JPanel jPanel7;
		private javax.swing.JPanel jPanel8;
		private javax.swing.JPanel jPanel9;
		private javax.swing.JLabel jLabel4;
		private javax.swing.JLabel jLabel6;
		private javax.swing.JLabel jLabel7;
		private javax.swing.JLabel jLabel8;
		private javax.swing.JLabel jLabel9;
		private javax.swing.JLabel jLabel10;
		private javax.swing.JLabel jLabel12;
	}





