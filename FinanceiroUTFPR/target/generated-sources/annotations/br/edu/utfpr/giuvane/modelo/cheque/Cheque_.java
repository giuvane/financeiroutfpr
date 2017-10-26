package br.edu.utfpr.giuvane.modelo.cheque;

import br.edu.utfpr.giuvane.modelo.conta.Conta;
import br.edu.utfpr.giuvane.modelo.lancamento.Lancamento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cheque.class)
public abstract class Cheque_ {

	public static volatile SingularAttribute<Cheque, Character> situacao;
	public static volatile SingularAttribute<Cheque, Lancamento> lancamento;
	public static volatile SingularAttribute<Cheque, ChequeId> chequeId;
	public static volatile SingularAttribute<Cheque, Conta> conta;
	public static volatile SingularAttribute<Cheque, Date> dataCadastro;

}

