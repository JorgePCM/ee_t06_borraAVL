
public class Prueba {

	
public static void main(String[] args){
BTreePrinter p=new BTreePrinter();
ArbolAVL<Integer> arbol=new ArbolAVL();

arbol.insertar(81);
arbol.insertar(88);
arbol.insertar(92);
arbol.insertar(100);
arbol.insertar(150);
arbol.insertar(300);
arbol.insertar(78);
arbol.insertar(30);
arbol.insertar(54);
arbol.insertar(20);
p.printNode(arbol.getRaizAVL());

arbol.eliminabalanceado(arbol.getRaizAVL(), false, 54);

p.printNode(arbol.getRaizAVL());

}
}
