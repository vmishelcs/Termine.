// Generated from /home/vmishel/Termine./src/lexicalAnalysis/LexicalAnalysis.g4 by ANTLR 4.10.1
package lexicalAnalysis;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexicalAnalysis extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, CONST=2, WHITESPACE=3, IDENTIFIER=4, INTEGER=5, TERMINATOR=6, 
		OPEN_BRACE=7, CLOSE_BRACE=8, EQUAL=9, OPERATOR=10, PLUS=11, MINUS=12, 
		MULTIPLY=13, DIVIDE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "CONST", "WHITESPACE", "IDENTIFIER", "INTEGER", "TERMINATOR", 
			"OPEN_BRACE", "CLOSE_BRACE", "EQUAL", "OPERATOR", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'const'", null, null, null, "'.'", "'{'", "'}'", "'='", 
			null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "CONST", "WHITESPACE", "IDENTIFIER", "INTEGER", "TERMINATOR", 
			"OPEN_BRACE", "CLOSE_BRACE", "EQUAL", "OPERATOR", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LexicalAnalysis(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexicalAnalysis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000eU\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002*\b\u0002\u000b"+
		"\u0002\f\u0002+\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u00031\b\u0003"+
		"\u000b\u0003\f\u00032\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u0003"+
		"9\t\u0003\u0001\u0004\u0004\u0004<\b\u0004\u000b\u0004\f\u0004=\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tL\b\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0000\u0000"+
		"\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u0001\u0000\u0004\u0002\u0000\t\n  \u0003\u0000AZ__az\u0004\u000009A"+
		"Z__az\u0001\u000009[\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003\"\u0001\u0000\u0000\u0000"+
		"\u0005)\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t;\u0001"+
		"\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000"+
		"\u0000\u000fC\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013"+
		"K\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017O\u0001"+
		"\u0000\u0000\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bS\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005m\u0000\u0000\u001e\u001f\u0005a\u0000\u0000\u001f"+
		" \u0005i\u0000\u0000 !\u0005n\u0000\u0000!\u0002\u0001\u0000\u0000\u0000"+
		"\"#\u0005c\u0000\u0000#$\u0005o\u0000\u0000$%\u0005n\u0000\u0000%&\u0005"+
		"s\u0000\u0000&\'\u0005t\u0000\u0000\'\u0004\u0001\u0000\u0000\u0000(*"+
		"\u0007\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-.\u0006\u0002\u0000\u0000.\u0006\u0001\u0000\u0000\u0000"+
		"/1\u0007\u0001\u0000\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000037\u0001\u0000"+
		"\u0000\u000046\u0007\u0002\u0000\u000054\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8\b\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0007\u0003\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005"+
		".\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005{\u0000\u0000B\u000e\u0001"+
		"\u0000\u0000\u0000CD\u0005}\u0000\u0000D\u0010\u0001\u0000\u0000\u0000"+
		"EF\u0005=\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GL\u0003\u0015\n\u0000"+
		"HL\u0003\u0017\u000b\u0000IL\u0003\u0019\f\u0000JL\u0003\u001b\r\u0000"+
		"KG\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000L\u0014\u0001\u0000\u0000\u0000MN\u0005"+
		"+\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OP\u0005-\u0000\u0000P\u0018"+
		"\u0001\u0000\u0000\u0000QR\u0005*\u0000\u0000R\u001a\u0001\u0000\u0000"+
		"\u0000ST\u0005/\u0000\u0000T\u001c\u0001\u0000\u0000\u0000\u0006\u0000"+
		"+27=K\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}