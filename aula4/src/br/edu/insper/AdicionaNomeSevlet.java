package br.edu.insper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdicionaNomeSevlet
 */
@WebServlet("/adicionaNome")
public class AdicionaNomeSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionaNomeSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String curso = request.getParameter("curso");
		
		PrintWriter out  = response.getWriter();
		
        out.println("<html>");
        out.println("<body>");
        out.println("Nome: "+ nome );
        out.println("e-mail: "+ email );
        out.println("Curso: "+ curso );
        out.println("</body>");
        out.println("</html>");

        
	}
	/*protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String curso = request.getParameter("curso");
		
		PrintWriter out  = response.getWriter();
		
        out.println("<html>");
        out.println("<body>");
        out.println("Nome: "+ nome );
        out.println("e-mail: "+ email );
        out.println("Curso: "+ curso );
        out.println("</body>");
        out.println("</html>");
        
		
	}*/

}
