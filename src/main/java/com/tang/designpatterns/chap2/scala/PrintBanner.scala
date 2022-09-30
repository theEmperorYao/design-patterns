package com.tang.designpatterns.chap2.scala

/**
 * 适配器模式 一个接口，一个类
 *
 * @param string
 */
class PrintBanner(override val string: String) extends Banner(string), Print {

  override def printStrong(): Unit = showWithAstar()

  override def printWeak(): Unit = showWithParen()
}

@main def main = {
  val printBanner = new PrintBanner("hello")

  printBanner.printStrong()
  printBanner.printWeak()

}