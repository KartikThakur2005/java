public class generic 
{
     public static class gen<K, V>
     {
        K key;
        V value;
         
         gen(K key, V value){
            this.key = key;
            this.value = value;
         }
     }

     public static void main(String[] args) 
     {
         gen <String, Integer>obj1 = new gen<>("Kartik", 1);
     }    
}
