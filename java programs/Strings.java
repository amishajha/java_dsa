public class Strings {
    public static void main(String[] args) {
        // String name="amisha Jha";
        // // for(int i=0;i<name.length();i++){
        // //     System.out.println(name.charAt(i));
        // // }
        // String name1="shila";
        // if(name.compareTo(name1)==0){
        //      System.out.println("equal");
        // }
        // else{
        //  System.out.println("not equal");

        // }
//Strings are immutable



//Stringbuilder

StringBuilder sb=new StringBuilder("Amisha jha");
System.out.println(sb);
// System.out.println(sb.charAt(1));
sb.setCharAt(0, 'f');
System.out.println(sb);

sb.insert(2,"s");
System.out.println(sb);

sb.delete(2, 3);
System.out.println(sb);




    }
    
}
