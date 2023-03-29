package br.com.fila;

public class No<T>{

	private T object; // conteudo do meu no
	private No<T> refNo;
	
	public No(T object) {
		this.refNo = null;
		this.object = object;
	}
	
	public Object getObject() {
		return object;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}

	public void setObject(T object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
}
