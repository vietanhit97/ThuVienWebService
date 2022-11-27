package service;

public class BookServiceProxy implements service.BookService {
  private String _endpoint = null;
  private service.BookService bookService = null;
  
  public BookServiceProxy() {
    _initBookServiceProxy();
  }
  
  public BookServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookServiceProxy();
  }
  
  private void _initBookServiceProxy() {
    try {
      bookService = (new service.BookServiceServiceLocator()).getBookService();
      if (bookService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookService != null)
      ((javax.xml.rpc.Stub)bookService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.BookService getBookService() {
    if (bookService == null)
      _initBookServiceProxy();
    return bookService;
  }
  
  public entity.Book getBookById(java.lang.String isbn) throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.getBookById(isbn);
  }
  
  public entity.Book[] getListBooks() throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.getListBooks();
  }
  
  public boolean insertBook(entity.Book book) throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.insertBook(book);
  }
  
  public boolean updateBook(entity.Book book) throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.updateBook(book);
  }
  
  public boolean deleteBook(java.lang.String isbn) throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.deleteBook(isbn);
  }
  
  
}