package trauma.core

// these two imports don't type-check
import trauma.util.A
import trauma.model.B

object C {
  // A.<TAB> and B.<TAB> don't show A.a and B.b as candidates for completion
  val c = "%s + %s + c".format(A.a, B.b)
}
