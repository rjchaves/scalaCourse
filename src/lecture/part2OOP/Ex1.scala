package lecture.part2OOP

object Ex1 extends App {

}

class Author(val name: String, val surname: String, val yearOfBirth: Int) {
  def fullName() = name + surname
}
class Novel(val name: String, val yearOfRelease: Int, val author: Author) {
  def authorAge() = yearOfRelease - author.yearOfBirth
  def isWrittenBy() = author.fullName()
  def copy(newYearOfRelease: Int) = new Novel(name, newYearOfRelease, author)
}

class Counter(value: Int) {
  def current() = value
  def inc() = new Counter(value+1)
  def dec() = new Counter(value-1)
  def inc(amount: Int) = new Counter(value+amount)
  def dec(amount: Int) = new Counter(value-amount)
}

