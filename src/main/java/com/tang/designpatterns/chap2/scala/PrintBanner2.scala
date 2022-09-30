package com.tang.designpatterns.chap2.scala

/**
 * 适配器模式 两个类
 *
 * @param string
 */
class PrintBanner2(val string: String) extends Print2 {

  val banner = new Banner(string)

  override def printWeak(): Unit = banner.showWithParen()

  override def printStrong(): Unit = banner.showWithAstar()

}

@main def main2 = {
  val banner = new PrintBanner2("hello2")
  banner.printStrong()
  banner.printWeak()
}
