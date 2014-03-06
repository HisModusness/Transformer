public class MyTransformer implements Transformer {
  public String getName() {
    return "Test Name";
  }
  
  public String transform(String input) {
    return "Test string: " + input;
  }
}
