package com.jhb0430.servlet.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// filter 인페이스	
// 꼭 필요한 servlet에만 쓸 수 있게 해주는게 효율적이다.
// url 맵핑 했던 것 처럼 범위 잡아주기.ㄳ하게도 어노테이션 존재함
@WebFilter("/*") // serlvet으로 시작하는 경로에 대해서만 필터 처리를 해주겠다는 뜻. 
// 해당 필터가 거쳐갈 서블릿에 대한 path 범위. 
// cf) "/*" << 전체에 대해서 처리한다는 뜻.
public class EncodingFilter implements Filter{
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		request.setCharacterEncoding("utf-8"); // UnsupportedEncodingException 어저구 있는데 걍 throws ㅇㅇㄴ
		response.setCharacterEncoding("utf-8");
		
		chain.doFilter(request, response);
		// 필터 호줄해주는 이유 -> 여러겹 있는 필터의 처리를 유연하게 하기 위하여.
		
	}

}
