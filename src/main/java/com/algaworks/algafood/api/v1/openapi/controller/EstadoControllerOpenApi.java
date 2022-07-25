package com.algaworks.algafood.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;

import com.algaworks.algafood.api.exceptionhandler.Problem;
import com.algaworks.algafood.api.v1.model.EstadoModel;
import com.algaworks.algafood.api.v1.model.input.EstadoInput;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Estados")
public interface EstadoControllerOpenApi {

	@ApiOperation("Lista estados")
	CollectionModel<EstadoModel> listar();
	
	
	@ApiOperation("Busca um estado por Id")
	@ApiResponses({
		@ApiResponse(code = 400, message = "Id de um estado inválido", response = Problem.class),
		@ApiResponse(code = 404, message = "Estado não encontrado", response = Problem.class)
	})
	EstadoModel buscar(
			@ApiParam(value = "Id de um estado", example = "1", required = true)
			Long estadoId);

	
	@ApiOperation("Cadastra um estado")
	@ApiResponses({
		@ApiResponse(code = 201, message = "Estado cadastrado")
	})
	EstadoModel adicionar(
			@ApiParam(name = "corpo", value = "Representação de um novo estado", required = true)
			EstadoInput estadoInput);

	
	@ApiOperation("Atualiza um estado por Id")
	@ApiResponses({
		@ApiResponse(code = 200, message = "Estado atualizado"),
		@ApiResponse(code = 404, message = "Estado não encontrado", response = Problem.class)
	})
	EstadoModel atualizar(
			@ApiParam(value = "Id de um estado", example = "1", required = true)
			Long estadoId, 
			
			@ApiParam(name = "corpo", value = "Representação de um novo estado", required = true)
			EstadoInput estadoInput);
	
	@ApiResponses({
		@ApiResponse(code = 204, message = "Estado excluído"),
		@ApiResponse(code = 404, message = "Estado não encontrado", response = Problem.class)
	})
	@ApiOperation("Exclui um estado por Id")
	void remover(
			@ApiParam(value = "Id de um estado", example = "1", required = true)
			Long estadoId);
	
}
