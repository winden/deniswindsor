package uk.co.deniswindsor

public class SignupValidation {

	public boolean checkPassword(final String aPassword) {
		if (aPassword == null) return false
		if (aPassword.isEmpty()) return false
		return aPassword ==~ /^.{3,20}$/
	}

	public boolean checkUsername(final String aUsername) {
		if (aUsername == null) return false
		if (aUsername.isEmpty()) return false
		return aUsername ==~ /^[a-zA-Z0-9_-]{3,20}$/
	}
}