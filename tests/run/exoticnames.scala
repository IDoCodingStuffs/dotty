// this is a run-test because the compiler should emit bytecode that'll pass the JVM's verifier
object Test extends dotty.runtime.LegacyApp {
  def `(` = sys.error("bla")
  def `.` = sys.error("bla")
  def `)` = sys.error("bla")
  def `,` = sys.error("bla")
}
