package uk.co.deniswindsor

import org.junit.Test

import static org.junit.Assert.assertThat
import static org.hamcrest.CoreMatchers.is

public class SignupValidationUsernameTest {

	@ObjectUnderTest SignupValidation validation = new SignupValidation()

	@Test
	public void shouldnotAcceptEmptyUsername() {
	//given
		def username = ""

	//when
		def validationResult = validation.checkUsername username

	//then
		assertThat(
			"Empty username is not permitted",
				validationResult, is(false)
		)
	}

	@Test
	public void shouldnotAcceptNullUsername() {
	//given
		def username = null

	//when
		def validationResult = validation.checkUsername username

	//then
		assertThat(
			"Null username is not permitted",
				validationResult, is(false)
		)
	}

	@Test
	public void shouldnotAcceptTwoCharsUsername() {
	//given
		def username = "12"

	//when
		def validationResult = validation.checkUsername username

	//then
		assertThat(
			"Two chars username is not permitted",
				validationResult, is(false)
		)
	}

	@Test
	public void shouldAcceptThreeOrMoreCharsUsername() {
	//given
		def username = "123"

	//when
		def validationResult = validation.checkUsername username

	//then
		assertThat(
			"Three chars or more username is OK",
				validationResult, is(true)
		)
	}

	@Test
	public void shouldAcceptTwentyOrLessCharsUsername() {
	//given
		def username = "12345678901234567890"

	//when
		def validationResult = validation.checkUsername username

	//then
		assertThat(
			"Twenty chars or less username is OK",
				validationResult, is(true)
		)
	}

	@Test
	public void shouldnotAcceptTwentyOnerMoreCharsUsername() {
	//given
		def username = "123456789012345678901"

	//when
		def validationResult = validation.checkUsername username

	//then
		assertThat(
			"Twenty one chars or more username is not permitted",
				validationResult, is(false)
		)
	}
}