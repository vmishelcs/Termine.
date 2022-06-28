// Generated from /home/vmishel/Termine./src/syntacticAnalysis/SyntacticAnalysis.g4 by ANTLR 4.10.1
package syntacticAnalysis;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyntacticAnalysis extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, CONST=2, WHITESPACE=3, IDENTIFIER=4, INTEGER=5, TERMINATOR=6, 
		OPEN_BRACE=7, CLOSE_BRACE=8, EQUAL=9, OPERATOR=10, PLUS=11, MINUS=12, 
		MULTIPLY=13, DIVIDE=14;
	public static final int
		RULE_programStart = 0, RULE_statement = 1, RULE_declaration = 2, RULE_expression = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"programStart", "statement", "declaration", "expression"
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

	@Override
	public String getGrammarFileName() { return "SyntacticAnalysis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SyntacticAnalysis(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramStartContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(SyntacticAnalysis.MAIN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(SyntacticAnalysis.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(SyntacticAnalysis.CLOSE_BRACE, 0); }
		public TerminalNode EOF() { return getToken(SyntacticAnalysis.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalysisListener ) ((SyntacticAnalysisListener)listener).enterProgramStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalysisListener ) ((SyntacticAnalysisListener)listener).exitProgramStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntacticAnalysisVisitor ) return ((SyntacticAnalysisVisitor<? extends T>)visitor).visitProgramStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramStartContext programStart() throws RecognitionException {
		ProgramStartContext _localctx = new ProgramStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(MAIN);
			setState(9);
			match(OPEN_BRACE);
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(10);
				statement();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(CLOSE_BRACE);
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalysisListener ) ((SyntacticAnalysisListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalysisListener ) ((SyntacticAnalysisListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntacticAnalysisVisitor ) return ((SyntacticAnalysisVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SyntacticAnalysis.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalysis.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(SyntacticAnalysis.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(SyntacticAnalysis.TERMINATOR, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalysisListener ) ((SyntacticAnalysisListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalysisListener ) ((SyntacticAnalysisListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntacticAnalysisVisitor ) return ((SyntacticAnalysisVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CONST);
			setState(22);
			match(IDENTIFIER);
			setState(23);
			match(EQUAL);
			setState(24);
			expression(0);
			setState(25);
			match(TERMINATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyntacticAnalysis.INTEGER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(SyntacticAnalysis.OPERATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalysisListener ) ((SyntacticAnalysisListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalysisListener ) ((SyntacticAnalysisListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntacticAnalysisVisitor ) return ((SyntacticAnalysisVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(28);
			match(INTEGER);
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(30);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(31);
					match(OPERATOR);
					setState(32);
					expression(3);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000e\'\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\"\b\u0003"+
		"\n\u0003\f\u0003%\t\u0003\u0001\u0003\u0000\u0001\u0006\u0004\u0000\u0002"+
		"\u0004\u0006\u0000\u0000$\u0000\b\u0001\u0000\u0000\u0000\u0002\u0013"+
		"\u0001\u0000\u0000\u0000\u0004\u0015\u0001\u0000\u0000\u0000\u0006\u001b"+
		"\u0001\u0000\u0000\u0000\b\t\u0005\u0001\u0000\u0000\t\r\u0005\u0007\u0000"+
		"\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f"+
		"\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0005\b\u0000\u0000\u0011\u0012\u0005\u0000\u0000"+
		"\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0004\u0002"+
		"\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0002\u0000"+
		"\u0000\u0016\u0017\u0005\u0004\u0000\u0000\u0017\u0018\u0005\t\u0000\u0000"+
		"\u0018\u0019\u0003\u0006\u0003\u0000\u0019\u001a\u0005\u0006\u0000\u0000"+
		"\u001a\u0005\u0001\u0000\u0000\u0000\u001b\u001c\u0006\u0003\uffff\uffff"+
		"\u0000\u001c\u001d\u0005\u0005\u0000\u0000\u001d#\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\n\u0002\u0000\u0000\u001f \u0005\n\u0000\u0000 \"\u0003\u0006"+
		"\u0003\u0003!\u001e\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0007\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000\u0002\r#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}