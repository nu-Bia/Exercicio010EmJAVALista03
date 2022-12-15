//10) Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C).
 //Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para cada 
//candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de votos válidos 
//para cada candidato, além de efetuar também a leitura da quantidade de votos nulos e votos em branco.
//Ao final o programa deve apresentar o número total de eleitores, considerando votos válidos, nulos e 
//em branco; o percentual correspondente de votos válidos em relação à quantidade de eleitores; o percentual
//correspondente de votos válidos do candidato A em relação à quantidade de eleitores; o percentual 
//correspondente de votos válidos do candidato B em relação à quantidade de eleitores; o percentual 
//correspondente de votos válidos do candidato C em relação à quantidade de eleitores; o percentual 
//correspondente de votos nulos em relação à quantidade de eleitores; e por último o percentual 
//correspondente de votos em branco em relação à quantidade de eleitores. 
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
te = vv + vn + vb; //número total de eleitores,
ptv = (vv * 100) / te; //percentual de votos válidos
pva = (a * 100) / te;// votos válidos do candidato a
pvb = (b * 100) / te;//votos válidos do candidato b
pvc = (c * 100) / te;//votos válidos do candidato C
pn = (vn * 100) / te;//percentual correspondente de votos nulos
pb = (vb * 100) / te; //percentual correspondente de votos brancos

System.out.println("O número total de eleitores é:" + vv);
System.out.println("O percentual de votos válidos:" + ptv);
System.out.println("O percentual de Votos válidos do candidato a:" + pva);
System.out.println("O percentual de Votos válidos do candidato b:" + pvb);
System.out.println("O percentual de Votos válidos do candidato c:" + pvc);
System.out.println("O percentual correspondente de votos nulos:" + pn);
System.out.println("O percentual correspondente de votos brancos:" + pb);
}}