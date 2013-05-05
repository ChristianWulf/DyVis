package cau.se.chw.main.utils;

import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;

public class PreferredMapper extends NamespacePrefixMapper {

	private final String rootNamespace;

	/**
	 * Constructs a new instance of {@link PreferredMapper}.
	 * @param rootNamespace
	 */
	public PreferredMapper(String rootNamespace) {
		this.rootNamespace = rootNamespace;
	}

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
		if ((namespaceUri == null) || namespaceUri.equals("")) {
			return "xmi";
		}
		if (namespaceUri.equalsIgnoreCase("http://www.omg.org/XMI")) {
			return "xmi";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/kdm")) {
			return "kdm";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/source")) {
			return "source";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/core")) {
			return "core";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/code")) {
			return "code";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/action")) {
			return "action";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/data")) {
			return "data";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/ui")) {
			return "ui";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/conceptual")) {
			return "conceptual";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/event")) {
			return "event";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/platform")) {
			return "platform";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/structure")) {
			return "structure";
		}
		if (namespaceUri.equalsIgnoreCase("http://schema.omg.org/spec/KDM/1.1/build")) {
			return "build";
		}
		if (namespaceUri.equalsIgnoreCase("http://www.w3.org/2001/XMLSchema-instance")) {
			return "xsi";
		}

		return suggestion;
	}

	@Override
	public String[] getPreDeclaredNamespaceUris() {
		return new String[] {};
	}
}
