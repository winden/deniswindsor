package uk.co.deniswindsor

public class SignupValidation {

	public boolean checkPassword(final String aPassword) {
		!checkIfEmpty(aPassword) && 
			checkPattern(aPassword, /^.{3,20}$/)
	}

	public boolean checkUsername(final String aUsername) {
		!checkIfEmpty(aUsername) && 
			checkPattern(aUsername, /^[a-zA-Z0-9_-]{3,20}$/)
	}

	public boolean checkEmail(final String aEmail) {
		checkIfEmpty(aEmail) ||
			checkPattern(aEmail, /^[\S]+@[\S]+\.[\S]+$/)
	}

	def checkPattern(final String str, final String pat) {
		str ==~ pat
	}

	def checkIfEmpty(final String str) {
		str == null || str.isEmpty()
	}
}