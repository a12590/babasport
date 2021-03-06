package com.lionxxw.common.model;

import com.lionxxw.common.constants.DataStatus;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


public class Response<T> implements Serializable {

	public Response(){
		
	}
	
	public Response(int status, String message, T data){
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public int status = DataStatus.HTTP_SUCCESS;
	
	public String message;
	
	public T data;

	public T parentData;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getParentData() {
		return parentData;
	}

	public void setParentData(T parentData) {
		this.parentData = parentData;
	}
}
