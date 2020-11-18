package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("index.jsp");
		mav.addObject("message", "Hello Spring MVC");
		System.out.println("更新1");
		System.out.println("创建分支");
		System.out.println("创建分支2");
		System.out.println("在线修改");
		return mav;
	}
}
