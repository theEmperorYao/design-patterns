package com.tang.designpatterns.chap2.scala

class Banner(val string: String) {

  def showWithParen() = println("(" + string + ")")

  def showWithAstar() = println("*" + string + "*")

}
