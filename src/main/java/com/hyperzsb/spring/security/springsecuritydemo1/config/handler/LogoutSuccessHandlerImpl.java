package com.hyperzsb.spring.security.springsecuritydemo1.config.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyperzsb.spring.security.springsecuritydemo1.domain.ResponseBean;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        ResponseBean ok = ResponseBean.ok("登出成功!", null);
        String string = new ObjectMapper().writeValueAsString(ok);
        out.write(string);
        out.flush();
        out.close();
    }
}
