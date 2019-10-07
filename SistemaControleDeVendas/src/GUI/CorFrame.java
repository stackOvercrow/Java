package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.Entidades.Pigmento;
import Persistencia.PigmentoDAO;
import SQL.PigmentoSQLDAO;

public class CorFrame extends JFrame{
	
	private JTextField nomeField;
	private JTextField qtdeField;
	private JTextField quantidadeField;
	
	CorFrame (){
		super("Controle de Vendas");
		criarMenu();
		criarFormulario();
	}
	
	private void criarFormulario() {
		setLayout(new BorderLayout());
		
		JFrame context = this;
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setLayout(new FlowLayout());
		
		JLabel titulo = new JLabel ("Solicite a Cor Desejada");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setLayout(new FlowLayout());
		
		/* CAMPOS */
		JLabel nomeLabel = new JLabel ("Cor:");
		nomeField = new JTextField(51);
		nomeField.setHorizontalAlignment(JTextField.CENTER);
		nomeLabel.setHorizontalAlignment(0);
		
		JLabel quantidadeLabel = new JLabel ("Quantidade:");
		qtdeField = new JTextField(51);
		nomeField.setHorizontalAlignment(JTextField.CENTER);
		qtdeField.setHorizontalAlignment(0);
		
		panelTitulo.add(titulo);
		panelTitulo.add(Box.createVerticalStrut(40));
		panelTitulo.setAlignmentX(CENTER_ALIGNMENT);
		panelFormulario.add(nomeLabel);
		panelFormulario.add(nomeField);
		panelFormulario.add(quantidadeLabel);
		panelFormulario.add(qtdeField);
		panelFormulario.setAlignmentY(CENTER_ALIGNMENT);
		
		
		JPanel panelBotao = new JPanel();
		panelBotao.setLayout(new FlowLayout());
	

		JButton botaoEnviar = new JButton("Enviar");
		
		botaoEnviar.addActionListener(new ActionListener() {		
			private PigmentoDAO pigmentoDAO = new PigmentoSQLDAO();
			private int quantidade = 0;
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Pigmento pigmento = null;
				
				try {
					quantidade = Integer.parseInt(qtdeField.getText());
				}catch (NumberFormatException e) {
					System.out.println();
				}
				
				try {
					pigmento = pigmentoDAO.search(quantidade, nomeField.getText());					
					
					int escolha = JOptionPane.showConfirmDialog(context, "Pigmento: " +pigmento.getNomeFantasia() + "\nPreco: R$ " +pigmento.valor(quantidade),"Confirmar Compra",JOptionPane.YES_NO_OPTION);
					
					if(escolha == JOptionPane.YES_OPTION) {						
						pigmento.debitar(quantidade);		
						pigmentoDAO.update(pigmento);						
					} 
				
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}			
			}
	
			});			
	

		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);						
			}
		});
		
		panelBotao.add(botaoEnviar);		
		panelBotao.add(botaoSair);
		
		add(panelTitulo, BorderLayout.NORTH);
		add(panelFormulario, BorderLayout.CENTER);
		add(panelBotao, BorderLayout.SOUTH);
		
	}
	
	private void criarMenu() {
	
		JMenu menuPigmento = new JMenu("Pigmento");
		
		JMenuItem menuItemEnviar = new JMenuItem("Enviar");
		menuPigmento.add(menuItemEnviar);
		
		JMenuItem menuItemFechar = new JMenuItem("Fechar");
		menuPigmento.add(menuItemFechar);		
	
		JMenu menuAjuda = new JMenu("Ajuda");		
		JMenuItem menuItemSobre = new JMenuItem("Sobre ...");
		menuAjuda.add(menuItemSobre);
		
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		
		barra.add(menuPigmento);
		barra.add(menuAjuda);
		
	}
	

	
}
