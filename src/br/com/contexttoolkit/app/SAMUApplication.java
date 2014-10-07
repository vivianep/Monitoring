package br.com.contexttoolkit.app;

import java.util.ArrayList;
import java.util.List;

import br.com.contexttoolkit.GUI.ModifiedModelSAMU;

import br.com.contexttoolkit.services.Monitoramento;
import br.com.contexttoolkit.services.MonitoramentoAcidente;
import br.com.contexttoolkit.services.MonitoramentoTraffic;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import br.com.contexttoolkit.services.AtualizacaoAcidente;





public class SAMUApplication extends JDialog implements AtualizacaoAcidente {
	
	private static SAMUApplication instance = null;
	private MonitoramentoAcidente monitoramentoAcidente;
	private JTable jTable1;
	
	private SAMUApplication() {
		initComponents();
	}
	
	public static synchronized SAMUApplication getInstance() {
		if (instance == null) {
			instance = new SAMUApplication();
		}
		return instance;
	}
	
	
		
	@Override
	public void atualizar(int via, String situacao) {
		((ModifiedModelSAMU) jTable1.getModel()).setAt(0,
				via,
				situacao);
	}
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1= new JTable();
		

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(220, 240, 239));

		jLabel1.setFont(new java.awt.Font("LuzSans-Book", 0, 20));
		jLabel1.setText("Situa\u00e7\u00e3o Atual");
		
		jLabel1.setText("Situa\u00e7\u00e3o Atual");
		jTable1.setForeground(new java.awt.Color(0, 0, 0));
		jTable1.setGridColor(new java.awt.Color(0, 0, 0));
		jTable1.setModel(new ModifiedModelSAMU());
		jTable1.setFont(new java.awt.Font("LuzSans-Book", 0, 16));
		jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
		jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
		jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
		jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
		jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
		jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
		jTable1.setRowHeight(25);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		jTable1.setDefaultRenderer(Object.class, centerRenderer);
		
		
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						jPanel1Layout.createSequentialGroup().addContainerGap()
								.addComponent(jLabel1)
								.addContainerGap(616, Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout
								.createSequentialGroup()
								.addContainerGap(39, Short.MAX_VALUE)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										677,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(38, 38, 38)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel1)
						.addGap(18, 18, 18)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(64, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SAMUApplication().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	
	/*
	
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */
	/**
	 *
	 * @author Vivi
	 */
	 

}
