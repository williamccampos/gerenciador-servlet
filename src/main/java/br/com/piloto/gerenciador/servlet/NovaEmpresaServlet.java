package br.com.piloto.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public NovaEmpresaServlet() {

    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastro de nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");

	}

}
