package com.algaworks.algafood.api.v1.model;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Relation(collectionRelation = "usuarios")
@Setter
@Getter
public class UsuarioModel extends RepresentationModel<UsuarioModel> {

	@ApiModelProperty(example = "1")
	private Long id;
	
	@ApiModelProperty(example = "Romulo Hipolito Abbiati")
	private String nome;
	
	@ApiModelProperty(example = "rhabbiati@hotmail.com")
	private String email;
	
}
