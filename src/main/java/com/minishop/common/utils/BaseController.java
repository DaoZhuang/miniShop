package com.minishop.common.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * base controller ,所有的controller必须继承这个controller
 * 1.getPageData（）:将前台传过来的参数封装到PageData 中，参数的接收请直接使用此方法；
 * 2.getModelAndView（）：返回ModelAndView
 * 3.
 */
public class BaseController {


	private static final long serialVersionUID = 6357869213649815390L;

	/**
	 * 得到PageData
	 */
	public PageData getPageData(){
		return new PageData(this.getRequest());
	}

	/**
	 * 得到ModelAndView
	 */
	public ModelAndView getModelAndView(){
		return new ModelAndView();
	}

	/**
	 * 得到request对象
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}
	/**
	 * 设置cookie
	 */

	public void refreshCookie(HttpServletResponse response, String key, String value,int maxAge) throws Exception {
		Cookie cookie = new Cookie(key, URLEncoder.encode(value, "UTF-8"));
		cookie.setMaxAge(maxAge);
		cookie.setPath("/");
		response.addCookie(cookie);
	}

	/**
	 * 获取value值
	 */
	public static String getCookieValue(HttpServletRequest request, String cookieName, boolean isDecoder) {
		Cookie[] cookieList = request.getCookies();
		if (cookieList == null || cookieName == null) {
			return null;
		}
		String retValue = null;
		try {
			for (int i = 0; i < cookieList.length; i++) {
				if (cookieList[i].getName().equals(cookieName)) {
					if (isDecoder) {
						retValue = URLDecoder.decode(cookieList[i].getValue(), "UTF-8");
					} else {
						retValue = cookieList[i].getValue();
					}
					break;
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return retValue;
	}
}