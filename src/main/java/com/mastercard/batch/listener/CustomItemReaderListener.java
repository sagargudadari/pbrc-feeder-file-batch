package com.mastercard.batch.listener;


import org.springframework.batch.core.ItemReadListener;
import org.springframework.stereotype.Component;

@Component
public class CustomItemReaderListener<T> implements ItemReadListener<T> {

	@Override
	public void beforeRead() {
		//System.out.println("item lister started");
	}

	@Override
	public void afterRead(T t) {
		//System.out.println("afterRead => "+t.toString());
	}

	@Override
	public void onReadError(Exception ex) {
		System.out.println("You have read record error ==>"+ex.getMessage());
	}

}