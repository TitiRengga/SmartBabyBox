public class Context {
   private speed Speed;

   public Context(speed Speed){
      this.Speed = Speed;
   }

   public String launch(){
      return Speed.getSpeed();
   }
}