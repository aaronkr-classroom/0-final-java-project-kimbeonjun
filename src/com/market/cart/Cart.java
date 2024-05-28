package com.market.cart;

import java.util.ArrayList;
import com.market.bookitem.Book;

public class Cart implements CartInterface {
	public ArrayList<CartItem> mCartItem = new ArrayList<CartItem>();
	
	// static final int NUM_BOOK = 3;
	// CartItem[] mCartItem = new CartItem[NUM_BOOK];
	public static int mCartCount = 0;
	public Cart() {
		
	}
	
	public void printBookList(ArrayList<Book> booklist) {
		
	}
	
	public void insertBook(Book book) {
		// mCartItem[mCartCount++] = new CartItem(book);
		CartItem bookitem = new CartItem(book);
		mCartItem.add(bookitem);
		mCartCount = mCartItem.size();
	}
	
	public void deleteBook() {
		// mCartItem = new CartItem[NUM_BOOK];
		mCartItem.clear();
		mCartCount = 0;
	}
	
	public void printCart() {
		System.out.println("장바구니 상품 목록 :");
		System.out.println("----------------------------------------------------");
		System.out.println("	도서ID \t|	수량 \t|		합계");
		System.out.println("----------------------------------------------------");
	}
	
	public boolean isCartInBook(String bookId) {
		boolean flag = false;
		return flag;
	}
	
	public void removeCart(int numId) {
		
		mCartItem.remove(numId);
		mCartCount = mCartItem.size();
	}
	
	public ArrayList<CartItem> getmCartItem() {
		return mCartItem;
	}
	
	public void setmCartItem(ArrayList<CartItem> mCartItem) {
		this.mCartItem = mCartItem;
	}
} // Cart 클래스 끝
