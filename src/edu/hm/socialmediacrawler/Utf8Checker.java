package edu.hm.socialmediacrawler;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public abstract class Utf8Checker {

	/**
	 * Prueft, ob der uebergebene String UTF-8 konform ist. Falls dies nicht der
	 * Fall ist, wird ein leerer String zurueckgegeben.
	 * 
	 * @return Falls der String UTF-8 konform ist, wird dieser zurueckgegeben.
	 *         Andernfalls wird ein leerer String zurueckgegeben
	 */
	public static String macheUtf8Konform(String wert) {
		try {
			if (wert!=null) {
				if (isValidUTF8(wert.getBytes("UTF-8"))) {
					return wert;
				} else {
					return "";
				}
			} else {
				return "";
			}
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}

	public static boolean isValidUTF8(byte[] input) {

		CharsetDecoder cs = Charset.forName("UTF-8").newDecoder();

		try {
			cs.decode(ByteBuffer.wrap(input));
			return true;
		} catch (CharacterCodingException e) {
			return false;
		}
	}
}
