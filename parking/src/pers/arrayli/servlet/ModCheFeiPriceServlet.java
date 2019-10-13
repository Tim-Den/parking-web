package pers.arrayli.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.arrayli.domain.CheFeiPrice;
import pers.arrayli.service.CheFeiPriceService;
import pers.arrayli.service.impl.CheFeiPriceServiceImpl;


/**
 *	修改车费价格 servlet
 */
public class ModCheFeiPriceServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			System.out.println("----------------------ModCheFeiPriceServlet DEBUG Start----------------------");
			// 1.获取车费价格数据
			int id = Integer.parseInt(request.getSession().getAttribute("pid").toString());
		
			int price = Integer.parseInt(request.getParameter("price"));
			System.out.println("----------------------ModCheFeiPriceServlet DEBUG 1----------------------");
			// 2.把车费价格封装成一个 CheFeiPrice对象
			CheFeiPrice cheFeiPrice = new CheFeiPrice();
			cheFeiPrice.setPrice(price);
			cheFeiPrice.setId(id);
			System.out.println("chefei: "+cheFeiPrice.toString());
			// 3.通过业务层代码处理请求
			CheFeiPriceService service = new CheFeiPriceServiceImpl();
			boolean result = service.setFare(id, cheFeiPrice);
			System.out.println("----------------------ModCheFeiPriceServlet DEBUG 2----------------------");
			// 如果修改车费价格成功
			if(result){
				request.getSession().setAttribute("fei", price);
				response.getWriter().println("<script>alert('修改收费标准成功！');window.location.href='fei/modFei.jsp'</script>");
			}else{
				// 如果修改车费结果失败
				response.getWriter().println("<script>alert('修改收费标准失败！');window.location.href='fei/modFei.jsp'</script>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------ModCheFeiPriceServlet DEBUG End----------------------");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
