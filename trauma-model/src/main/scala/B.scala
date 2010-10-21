package trauma.model

// this import doesn't type-check
import trauma.util.A

object B {
  // A.<TAB> doesn't show A.a as a candidate for completion
  val b = "%s + b".format(A.a)
}
