package br.com.senac.cadastrousuario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario_tipo")
public class UsuarioTipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long usuarioTipoId;
	private String descricao;
	private String status;

	public UsuarioTipo(long usuarioTipoId, String descricao, String status) {
		this.usuarioTipoId = usuarioTipoId;
		this.descricao = descricao;
		this.status = status;
	}

	public long getUsuarioTipoId() {
		return usuarioTipoId;
	}

	public void setUsuarioTipoId(long usuarioTipoId) {
		this.usuarioTipoId = usuarioTipoId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UsuarioTipo{" + "usuarioTipoId=" + usuarioTipoId + ", descricao='" + descricao + '\'' + ", status='"
				+ status + '\'' + '}';
	}
}
