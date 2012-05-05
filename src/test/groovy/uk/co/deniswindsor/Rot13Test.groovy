package uk.co.deniswindsor

import org.junit.Test

import static org.junit.Assert.assertThat
import static org.hamcrest.CoreMatchers.is

public class Rot13Test {

	@ObjectUnderTest Rot13 rot13 = new Rot13()

	@Test
	public void shouldReturnTheSameTextAfterItWasEncryptedTwice() {
		def text = "Hello, world"
		def textEncryptedTwice = rot13.encrypt rot13.encrypt(text)

		assertThat(
			text + " didn't change after encrypting twice",
				textEncryptedTwice, is(text)
		)
	}

	@Test
	public void shouldReturnTextEachLetterIncreasedByThirteen() {
		def text = "Hello, world"
		def textEncrypted = rot13.encrypt text
		def expected = "Uryyb, jbeyq"

		assertThat (
			text + " changed into " + expected + " after encrypting",
				textEncrypted, is(expected)
		)
	}
}