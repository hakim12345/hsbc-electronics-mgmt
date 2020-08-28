package com.hsbc.electronics.exception;

public class ErrorCode {

	private ErrorCode() {
	}

	public static class Electronics {

		public Electronics() {
		}
		public static final String ELECTRONICS_LIST_NOT_FOUND = "electronics.list.not.found";
		public static final String ELECTRONICS_IS_EMPTY = "electronics.is.empty";
		public static final String DUMMY_ORDER_IS_EMPTY = "dummy.order.is.empty";
		public static final String DUMMY_ORDER_DELETE = "dummy.order.delete";


	}
}