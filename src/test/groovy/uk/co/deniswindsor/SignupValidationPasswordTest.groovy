package uk.co.deniswindsor

import org.junit.Test

import static org.junit.Assert.assertThat
import static org.hamcrest.CoreMatchers.is

public class SignupValidationPasswordTest {

	@ObjectUnderTest SignupValidation validation = new SignupValidation()

	@Test
	public void shouldnotAcceptEmptyPassword() {
	//given
		def password = ""

	//when
		def validationResult = validation.checkPassword password

	//then
		assertThat(
			"Empty password is not permitted",
				validationResult, is(false)
		)
	}

	@Test
	public void shouldnotAcceptNullPassword() {
	//given
		def password = null

	//when
		def validationResult = validation.checkPassword password

	//then
		assertThat(
			"Null password is not permitted",
				validationResult, is(false)
		)
	}

	@Test
	public void shouldnotAcceptTwoCharsPassword() {
	//given
		def password = "12"

	//when
		def validationResult = validation.checkPassword password

	//then
		assertThat(
			"Two chars password is not permitted",
				validationResult, is(false)
		)
	}

	@Test
	public void shouldAcceptThreeOrMoreCharsPassword() {
	//given
		def password = "123"

	//when
		def validationResult = validation.checkPassword password

	//then
		assertThat(
			"Three chars or more password is OK",
				validationResult, is(true)
		)
	}

	@Test
	public void shouldAcceptTwentyOrLessCharsPassword() {
	//given
		def password = "12345678901234567890"

	//when
		def validationResult = validation.checkPassword password

	//then
		assertThat(
			"Twenty chars or less password is OK",
				validationResult, is(true)
		)
	}

	@Test
	public void shouldnotAcceptTwentyOnerMoreCharsPassword() {
	//given
		def password = "123456789012345678901"

	//when
		def validationResult = validation.checkPassword password

	//then
		assertThat(
			"Twenty one chars or more password is not permitted",
				validationResult, is(false)
		)
	}
}