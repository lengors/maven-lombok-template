package io.github.lengors.maven_lombok_template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExampleDataTest {
  @Test
  void shouldCorrectlyInitializeExampleData() {
    final var value = "Hello, World!";
    final var data = new ExampleData(value);
    Assertions.assertEquals(value, data.getExample());
  }
}
