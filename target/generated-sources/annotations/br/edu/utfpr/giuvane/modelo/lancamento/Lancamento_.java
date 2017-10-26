package br.edu.utfpr.giuvane.modelo.lancamento;

import br.edu.utfpr.giuvane.modelo.categoria.Categoria;
import br.edu.utfpr.giuvane.modelo.cheque.Cheque;
import br.edu.utfpr.giuvane.modelo.conta.Conta;
import br.edu.utfpr.giuvane.modelo.usuario.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lancamento.class)
public abstract class Lancamento_ {

	public static volatile SingularAttribute<Lancamento, Integer> lancamento;
	public static volatile SingularAttribute<Lancamento, Date> data;
	public static volatile SingularAttribute<Lancamento, Categoria> categoria;
	public static volatile SingularAttribute<Lancamento, Conta> conta;
	public static volatile SingularAttribute<Lancamento, BigDecimal> valor;
	public static volatile SingularAttribute<Lancamento, Cheque> cheque;
	public static volatile SingularAttribute<Lancamento, Usuario> usuario;
	public static volatile SingularAttribute<Lancamento, String> descricao;

}

