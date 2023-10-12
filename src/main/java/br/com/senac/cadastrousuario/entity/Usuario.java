package br.com.senac.cadastrousuario.entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
	    private int status;
	    private String email;
	    private String nome;
	    private String telefone;
	    private String endereco;
	    private String cpf;
	    private String cnpj;
	    private String senha;
	    private byte[] fotoPerfil;
	    
	    @OneToOne
	    @JoinColumn(name="usuario_tipo_id")
	    private UsuarioTipo usuarioTipo;
	    
	    public Usuario(long id, int status, String email, String nome, String telefone, String endereco, String cpf, String cnpj, String senha, byte[] fotoPerfil) {
	        this.id = id;
	        this.status = status;
	        this.email = email;
	        this.nome = nome;
	        this.telefone = telefone;
	        this.endereco = endereco;
	        this.cpf = cpf;
	        this.cnpj = cnpj;
	        this.senha = senha;
	        this.fotoPerfil = fotoPerfil;
	    }

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public byte[] getFotoPerfil() {
			return fotoPerfil;
		}

		public void setFotoPerfil(byte[] fotoPerfil) {
			this.fotoPerfil = fotoPerfil;
		}
	    
		@Override
		public String toString() {
	        return "Usuario{" +
	                "id=" + id +
	                ", status=" + status +
	                ", email='" + email + '\'' +
	                ", nome='" + nome + '\'' +
	                ", telefone='" + telefone + '\'' +
	                ", endereco='" + endereco + '\'' +
	                ", cpf='" + cpf + '\'' +
	                ", cnpj='" + cnpj + '\'' +
	                ", senha='" + senha + '\'' +
	                ", fotoPerfil=" + Arrays.toString(fotoPerfil) +
	                '}';
	    }

}
