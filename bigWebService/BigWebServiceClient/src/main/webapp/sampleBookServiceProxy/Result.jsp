<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBookServiceProxyid" scope="session" class="service.BookServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBookServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleBookServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleBookServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        service.BookService getBookService10mtemp = sampleBookServiceProxyid.getBookService();
if(getBookService10mtemp == null){
%>
<%=getBookService10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String isbn_1id=  request.getParameter("isbn32");
            java.lang.String isbn_1idTemp = null;
        if(!isbn_1id.equals("")){
         isbn_1idTemp  = isbn_1id;
        }
        entity.Book getBookById15mtemp = sampleBookServiceProxyid.getBookById(isbn_1idTemp);
if(getBookById15mtemp == null){
%>
<%=getBookById15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pages:</TD>
<TD>
<%
if(getBookById15mtemp != null){
java.lang.Integer typepages18 = getBookById15mtemp.getPages();
        String tempResultpages18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepages18));
        %>
        <%= tempResultpages18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">isbn:</TD>
<TD>
<%
if(getBookById15mtemp != null){
java.lang.String typeisbn20 = getBookById15mtemp.getIsbn();
        String tempResultisbn20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeisbn20));
        %>
        <%= tempResultisbn20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">author:</TD>
<TD>
<%
if(getBookById15mtemp != null){
java.lang.String typeauthor22 = getBookById15mtemp.getAuthor();
        String tempResultauthor22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeauthor22));
        %>
        <%= tempResultauthor22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">publisher:</TD>
<TD>
<%
if(getBookById15mtemp != null){
java.lang.String typepublisher24 = getBookById15mtemp.getPublisher();
        String tempResultpublisher24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepublisher24));
        %>
        <%= tempResultpublisher24 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">price:</TD>
<TD>
<%
if(getBookById15mtemp != null){
java.lang.Double typeprice26 = getBookById15mtemp.getPrice();
        String tempResultprice26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprice26));
        %>
        <%= tempResultprice26 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">bookName:</TD>
<TD>
<%
if(getBookById15mtemp != null){
java.lang.String typebookName28 = getBookById15mtemp.getBookName();
        String tempResultbookName28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebookName28));
        %>
        <%= tempResultbookName28 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">yearPubish:</TD>
<TD>
<%
if(getBookById15mtemp != null){
java.lang.Integer typeyearPubish30 = getBookById15mtemp.getYearPubish();
        String tempResultyearPubish30 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeyearPubish30));
        %>
        <%= tempResultyearPubish30 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 34:
        gotMethod = true;
        entity.Book[] getListBooks34mtemp = sampleBookServiceProxyid.getListBooks();
if(getListBooks34mtemp == null){
%>
<%=getListBooks34mtemp %>
<%
}else{
        String tempreturnp35 = null;
        if(getListBooks34mtemp != null){
        java.util.List listreturnp35= java.util.Arrays.asList(getListBooks34mtemp);
        tempreturnp35 = listreturnp35.toString();
        }
        %>
        <%=tempreturnp35%>
        <%
}
break;
case 37:
        gotMethod = true;
        String pages_3id=  request.getParameter("pages42");
            java.lang.Integer pages_3idTemp = null;
        if(!pages_3id.equals("")){
         pages_3idTemp  = java.lang.Integer.valueOf(pages_3id);
        }
        String isbn_4id=  request.getParameter("isbn44");
            java.lang.String isbn_4idTemp = null;
        if(!isbn_4id.equals("")){
         isbn_4idTemp  = isbn_4id;
        }
        String author_5id=  request.getParameter("author46");
            java.lang.String author_5idTemp = null;
        if(!author_5id.equals("")){
         author_5idTemp  = author_5id;
        }
        String publisher_6id=  request.getParameter("publisher48");
            java.lang.String publisher_6idTemp = null;
        if(!publisher_6id.equals("")){
         publisher_6idTemp  = publisher_6id;
        }
        String price_7id=  request.getParameter("price50");
            java.lang.Double price_7idTemp = null;
        if(!price_7id.equals("")){
         price_7idTemp  = java.lang.Double.valueOf(price_7id);
        }
        String bookName_8id=  request.getParameter("bookName52");
            java.lang.String bookName_8idTemp = null;
        if(!bookName_8id.equals("")){
         bookName_8idTemp  = bookName_8id;
        }
        String yearPubish_9id=  request.getParameter("yearPubish54");
            java.lang.Integer yearPubish_9idTemp = null;
        if(!yearPubish_9id.equals("")){
         yearPubish_9idTemp  = java.lang.Integer.valueOf(yearPubish_9id);
        }
        %>
        <jsp:useBean id="entity1Book_2id" scope="session" class="entity.Book" />
        <%
        entity1Book_2id.setPages(pages_3idTemp);
        entity1Book_2id.setIsbn(isbn_4idTemp);
        entity1Book_2id.setAuthor(author_5idTemp);
        entity1Book_2id.setPublisher(publisher_6idTemp);
        entity1Book_2id.setPrice(price_7idTemp);
        entity1Book_2id.setBookName(bookName_8idTemp);
        entity1Book_2id.setYearPubish(yearPubish_9idTemp);
        boolean insertBook37mtemp = sampleBookServiceProxyid.insertBook(entity1Book_2id);
        String tempResultreturnp38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertBook37mtemp));
        %>
        <%= tempResultreturnp38 %>
        <%
