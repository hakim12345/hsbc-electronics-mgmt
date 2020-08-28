package com.hsbc.electronics.exception;

public class ErrorCode {

	private ErrorCode() {
	}

	public static class Common {
		private Common() {
		}

		public static final String ID_MUST_NOT_NULL = "id.is.null";
	}

	public static class Electronics {

		public Electronics() {
		}
		public static final String ELECTRONICS_LIST_NOT_FOUND = "electronics.list.not.found";
		public static final String ELECTRONICS_IS_EMPTY = "electronics.is.empty";
	}
}