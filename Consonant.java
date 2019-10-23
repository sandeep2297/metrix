class Consonant{
 public static void main(String[] args) {
char letter;
letter=args[0].charAt(0);
if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U'||letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
{
		System.out.println("Entered character "+letter+" is a Vowel");
}
else{
		System.out.println("Entered character "+letter+" is a Consonant");
		}
	}
}