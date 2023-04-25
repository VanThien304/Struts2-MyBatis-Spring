package com.tpv.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tpv.controller.BookController;
import com.tpv.entity.Book;

import freemarker.template.utility.StringUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

public class BookAction extends ActionSupport{

	/**
	 * 
	 */
	BookController bookController = new BookController();
	
	private static final long serialVersionUID = 1L;
	
	private List<Book> listBooks = new ArrayList<Book>();

	public List<Book> getListBooks() {
		return listBooks;
	}

	public void setListBooks(List<Book> listBooks) {
		this.listBooks = listBooks;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		listBooks = bookController.getListBook();
		return super.execute();
	}

	private String ma;
	private String bookId;
	private Book objSach;
	private File fileUpload;
	private String fileUploadFileName;
	private String fileUploadContentType;
	
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Book getObjSach() {
		return objSach;
	}

	public void setObjSach(Book objSach) {
		this.objSach = objSach;
	}
	
	public File getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}

	public String getFileUploadFileName() {
		return fileUploadFileName;
	}

	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}

	public String getFileUploadContentType() {
		return fileUploadContentType;
	}

	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}
	
	public String detailsBookInformation() {
		objSach= bookController.getDetailsByCode(ma);
		
		return SUCCESS;
	}
	
	public String addAndUpdateBook() {
		if(objSach!=null) {
			if(StringUtils.isEmpty(objSach.getBookName())) {
				addActionError("Bạn cần phải nhập tên sách trước khi thực hiện");
				return ERROR;
			}
			if(StringUtils.isEmpty(objSach.getAuthorName())) {
				addActionError("Bạn cần phải nhập tên tác giả!");
				return ERROR;
			}
//			xử lý upload file
			if(fileUploadFileName!=null && !fileUploadFileName.isEmpty() && fileUploadFileName.length()>0) {
				try {
//					lấy đường dẫn từ web.xml
					String filePath = ServletActionContext.getServletContext().getInitParameter("file-upload");
					System.out.println("Image location: "+ filePath);
	//				tạo một đối tượng file
					File fileToCreate = new File(filePath	, fileUploadFileName);
//						di chuyển file
					FileUtils.copyFile(fileUpload, fileToCreate);
				
				}catch(IOException ex) {
						System.out.println("Có lỗi xảy ra. chi tiết :");
						
					}
				objSach.setAvatar(fileUploadFileName);
				}
			//chủ đề
			objSach.setTopicId("TH");
			//kiểm tra TH sửa
			boolean result= false;
			if(StringUtils.isEmpty(bookId)) {
				result = bookController.update(objSach);
			}else {
				result = bookController.addBook(objSach);
			}
			if(result) {
				return SUCCESS;	
			}
		}
		return SUCCESS;
	}


}
