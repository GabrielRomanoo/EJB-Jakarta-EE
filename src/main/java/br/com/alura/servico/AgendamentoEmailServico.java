package br.com.alura.servico;

import java.util.List;

import javax.ejb.Stateless;

@Stateless // <- a cada nova requisicao, eh criada uma nova instancia de AgendamentoEmailServico
//@EJB <- entrega o mesmo resultado citado acima. A diferença é que a anotação @EJB só funcionará se você estiver trabalhando com um EJB, caso contrário ocorrerá uma exceção. Já a anotação @Inject funcionará para EJB e, também, para outros recursos habilitados para injeção de dependência.
public class AgendamentoEmailServico {

	public List<String> listar() {
		return List.of("joao@alura.com.br");
	}
}
