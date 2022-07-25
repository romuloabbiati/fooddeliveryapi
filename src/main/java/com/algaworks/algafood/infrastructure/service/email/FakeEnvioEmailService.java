package com.algaworks.algafood.infrastructure.service.email;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FakeEnvioEmailService extends SmtpEnvioEmailService {
	
	@Override
	public void enviar(Mensagem mensagem) {
		
		String corpo = processaTemplate(mensagem);
		
		log.info("\n[ FAKE E-MAIL ] Para: {}\n{}", mensagem.getDestinatarios(), corpo);
	}

}
