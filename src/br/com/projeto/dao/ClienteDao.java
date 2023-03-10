package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;

public class ClienteDao {

	private Connection con;
	
	//construtor
	public ClienteDao() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	//Metodo cadastrarCliente
	public void cadastrarCliente(Clientes obj) {
		
		try {
		  //1 passo criar o comando SQL 
		  String sql = "INSERT INTO tb_clientes  "
              + "(nome,rg,cpf,email,telefone,celular,cep,"
              + "endereco,numero,complemento,bairro,cidade,estado)"
              + " values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			
		  //2 passo -conectar o banco de dados e organizar o comando SQL
		  
		  PreparedStatement stmt = con.prepareStatement(sql);
			  stmt.setString(1, obj.getNome());
			  stmt.setString(2, obj.getRg());
			  stmt.setString(3, obj.getCpf());
			  stmt.setString(4, obj.getEmail());
			  stmt.setString(5, obj.getTelefone());
			  stmt.setString(6, obj.getCelular());
			  stmt.setString(7, obj.getCep());
			  stmt.setString(8, obj.getEndereco() );
			  stmt.setInt(9, obj.getNumero());
			  stmt.setString(10,obj.getComplemento());
			  stmt.setString(11,obj.getBairro());
			  stmt.setString(12,obj.getCidade());
			  stmt.setString(13,obj.getUf());
			  
		// 3 passo - executar o comando sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
			  
			  
			  
	
		
		} catch (SQLException erro) {
		
			JOptionPane.showMessageDialog(null, "Erro" + erro);
			  
			
		}		
		
	}
	////////////////////////////////////////////////////////////////////////////////////
	
	//Metodo alterarCliente
	public void alterarCliente() {
		
	}
	
	
	//Metodo excluirCliente
	public void excluirCliente() {
		
	}
	
	//ArrayList -Lista de itens
	//Metodo Listar todos os clientes
	
	public List<Clientes> listarClientes(){
	
		try {
		 // 1 passo criar lista
			List<Clientes> lista = new ArrayList<>();
			
		// 2 passo  - criar o sql , organizar e  executar
			
			String sql = "select * from tb_clientes";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Clientes obj = new Clientes();
				
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setRg(rs.getString("rg"));
				obj.setCpf(rs.getString("cpf"));
				obj.setEmail(rs.getString("email"));
				obj.setTelefone(rs.getString("telefone"));
				obj.setCelular(rs.getString("celular"));
				obj.setCep(rs.getString("Nome"));
				obj.setEndereco(rs.getString("endereco"));
				obj.setNumero(rs.getInt("numero"));
				obj.setComplemento(rs.getString("complemento"));
				obj.setCidade(rs.getString("cidade"));
				obj.setUf(rs.getString("estado"));
				
				lista.add(obj);
				
			}
			
			return lista;
			
			
		} catch (Exception erro) {
			
			JOptionPane.showMessageDialog(null, "Erro: " + erro);
			return null;
		}
		
		
		
		
		
	}
	
	
	
	
	
	
}
