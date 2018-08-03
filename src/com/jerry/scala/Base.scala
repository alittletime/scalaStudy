package com.jerry.scala

/**
  * 伴生对象和伴生类必须定义在同一个源文件
  * 这样才能互相访问对方的私语变量
  */

class Base {
  private var a = "hello class"
  println(Base.name)
}

object Base {
  private var name = "hello obj"

  def main(args: Array[String]): Unit = {
    val bs = new Base()
    println(bs.a)
  }

}

