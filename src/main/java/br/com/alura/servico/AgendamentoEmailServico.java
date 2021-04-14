package br.com.alura.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.alura.dao.AgendamentoEmailDAO;
import br.com.alura.entidade.AgendamentoEmail;

@Stateless // <- a cada nova requisicao, eh criada uma nova instancia de AgendamentoEmailServico
//@EJB <- entrega o mesmo resultado citado acima. A diferença é que a anotação @EJB só funcionará se você estiver trabalhando com um EJB, caso contrário ocorrerá uma exceção. Já a anotação @Inject funcionará para EJB e, também, para outros recursos habilitados para injeção de dependência.
public class AgendamentoEmailServico {
	
	@Inject
	private AgendamentoEmailDAO dao;

	public List<AgendamentoEmail> listar() {
		return dao.listar();
	}
}
