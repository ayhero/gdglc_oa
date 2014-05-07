package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/base/resource.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_fielderror_cssStyle_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_fielderror_cssStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_fielderror_cssStyle_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 最新 Bootstrap 核心 CSS 文件 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- 可选的Bootstrap主题文件（一般不用引入） -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js\"></script>");
      out.write("\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t  <div class=\"col-md-12\">\r\n");
      out.write("\t\t    <div class=\"row\">\r\n");
      out.write("\t\t    \t<div class=\"col-md-6 col-md-offset-3 text-center\">\r\n");
      out.write("\t\t    \t\t<h4>登陆页面</h4>\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div class=\"row\">\r\n");
      out.write("\t\t      <div class=\"col-md-4\">\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t      <div class=\"col-md-4\">\r\n");
      out.write("\t\t        <form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("\t\t        \t\t");
      if (_jspx_meth_s_fielderror_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t    <label for=\"user.username\" class=\"col-sm-3 control-label\">用户名</label>\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t      <input type=\"text\" class=\"form-control\" id=\"user.username\" name=\"user.username\" placeholder=\"Email\">\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t    <label for=\"user.password\" class=\"col-sm-3 control-label\">密码</label>\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t      <input type=\"password\" class=\"form-control\" id=\"user.password\" name=\"user.password\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t        <label>\r\n");
      out.write("\t\t\t\t\t\t          <input type=\"checkbox\" name=\"isRemember\"> 记住我\r\n");
      out.write("\t\t\t\t\t\t        </label>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t      <button type=\"submit\" class=\"btn btn-default\">登陆</button>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t      <div class=\"col-md-4\">\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_fielderror_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_cssStyle_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_0.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_0.setParent(null);
    _jspx_th_s_fielderror_0.setCssStyle("color: red");
    int _jspx_eval_s_fielderror_0 = _jspx_th_s_fielderror_0.doStartTag();
    if (_jspx_th_s_fielderror_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_cssStyle_nobody.reuse(_jspx_th_s_fielderror_0);
      return true;
    }
    _jspx_tagPool_s_fielderror_cssStyle_nobody.reuse(_jspx_th_s_fielderror_0);
    return false;
  }
}
