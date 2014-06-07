package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>Get Delicious bookmark count with jQuery</h1>\r\n");
      out.write("\r\n");
      out.write("\tURL :\r\n");
      out.write("\t<input type='text' id='url' size='50' value='http://www.google.com' />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<h4>\r\n");
      out.write("\t\tDelicious count : <span id=\"delicious_result\"></span>\r\n");
      out.write("\t</h4>\r\n");
      out.write("\r\n");
      out.write("\t<button id=\"delicious\">Get Delicious Count (.Ajax)</button>\r\n");
      out.write("\t<button id=\"delicious2\">Get Delicious Count (.getJSON)</button>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$('#delicious')\r\n");
      out.write("\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#delicious_result\").text(\"Loading......\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tvar url = $('#url').val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\turl : \"http://feeds.delicious.com/v2/json/urlinfo/data?url=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t+ url + \"&amp;callback=?\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar count = 0;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (data.length > 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tcount = data[0].total_posts;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#delicious_result\").text(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcount + ' Saved');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#delicious2').click(\r\n");
      out.write("\t\t\t\tfunction() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$(\"#delicious_result\").text(\"Loading......\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar url = $('#url').val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$.getJSON(\r\n");
      out.write("\t\t\t\t\t\t\t\"http://feeds.delicious.com/v2/json/urlinfo/data?url=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ url + \"&amp;callback=?\",\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tfunction(data) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tvar count = 0;\r\n");
      out.write("\t\t\t\t\t\t\t\tif (data.length > 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcount = data[0].total_posts;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#delicious_result\").text(count + ' Saved');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
