//SER05-J. Do not serialize instances of inner classes

public class OuterSer implements Serializable {
  private int rank;
  class InnerSer {
    protected String name;
    // ...
  }
}