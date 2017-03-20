package org.yacare.ui;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of a html page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */
@Theme("yacaretheme")
public class YacareUI extends UI {

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		final VerticalLayout layout = new VerticalLayout();

		VerticalLayout headerVH = new VerticalLayout();

		headerVH.setHeight("400px");

		Button b = new Button("XXXXXX");
		//
		// FileResource resource = new FileResource(new
		// File("/WEB-INF/images/image.png"));
		//
		// Image image = new Image("Image from file", resource);

		headerVH.setHeight("120px");
		headerVH.setWidth("100%");
		headerVH.setMargin(true);
		headerVH.setSpacing(true);

		headerVH.setStyleName("header");
		headerVH.addStyleName("header");

		headerVH.addComponent(b);

		 layout.addComponent(headerVH);

//		layout.setStyleName("header");

		setContent(layout);
	}

	@WebServlet(urlPatterns = "/*", name = "YacareUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = YacareUI.class, productionMode = false)
	public static class YacareUIServlet extends VaadinServlet {
	}
}
