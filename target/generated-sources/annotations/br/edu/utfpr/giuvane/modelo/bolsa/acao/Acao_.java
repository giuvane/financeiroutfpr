package br.edu.utfpr.giuvane.modelo.bolsa.acao;

import br.edu.utfpr.giuvane.modelo.usuario.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Acao.class)
public abstract class Acao_ {

	public static volatile SingularAttribute<Acao, Integer> codigo;
	public static volatile SingularAttribute<Acao, String> sigla;
	public static volatile SingularAttribute<Acao, Character> origem;
	public static volatile SingularAttribute<Acao, Usuario> usuario;
	public static volatile SingularAttribute<Acao, Integer> quantidade;
	public static volatile SingularAttribute<Acao, String> descricao;

}

