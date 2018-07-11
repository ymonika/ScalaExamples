package p {

  class Super {
    protected def f() = println("F")
  }

  class Sub extends Super {
    f()
  }

}

package society {
  package profession {
    class Executive {
      private[profession] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another: Executive): Unit = {
        println(another.friends)
        println(another.workDetails)
        //println(another.secrets)
      }

    }

  }
}
