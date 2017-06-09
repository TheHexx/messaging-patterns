package servicea;

/**
 * Created by technologydesign3 on 09/06/2017.
 */
public class ServiceAResource {

   private String contents;

   ServiceAResource(){
     this.contents = "Resource contents!!!!";
   }

   public String getContents() {
      return this.contents;
   }

   public void setContents(String contents) {
      this.contents = contents;
   }
}
