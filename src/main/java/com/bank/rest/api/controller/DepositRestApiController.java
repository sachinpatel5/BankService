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

public class DepositRestApiController extends BaseRestApiController{

	private static final Logger logger = LoggerFactory.getLogger(DepositRestApiController.class);


	@PutMapping(path = "/deposit/{customerNumber}")
	public ResponseEntity<?>  makeDeposit(@RequestBody UserTransaction userTransaction,
			@PathVariable Long customerNumber) {
		logger.info("DepositRestApiController::makeDeposit(),customerNumber :{} ",customerNumber);
		return transactionsService.makeDeposit(userTransaction, customerNumber);
	}
	
}
