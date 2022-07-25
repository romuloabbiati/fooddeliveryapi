package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.v1.model.PermissaoModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Grupos")
public interface GrupoPermissaoControllerOpenApi {

	@ApiOperation(value = "Lista as permissões associadas a um grupo")
	@ApiResponses({
		@ApiResponse(code = 400, message = "Id do grupo inválido", response = Problem.class),
		@ApiResponse(code = 404, message = "Grupo não encontrado", response = Problem.class)
	})
	CollectionModel<PermissaoModel> listar(
			@ApiParam(value = "Id do grupo", example = "1", required = true)
			Long grupoId);
	
	@ApiOperation(value = "Associação de permissão com grupo")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Associação realizada com sucesso"),
		@ApiResponse(code = 404, message = "Grupo ou permissão não encontrado", 
		response = Problem.class)
	})
	ResponseEntity<Void> associarPermissao(
			@ApiParam(value = "Id do grupo", example = "1", required = true)
			Long grupoId, 
			
			@ApiParam(value = "Id da permissão", example = "1", required = true)
			Long permissaoId);
	
	@ApiOperation(value = "Desassociação de permissão com grupo")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Desassociação realizada com sucesso"),
		@ApiResponse(code = 404, message = "Grupo ou permissão não encontrado", 
		response = Problem.class)
	})
	ResponseEntity<Void> desassociarPermissao(
			@ApiParam(value = "Id do grupo", example = "1", required = true)
			Long grupoId, 
			
			@ApiParam(value = "Id da permissão", example = "1", required = true)
			Long permissaoId);
	
}
