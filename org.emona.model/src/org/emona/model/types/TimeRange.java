/*******************************************************************************
 *
 * Copyright (c) 2011  Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Martin Stockhammer - Initial API and implementation
 *
 *******************************************************************************/
package org.emona.model.types;

import java.util.Calendar;
import java.util.Locale;

public class TimeRange {
	
	public long MAX_TIME=86400000L;

	/*
	 * milliseconds starting at 00:00:00.0
	 */
	private long start = -1;
	private long end = -1;

	public TimeRange() {
	}
	
	public TimeRange(long start, long end) {
		setStart(start);
		setEnd(end);
	}
	
	public static long getHour(long value) {
		return value / 3600000;
	}

	public static long getMinute(long value) {
		return (value / 60000) % 60;
	}

	public static long getSecond(long value) {
		return (value / 1000) % 60;
	}
	
	public static double getSecondWithMilli(long value) {
		return getSecond(value)+ ((value % 1000) / 1000.0);
	}

	/**
	 * Returns a string representation of the time range with the given time
	 * resolution.
	 * 
	 * @param resolution
	 *            must be one of {@link Calendar#HOUR}, {@link Calendar#MINUTE}
	 *            or {@link Calendar#SECOND}
	 * @return
	 */
	public String getString(int resolution) {
		switch (resolution) {
		case Calendar.HOUR:
			return String.format("%02d-%02d", getHour(start), getHour(end));
		case Calendar.MINUTE:
			return String.format("%02d:%02d-%02d:%02d", getHour(start),
					getMinute(start), getHour(end), getMinute(end));
		case Calendar.SECOND:
			return String.format("%02d:%02d:%02d-%02d:%02d:%02d",
					getHour(start), getMinute(start), getSecond(start),
					getHour(end), getMinute(end), getSecond(end));
		case Calendar.MILLISECOND:
			return String.format(Locale.US, "%02d:%02d:%06.3f-%02d:%02d:%06.3f",
					getHour(start), getMinute(start), getSecondWithMilli(start),
					getHour(end), getMinute(end), getSecondWithMilli(end));

		default:
			return "";
		}
	}
	
	@Override
	public String toString() {
		return getString(Calendar.SECOND);
	}
	
	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		if (start > MAX_TIME ) {
			throw new NumberFormatException("Start value must not exceed 24:00:00");
		}
		if ( end != -1 && start>end) {
			throw new NumberFormatException("Start value > end value");
		}
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		if (end > MAX_TIME ) {
			throw new NumberFormatException("End value must not exceed 24:00:00");
		}
		if (start != -1 && end < start) {
			throw new NumberFormatException("End value < start value");
		}
		this.end = end;
	}
	
	/*
	 * Parses the given string and returns a TimeRange object.
	 */
	public static TimeRange parse(String value) {
		TimeRange obj = new TimeRange();
		String startStr  = null;
		String endStr = null;
		if (value.contains("-")) {
			String[] startEnd = value.split("-");
			startStr = startEnd[0];
			endStr = startEnd[1];
		} else {
			startStr = value;
		}
		long start = 0;
		long end = 0;
		String[] values = startStr.split(":");
		int size = values.length;
		for (int i=0; i<size; i++) {
			start += getValue(values[i], i);
		}
		if (endStr == null) {
			end = start;
		} else {
			values = endStr.split(":");
			size = values.length;
			for (int i=0; i<size; i++) {
				end += getValue(values[i], i);
			}
		}
		obj.setStart(start);
		obj.setEnd(end);
		return obj;
	}
	
	private static long getValue(String str, int index) {
		String stringVal = str.trim();
		switch (index) {
		case 0:
			return Long.parseLong(stringVal)*3600000;
		
		case 1:
			return Long.parseLong(stringVal)*60000;
			
		case 2:
			return new Double(Double.parseDouble(stringVal)*1000).longValue();

		}
		return -1;
	}


}
