package nemchin.ru.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nemchin.ru.object.User;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CheckUserInterceptor extends HandlerInterceptorAdapter{

	
		
		@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
			if (request.getRequestURI().contains("check-user")) {

				User user = (User) modelAndView.getModel().get("user");
				if (user.getName().isEmpty() || user.getPassword().isEmpty()) {
					response.sendRedirect(request.getContextPath() + "/failed");
				}

			}
		}

	
}
