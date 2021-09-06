package com.krjani.service;

import com.google.inject.ImplementedBy;
import com.krjani.service.impl.GuiceServiceImpl;

//@ImplementedBy(GuiceServiceImpl.class)
public interface GuiceService {
	String sayHello();
}
