package br.com.senac.cadastrousuario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="coletor")
public class Coletor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long coletorId;
    
    @OneToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public Coletor(long coletorId) {
        this.coletorId = coletorId;
 
    }

    public long getColetorId() {
        return coletorId;
    }

    public void setColetorId(long coletorId) {
        this.coletorId = coletorId;
    }

  

    @Override
    public String toString() {
        return "Coletor{" +
                "coletorId=" + coletorId +
                '}';
    }
}
