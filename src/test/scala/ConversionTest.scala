import VariableNamingConvention.{camelToSnake, snakeToCamel}
import org.scalatest.funsuite.AnyFunSuite

class ConversionTest extends AnyFunSuite {
  test("camelToSnake should convert camelCase to snake_case") {
    assert(camelToSnake("camelCaseVariable") === "camel_case_variable")
  }

  test("camelToSnake should handle numbers in camelCase") {
    assert(camelToSnake("myVariable123") === "my_variable123")
  }

  test("camelToSnake should handle already  strings") {
    assert(camelToSnake("snake_case_variable") === "snake_case_variable")
  }

  test("snake_case should convert camelCase to camelToSnake") {
    assert(snakeToCamel("camel_case_variable") == "camelCaseVariable")
  }

  test("snakeToCamel should handle numbers in snake_case") {
    assert(snakeToCamel("my_variable123") == "myVariable123")
  }

  test("snakeToCamel should handle already camelCase strings") {
    assert(snakeToCamel("camelCaseVariable") == "camelCaseVariable")
  }
}

