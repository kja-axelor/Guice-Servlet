package com.krjani.module;

import com.google.inject.servlet.ServletModule;
import com.krjani.servlet.GuiceServlet;

public class GuiceModule extends ServletModule {

	@Override
	protected void configureServlets() {
		serve("/test").with(GuiceServlet.class);
	}

}
