/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.adaptdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AdaptDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/adaptdsl/parser/antlr/internal/InternalAdaptDsl.tokens");
	}
}
