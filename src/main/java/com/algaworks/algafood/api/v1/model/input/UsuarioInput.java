package com.algaworks.algafood.api.v1.model.input;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioInput {

	@ApiModelProperty(example = "Romulo Hipolito Abbiati", required = true)
	@NotBlank
	private String nome;
	
	@ApiModelProperty(example = "rhabbiati@hotmail.com", required = true)
	@NotBlank
	@Email
	private String email;
	
}
