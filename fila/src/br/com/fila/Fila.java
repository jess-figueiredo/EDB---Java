package br.com.fila;

public class Fila <T>{

	private No<T> refNoEntrada;

	public Fila() {
		this.refNoEntrada = null;
	}
	
	public boolean isEmpty() {
		return refNoEntrada == null ? true : false;
	}
	
	public void enqueue(T object) {
		No<T> novoNo = new No<>(object);
		novoNo.setRefNo(refNoEntrada);
		refNoEntrada = novoNo;
	}
	
	//apenas pega o Noref
	public T first() {
		if(!isEmpty()) {
			No primeiroNo = refNoEntrada;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	public T dequeue() {
		if(!isEmpty()) {
			No primeiroNo = refNoEntrada;
			No noAuxiliar = refNoEntrada;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return  (T) primeiroNo.getObject();
		}
		return null;
	}

	@Override
	public String toString() {
		
		String retorno = "";
		No noAuxiliar = refNoEntrada;
		
		if(!isEmpty()) {
			while(true) {
				retorno += "[No{objeto=" + noAuxiliar.getObject() + "}] ---> ";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();					
				}else {
					retorno += "null";
					break;
				}
			}
		}else {
			retorno = "null";
		}
		return retorno;
	}
	
	
}
