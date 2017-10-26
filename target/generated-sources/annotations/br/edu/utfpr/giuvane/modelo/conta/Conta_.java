package br.edu.utfpr.giuvane.modelo.conta;

import br.edu.utfpr.giuvane.modelo.usuario.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Conta.class)
public abstract class Conta_ {

	public static volatile SingularAttribute<Conta, Integer> conta;
	public static volatile SingularAttribute<Conta, Boolean> favorita;
	public static volatile SingularAttribute<Conta, Usuario> usuario;
	public static volatile SingularAttribute<Conta, Float> saldoInicial;
	public static volatile SingularAttribute<Conta, Date> dataCadastro;
	public static volatile SingularAttribute<Conta, String> descricao;

}

