import spock.lang.Specification

class LibraryTest extends Specification{

    def adder = { x, y -> return x + y }

    def "Is the adder adding correctly"() {
        expect:
        adder.call(a, b) == a * b
        where:
	a | b
	3 | 4
	5 | 6
	7 | 8
    }

    def "File contains Gradle rocks"() {
        setup:
	def gradleRocks = 'Gradle rocks'
	File file = new File("output.txt")
	file << """Lorem ipsum dolor sit amet, ignota principes persequeris ius ex, sea te unum noster habemus. Sit eu amet vitae. Nec ut erat mundi reformidans, cu sed dicunt aperiri. Magna scaevola atomorum ei est, quis tamquam disputando sit et.

 Qui postea integre fabulas an, {gradleRocks} aperiam temporibus eos id. Eu pro essent."""
        when:
	def fileContents = file.text
	
	then:
	fileContents.contains(gradleRocks)

	cleanup:
	file.delete()
    }
}
