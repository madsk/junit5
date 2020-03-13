/*
 * Copyright 2015-2020 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.jupiter.api;

//import static org.junit.jupiter.api.AssertionTestUtils.assertExpectedAndActualValues;
//import static org.junit.jupiter.api.AssertionTestUtils.assertMessageEndsWith;
//import static org.junit.jupiter.api.AssertionTestUtils.assertMessageEquals;
//import static org.junit.jupiter.api.AssertionTestUtils.assertMessageStartsWith;
//import static org.junit.jupiter.api.AssertionTestUtils.expectAssertionFailedError;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.function.Executable;
//import org.opentest4j.AssertionFailedError;

/**
 * Unit tests for JUnit Jupiter {@link Assertions}.
 *
 * @since 5.0
 */
class AssertionTests {

	@Test
	void assertEqualsTestDouble() { //should pass
		double expected = 10.5;
		double actual = 10.5;
		assertEquals(expected, actual);
		assertEquals(expected, actual, "message");
		assertEquals(expected, actual, () -> "message");
	}

	@Test
	void assertEqualsTestDouble2() {
		double expected = 2.2;
		double actual = 2.2;
		assertEquals(expected, actual);
		assertEquals(expected, actual, "message");
		assertEquals(expected, actual, () -> "message");
	}

	@Test
	void assertEqualsTestInt() {
		int expected = 18;
		int actual = 18;
		assertEquals(expected, actual);
		assertEquals(expected, actual, "message");
		assertEquals(expected, actual, () -> "message");
	}

	@Test
	void assertEqualsTestFloat() {
		int expected = -5;
		int actual = -5;
		assertEquals(expected, actual);
		assertEquals(expected, actual, "message");
		assertEquals(expected, actual, () -> "message");
	}

}
