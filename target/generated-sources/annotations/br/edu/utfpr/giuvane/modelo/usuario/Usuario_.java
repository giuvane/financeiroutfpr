package br.edu.utfpr.giuvane.modelo.usuario;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile SingularAttribute<Usuario, Integer> codigo;
	public static volatile SingularAttribute<Usuario, Date> nascimento;
	public static volatile SingularAttribute<Usuario, Boolean> ativo;
	public static volatile SingularAttribute<Usuario, String> celular;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile SingularAttribute<Usuario, String> idioma;
	public static volatile SingularAttribute<Usuario, String> login;
	public static volatile SetAttribute<Usuario, String> permissao;
	public static volatile SingularAttribute<Usuario, String> email;

}

