package com.example.portal.portlet;

import java.io.IOException;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class SamplePortlet extends GenericPortlet {

  @Override
  protected void doView(RenderRequest request, RenderResponse response)
      throws PortletException, IOException {
    response.setContentType("text/html");
    response.getWriter().println("<div class=\"sample-portlet\">");
    response.getWriter().println("<h2>Sample JSR-286 Portlet</h2>");
    response.getWriter().println("<p>This portlet renders inside the Spring home page.</p>");
    response.getWriter().println("</div>");
  }
}
