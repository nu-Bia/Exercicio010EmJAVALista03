//10) Em uma elei��o sindical concorreram ao cargo de presidente tr�s candidatos (A, B e C).
 //Durante a apura��o dos votos foram computados votos nulos e votos em branco, al�m dos votos v�lidos para cada 
//candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de votos v�lidos 
//para cada candidato, al�m de efetuar tamb�m a leitura da quantidade de votos nulos e votos em branco.
//Ao final o programa deve apresentar o n�mero total de eleitores, considerando votos v�lidos, nulos e 
//em branco; o percentual correspondente de votos v�lidos em rela��o � quantidade de eleitores; o percentual
//correspondente de votos v�lidos do candidato A em rela��o � quantidade de eleitores; o percentual 
//correspondente de votos v�lidos do candidato B em rela��o � quantidade de eleitores; o percentual 
//correspondente de votos v�lidos do candidato C em rela��o � quantidade de eleitores; o percentual 
//correspondente de votos nulos em rela��o � quantidade de eleitores; e por �ltimo o percentual 
//correspondente de votos em branco em rela��o � quantidade de eleitores. 
package Exercicios;
import java.util.Scanner;
public class Exercicio10 {

public static void main (String[]args){
	
Scanner sc = new Scanner(System.in);

System.out.println("Quantidade de Votos Validos Para Candidato A");
double a = sc.nextInt();

System.out.println("Quantidade de Votos Validos Para Candidato B");
double b = sc.nextInt();

System.out.println("Quantidade de Votos Validos Para Candidato C");
double c = sc.nextInt();

System.out.println("Quantidade de Votos Nulos");
double vn = sc.nextInt();

System.out.println("Quantidade de Votos Brancos");
double vb = sc.nextInt();

double vv,te,ptv,pva,pvb,pvc,pn,pb;

vv =  a + b + c;//votos validos
te = vv + vn + vb; //n�mero total de eleitores,
ptv = (vv * 100) / te; //percentual de votos v�lidos
pva = (a * 100) / te;// votos v�lidos do candidato a
pvb = (b * 100) / te;//votos v�lidos do candidato b
pvc = (c * 100) / te;//votos v�lidos do candidato C
pn = (vn * 100) / te;//percentual correspondente de votos nulos
pb = (vb * 100) / te; //percentual correspondente de votos brancos

System.out.println("O n�mero total de eleitores �:" + vv);
System.out.println("O percentual de votos v�lidos:" + ptv);
System.out.println("O percentual de Votos v�lidos do candidato a:" + pva);
System.out.println("O percentual de Votos v�lidos do candidato b:" + pvb);
System.out.println("O percentual de Votos v�lidos do candidato c:" + pvc);
System.out.println("O percentual correspondente de votos nulos:" + pn);
System.out.println("O percentual correspondente de votos brancos:" + pb);
}}