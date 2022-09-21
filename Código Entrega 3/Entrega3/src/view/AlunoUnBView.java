package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AlunoUnBControl;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlunoUnBView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField c_nome;
	private JLabel t_matricula;
	private JTextField c_matricula;
	private JLabel t_curso;
	private JTextField c_curso;
	private JLabel t_email;
	private JTextField c_email;
	private JButton btn_dados;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlunoUnBView frame = new AlunoUnBView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AlunoUnBView() {
		setTitle("App Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aluno");
		lblNewLabel.setBounds(183, 10, 68, 30);
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 24));
		contentPane.add(lblNewLabel);
		
		JLabel t_nome = new JLabel("Nome:");
		t_nome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		t_nome.setBounds(10, 52, 48, 14);
		contentPane.add(t_nome);
		
		c_nome = new JTextField();
		c_nome.setBounds(86, 51, 286, 20);
		contentPane.add(c_nome);
		c_nome.setColumns(10);
		
		t_matricula = new JLabel("Matricula:");
		t_matricula.setFont(new Font("Tahoma", Font.PLAIN, 16));
		t_matricula.setBounds(10, 98, 69, 14);
		contentPane.add(t_matricula);
		
		c_matricula = new JTextField();
		c_matricula.setColumns(10);
		c_matricula.setBounds(86, 97, 286, 20);
		contentPane.add(c_matricula);
		
		t_curso = new JLabel("Curso:");
		t_curso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		t_curso.setBounds(10, 141, 48, 14);
		contentPane.add(t_curso);
		
		c_curso = new JTextField();
		c_curso.setColumns(10);
		c_curso.setBounds(86, 140, 286, 20);
		contentPane.add(c_curso);
		
		t_email = new JLabel("Email:");
		t_email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		t_email.setBounds(10, 188, 48, 14);
		contentPane.add(t_email);
		
		c_email = new JTextField();
		c_email.setColumns(10);
		c_email.setBounds(86, 187, 286, 20);
		contentPane.add(c_email);
		
		JButton btn_cadastrar = new JButton("Cadastrar");
		btn_cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = c_nome.getText();
				int matricula = Integer.parseInt(c_matricula.getText());
				String curso = c_curso.getText();
				String email = c_email.getText();
				
				AlunoUnBControl.enviarAluno(nome, matricula, curso, email);
				JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
				
			}
		});
		btn_cadastrar.setBounds(86, 232, 118, 23);
		contentPane.add(btn_cadastrar);
		
		btn_dados = new JButton("Dados");
		btn_dados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, AlunoUnBControl.strRelatorio);
			}
		});
		btn_dados.setBounds(254, 232, 118, 23);
		contentPane.add(btn_dados);
	}
}
