package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.v1.model.UsuarioModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Restaurantes")
public interface RestauranteUsuarioResponsavelControllerOpenApi {

	@ApiOperation("Lista os usuários responsáveis associados a restaurante")
	@ApiResponses({
		@ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problem.class)
	})
	CollectionModel<UsuarioModel> listar(
			@ApiParam(value = "Id do restaurante", example = "1", required = true)
			Long restauranteId);
	
	@ApiOperation("Associação de restaurante com usuário responsável")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Associação realizada com sucesso"),
		@ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problem.class)
	})
	ResponseEntity<Void> associar(
			@ApiParam(value = "Id do restaurante", example = "1", required = true)
			Long restauranteId, 
			
			@ApiParam(name = "corpo", value = "Id do usuário", example = "1", required = true)
			Long usuarioId);
	
	@ApiOperation("Desassociação de restaurante com usuário responsável")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Desassociação realizada com sucesso"),
		@ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problem.class)
	})
	ResponseEntity<Void> desassociar(
			@ApiParam(value = "Id do restaurante", example = "1", required = true)
			Long restauranteId, 
			
			@ApiParam(name = "corpo", value = "Id do usuário", example = "1", required = true)
			Long usuarioId);
	
}
