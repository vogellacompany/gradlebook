import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }

    def "computing the maximum of two numbers"() {
        expect:
	Math.max(a, b) == c
        where:
	a << [5, 3]
	b << [1, 9]
	c << [5, 9]
    }

    def "length of Spock's and his friends' names"() {
        expect:
	name.size() == length
        where:
	name     | length
	"Spock"  | 5
	"Kirk"   | 4
	"Scotty" | 6
    }
}
