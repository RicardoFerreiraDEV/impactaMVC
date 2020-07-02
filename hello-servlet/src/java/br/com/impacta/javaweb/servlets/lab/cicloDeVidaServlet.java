package br.com.impacta.javaweb.servlets.lab;
import java.io.IOException;
import javax.servlet.ServletConfig;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="cicloVida", urlPatterns={"/cicloVida"})
public class cicloDeVidaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

        @Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Iniciando!");
	}
        @Override
	public void destroy() {
		System.out.println("Servlet Encerrando!");
	}
        @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Algum Metodo http foi chamado!");
	}
}
