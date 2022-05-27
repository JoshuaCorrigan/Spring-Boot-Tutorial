package edu.bothellcs.FirstWebSocket;

public class Greeting {

  private String content;
  private String other = "THIS IS OTHER STUFF";

  public Greeting() {
  }

  public Greeting(String content) {
    System.out.println("I am constructing the greeting object");
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public String getOther(){
    return other;
  }

}