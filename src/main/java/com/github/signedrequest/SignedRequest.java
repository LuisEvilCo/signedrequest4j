/* 
 * Copyright 2011 Kazuhiro Sera
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language 
 * governing permissions and limitations under the License. 
 */
package com.github.signedrequest;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * <pre>
 * Singed Request.
 * An implementation of <a href="http://oauth.googlecode.com/svn/spec/ext/consumer_request/1.0/drafts/1/spec.html">OAuth Consumer Request 1.0 Draft 1</a>.
 * 
 * a.k.a OAuth Consumer Request
 * a.k.a OpenSocial Signed Request
 * a.k.a 2 Legged Auth Request
 * </pre>
 * 
 * @author <a href="mailto:seratch@gmail.com">Kazuhiro Sera</a>
 * @see <a
 *      href="http://oauth.googlecode.com/svn/spec/ext/consumer_request/1.0/drafts/1/spec.html">Specification</a>
 */
public interface SignedRequest {

	/**
	 * Returns Signed {@link HttpURLConnection} instance.
	 * 
	 * @param url
	 *            Request URL
	 * @param method
	 *            HTTP Method
	 * @return Signed {@link HttpURLConnection} instance
	 * @throws IOException
	 */
	HttpURLConnection getHttpURLConnection(String url, HttpMethod method)
			throws IOException;

	/**
	 * Returns Signed {@link HttpURLConnection} instance.
	 * 
	 * @param url
	 *            Request URL
	 * @param method
	 *            HTTP Method
	 * @param oAuthNonce
	 *            OAuth Nonce Value
	 * @param oAuthTimestamp
	 *            OAuth Timestamp Value
	 * @return Signed {@link HttpURLConnection} instance
	 * @throws IOException
	 */
	HttpURLConnection getHttpURLConnection(String url, HttpMethod method,
			String oAuthNonce, Long oAuthTimestamp) throws IOException;

	/**
	 * Returns the body of a HTTP response as String.
	 * 
	 * @param url
	 *            Request URL
	 * @param method
	 *            HTTP Method
	 * @return Response Body
	 * @throws IOException
	 */
	String getContent(String url, HttpMethod method) throws IOException;

	/**
	 * Returns the body of a HTTP response as String.
	 * 
	 * @param url
	 *            Request URL
	 * @param method
	 *            HTTP Method
	 * @param oAuthNonce
	 *            OAuth Nonce Value
	 * @param oAuthTimestamp
	 *            OAuth Timestamp Value
	 * @return Response Body
	 * @throws IOException
	 */
	String getContent(String url, HttpMethod method, String oAuthNonce,
			Long oAuthTimestamp) throws IOException;

	/**
	 * Returns OAuth Signature.
	 * 
	 * @param url
	 *            Request URL
	 * @param method
	 *            HTTP Method
	 * @param oAuthNonce
	 *            OAuth Nonce Value
	 * @param oAuthTimestamp
	 *            OAuth Timestamp Value
	 * @return OAuth Signature
	 */
	String getSignature(String url, HttpMethod method, String oAuthNonce,
			Long oAuthTimestamp);

}
