package com.example.scala.chapter07.mxdx.exercise

/**
  * 练习1
  * 编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回Computer的详细信息
  * 编写PC子类，继承Computer类，添加特有属性【品牌brand】
  * 编写NotePad子类，继承Computer类，
  * 添加特有属性【颜色color】
  *
  * 编写Test Object，在main方法中创建PC和NotePad对象，
  * 分别对象中特有的属性赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息。
  *
  */

/**
  * 练习2 根据下图实现类。在TestCylinder类中创建Cylinder类的对象，设置圆柱的底面半径和高，并输出圆柱的体积
  *
  */

/**
  * 练习3(多态应用)
  * 定义员工类 Employee，包含姓名和月工资，以及计算年工资getAnnual的方法。
  *
  * 普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，普通员工类多了work方法，
  *
  * 普通员工和经理类要求分别重写getAnnual方法 , 测试类中添加一个方法 showEmpAnnal，实现获取任何员工对象的年工资,
  * 并在main方法中调用该方法 , 测试类中添加一个方法，testWork,如果是普通员工，则调用work方法，
  * 如果是经理，则调用manage方法 【10min】
  *
  */
object E01 {

  def showEmpAnnal(employee: Employee): Unit = {
    println(s"${employee.name} annual is ${employee.getAnnual()}")

  }

  def testWork(employee: Employee): Unit = {

    employee match {
      case _: Manager =>
        employee.asInstanceOf[Manager].manage()
      case _: Worker =>
        employee.asInstanceOf[Worker].work()
      case _ =>
        println("错误的类型")
    }

  }

  def main(args: Array[String]): Unit = {

    val manager = new Manager("jack")
    manager.salary = 100
    manager.bonus = 50

    val worker = new Worker("ghbaqi")
    worker.salary = 10


    showEmpAnnal(manager)
    showEmpAnnal(worker)

    testWork(manager)
    testWork(worker)

  }

}


class Manager(nameIn: String) extends Employee(nameIn) {
  override var salary: Double = _
  override var age: Int = _

  var bonus: Double = _

  override def getAnnual(): Double = {
    super.getAnnual() + bonus
  }

  def manage(): Unit = {
    println(s"$name manage very well")
  }
}


class Worker(nameIn: String) extends Employee(nameIn) {

  override var salary: Double = _
  override var age: Int = _

  def work(): Unit = {
    println(s"$name work hard ..")
  }

}


abstract class Employee(nameIn: String) {

  val name: String = nameIn

  var salary: Double

  var age: Int


  def getAnnual(): Double = {
    salary * 12
  }

}




