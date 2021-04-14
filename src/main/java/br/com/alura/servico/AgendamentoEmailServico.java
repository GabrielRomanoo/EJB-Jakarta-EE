package br.com.alura.servico;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.alura.dao.AgendamentoEmailDAO;
import br.com.alura.entidade.AgendamentoEmail;

@Stateless // <- a cada nova requisicao, eh criada uma nova instancia de AgendamentoEmailServico
//@EJB <- entrega o mesmo resultado citado acima. A diferen�a � que a anota��o @EJB s� funcionar� se voc� estiver trabalhando com um EJB, caso contr�rio ocorrer� uma exce��o. J� a anota��o @Inject funcionar� para EJB e, tamb�m, para outros recursos habilitados para inje��o de depend�ncia.
public class AgendamentoEmailServico {
	
	@Inject
	private AgendamentoEmailDAO dao;

	public List<AgendamentoEmail> listar() {
		return dao.listar();
	}
}
