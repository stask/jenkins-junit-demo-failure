package com.practitest.examples.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

import com.practitest.examples.jenkins.Thing;

public class ThingTest {

  Thing subject = new Thing();

  @Test
  public void test() {
    boolean result = subject.tryMe();

    assertTrue(!result);
  }
}
