package com.bank.rest.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.rest.api.constants.URLConstants;
import com.bank.rest.api.dto.UserTransaction;

@RestController
@RequestMapping(URLConstants.BASE_URL)
public class WithdrawalRestApiController extends BaseRestApiController {

	private static final Logger logger = LoggerFactory.getLogger(WithdrawalRestApiController.class);
	
	@PutMapping(path = "/withdrawal/{customerNumber}")
	public ResponseEntity<?> withdrawalDetails(@RequestBody UserTransaction userTransaction,
			@PathVariable Long customerNumber) {
		logger.info("Calling withdrawalDetails()...");
		return transactionsService.withdrawalDetails(userTransaction, customerNumber);
	}
	
}
