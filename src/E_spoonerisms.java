import java.util.Scanner;

public class E_spoonerisms {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			String S = scan.nextLine();
			String output = "";
			String[] words = S.split(" ");
			String firstword = words[0];
			String lastword = words[words.length-1];
			String firstsub = "";
			String lastsub = "";
			for(int i=0; i< firstword.length();i++) {
				char ch = firstword.charAt(i);
				
				if(i == 0) {
					if(ch=='y'||ch=='b' || ch=='c' || ch=='d' || ch=='f' ||ch=='g'||ch=='h'||ch=='j'||
							ch=='k'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||
							ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='z')
					{
						firstsub += ch;
					}
					else {
						break;
					}
				}
				else {
					if(ch=='b' || ch=='c' || ch=='d' || ch=='f' ||ch=='g'||ch=='h'||ch=='j'||
							ch=='k'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||
							ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='z')
					{
						firstsub += ch;
					}
					else {
						break;
					}
				}
			}
			for(int i=0; i< lastword.length();i++) {
				char ch = lastword.charAt(i);
				
				if(i == 0) {
					if(ch=='y'||ch=='b' || ch=='c' || ch=='d' || ch=='f' ||ch=='g'||ch=='h'||ch=='j'||
							ch=='k'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||
							ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='z')
					{
						lastsub += ch;
					}
					else {
						break;
					}
				}
				else {
					if(ch=='b' || ch=='c' || ch=='d' || ch=='f' ||ch=='g'||ch=='h'||ch=='j'||
							ch=='k'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||
							ch=='r'||ch=='s'||ch=='t'||ch=='v'||ch=='w'||ch=='x'||ch=='z')
					{
						lastsub += ch;
					}
					else {
						break;
					}
				}
			}
			int len_firstsub = firstsub.length();
			int len_lastsub = lastsub.length();
			String a = "";
			String b = "";
			for(int k=len_firstsub;k<firstword.length();k++) {
				a += firstword.charAt(k);
			}
			for(int l=len_lastsub;l<lastword.length();l++) {
				b += lastword.charAt(l);
			}
			firstword = "";lastword = "";
			firstword = lastsub + a;
			lastword = firstsub + b;
			words[0] = firstword;
			words[words.length-1] = lastword;
			for(String result:words) {
				output += result + " ";
			}
			System.out.println(output.trim());
		}
		
		
	}
}
