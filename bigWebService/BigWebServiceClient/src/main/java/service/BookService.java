/**
 * BookService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface BookService extends java.rmi.Remote {
    public entity.Book getBookById(java.lang.String isbn) throws java.rmi.RemoteException;
    public entity.Book[] getListBooks() throws java.rmi.RemoteException;
    public boolean insertBook(entity.Book book) throws java.rmi.RemoteException;
    public boolean updateBook(entity.Book book) throws java.rmi.RemoteException;
    public boolean deleteBook(java.lang.String isbn) throws java.rmi.RemoteException;
}
