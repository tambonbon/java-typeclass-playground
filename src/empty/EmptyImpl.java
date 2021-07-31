package empty;

public class EmptyImpl  {

    class EmptyInt implements Empty<Integer> {
        @Override
        public Integer empty() {
            return 0; // 2nd: implement the type class, create instance from that impl (e.g. int)
        }
   }

   class EmptyString implements Empty<String> {
       @Override
       public String empty() {
          return "Nothing";

       }
   }
}
