package com.hyperzsb.spring.security.springsecuritydemo1.config.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyperzsb.spring.security.springsecuritydemo1.domain.ResponseBean;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        ResponseBean error = ResponseBean.error("请求拒绝！");
        String string = new ObjectMapper().writeValueAsString(error);
        out.write(string);
        out.flush();
        out.close();
    }

}
