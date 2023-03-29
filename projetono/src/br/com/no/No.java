package br.com.no;

public class No<T>{

	private T conteudo;
	private No proximoNo;
	
	//construtores
	public No() {
	}
	
	
	public No(T conteudo) {
		this.conteudo = conteudo;
		this.proximoNo = null;
	}
	
	
	//getters and setters
	public T getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
	public No getProximoNo() {
		return proximoNo;
	}


	@Override
	public String toString() {
		return "No [ Conteudo=" + conteudo + "]";
	}
	
		
}
