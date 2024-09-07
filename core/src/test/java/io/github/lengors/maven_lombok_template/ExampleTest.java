package io.github.lengors.maven_lombok_template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

class ExampleTest {
  @Test
  void shouldThrowUnsupportedOperationExceptionWhenInstantiateExample() {
    Assertions.assertThrows(UnsupportedOperationException.class, () -> {
      ReflectionUtils.newInstance(Example.class);
    });
  }

  @Test
  void shouldGetHelloWorldFromExampleFunction() {
    Assertions.assertEquals("Hello, World!", Example.example());
  }

  @Test
  void shouldExecuteMainFunctionWithoutErrors() {
    Example.main(new String[] {});
  }
}
