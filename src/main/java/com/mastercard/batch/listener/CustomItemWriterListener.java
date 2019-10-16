package com.mastercard.batch.listener;

import org.springframework.batch.core.ItemWriteListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomItemWriterListener<T> implements ItemWriteListener<T> {

	@Override
	public void beforeWrite(List<? extends T> items) {
	}

	@Override
	public void afterWrite(List<? extends T> items) {
	}

	@Override
	public void onWriteError(Exception exception, List<? extends T> items) {
		//System.out.println("ItemWriteListener - onWriteError"+exception.getMessage());
		for (T t : items) {
			System.out.println(exception.getMessage()+" < = = > "+t.toString());
		}
	}

}