/*
 * <copyright> 
 *
 * Copyright (c) 2011 Martin Stockhammer <m.stockhammer@web.de>
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Martin Stockhammer - Initial API and implementation
 *
 * </copyright>
 */
package org.emona.edit.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class IOUtil {

	private static final int STREAM_BUFFER = 4096;


	/**
	 * Reads a file into string using FileChannel.
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static String toString(FileInputStream stream) throws IOException {
		try {
			FileChannel fc = stream.getChannel();
			MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0,
					fc.size());
			/* Instead of using default, pass in a decoder. */
			return Charset.defaultCharset().decode(bb).toString();
		} finally {
			stream.close();
		}
	}
	
	/**
	 * Reads a file into String and assumes the given charset.
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static String toString(FileInputStream stream, String charsetName) throws IOException {
		try {
			FileChannel fc = stream.getChannel();
			MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0,
					fc.size());
			/* Instead of using default, pass in a decoder. */
			return Charset.forName(charsetName).decode(bb).toString();
		} finally {
			stream.close();
		}
	}

	
	public static String toString(InputStream stream) throws IOException {
		if (stream == null) {
			return "";
		}
	    StringBuilder out = new StringBuilder();
	    byte[] b = new byte[STREAM_BUFFER];
	    for (int n; (n = stream.read(b)) != -1;) {
	        out.append(new String(b, 0, n));
	    }
	    return out.toString();
	}
	
	public static String toString(InputStream stream, String charsetName) throws IOException {
		if (stream == null) {
			return "";
		}
		CharBuffer cbuf = CharBuffer.allocate(STREAM_BUFFER);
		Charset charset = Charset.forName(charsetName);
		CharsetDecoder decoder = charset.newDecoder();
		StringBuilder out = new StringBuilder();
	    byte[] b = new byte[STREAM_BUFFER];
	    for (int n; (n = stream.read(b)) != -1;) {
	    	decoder.decode(ByteBuffer.wrap(b, 0, n), cbuf, false);
	    	out.append(cbuf);
	    	cbuf.reset();
	    }
	    return out.toString();
	}
	
	public static void closeQuietly(InputStream stream) {
		if (stream != null) {
			try {
				stream.close();
			} catch (IOException e) {
				// Do nothing
			}
		}
	}
		

}
