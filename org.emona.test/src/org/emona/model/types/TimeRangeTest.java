package org.emona.model.types;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.emona.model.types.TimeRange;

public class TimeRangeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetString() {
		TimeRange ra = new TimeRange(3721888, 3722999);
		assertEquals("01:02:01.888-01:02:02.999", ra.getString(Calendar.MILLISECOND));
		assertEquals("01:02:01-01:02:02", ra.getString(Calendar.SECOND));
		assertEquals("01:02-01:02", ra.getString(Calendar.MINUTE));
		assertEquals("01-01", ra.getString(Calendar.HOUR));
	}

	@Test
	public void testParse() {
		TimeRange ra = TimeRange.parse("02:05:04.666-03:06:05.888");
		assertEquals(7504666, ra.getStart());
		assertEquals(11165888, ra.getEnd());
		ra = TimeRange.parse("02:05:04.666 - 03:06:05.888");
		assertEquals(7504666, ra.getStart());
		assertEquals(11165888, ra.getEnd());
		ra = TimeRange.parse("02:05:04.666 - 03:06:05.8889");
		assertEquals(7504666, ra.getStart());
		assertEquals(11165888, ra.getEnd());
		ra = TimeRange.parse("00:00:00 - 24:00:00");
		assertEquals(0, ra.getStart());
		assertEquals(86400000, ra.getEnd());
		
		try {
			ra = TimeRange.parse("01:00:00-00:00:00");
			assertFalse("NumberFormatException expected ", true);
		} catch (NumberFormatException e) {
			// OK
		}
		try {
			ra = new TimeRange(86400000,84600001);
			assertFalse("NumberFormatException expected ", true);
		} catch (NumberFormatException e) {
			// OK
		}
		
	}

}
