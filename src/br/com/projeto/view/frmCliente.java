package br.com.projeto.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import br.com.projeto.dao.ClienteDao;
import br.com.projeto.model.Clientes;

import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.nio.CharBuffer;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class frmCliente extends JFrame implements ActionListener, WindowListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	private JTextField textField_4;
	private JTable tabelaClientes;
	private JButton btnSalvar;
	private JTextField txtCel;
	private JTextField txtTelFixo;
	private JTextField txtCep;
	private JTextField txtRg;
	private JTextField txtCpf;
	private JTextField txtNu;
	private JTextField txtCompl;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtUF;
	private DefaultTableModel  defaultTableModel;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCliente frame = new frmCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public frmCliente() throws ParseException {
		addWindowListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 892, 82);
		panel.setBackground(new Color(0, 0, 255));
		panel.setForeground(new Color(0, 0, 0));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Clientes");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 42));
		panel.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 93, 872, 326);
		contentPane.add(tabbedPane);
		
		JPanel painel = new JPanel();
		painel.setForeground(Color.WHITE);
		painel.setBackground(Color.GRAY);
		tabbedPane.addTab("Dados pessoais", null, painel, null);
		painel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Código:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 30, 62, 17);
		painel.add(lblNewLabel_1);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(69, 29, 72, 20);
		painel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 59, 62, 17);
		painel.add(lblNewLabel_1_1);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(62, 58, 262, 20);
		painel.add(txtNome);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 90, 62, 17);
		painel.add(lblNewLabel_1_1_1);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(62, 87, 262, 20);
		painel.add(txtEmail);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Celular:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(334, 90, 62, 17);
		painel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Tel Fixo:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBounds(535, 90, 90, 17);
		painel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("CEP:");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_2.setBounds(10, 121, 62, 17);
		painel.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Endereço:");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2.setBounds(192, 121, 72, 17);
		painel.add(lblNewLabel_1_1_1_2);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(263, 120, 494, 20);
		painel.add(txtEndereco);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("N°:");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_1.setBounds(10, 161, 24, 17);
		painel.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Bairro:");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_2_1.setBounds(10, 189, 62, 17);
		painel.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Cidade:");
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_2_1_1.setBounds(263, 189, 62, 17);
		painel.add(lblNewLabel_1_1_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1_1 = new JLabel("Complemento:");
		lblNewLabel_1_1_1_1_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_2_1_1_1.setBounds(154, 161, 99, 17);
		painel.add(lblNewLabel_1_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("UF:");
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_1_1.setBounds(564, 189, 24, 17);
		painel.add(lblNewLabel_1_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1_2 = new JLabel("RG:");
		lblNewLabel_1_1_1_1_2_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_2_1_2.setBounds(345, 59, 62, 17);
		painel.add(lblNewLabel_1_1_1_1_2_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2_1_2_1 = new JLabel("CPF:");
		lblNewLabel_1_1_1_1_2_1_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_2_1_2_1.setBounds(548, 59, 62, 17);
		painel.add(lblNewLabel_1_1_1_1_2_1_2_1);
		
		txtCel = new JTextField();
		txtCel.setFont(new Font("Arial", Font.PLAIN, 14));
		txtCel.setColumns(10);
		txtCel.setBounds(387, 89, 145, 20);
		painel.add(txtCel);
		
		txtTelFixo = new JTextField();
		txtTelFixo.setColumns(10);
		txtTelFixo.setBounds(593, 89, 164, 20);
		painel.add(txtTelFixo);
		
		txtCep = new JTextField();
		txtCep.setFont(new Font("Arial", Font.PLAIN, 14));
		txtCep.setColumns(10);
		txtCep.setBounds(62, 118, 130, 20);
		painel.add(txtCep);
		
		txtRg = new JTextField();
		txtRg.setFont(new Font("Arial", Font.PLAIN, 14));
		txtRg.setColumns(10);
		txtRg.setBounds(376, 57, 156, 20);
		painel.add(txtRg);
		
		txtCpf = new JTextField();
		txtCpf.setFont(new Font("Arial", Font.PLAIN, 14));
		txtCpf.setColumns(10);
		txtCpf.setBounds(593, 57, 164, 20);
		painel.add(txtCpf);
		
		txtNu = new JTextField();
		txtNu.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNu.setColumns(10);
		txtNu.setBounds(62, 159, 65, 20);
		painel.add(txtNu);
		
		txtCompl = new JTextField();
		txtCompl.setColumns(10);
		txtCompl.setBounds(263, 160, 494, 20);
		painel.add(txtCompl);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(62, 188, 198, 20);
		painel.add(txtBairro);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(324, 188, 230, 20);
		painel.add(txtCidade);
		
		txtUF = new JTextField();
		txtUF.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUF.setColumns(10);
		txtUF.setBounds(593, 188, 53, 20);
		painel.add(txtUF);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("Consulta de clientes", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nome:");
		lblNewLabel_1_2.setBounds(23, 23, 62, 17);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_1_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(64, 22, 264, 20);
		textField_4.setColumns(10);
		panel_2.add(textField_4);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.setBounds(336, 21, 100, 23);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		panel_2.add(btnNewButton);
		
		JScrollPane tableModel = new JScrollPane();
		tableModel.setBounds(0, 51, 851, 194);
		panel_2.add(tableModel);
		
		tabelaClientes = new JTable();
		tabelaClientes.setFont(new Font("Arial", Font.PLAIN, 10));
		tabelaClientes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nome", "RG", "E-mail", "Telefone", "Celular", "Cepl", "Endere\u00E7o", "N\u00B0", "Comp", "Bairro", "Cidade", "UF"
			}
		));
		tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(51);
		tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(106);
		tabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(91);
		tabelaClientes.getColumnModel().getColumn(4).setPreferredWidth(83);
		tabelaClientes.getColumnModel().getColumn(7).setPreferredWidth(122);
		tabelaClientes.getColumnModel().getColumn(8).setPreferredWidth(35);
		tabelaClientes.getColumnModel().getColumn(9).setPreferredWidth(83);
		tabelaClientes.getColumnModel().getColumn(10).setPreferredWidth(87);
		tabelaClientes.getColumnModel().getColumn(11).setPreferredWidth(85);
		tabelaClientes.getColumnModel().getColumn(12).setPreferredWidth(37);
		tableModel.setViewportView(tabelaClientes);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setFont(new Font("Arial", Font.BOLD, 14));
		btnNovo.setBounds(139, 430, 89, 34);
		contentPane.add(btnNovo);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 14));
		btnSalvar.setBounds(255, 430, 89, 34);
		contentPane.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Arial", Font.BOLD, 14));
		btnEditar.setBounds(366, 430, 89, 34);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Arial", Font.BOLD, 14));
		btnExcluir.setBounds(480, 430, 89, 34);
		contentPane.add(btnExcluir);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalvar) {
			do_btnSalvar_actionPerformed(e);
		}
	}
	protected void do_btnSalvar_actionPerformed(ActionEvent e) {
		
		//botão cadastrar
		try {
			
			Clientes obj = new Clientes();
			
			obj.setNome(txtNome.getText());
			obj.setRg(txtRg.getText());
			obj.setCpf(txtCpf.getText());
			obj.setEmail(txtEmail.getText());
			obj.setTelefone(txtTelFixo.getText());
			obj.setCelular(txtCel.getText());
			obj.setCep(txtCep.getText());
			obj.setEndereco(txtEndereco.getText());
			obj.setNumero(Integer.parseInt(txtNu.getText()));
			obj.setComplemento(txtCompl.getText());
			obj.setBairro(txtBairro.getText());
			obj.setCidade(txtCidade.getText());
			obj.setUf(txtUF.getText());
			
			ClienteDao dao = new ClienteDao();
			dao.cadastrarCliente(obj);
			
			
			
			
		} catch (Exception e2) {
			
		}
	
		
	}
	
	// metodo listar na tabela
	public void Listar() {
		
		ClienteDao dao = new ClienteDao();
		List<Clientes> lista = dao.listarClientes();
		
		DefaultTableModel dados = (DefaultTableModel)tabelaClientes.getModel();
		dados.setNumRows(0);
		
		for (Clientes c : lista) {
			dados.addRow( new Object[] {
				c.getId(),
				c.getNome(),
				c.getRg(),
				c.getCpf(),
				c.getEmail(),
				c.getTelefone(),
				c.getCelular(),
				c.getCep(),
				c.getEndereco(),
				c.getNumero(),
				c.getComplemento(),
				c.getBairro(),
				c.getCidade(),
				c.getUf()
						});
			
		}
			
	}

	
	

	public void windowActivated(WindowEvent e) {
		Listar();
	}
	public void windowClosed(WindowEvent e) {
	}
	public void windowClosing(WindowEvent e) {
	}
	public void windowDeactivated(WindowEvent e) {
	}
	public void windowDeiconified(WindowEvent e) {
	}
	public void windowIconified(WindowEvent e) {
	}
	public void windowOpened(WindowEvent e) {
	}
	protected void do_this_windowActivated(WindowEvent e) {
	}
}