break;
case 56:
        gotMethod = true;
        String pages_11id=  request.getParameter("pages61");
            java.lang.Integer pages_11idTemp = null;
        if(!pages_11id.equals("")){
         pages_11idTemp  = java.lang.Integer.valueOf(pages_11id);
        }
        String isbn_12id=  request.getParameter("isbn63");
            java.lang.String isbn_12idTemp = null;
        if(!isbn_12id.equals("")){
         isbn_12idTemp  = isbn_12id;
        }
        String author_13id=  request.getParameter("author65");
            java.lang.String author_13idTemp = null;
        if(!author_13id.equals("")){
         author_13idTemp  = author_13id;
        }
        String publisher_14id=  request.getParameter("publisher67");
            java.lang.String publisher_14idTemp = null;
        if(!publisher_14id.equals("")){
         publisher_14idTemp  = publisher_14id;
        }
        String price_15id=  request.getParameter("price69");
            java.lang.Double price_15idTemp = null;
        if(!price_15id.equals("")){
         price_15idTemp  = java.lang.Double.valueOf(price_15id);
        }
        String bookName_16id=  request.getParameter("bookName71");
            java.lang.String bookName_16idTemp = null;
        if(!bookName_16id.equals("")){
         bookName_16idTemp  = bookName_16id;
        }
        String yearPubish_17id=  request.getParameter("yearPubish73");
            java.lang.Integer yearPubish_17idTemp = null;
        if(!yearPubish_17id.equals("")){
         yearPubish_17idTemp  = java.lang.Integer.valueOf(yearPubish_17id);
        }
        %>
        <jsp:useBean id="entity1Book_10id" scope="session" class="entity.Book" />
        <%
        entity1Book_10id.setPages(pages_11idTemp);
        entity1Book_10id.setIsbn(isbn_12idTemp);
        entity1Book_10id.setAuthor(author_13idTemp);
        entity1Book_10id.setPublisher(publisher_14idTemp);
        entity1Book_10id.setPrice(price_15idTemp);
        entity1Book_10id.setBookName(bookName_16idTemp);
        entity1Book_10id.setYearPubish(yearPubish_17idTemp);
        boolean updateBook56mtemp = sampleBookServiceProxyid.updateBook(entity1Book_10id);
        String tempResultreturnp57 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateBook56mtemp));
        %>
        <%= tempResultreturnp57 %>
        <%
break;
case 75:
        gotMethod = true;
        String isbn_18id=  request.getParameter("isbn78");
            java.lang.String isbn_18idTemp = null;
        if(!isbn_18id.equals("")){
         isbn_18idTemp  = isbn_18id;
        }
        boolean deleteBook75mtemp = sampleBookServiceProxyid.deleteBook(isbn_18idTemp);
        String tempResultreturnp76 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteBook75mtemp));
        %>
        <%= tempResultreturnp76 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>