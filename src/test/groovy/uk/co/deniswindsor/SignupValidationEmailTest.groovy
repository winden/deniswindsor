package uk.co.deniswindsor

import org.junit.Test

import static org.junit.Assert.assertThat
import static org.hamcrest.CoreMatchers.is

public class SignupValidationEmailTest {

	@ObjectUnderTest SignupValidation validation = new SignupValidation()

	@Test
	public void shoulAcceptEmptyEmail() {
	//given
		def email = ""

	//when
		def validationResult = validation.checkEmail email

	//then
		assertThat(
			"Empty email is OK",
				validationResult, is(true)
		)
	}

	@Test
	public void shouldAcceptNullEmail() {
	//given
		def email = null

	//when
		def validationResult = validation.checkEmail email

	//then
		assertThat(
			"Null email is OK",
				validationResult, is(true)
		)
	}

	@Test
	public void shouldAcceptEmailWithThreePartsNameDomainDotSomething() {
	//given
		def email = "123@domain.something"

	//when
		def validationResult = validation.checkEmail email

	//then
		assertThat(
			"Email that consists of name@domain.something",
				validationResult, is(true)
		)
	}

	@Test
	public void shouldnotAcceptEmailWithoutAT() {
	//given
		def email = "12"

	//when
		def validationResult = validation.checkEmail email

	//then
		assertThat(
			"Email without @ is not permitted",
				validationResult, is(false)
		)
	}

	@Test
	public void shouldnotAcceptEmailWithoutDomainPart() {
	//given
		def email = "1234@.com"

	//when
		def validationResult = validation.checkEmail email

	//then
		assertThat(
			"Email without domain part is not permitted",
				validationResult, is(false)
		)
	}

	@Test
	public void shouldnotAcceptEmailWithoutDomainSomethingAfterDot() {
	//given
		def email = "1234@server."

	//when
		def validationResult = validation.checkEmail email

	//then
		assertThat(
			"Email without something after dot is not permitted",
				validationResult, is(false)
		)
	}
}