package br.com.contexttoolkit.app;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import br.com.contexttoolkit.GUI.ModifiedModel;
import br.com.contexttoolkit.GUI.ModifiedModelSAMU;
import br.com.contexttoolkit.services.AtualizacaoAcidente;
import br.com.contexttoolkit.services.AtualizacaoCongestionamento;
import br.com.contexttoolkit.services.Monitoramento;
import br.com.contexttoolkit.services.MonitoramentoAcidente;
import br.com.contexttoolkit.services.MonitoramentoTraffic;

public class SecretariaTransporteApplication extends JFrame implements AtualizacaoCongestionamento, AtualizacaoAcidente {

	private static SecretariaTransporteApplication instance = null;
	private Monitoramento monitoramentoTraffic;
	private String elemento_atual_cb = "1";
	private String via_acidente;
	private String[] status_via = new String[5];
	private Monitoramento monitoramentoAcidente;



	private SecretariaTransporteApplication() {
		
			for (int i = 0; i < 5; i++) {
				status_via[i] = "Livre";
			}
			this.monitoramentoAcidente= new MonitoramentoAcidente();
			via_acidente="Via 1";
			this.monitoramentoTraffic =  new MonitoramentoTraffic();
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

			jPanel5 = new javax.swing.JPanel();
			jLabel1 = new javax.swing.JLabel();
			jPanel2 = new javax.swing.JPanel();
			jLabel3 = new javax.swing.JLabel();
			jComboBox1 = new javax.swing.JComboBox();
			jLabel2 = new javax.swing.JLabel();
			jLabelQtdCarros = new javax.swing.JLabel();
			jSliderQtdCarros = new javax.swing.JSlider();
			jScrollPane1 = new javax.swing.JScrollPane();
			jTable1 = new javax.swing.JTable();
			jTable2 = new javax.swing.JTable();
			jPanel3 = new javax.swing.JPanel();
			jLabel4 = new javax.swing.JLabel();
			jPanel10 = new javax.swing.JPanel();
			jPanel4 = new javax.swing.JPanel();
			jLabel6 = new javax.swing.JLabel();
			jPanel7 = new javax.swing.JPanel();
			jLabel7 = new javax.swing.JLabel();
			jPanel6 = new javax.swing.JPanel();
			jLabel8 = new javax.swing.JLabel();
			jPanel11 = new javax.swing.JPanel();
			jPanel8 = new javax.swing.JPanel();
			jLabel9 = new javax.swing.JLabel();
			jPanel9 = new javax.swing.JPanel();
			jLabel10 = new javax.swing.JLabel();
			jPanel1 = new javax.swing.JPanel();
			jLabel5 = new javax.swing.JLabel();
			jLabel11 = new javax.swing.JLabel();
			jLabel12 = new javax.swing.JLabel();	
			jComboBox2 = new javax.swing.JComboBox();
			jButton1 = new javax.swing.JButton();

			setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

			jPanel5.setBackground(new java.awt.Color(222, 230, 239));

			jLabel1.setFont(new java.awt.Font("LuzSans-Book", 0, 30));
			jLabel1.setText("Situa\u00e7\u00e3o em Tempo Real ");

			jPanel2.setBackground(new java.awt.Color(222, 230, 239));

			jLabel3.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jLabel3.setText("Quantidade de Carros");

			jComboBox1.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
					"1", "2", "3", "4", "5" }));
			jComboBox1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jComboBox1ActionPerformed(evt);
				}
			});

			jLabel2.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jLabel2.setText("Via ");

			jLabelQtdCarros.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jSliderQtdCarros.setValue(0);
			jLabelQtdCarros.setText(Integer.toString(jSliderQtdCarros.getValue()));

			jSliderQtdCarros
			.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent evt) {
					jSliderQtdCarrosStateChanged(evt);
				}
			});

			javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
					jPanel2);
			jPanel2.setLayout(jPanel2Layout);
			jPanel2Layout
			.setHorizontalGroup(jPanel2Layout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(
									jPanel2Layout
									.createSequentialGroup()
									.addGap(13, 13, 13)
									.addComponent(
											jLabel2,
											javax.swing.GroupLayout.PREFERRED_SIZE,
											37,
											javax.swing.GroupLayout.PREFERRED_SIZE)
											.addGap(18, 18, 18)
											.addComponent(
													jComboBox1,
													javax.swing.GroupLayout.PREFERRED_SIZE,
													47,
													javax.swing.GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(
															javax.swing.LayoutStyle.ComponentPlacement.RELATED,
															javax.swing.GroupLayout.DEFAULT_SIZE,
															Short.MAX_VALUE)
															.addComponent(jLabel3)
															.addGap(35, 35, 35)
															.addComponent(
																	jSliderQtdCarros,
																	javax.swing.GroupLayout.PREFERRED_SIZE,
																	javax.swing.GroupLayout.DEFAULT_SIZE,
																	javax.swing.GroupLayout.PREFERRED_SIZE)
																	.addGap(18, 18, 18)
																	.addComponent(jLabelQtdCarros)
																	.addGap(124, 124, 124)));
			jPanel2Layout
			.setVerticalGroup(jPanel2Layout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(
									jPanel2Layout
									.createSequentialGroup()
									.addContainerGap()
									.addGroup(
											jPanel2Layout
											.createParallelGroup(
													javax.swing.GroupLayout.Alignment.LEADING)
													.addGroup(
															jPanel2Layout
															.createParallelGroup(
																	javax.swing.GroupLayout.Alignment.BASELINE)
																	.addComponent(
																			jComboBox1,
																			javax.swing.GroupLayout.PREFERRED_SIZE,
																			javax.swing.GroupLayout.DEFAULT_SIZE,
																			javax.swing.GroupLayout.PREFERRED_SIZE)
																			.addComponent(
																					jLabel2,
																					javax.swing.GroupLayout.PREFERRED_SIZE,
																					23,
																					javax.swing.GroupLayout.PREFERRED_SIZE)
																					.addComponent(
																							jLabel3))
																							.addComponent(
																									jSliderQtdCarros,
																									javax.swing.GroupLayout.PREFERRED_SIZE,
																									javax.swing.GroupLayout.DEFAULT_SIZE,
																									javax.swing.GroupLayout.PREFERRED_SIZE)
																									.addComponent(
																											jLabelQtdCarros))
																											.addContainerGap(
																													javax.swing.GroupLayout.DEFAULT_SIZE,
																													Short.MAX_VALUE)));

			jTable1.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jTable1.setForeground(new java.awt.Color(0, 0, 0));
			jTable1.setModel(new ModifiedModel());
			jTable1.setGridColor(new java.awt.Color(0, 0, 0));
			jTable1.setRowHeight(25);
			jTable1.getTableHeader().setReorderingAllowed(false);
			jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
			jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
			jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
			jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
			jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
			jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
			DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
			centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
			jTable1.setDefaultRenderer(Object.class, centerRenderer);
			jScrollPane1.setViewportView(jTable1);
			jPanel3.setBackground(new java.awt.Color(255, 255, 255));
			jPanel3.setBorder(javax.swing.BorderFactory
					.createLineBorder(new java.awt.Color(0, 0, 0)));

			jLabel4.setFont(new java.awt.Font("LuzSans-Book", 0, 30));
			jLabel4.setText("Secretaria de Transportes ");

			jPanel10.setBackground(new java.awt.Color(255, 255, 255));
			jPanel10.setLayout(new java.awt.GridLayout(1, 0));

			jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Via 1"));
			jPanel4.setFont(new java.awt.Font("LuzSans-Book", 0, 12));

			jLabel6.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jLabel6.setText("Livre");



			jLabel12.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jLabel11.setText("jLabel6");

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

			jPanel10.add(jPanel4);

			jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Via 2"));

			jLabel7.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jLabel7.setText("Livre");

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

			jPanel10.add(jPanel7);

			jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Via 3"));

			jLabel8.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jLabel8.setText("Livre");

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

			jPanel10.add(jPanel6);

			jPanel11.setLayout(new java.awt.GridLayout(1, 0));

			jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Via 4"));

			jLabel9.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jLabel9.setText("Livre");

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

			jPanel11.add(jPanel8);

			jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Via 5"));

			jLabel10.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jLabel10.setText("Livre");

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

			jPanel11.add(jPanel9);

			javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
					jPanel3);
			jPanel3.setLayout(jPanel3Layout);
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

			jPanel1.setBackground(new java.awt.Color(255, 255, 255));
			jPanel1.setBorder(javax.swing.BorderFactory
					.createLineBorder(new java.awt.Color(0, 0, 0)));
			jPanel1.setToolTipText("");

			jLabel5.setFont(new java.awt.Font("LuzSans-Book", 0, 30));
			jLabel5.setText("Informar Acidente");

			jLabel11.setFont(new java.awt.Font("LuzSans-Book", 0, 18));
			jLabel11.setText("Onde ocorreu o acidente?");

			jComboBox2.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
			jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
					"Via 1", "Via 2", "Via 3", "Via 4","Via 5" }));
			jComboBox2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jComboBox2ActionPerformed(evt);
				}
			});

			jButton1.setBackground(new java.awt.Color(255, 255, 255));
			jButton1.setFont(new java.awt.Font("LuzSans-Book", 0, 18));
			jButton1.setIcon(new javax.swing.ImageIcon(
					"img\\amb_icon.png")); // NOI18N
			jButton1.setText("    Informar SAMU");
			jButton1.setContentAreaFilled(false);
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jButton1ActionPerformed(evt);
				}
			});

			javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
					jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			jPanel1Layout
			.setHorizontalGroup(jPanel1Layout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(
									jPanel1Layout
									.createSequentialGroup()
									.addGroup(
											jPanel1Layout
											.createParallelGroup(
													javax.swing.GroupLayout.Alignment.LEADING)
													.addGroup(
															jPanel1Layout
															.createSequentialGroup()
															.addContainerGap()
															.addComponent(
																	jLabel5))
																	.addGroup(
																			jPanel1Layout
																			.createSequentialGroup()
																			.addGap(26,
																					26,
																					26)
																					.addComponent(
																							jLabel11)
																							.addGap(18,
																									18,
																									18)
																									.addComponent(
																											jComboBox2,
																											javax.swing.GroupLayout.PREFERRED_SIZE,
																											151,
																											javax.swing.GroupLayout.PREFERRED_SIZE))
																											.addGroup(
																													jPanel1Layout
																													.createSequentialGroup()
																													.addGap(89,
																															89,
																															89)
																															.addComponent(
																																	jButton1)))
																																	.addContainerGap(24, Short.MAX_VALUE)));
			jPanel1Layout
			.setVerticalGroup(jPanel1Layout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(
									jPanel1Layout
									.createSequentialGroup()
									.addContainerGap()
									.addGroup(
											jPanel1Layout
											.createParallelGroup(
													javax.swing.GroupLayout.Alignment.TRAILING)
													.addGroup(
															jPanel1Layout
															.createSequentialGroup()
															.addComponent(
																	jLabel5)
																	.addGap(59,
																			59,
																			59)
																			.addComponent(
																					jLabel11))
																					.addComponent(
																							jComboBox2,
																							javax.swing.GroupLayout.PREFERRED_SIZE,
																							javax.swing.GroupLayout.DEFAULT_SIZE,
																							javax.swing.GroupLayout.PREFERRED_SIZE))
																							.addGap(29, 29, 29)
																							.addComponent(
																									jButton1,
																									javax.swing.GroupLayout.PREFERRED_SIZE,
																									76,
																									javax.swing.GroupLayout.PREFERRED_SIZE)
																									.addContainerGap(127, Short.MAX_VALUE)));

			javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
					jPanel5);
			jPanel5.setLayout(jPanel5Layout);
			jPanel5Layout
			.setHorizontalGroup(jPanel5Layout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(
									jPanel5Layout
									.createSequentialGroup()
									.addGroup(
											jPanel5Layout
											.createParallelGroup(
													javax.swing.GroupLayout.Alignment.LEADING)
													.addGroup(
															jPanel5Layout
															.createSequentialGroup()
															.addContainerGap()
															.addComponent(
																	jLabel1,
																	javax.swing.GroupLayout.PREFERRED_SIZE,
																	352,
																	javax.swing.GroupLayout.PREFERRED_SIZE))
																	.addGroup(
																			jPanel5Layout
																			.createSequentialGroup()
																			.addContainerGap()
																			.addComponent(
																					jPanel3,
																					javax.swing.GroupLayout.PREFERRED_SIZE,
																					javax.swing.GroupLayout.DEFAULT_SIZE,
																					javax.swing.GroupLayout.PREFERRED_SIZE)
																					.addPreferredGap(
																							javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																							.addComponent(
																									jPanel1,
																									javax.swing.GroupLayout.PREFERRED_SIZE,
																									javax.swing.GroupLayout.DEFAULT_SIZE,
																									javax.swing.GroupLayout.PREFERRED_SIZE))
																									.addGroup(
																											jPanel5Layout
																											.createSequentialGroup()
																											.addGap(56,
																													56,
																													56)
																													.addComponent(
																															jScrollPane1,
																															javax.swing.GroupLayout.PREFERRED_SIZE,
																															807,
																															javax.swing.GroupLayout.PREFERRED_SIZE)))
																															.addContainerGap(
																																	javax.swing.GroupLayout.DEFAULT_SIZE,
																																	Short.MAX_VALUE))
																																	.addGroup(
																																			javax.swing.GroupLayout.Alignment.TRAILING,
																																			jPanel5Layout
																																			.createSequentialGroup()
																																			.addContainerGap(147, Short.MAX_VALUE)
																																			.addComponent(
																																					jPanel2,
																																					javax.swing.GroupLayout.PREFERRED_SIZE,
																																					640,
																																					javax.swing.GroupLayout.PREFERRED_SIZE)
																																					.addGap(127, 127, 127)));
			jPanel5Layout
			.setVerticalGroup(jPanel5Layout
					.createParallelGroup(
							javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(
									jPanel5Layout
									.createSequentialGroup()
									.addContainerGap()
									.addComponent(jLabel1)
									.addPreferredGap(
											javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(
													jPanel2,
													javax.swing.GroupLayout.PREFERRED_SIZE,
													javax.swing.GroupLayout.DEFAULT_SIZE,
													javax.swing.GroupLayout.PREFERRED_SIZE)
													.addGap(18, 18, 18)
													.addComponent(
															jScrollPane1,
															javax.swing.GroupLayout.PREFERRED_SIZE,
															78,
															javax.swing.GroupLayout.PREFERRED_SIZE)
															.addGap(44, 44, 44)
															.addGroup(
																	jPanel5Layout
																	.createParallelGroup(
																			javax.swing.GroupLayout.Alignment.LEADING)
																			.addComponent(
																					jPanel1,
																					javax.swing.GroupLayout.DEFAULT_SIZE,
																					javax.swing.GroupLayout.DEFAULT_SIZE,
																					Short.MAX_VALUE)
																					.addComponent(
																							jPanel3,
																							javax.swing.GroupLayout.DEFAULT_SIZE,
																							javax.swing.GroupLayout.DEFAULT_SIZE,
																							Short.MAX_VALUE))
																							.addContainerGap()));

			javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
					getContentPane());
			getContentPane().setLayout(layout);
			layout.setHorizontalGroup(layout.createParallelGroup(
					javax.swing.GroupLayout.Alignment.LEADING).addComponent(
							jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.PREFERRED_SIZE));
			layout.setVerticalGroup(layout.createParallelGroup(
					javax.swing.GroupLayout.Alignment.LEADING).addComponent(
							jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.PREFERRED_SIZE));

			pack();
		}// </editor-fold>
		//GEN-END:initComponents

		private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
			
			String[] str = via_acidente.split("");
			int via_acidente_num=Integer.parseInt(str[5]);
			this.monitoramentoAcidente.atualizarInformacoes("true" + "-"
					+ String.valueOf(via_acidente_num));
			JDialog samu_app = SAMUApplication.getInstance();
			samu_app.setVisible(true);
		}

		private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
			//GEN-FIRST:event_jComboBox1ActionPerformed
			JComboBox cb = (JComboBox) evt.getSource();
			elemento_atual_cb = (String) cb.getSelectedItem();
		}

		private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt){
			
			JComboBox cb = (JComboBox) evt.getSource();
			via_acidente = (String) cb.getSelectedItem();

		}

		private void jSliderQtdCarrosStateChanged(javax.swing.event.ChangeEvent evt) {
			
			String slider_value = Integer.toString(jSliderQtdCarros.getValue());
			jLabelQtdCarros.setText(slider_value);
			((ModifiedModel) jTable1.getModel()).setAt(0,
					elemento_atual_cb.codePointAt(0) - 48,
					jSliderQtdCarros.getValue());
			String insert_data = elemento_atual_cb + "-" + slider_value;
			monitoramentoTraffic.atualizarInformacoes(insert_data);
			

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
					JFrame frame = SecretariaTransporteApplication.getInstance();
					//SjPanel1.add(, jTable1.CENTER_ALIGNMENT);
					frame.setVisible(true);
				}
			});
		}

		//GEN-BEGIN:variables
		// Variables declaration - do not modify
		private javax.swing.JButton jButton1;
		private javax.swing.JComboBox jComboBox1;
		private javax.swing.JComboBox jComboBox2;
		private javax.swing.JLabel jLabel1;
		private javax.swing.JLabel jLabel10;
		private javax.swing.JLabel jLabel11;
		private javax.swing.JLabel jLabel12;
		private javax.swing.JLabel jLabel2;
		private javax.swing.JLabel jLabel3;
		private javax.swing.JLabel jLabel4;
		private javax.swing.JLabel jLabel5;
		private javax.swing.JLabel jLabel6;
		private javax.swing.JLabel jLabel7;
		private javax.swing.JLabel jLabel8;
		private javax.swing.JLabel jLabel9;
		private javax.swing.JLabel jLabelQtdCarros;
		private javax.swing.JPanel jPanel1;
		private javax.swing.JPanel jPanel10;
		private javax.swing.JPanel jPanel11;
		private javax.swing.JPanel jPanel2;
		private javax.swing.JPanel jPanel3;
		private javax.swing.JPanel jPanel4;
		private javax.swing.JPanel jPanel5;
		private javax.swing.JPanel jPanel6;
		private javax.swing.JPanel jPanel7;
		private javax.swing.JPanel jPanel8;
		private javax.swing.JPanel jPanel9;
		private javax.swing.JScrollPane jScrollPane1;
		private javax.swing.JSlider jSliderQtdCarros;
		private javax.swing.JTable jTable1;
		private javax.swing.JTable jTable2;
		// End of variables declaration//GEN-END:variables
	}





