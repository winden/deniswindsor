package co.uk.deniswindsor

public class Rot13 {

	public String encrypt(final String aInput) {
		aInput.inject(''){ result, c ->
			result + (char)((c as char) + rotCount(c))
		}
	}

	def rotCount(c) {
		if(c in upperAndLowerCase('a'..'m')) return  13
		if(c in upperAndLowerCase('n'..'z')) return -13
		0
	}

	def upperAndLowerCase(characters) {
		characters*.toUpperCase() + characters*.toLowerCase()
	}
}