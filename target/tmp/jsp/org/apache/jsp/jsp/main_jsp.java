package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/base/resource.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\t\t  \t<h4>欢迎</h4>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t      <div class=\"col-md-3\">\r\n");
      out.write("\t\t      \t<div class=\"panel-group\" id=\"accordion\">\r\n");
      out.write("\t\t\t\t  <div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t    <div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t      <h4 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\"  class=\"btn btn-block\">\r\n");
      out.write("\t\t\t\t          \t邮件\r\n");
      out.write("\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t      </h4>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t    <div id=\"collapseOne\" class=\"panel-collapse collapse in\">\r\n");
      out.write("\t\t\t\t      <div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t  \t<a href=\"newMail?mail.userFrom=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" target=\"content\" class=\"btn btn-block btn-primary\">新邮件</a>\r\n");
      out.write("\t\t\t\t\t  \t<a href=\"base/success.jsp?mailType=未读邮件\" target=\"content\" class=\"btn btn-block\">未读邮件</a>\r\n");
      out.write("\t\t\t\t\t  \t<a href=\"mails\" target=\"content\" class=\"btn btn-block\">收件箱</a>\r\n");
      out.write("\t\t\t\t\t  \t<a href=\"base/success.jsp\" target=\"content\" class=\"btn btn-block\">发件箱</a>\r\n");
      out.write("\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t      \r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t      <!-- 中间内容页 -->\r\n");
      out.write("\t\t      <div class=\"col-md-7\">\r\n");
      out.write("\t\t        \t<iframe name=\"content\" width=\"100%\" height=\"100%\" frameborder=\"0\">\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t        \t</iframe>\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t      <div class=\"col-md-2\">\r\n");
      out.write("\t\t        \t<h4>right side brar</h4>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
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
}
