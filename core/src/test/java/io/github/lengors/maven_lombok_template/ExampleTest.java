package io.github.lengors.maven_lombok_template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

/**
 * Example test suite for {@link Example}.
 *
 * @author lengors
 */
class ExampleTest {
  /**
   * Example test for {@link Example#Example()}.
   */
  @Test
  void shouldThrowUnsupportedOperationExceptionWhenInstantiateExample() {
    Assertions.assertThrows(UnsupportedOperationException.class, () -> {
      ReflectionUtils.newInstance(Example.class);
    });
  }

  /**
   * Example test for {@link Example#example()}.
   */
  @Test
  void shouldGetHelloWorldFromExampleFunction() {
    Assertions.assertEquals("Hello, World!", Example.example());
  }

  /**
   * Example test for {@link Example#main(String[])}.
   */
  @Test
  void shouldExecuteMainFunctionWithoutErrors() {
    Example.main(new String[] {});
  }
}
