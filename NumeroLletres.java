public class practicar {
public static void main(String[] args){
   	
       Scanner llegir = new Scanner(System.in);
       
       System.out.print("Afegeix una frase: \n");
       String frase = llegir.nextLine(); // Llegir cadena
       frase = frase.toLowerCase(); // Passar a minúscula la cadena
       
       int ComptarVocals = 0;
       int ComptarConsonants = 0;
       int ComptarAltres = 0;
       int ComptarNumeros = 0;
       
       
       for(int p=0; p<frase.length(); p++)
       {
           if(frase.charAt(p) == 'a' || frase.charAt(p) == 'e' || frase.charAt(p) == 'i' || frase.charAt(p) == 'o' || frase.charAt(p) == 'u')
               ComptarVocals++;
       

       else if(frase.charAt(p)=='b'||frase.charAt(p)=='c'||frase.charAt(p)=='d'|| frase.charAt(p)=='f'||frase.charAt(p)=='g'||
     frase.charAt(p)=='h'|| frase.charAt(p)=='j'||frase.charAt(p)=='k'||frase.charAt(p)=='l'|| frase.charAt(p)=='m'||
     frase.charAt(p)=='n'||frase.charAt(p)=='p'|| frase.charAt(p)=='q'||frase.charAt(p)=='r'||frase.charAt(p)=='s'|| 
     frase.charAt(p)=='t'||frase.charAt(p)=='v'||frase.charAt(p)=='w'|| frase.charAt(p)=='x'||frase.charAt(p)=='y'||
     frase.charAt(p)=='z')

         ComptarConsonants++;

       else

         ComptarAltres++;
           
           
       	String s;
   	char c1,c2;
   	c1 = s.charAt(0);
   	      for(int i=1;i<s.length(); i++){
   	     char c2 = s.charAt(i);
   	     c1=c2;
   	}
           
           
       }
       
      System.out.println("Número de Vocals "+ComptarVocals+"\nNúmero de Consonants "+ComptarConsonants+"\nAltres "+ComptarAltres);
         

   // Check if they are equal here

  
}
}
