package com.tang.designpatterns.chap1.scala

trait Aggregate {
  def iterator(): MyIterator
}
