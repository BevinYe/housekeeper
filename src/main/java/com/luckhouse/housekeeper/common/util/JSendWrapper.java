package com.luckhouse.housekeeper.common.util;

import java.util.HashMap;
import java.util.Map;

import com.luckhouse.housekeeper.common.LkConstant;

/**
 * This class is used to wrap the JSon response to fit the JSend standard.
 * Refer to <a href="http://labs.omniti.com/labs/jsend">JSend</a>
 * @author whitman.yang
 *
 */

public class JSendWrapper {
	
	public static final String KEY_STATUS = "status";
	
	public static final String KEY_DATA = "data";
	
	public static final String KEY_AJAX_CALL_ID = LkConstant.REQUEST_PARAM_AJAX_CALL_ID;
	
	public static final String KEY_MESSAGE = "message";
	
	public static final String KEY_RESPONSE = "response";
	
	public static final String STATUS_SUCCESS = "success";
	
	public static final String STATUS_ERROR = "error";
	
	private JSendWrapper () {
		
	}
	
	public static Map<String, Object> wrapSuccessResponse(Object successResponse) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(KEY_STATUS, STATUS_SUCCESS);
		result.put(KEY_DATA, successResponse);
		return result;
	}
	
	public static Map<String, Object> wrapSuccessResponseWithAjaxCallId(Object successResponse, String ajaxCallId) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(KEY_STATUS, STATUS_SUCCESS);
		result.put(KEY_DATA, successResponse);
		result.put(KEY_AJAX_CALL_ID, ajaxCallId);
		return result;
	}
	
	public static Map<String, Object> wrapErrorResponse(String errorMessage) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(KEY_STATUS, STATUS_ERROR);
		result.put(KEY_MESSAGE, errorMessage);
		return result;
	}

}
