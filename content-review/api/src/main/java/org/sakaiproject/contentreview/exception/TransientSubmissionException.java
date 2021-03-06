/**
 * Copyright (c) 2003 The Apereo Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://opensource.org/licenses/ecl2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sakaiproject.contentreview.exception;

public class TransientSubmissionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer errorCode = null;

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public TransientSubmissionException() {
		super();
	}

	public TransientSubmissionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public TransientSubmissionException(Throwable arg0) {
		super(arg0);
	}

	public TransientSubmissionException(String s) {
		super(s);
	}

	public TransientSubmissionException(String s, Integer error) {
		super(s);
		errorCode = error;
	}

}
