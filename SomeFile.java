package com.test.common;

public class SomeFile {

  private static String message = "some text";

  public void SomeMethod() {
    otherMethod(3);
    anotherMethod(true, false);
    System.out.println(message);
  }

  private void otherMethod(int unused) {
  }

  private boolean anotherMethod(boolean couldBe, boolean maybeNot) {
    return couldBe && maybeNot;
  }
}
