package reto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConjuntosPoo {
	public static void main(String[] args) {
		ConjuntosPoo conjunto = new ConjuntosPoo();
		int tamA, tamB;
		ArrayList<Float> list1 = new ArrayList<Float>();
		ArrayList<Float> list2 = new ArrayList<Float>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of A");
		tamA = sc.nextInt();
		System.out.println("Enter the size of B");
		tamB = sc.nextInt();
		
		//Llenado de A
		for(int i=0; i<tamA; i++) {
			System.out.println("Enter a number of the list of A");
			float num =	 sc.nextFloat();
			list1.add(num);
			Collections.sort(list1);
		
		}
		//Llenado de B
		for(int i=0; i<tamB; i++) {
			System.out.println("Enter a number of the list of B");
			float num = sc.nextFloat();
			list2.add(num);
			Collections.sort(list2);
			
		}
		
		conjunto.interseccion(list1, list2);
		conjunto.diferenciaAB(list1, list2);
		conjunto.diferenciaBA(list1, list2);
		conjunto.diferenciaSimetrica(list1, list2);
	}
	//Atributos 
	ArrayList<Float> a; 
	ArrayList<Float> b;
	ArrayList<Float> c;
	int tamA, tamB;
	Scanner sc;
	
	public ConjuntosPoo() {
		this.a= new ArrayList<>();
		this.b= new ArrayList<>();
		this.c= new ArrayList<>();
		this.sc = new Scanner(System.in);
	}
	
	//Metodos
	
	//Cantidad
	public void cantidad(ArrayList<Float> listSize) {
		listSize.size();
		System.out.println("El tamaño de la operacion del conjunto es "
				+ listSize.size());
	}

	public void union(ArrayList<Float> list1, ArrayList<Float> list2) {

		/*System.out.println("Enter the size of A");
		tamA = sc.nextInt();
		System.out.println("Enter the size of B");
		tamB = sc.nextInt();
		
		//Llenado de A
		for(int i=0; i<tamA; i++) {
			System.out.println("Enter a number of the list of A");
			float num =	 sc.nextFloat();
			list1.add(num);
			Collections.sort(a);
		
		}
		//Llenado de B
		for(int i=0; i<tamB; i++) {
			System.out.println("Enter a number of the list of B");
			float num = sc.nextFloat();
			list2.add(num);
			Collections.sort(b);
			
		}*/
		c.addAll(list1);
		c.addAll(list2);
		ArrayList<Float> aux = new ArrayList<Float>();
		for(Float element: c) {
			if(!aux.contains(element)) {
				aux.add(element);
			}
		}//SHOW
		for(int i=0;i<aux.size();i++) {
			System.out.println("The elements for union are: "+aux.get(i));
		}
		cantidad(aux);
	}
	public void interseccion(ArrayList<Float> list1, ArrayList<Float> list2) {
		ArrayList<Float> aux = new ArrayList<Float>();
		//ordenar
		Collections.sort(list1);
		Collections.sort(list2);
		//El metodo retainAll, eliminar todos los elementos
		//de la lista1 que no esten en la  2.
		list1.retainAll(list2);
		//ELiminar repetidos
		for(Float element: list1) {
			if(!aux.contains(element)) {
				aux.add(element);
			}
		}
		/*ordenar
		ArrayList<Float> aux2 = new ArrayList<Float>();
		for(Float element: aux) {
			if(!aux2.contains(element)) {
				aux2.add(element);
			}
		}*/
		
		//show
		for(int i=0;i<aux.size();i++) {
			System.out.println("The elements for interseccion are: "+aux.get(i));
		}

		cantidad(aux);
	}
	public ArrayList<Float> diferenciaAB(ArrayList<Float> list1, ArrayList<Float> list2) {
		list1.removeAll(list2);
	
		ArrayList<Float> aux = new ArrayList<>();
		for(Float element: list1) {
			if(!aux.contains(element)) {
				aux.add(element);
			}
		}
		for(int i=0;i<aux.size();i++) {
			System.out.println("The elements for diferencia entr A - B are: "+aux.get(i));
		}
		cantidad(aux);
		return aux;
	}
	public ArrayList<Float> diferenciaBA(ArrayList<Float> list1, ArrayList<Float> list2) {
		list2.removeAll(list1);
		ArrayList<Float> aux = new ArrayList<>();
		
		for(Float element: list2) {
			if(!aux.contains(element)) {
				aux.add(element);
			}
		}
		for(int i=0;i<aux.size();i++) {
			System.out.println("The elements for diferencia BA are: "+aux.get(i));
		}
		cantidad(aux);
		return aux;
	}
	public void diferenciaSimetrica(ArrayList<Float> list1, ArrayList<Float> list2) {
		ArrayList<Float> auxSimetrica = new ArrayList<Float>();
		auxSimetrica.addAll(list1);
		//diferencia a-b
		list1.removeAll(list2);
		//diferencia b-a (me toca asignar una lista auxiliar par ano generar
		// conlifctos entre list1 y list2)
		list2.removeAll(auxSimetrica);
		/*
		ArrayList<Float> aux = new ArrayList<>();
		for(Float element: list1) {
			if(!aux.contains(element)) {
				aux.add(element);
			}
		}
		//diferencia b-a
		list2.removeAll(list1);*//* 
		ArrayList<Float> aux2 = new ArrayList<>();
		for(Float element: list2) {
			if(!aux2.contains(element)) {
				aux2.add(element);
			}
		}*/
		
		System.out.println("La diferencia simetrica es: {"+list1+""+list2+"}");
		ArrayList<Float> auxCompleta = new ArrayList<Float>();
		auxCompleta.addAll(list2);
		auxCompleta.addAll(list1);
		cantidad(auxCompleta);
		
		
	
	
}
}
