package com.github.seratch.signedrequest4j.pem;

import com.github.seratch.signedrequest4j.pem.Asn1Object.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.BDDMockito.*;

import java.io.IOException;
import java.math.BigInteger;
public class Asn1ObjectTest {

	@Test
	public void type() throws Exception {
		// TODO auto-generated by JUnit Helper.
		assertThat(Asn1Object.class, notNullValue());
	}

	@Test
	public void instantiation() throws Exception {
		// TODO auto-generated by JUnit Helper.
		int tag = 0;
		int length = 0;
		byte[] value = null;
		Asn1Object target = new Asn1Object(tag, length, value);
		assertThat(target, notNullValue());
	}

	@Test
	public void getType_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		int tag = 0;
		int length = 0;
		byte[] value = null;
		Asn1Object target = new Asn1Object(tag, length, value);
		// given
		// e.g. : given(mocked.called()).willReturn(1);
		// when
		int actual = target.getType();
		// then
		// e.g. : verify(mocked).called();
		int expected = 0;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getLength_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		int tag = 0;
		int length = 0;
		byte[] value = null;
		Asn1Object target = new Asn1Object(tag, length, value);
		// given
		// e.g. : given(mocked.called()).willReturn(1);
		// when
		int actual = target.getLength();
		// then
		// e.g. : verify(mocked).called();
		int expected = 0;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getValue_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		int tag = 0;
		int length = 0;
		byte[] value = null;
		Asn1Object target = new Asn1Object(tag, length, value);
		// given
		// e.g. : given(mocked.called()).willReturn(1);
		// when
		byte[] actual = target.getValue();
		// then
		// e.g. : verify(mocked).called();
		byte[] expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void isConstructed_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		int tag = 0;
		int length = 0;
		byte[] value = null;
		Asn1Object target = new Asn1Object(tag, length, value);
		// given
		// e.g. : given(mocked.called()).willReturn(1);
		// when
		boolean actual = target.isConstructed();
		// then
		// e.g. : verify(mocked).called();
		boolean expected = false;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getParser_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		int tag = 0;
		int length = 0;
		byte[] value = null;
		Asn1Object target = new Asn1Object(tag, length, value);
		// given
		// e.g. : given(mocked.called()).willReturn(1);
		// when
		DerParser actual = target.getParser();
		// then
		// e.g. : verify(mocked).called();
		DerParser expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getInteger_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		int tag = 0;
		int length = 0;
		byte[] value = null;
		Asn1Object target = new Asn1Object(tag, length, value);
		// given
		// e.g. : given(mocked.called()).willReturn(1);
		// when
		BigInteger actual = target.getInteger();
		// then
		// e.g. : verify(mocked).called();
		BigInteger expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void getString_A$() throws Exception {
		// TODO auto-generated by JUnit Helper.
		int tag = 0;
		int length = 0;
		byte[] value = null;
		Asn1Object target = new Asn1Object(tag, length, value);
		// given
		// e.g. : given(mocked.called()).willReturn(1);
		// when
		String actual = target.getString();
		// then
		// e.g. : verify(mocked).called();
		String expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

}
