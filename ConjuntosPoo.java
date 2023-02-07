/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author l52
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConjuntosPoo {
	public static void main(String[] args) {
		ConjuntosPoo conjunto = new ConjuntosPoo();
		int tamA, tamB;
		ArrayList<Float> list1 = new ArrayList<>();
		ArrayList<Float> list2 = new ArrayList<>();
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
		
                //Asignacion de conjuntos iniciales
                ArrayList<Float> A = new ArrayList<>();
                A.add(6.0f);
                A.add(7.0f);
                A.add(8.0f);
                A.add(9.0f);
                A.add(10.0f);
                A.add(11.0f);
                A.add(12.0f);
                A.add(13.0f);
                A.add(14.0f);
                A.add(15.0f);
                A.add(16.0f);
                A.add(17.0f);
                A.add(18.0f);
                A.add(19.0f);
                A.add(20.0f);
               
                ArrayList<Float> B= new ArrayList<>();
               
                B.add(2.0f);
                
                B.add(4.0f);
                B.add(6.0f);
                
                B.add(8.0f);
                
                B.add(10.0f);
                
                B.add(12.0f);
                
                B.add(14.0f);
                
                B.add(16.0f);
                
                B.add(18.0f);
                
                B.add(20.0f);
                
                B.add(22.0f);
                
                B.add(24.0f);
                
                
                ArrayList<Float> C= new ArrayList<>();
                
                C.add(1.0f);
                
                C.add(4.0f);
                C.add(8.0f);
                C.add(10.0f);
                C.add(12.0f);
                C.add(15.0f);
                C.add(18.0f);
                C.add(20.0f);
                
                 ArrayList<Float> D= new ArrayList<>();
                
                D.add(2.0f);
                
                D.add(3.0f);
                
                D.add(5.0f);
                
                D.add(7.0f);
                
                D.add(11.0f);
                D.add(13.0f);
                
                D.add(17.0f);
                
                D.add(19.0f);
                
                D.add(23.0f);
                
                D.add(29.0f);
                
                D.add(31.0f);
                
                D.add(37.0f);
                
                D.add(41.0f);
                
                D.add(43.0f);
		//conjunto.interseccion(list1, list2);
		//conjunto.diferenciaAB(list1, list2);
		//conjunto.diferenciaBA(list1, list2);
		//conjunto.diferenciaSimetrica(list1, list2);
                conjunto.op1(B,C,D);
                conjunto.op2(B,C,A);
                
                conjunto.op3(B,C,D);
         conjunto.op4(A,B,D);
                
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

	public ArrayList<Float> union(ArrayList<Float> list1, ArrayList<Float> list2) {

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
		ArrayList<Float> aux = new ArrayList<>();
		for(Float element: c) {
			if(!aux.contains(element)) {
				aux.add(element);
			}
		}//SHOW
		for(int i=0;i<aux.size();i++) {
			System.out.println("The elements for union are: "+aux.get(i));
		}
		cantidad(aux);
                return aux;
	}
	public ArrayList<Float> interseccion(ArrayList<Float> list1, ArrayList<Float> list2) {
		ArrayList<Float> aux = new ArrayList<>();
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
                return aux;
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
	public ArrayList<Float> diferenciaSimetrica(ArrayList<Float> list1, ArrayList<Float> list2) {
		ArrayList<Float> auxSimetrica = new ArrayList<>();
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
		ArrayList<Float> auxCompleta = new ArrayList<>();
		auxCompleta.addAll(list2);
		auxCompleta.addAll(list1);
		cantidad(auxCompleta);
		return auxCompleta;
		
	
	
}
        public void op2(ArrayList<Float> listB, ArrayList<Float> listC, ArrayList<Float> listA  ){
            ArrayList<Float> l = new ArrayList<>();
            l = interseccion(listA, listC);
            ArrayList<Float> l2 = new ArrayList<>();
            union(l,listB);
        }
        public ArrayList<Float> op1(ArrayList<Float> listB, ArrayList<Float> listC, ArrayList<Float> listD ){
            
            ArrayList<Float> l3 = new ArrayList<>();
            l3 = diferenciaSimetrica(listC, listD);
            interseccion(listB,l3);

        }
        public void op3 (ArrayList<Float> listB, ArrayList<Float> listC, ArrayList<Float> listD){
            ArrayList<Float> l4 = new ArrayList<>();
            l4 = union(listB,listD);
            ArrayList<Float> l5 = new ArrayList<>();
            l5 = diferenciaAB(l4, listC);
        }
        public void op4 (ArrayList<Float> listA, ArrayList<Float> listB, ArrayList<Float> listD){
            ArrayList<Float> l = new ArrayList<>();
            ArrayList<Float> l2 = new ArrayList<>();
            l = diferenciaAB(listA, listB);
            l2 = interseccion(listA, listD);
            diferenciaSimetrica(l,l2);
        
        }
}