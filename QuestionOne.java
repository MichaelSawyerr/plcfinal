public class QuestionOne {
File f = new File(“whateverlangaugefileisinputed.txt");
public static void main(string args){
Scanner scan;
try {
scan = new Scanner (f);
while (scan.hasNextLine()) {
//for (int i = 0; i <file.length(); i++) {   
     String data = scan.next();        
if (data.contains(".")){
System.out.println("Decimal");  
      }       
 if (scan.hasNextInt()){
System.out.println("Integer");     
   }       
 if(scan.hasNextFloat()) {
System.out.println("Float");  
      }   
   if (scan.data.contains("_")) {
System.out.println("variable");      
  }  else {
System.out.println(" string");    
    }      }} catch (FileNotFoundException e) {
// TODO Auto-generated catch blocke.printStackTrace();
}
}
}
}