package br.com.senac.cadastrousuario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="descartador")
public class Descartador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long descartadorId;

    
    @OneToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public Descartador(long descartadorId) {
        this.descartadorId = descartadorId;
     
    }

    public long getDescartadorId() {
        return descartadorId;
    }

    public void setDescartadorId(long descartadorId) {
        this.descartadorId = descartadorId;
    }

  
    @Override
    public String toString() {
        return "Descartador{" +
                "descartadorId=" + descartadorId +
                '}';
    }
}
