package com.algaworks.algafood.core.email;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Validated
@Setter
@Getter
@Component
@ConfigurationProperties(value = "algafood.email")
public class EmailProperties {

	@NotNull
	private String remetente;
	
	private Sandbox sandbox = new Sandbox();
	
	private Implementacao impl = Implementacao.SANDBOX;
	
	public enum Implementacao {
		FAKE, SMTP, SANDBOX
	}
	
	@Getter
	@Setter
	public class Sandbox {
		private String destinatario;
	}
	
	
	
}
