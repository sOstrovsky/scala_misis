object VariableNamingConvention {
  def snakeToCamel(snakeCaseVariable: String): String = {
    val words = snakeCaseVariable.split("_|-|\\s+")
    words.head + words.tail.map(_.capitalize).mkString
  }

  def camelToSnake(camelCaseVariable: String): String = {
    camelCaseVariable.replaceAll("([a-z0-9])([A-Z])", "$1_$2").toLowerCase
  }

  def main(args: Array[String]): Unit = {
    val strings = List("snakeCase", "snake_case", "variable_10_case", "variable10Case", "ɛrgo rE tHis",
      "hurry-up-joe!", "c://my-docs/happy_Flag-Day/12.doc", "  spaces  ")

    for (str <- strings) {
      println(s"Original: $str")
      val camelCase = snakeToCamel(str)
      println(s"Camel Case: $camelCase")
      val snakeCase = camelToSnake(camelCase)
      println(s"Snake Case: $snakeCase")
      println("-" * 20)
    }
  }
}