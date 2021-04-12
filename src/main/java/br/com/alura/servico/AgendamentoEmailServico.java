package br.com.alura.servico;

import java.util.List;

import javax.ejb.Stateless;

@Stateless // <- a cada nova requisicao, eh criada uma nova instancia de AgendamentoEmailServico
//@EJB <- entrega o mesmo resultado citado acima. A diferen�a � que a anota��o @EJB s� funcionar� se voc� estiver trabalhando com um EJB, caso contr�rio ocorrer� uma exce��o. J� a anota��o @Inject funcionar� para EJB e, tamb�m, para outros recursos habilitados para inje��o de depend�ncia.
public class AgendamentoEmailServico {

	public List<String> listar() {
		return List.of("joao@alura.com.br");
	}
}
