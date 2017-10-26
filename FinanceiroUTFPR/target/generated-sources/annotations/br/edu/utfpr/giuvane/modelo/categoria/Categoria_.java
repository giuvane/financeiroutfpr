package br.edu.utfpr.giuvane.modelo.categoria;

import br.edu.utfpr.giuvane.modelo.usuario.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Categoria.class)
public abstract class Categoria_ {

	public static volatile SingularAttribute<Categoria, Integer> codigo;
	public static volatile SingularAttribute<Categoria, Integer> fator;
	public static volatile SingularAttribute<Categoria, Categoria> pai;
	public static volatile SingularAttribute<Categoria, Usuario> usuario;
	public static volatile ListAttribute<Categoria, Categoria> filhos;
	public static volatile SingularAttribute<Categoria, String> descricao;

}

