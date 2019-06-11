// Generated from /Users/kdg/intuit_projects/apache-atlas-sources-1.1.0/repository/src/main/java/org/apache/atlas/query/antlr4/AtlasDSLParser.g4 by ANTLR 4.7.2
package org.apache.atlas.query.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtlasDSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_LINE_COMMENT=1, MULTILINE_COMMENT=2, WS=3, NUMBER=4, FLOATING_NUMBER=5, 
		BOOL=6, K_COMMA=7, K_PLUS=8, K_MINUS=9, K_STAR=10, K_DIV=11, K_DOT=12, 
		K_LIKE=13, K_AND=14, K_OR=15, K_LPAREN=16, K_LBRACKET=17, K_RPAREN=18, 
		K_RBRACKET=19, K_LT=20, K_LTE=21, K_EQ=22, K_NEQ=23, K_GT=24, K_GTE=25, 
		K_FROM=26, K_WHERE=27, K_ORDERBY=28, K_GROUPBY=29, K_LIMIT=30, K_SELECT=31, 
		K_MAX=32, K_MIN=33, K_SUM=34, K_COUNT=35, K_OFFSET=36, K_AS=37, K_ISA=38, 
		K_IS=39, K_HAS=40, K_ASC=41, K_DESC=42, K_TRUE=43, K_FALSE=44, K_HASR=45, 
		KEYWORD=46, ID=47, STRING=48;
	public static final int
		RULE_identifier = 0, RULE_operator = 1, RULE_sortOrder = 2, RULE_valueArray = 3, 
		RULE_literal = 4, RULE_limitClause = 5, RULE_offsetClause = 6, RULE_atomE = 7, 
		RULE_multiERight = 8, RULE_multiE = 9, RULE_arithERight = 10, RULE_arithE = 11, 
		RULE_comparisonClause = 12, RULE_isClause = 13, RULE_hasClause = 14, RULE_countClause = 15, 
		RULE_maxClause = 16, RULE_minClause = 17, RULE_sumClause = 18, RULE_exprRight = 19, 
		RULE_hasRClause = 20, RULE_compE = 21, RULE_expr = 22, RULE_limitOffset = 23, 
		RULE_selectExpression = 24, RULE_selectExpr = 25, RULE_aliasExpr = 26, 
		RULE_orderByExpr = 27, RULE_fromSrc = 28, RULE_whereClause = 29, RULE_fromExpression = 30, 
		RULE_fromClause = 31, RULE_selectClause = 32, RULE_hasRExpression = 33, 
		RULE_singleQrySrc = 34, RULE_groupByExpression = 35, RULE_commaDelimitedQueries = 36, 
		RULE_spaceDelimitedQueries = 37, RULE_querySrc = 38, RULE_query = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "operator", "sortOrder", "valueArray", "literal", "limitClause", 
			"offsetClause", "atomE", "multiERight", "multiE", "arithERight", "arithE", 
			"comparisonClause", "isClause", "hasClause", "countClause", "maxClause", 
			"minClause", "sumClause", "exprRight", "hasRClause", "compE", "expr", 
			"limitOffset", "selectExpression", "selectExpr", "aliasExpr", "orderByExpr", 
			"fromSrc", "whereClause", "fromExpression", "fromClause", "selectClause", 
			"hasRExpression", "singleQrySrc", "groupByExpression", "commaDelimitedQueries", 
			"spaceDelimitedQueries", "querySrc", "query"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "','", "'+'", "'-'", "'*'", 
			"'/'", "'.'", null, null, null, "'('", "'['", "')'", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "WS", "NUMBER", "FLOATING_NUMBER", 
			"BOOL", "K_COMMA", "K_PLUS", "K_MINUS", "K_STAR", "K_DIV", "K_DOT", "K_LIKE", 
			"K_AND", "K_OR", "K_LPAREN", "K_LBRACKET", "K_RPAREN", "K_RBRACKET", 
			"K_LT", "K_LTE", "K_EQ", "K_NEQ", "K_GT", "K_GTE", "K_FROM", "K_WHERE", 
			"K_ORDERBY", "K_GROUPBY", "K_LIMIT", "K_SELECT", "K_MAX", "K_MIN", "K_SUM", 
			"K_COUNT", "K_OFFSET", "K_AS", "K_ISA", "K_IS", "K_HAS", "K_ASC", "K_DESC", 
			"K_TRUE", "K_FALSE", "K_HASR", "KEYWORD", "ID", "STRING"
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
	public String getGrammarFileName() { return "AtlasDSLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AtlasDSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AtlasDSLParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode K_LT() { return getToken(AtlasDSLParser.K_LT, 0); }
		public TerminalNode K_LTE() { return getToken(AtlasDSLParser.K_LTE, 0); }
		public TerminalNode K_EQ() { return getToken(AtlasDSLParser.K_EQ, 0); }
		public TerminalNode K_NEQ() { return getToken(AtlasDSLParser.K_NEQ, 0); }
		public TerminalNode K_GT() { return getToken(AtlasDSLParser.K_GT, 0); }
		public TerminalNode K_GTE() { return getToken(AtlasDSLParser.K_GTE, 0); }
		public TerminalNode K_LIKE() { return getToken(AtlasDSLParser.K_LIKE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_LIKE) | (1L << K_LT) | (1L << K_LTE) | (1L << K_EQ) | (1L << K_NEQ) | (1L << K_GT) | (1L << K_GTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class SortOrderContext extends ParserRuleContext {
		public TerminalNode K_ASC() { return getToken(AtlasDSLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(AtlasDSLParser.K_DESC, 0); }
		public SortOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterSortOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitSortOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitSortOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortOrderContext sortOrder() throws RecognitionException {
		SortOrderContext _localctx = new SortOrderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sortOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==K_ASC || _la==K_DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ValueArrayContext extends ParserRuleContext {
		public TerminalNode K_LBRACKET() { return getToken(AtlasDSLParser.K_LBRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(AtlasDSLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtlasDSLParser.ID, i);
		}
		public TerminalNode K_RBRACKET() { return getToken(AtlasDSLParser.K_RBRACKET, 0); }
		public List<TerminalNode> K_COMMA() { return getTokens(AtlasDSLParser.K_COMMA); }
		public TerminalNode K_COMMA(int i) {
			return getToken(AtlasDSLParser.K_COMMA, i);
		}
		public ValueArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterValueArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitValueArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitValueArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueArrayContext valueArray() throws RecognitionException {
		ValueArrayContext _localctx = new ValueArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valueArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(K_LBRACKET);
			setState(87);
			match(ID);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_COMMA) {
				{
				{
				setState(88);
				match(K_COMMA);
				setState(89);
				match(ID);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(K_RBRACKET);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(AtlasDSLParser.BOOL, 0); }
		public TerminalNode NUMBER() { return getToken(AtlasDSLParser.NUMBER, 0); }
		public TerminalNode FLOATING_NUMBER() { return getToken(AtlasDSLParser.FLOATING_NUMBER, 0); }
		public TerminalNode ID() { return getToken(AtlasDSLParser.ID, 0); }
		public ValueArrayContext valueArray() {
			return getRuleContext(ValueArrayContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_literal);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(BOOL);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(NUMBER);
				}
				break;
			case FLOATING_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(FLOATING_NUMBER);
				}
				break;
			case K_LBRACKET:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(100);
					match(ID);
					}
					break;
				case K_LBRACKET:
					{
					setState(101);
					valueArray();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode K_LIMIT() { return getToken(AtlasDSLParser.K_LIMIT, 0); }
		public TerminalNode NUMBER() { return getToken(AtlasDSLParser.NUMBER, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(K_LIMIT);
			setState(107);
			match(NUMBER);
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

	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode K_OFFSET() { return getToken(AtlasDSLParser.K_OFFSET, 0); }
		public TerminalNode NUMBER() { return getToken(AtlasDSLParser.NUMBER, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitOffsetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitOffsetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(K_OFFSET);
			setState(110);
			match(NUMBER);
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

	public static class AtomEContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode K_LPAREN() { return getToken(AtlasDSLParser.K_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_RPAREN() { return getToken(AtlasDSLParser.K_RPAREN, 0); }
		public AtomEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterAtomE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitAtomE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitAtomE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomEContext atomE() throws RecognitionException {
		AtomEContext _localctx = new AtomEContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atomE);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case FLOATING_NUMBER:
			case BOOL:
			case K_LBRACKET:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(112);
					identifier();
					}
					break;
				case 2:
					{
					setState(113);
					literal();
					}
					break;
				}
				}
				break;
			case K_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(K_LPAREN);
				setState(117);
				expr();
				setState(118);
				match(K_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MultiERightContext extends ParserRuleContext {
		public AtomEContext atomE() {
			return getRuleContext(AtomEContext.class,0);
		}
		public TerminalNode K_STAR() { return getToken(AtlasDSLParser.K_STAR, 0); }
		public TerminalNode K_DIV() { return getToken(AtlasDSLParser.K_DIV, 0); }
		public MultiERightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiERight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterMultiERight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitMultiERight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitMultiERight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiERightContext multiERight() throws RecognitionException {
		MultiERightContext _localctx = new MultiERightContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiERight);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==K_STAR || _la==K_DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
			atomE();
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

	public static class MultiEContext extends ParserRuleContext {
		public AtomEContext atomE() {
			return getRuleContext(AtomEContext.class,0);
		}
		public List<MultiERightContext> multiERight() {
			return getRuleContexts(MultiERightContext.class);
		}
		public MultiERightContext multiERight(int i) {
			return getRuleContext(MultiERightContext.class,i);
		}
		public MultiEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterMultiE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitMultiE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitMultiE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiEContext multiE() throws RecognitionException {
		MultiEContext _localctx = new MultiEContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			atomE();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_STAR || _la==K_DIV) {
				{
				{
				setState(126);
				multiERight();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ArithERightContext extends ParserRuleContext {
		public MultiEContext multiE() {
			return getRuleContext(MultiEContext.class,0);
		}
		public TerminalNode K_PLUS() { return getToken(AtlasDSLParser.K_PLUS, 0); }
		public TerminalNode K_MINUS() { return getToken(AtlasDSLParser.K_MINUS, 0); }
		public ArithERightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithERight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterArithERight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitArithERight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitArithERight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithERightContext arithERight() throws RecognitionException {
		ArithERightContext _localctx = new ArithERightContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arithERight);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==K_PLUS || _la==K_MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			multiE();
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

	public static class ArithEContext extends ParserRuleContext {
		public MultiEContext multiE() {
			return getRuleContext(MultiEContext.class,0);
		}
		public List<ArithERightContext> arithERight() {
			return getRuleContexts(ArithERightContext.class);
		}
		public ArithERightContext arithERight(int i) {
			return getRuleContext(ArithERightContext.class,i);
		}
		public ArithEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterArithE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitArithE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitArithE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithEContext arithE() throws RecognitionException {
		ArithEContext _localctx = new ArithEContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arithE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			multiE();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_PLUS || _la==K_MINUS) {
				{
				{
				setState(136);
				arithERight();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ComparisonClauseContext extends ParserRuleContext {
		public List<ArithEContext> arithE() {
			return getRuleContexts(ArithEContext.class);
		}
		public ArithEContext arithE(int i) {
			return getRuleContext(ArithEContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ComparisonClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterComparisonClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitComparisonClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitComparisonClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonClauseContext comparisonClause() throws RecognitionException {
		ComparisonClauseContext _localctx = new ComparisonClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparisonClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			arithE();
			setState(143);
			operator();
			setState(144);
			arithE();
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

	public static class IsClauseContext extends ParserRuleContext {
		public ArithEContext arithE() {
			return getRuleContext(ArithEContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode K_ISA() { return getToken(AtlasDSLParser.K_ISA, 0); }
		public TerminalNode K_IS() { return getToken(AtlasDSLParser.K_IS, 0); }
		public IsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterIsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitIsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitIsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsClauseContext isClause() throws RecognitionException {
		IsClauseContext _localctx = new IsClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_isClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			arithE();
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==K_ISA || _la==K_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			identifier();
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

	public static class HasClauseContext extends ParserRuleContext {
		public ArithEContext arithE() {
			return getRuleContext(ArithEContext.class,0);
		}
		public TerminalNode K_HAS() { return getToken(AtlasDSLParser.K_HAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public HasClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterHasClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitHasClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitHasClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasClauseContext hasClause() throws RecognitionException {
		HasClauseContext _localctx = new HasClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_hasClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			arithE();
			setState(151);
			match(K_HAS);
			setState(152);
			identifier();
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

	public static class CountClauseContext extends ParserRuleContext {
		public TerminalNode K_COUNT() { return getToken(AtlasDSLParser.K_COUNT, 0); }
		public TerminalNode K_LPAREN() { return getToken(AtlasDSLParser.K_LPAREN, 0); }
		public TerminalNode K_RPAREN() { return getToken(AtlasDSLParser.K_RPAREN, 0); }
		public CountClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterCountClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitCountClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitCountClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountClauseContext countClause() throws RecognitionException {
		CountClauseContext _localctx = new CountClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_countClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(K_COUNT);
			setState(155);
			match(K_LPAREN);
			setState(156);
			match(K_RPAREN);
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

	public static class MaxClauseContext extends ParserRuleContext {
		public TerminalNode K_MAX() { return getToken(AtlasDSLParser.K_MAX, 0); }
		public TerminalNode K_LPAREN() { return getToken(AtlasDSLParser.K_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_RPAREN() { return getToken(AtlasDSLParser.K_RPAREN, 0); }
		public MaxClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterMaxClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitMaxClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitMaxClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxClauseContext maxClause() throws RecognitionException {
		MaxClauseContext _localctx = new MaxClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_maxClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(K_MAX);
			setState(159);
			match(K_LPAREN);
			setState(160);
			expr();
			setState(161);
			match(K_RPAREN);
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

	public static class MinClauseContext extends ParserRuleContext {
		public TerminalNode K_MIN() { return getToken(AtlasDSLParser.K_MIN, 0); }
		public TerminalNode K_LPAREN() { return getToken(AtlasDSLParser.K_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_RPAREN() { return getToken(AtlasDSLParser.K_RPAREN, 0); }
		public MinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterMinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitMinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitMinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinClauseContext minClause() throws RecognitionException {
		MinClauseContext _localctx = new MinClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_minClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(K_MIN);
			setState(164);
			match(K_LPAREN);
			setState(165);
			expr();
			setState(166);
			match(K_RPAREN);
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

	public static class SumClauseContext extends ParserRuleContext {
		public TerminalNode K_SUM() { return getToken(AtlasDSLParser.K_SUM, 0); }
		public TerminalNode K_LPAREN() { return getToken(AtlasDSLParser.K_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_RPAREN() { return getToken(AtlasDSLParser.K_RPAREN, 0); }
		public SumClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterSumClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitSumClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitSumClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumClauseContext sumClause() throws RecognitionException {
		SumClauseContext _localctx = new SumClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sumClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(K_SUM);
			setState(169);
			match(K_LPAREN);
			setState(170);
			expr();
			setState(171);
			match(K_RPAREN);
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

	public static class ExprRightContext extends ParserRuleContext {
		public CompEContext compE() {
			return getRuleContext(CompEContext.class,0);
		}
		public TerminalNode K_AND() { return getToken(AtlasDSLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(AtlasDSLParser.K_OR, 0); }
		public ExprRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterExprRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitExprRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitExprRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRightContext exprRight() throws RecognitionException {
		ExprRightContext _localctx = new ExprRightContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprRight);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==K_AND || _la==K_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			compE();
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

	public static class HasRClauseContext extends ParserRuleContext {
		public TerminalNode K_HASR() { return getToken(AtlasDSLParser.K_HASR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public HasRClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasRClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterHasRClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitHasRClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitHasRClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasRClauseContext hasRClause() throws RecognitionException {
		HasRClauseContext _localctx = new HasRClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hasRClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(K_HASR);
			setState(177);
			identifier();
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

	public static class CompEContext extends ParserRuleContext {
		public ComparisonClauseContext comparisonClause() {
			return getRuleContext(ComparisonClauseContext.class,0);
		}
		public IsClauseContext isClause() {
			return getRuleContext(IsClauseContext.class,0);
		}
		public HasClauseContext hasClause() {
			return getRuleContext(HasClauseContext.class,0);
		}
		public ArithEContext arithE() {
			return getRuleContext(ArithEContext.class,0);
		}
		public CountClauseContext countClause() {
			return getRuleContext(CountClauseContext.class,0);
		}
		public MaxClauseContext maxClause() {
			return getRuleContext(MaxClauseContext.class,0);
		}
		public MinClauseContext minClause() {
			return getRuleContext(MinClauseContext.class,0);
		}
		public SumClauseContext sumClause() {
			return getRuleContext(SumClauseContext.class,0);
		}
		public CompEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterCompE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitCompE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitCompE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompEContext compE() throws RecognitionException {
		CompEContext _localctx = new CompEContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compE);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				comparisonClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				isClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				hasClause();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				arithE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				countClause();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				maxClause();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				minClause();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				sumClause();
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public CompEContext compE() {
			return getRuleContext(CompEContext.class,0);
		}
		public List<ExprRightContext> exprRight() {
			return getRuleContexts(ExprRightContext.class);
		}
		public ExprRightContext exprRight(int i) {
			return getRuleContext(ExprRightContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			compE();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND || _la==K_OR) {
				{
				{
				setState(190);
				exprRight();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LimitOffsetContext extends ParserRuleContext {
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public LimitOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterLimitOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitLimitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitLimitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitOffsetContext limitOffset() throws RecognitionException {
		LimitOffsetContext _localctx = new LimitOffsetContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_limitOffset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			limitClause();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_OFFSET) {
				{
				setState(197);
				offsetClause();
				}
			}

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

	public static class SelectExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(AtlasDSLParser.K_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterSelectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitSelectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitSelectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_selectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			expr();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(201);
				match(K_AS);
				setState(202);
				identifier();
				}
			}

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

	public static class SelectExprContext extends ParserRuleContext {
		public List<SelectExpressionContext> selectExpression() {
			return getRuleContexts(SelectExpressionContext.class);
		}
		public SelectExpressionContext selectExpression(int i) {
			return getRuleContext(SelectExpressionContext.class,i);
		}
		public List<TerminalNode> K_COMMA() { return getTokens(AtlasDSLParser.K_COMMA); }
		public TerminalNode K_COMMA(int i) {
			return getToken(AtlasDSLParser.K_COMMA, i);
		}
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterSelectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitSelectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitSelectExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selectExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			selectExpression();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_COMMA) {
				{
				{
				setState(206);
				match(K_COMMA);
				setState(207);
				selectExpression();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AliasExprContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(AtlasDSLParser.K_AS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AliasExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterAliasExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitAliasExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitAliasExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasExprContext aliasExpr() throws RecognitionException {
		AliasExprContext _localctx = new AliasExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_aliasExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(213);
				identifier();
				}
				break;
			case 2:
				{
				setState(214);
				literal();
				}
				break;
			}
			setState(217);
			match(K_AS);
			setState(218);
			identifier();
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

	public static class OrderByExprContext extends ParserRuleContext {
		public TerminalNode K_ORDERBY() { return getToken(AtlasDSLParser.K_ORDERBY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SortOrderContext sortOrder() {
			return getRuleContext(SortOrderContext.class,0);
		}
		public OrderByExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterOrderByExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitOrderByExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitOrderByExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByExprContext orderByExpr() throws RecognitionException {
		OrderByExprContext _localctx = new OrderByExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_orderByExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(K_ORDERBY);
			setState(221);
			expr();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(222);
				sortOrder();
				}
			}

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

	public static class FromSrcContext extends ParserRuleContext {
		public AliasExprContext aliasExpr() {
			return getRuleContext(AliasExprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FromSrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSrc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterFromSrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitFromSrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitFromSrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromSrcContext fromSrc() throws RecognitionException {
		FromSrcContext _localctx = new FromSrcContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fromSrc);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				aliasExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(226);
					identifier();
					}
					break;
				case 2:
					{
					setState(227);
					literal();
					}
					break;
				}
				}
				break;
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(AtlasDSLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(K_WHERE);
			setState(233);
			expr();
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

	public static class FromExpressionContext extends ParserRuleContext {
		public FromSrcContext fromSrc() {
			return getRuleContext(FromSrcContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public FromExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterFromExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitFromExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitFromExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromExpressionContext fromExpression() throws RecognitionException {
		FromExpressionContext _localctx = new FromExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fromExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			fromSrc();
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(236);
				whereClause();
				}
				break;
			}
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(AtlasDSLParser.K_FROM, 0); }
		public FromExpressionContext fromExpression() {
			return getRuleContext(FromExpressionContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(K_FROM);
			setState(240);
			fromExpression();
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(AtlasDSLParser.K_SELECT, 0); }
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(K_SELECT);
			setState(243);
			selectExpr();
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

	public static class HasRExpressionContext extends ParserRuleContext {
		public HasRClauseContext hasRClause() {
			return getRuleContext(HasRClauseContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(AtlasDSLParser.K_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public HasRExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasRExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterHasRExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitHasRExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitHasRExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasRExpressionContext hasRExpression() throws RecognitionException {
		HasRExpressionContext _localctx = new HasRExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_hasRExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			hasRClause();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(246);
				match(K_AS);
				setState(247);
				identifier();
				}
			}

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

	public static class SingleQrySrcContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public HasRExpressionContext hasRExpression() {
			return getRuleContext(HasRExpressionContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public FromExpressionContext fromExpression() {
			return getRuleContext(FromExpressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingleQrySrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQrySrc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterSingleQrySrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitSingleQrySrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitSingleQrySrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleQrySrcContext singleQrySrc() throws RecognitionException {
		SingleQrySrcContext _localctx = new SingleQrySrcContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_singleQrySrc);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				fromClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				hasRExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				whereClause();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				fromExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				expr();
				}
				break;
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

	public static class GroupByExpressionContext extends ParserRuleContext {
		public TerminalNode K_GROUPBY() { return getToken(AtlasDSLParser.K_GROUPBY, 0); }
		public TerminalNode K_LPAREN() { return getToken(AtlasDSLParser.K_LPAREN, 0); }
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public TerminalNode K_RPAREN() { return getToken(AtlasDSLParser.K_RPAREN, 0); }
		public GroupByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterGroupByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitGroupByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitGroupByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByExpressionContext groupByExpression() throws RecognitionException {
		GroupByExpressionContext _localctx = new GroupByExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_groupByExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(K_GROUPBY);
			setState(258);
			match(K_LPAREN);
			setState(259);
			selectExpr();
			setState(260);
			match(K_RPAREN);
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

	public static class CommaDelimitedQueriesContext extends ParserRuleContext {
		public List<SingleQrySrcContext> singleQrySrc() {
			return getRuleContexts(SingleQrySrcContext.class);
		}
		public SingleQrySrcContext singleQrySrc(int i) {
			return getRuleContext(SingleQrySrcContext.class,i);
		}
		public List<TerminalNode> K_COMMA() { return getTokens(AtlasDSLParser.K_COMMA); }
		public TerminalNode K_COMMA(int i) {
			return getToken(AtlasDSLParser.K_COMMA, i);
		}
		public CommaDelimitedQueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaDelimitedQueries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterCommaDelimitedQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitCommaDelimitedQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitCommaDelimitedQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaDelimitedQueriesContext commaDelimitedQueries() throws RecognitionException {
		CommaDelimitedQueriesContext _localctx = new CommaDelimitedQueriesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_commaDelimitedQueries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			singleQrySrc();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_COMMA) {
				{
				{
				setState(263);
				match(K_COMMA);
				setState(264);
				singleQrySrc();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SpaceDelimitedQueriesContext extends ParserRuleContext {
		public List<SingleQrySrcContext> singleQrySrc() {
			return getRuleContexts(SingleQrySrcContext.class);
		}
		public SingleQrySrcContext singleQrySrc(int i) {
			return getRuleContext(SingleQrySrcContext.class,i);
		}
		public SpaceDelimitedQueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaceDelimitedQueries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterSpaceDelimitedQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitSpaceDelimitedQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitSpaceDelimitedQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceDelimitedQueriesContext spaceDelimitedQueries() throws RecognitionException {
		SpaceDelimitedQueriesContext _localctx = new SpaceDelimitedQueriesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_spaceDelimitedQueries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			singleQrySrc();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << FLOATING_NUMBER) | (1L << BOOL) | (1L << K_LPAREN) | (1L << K_LBRACKET) | (1L << K_FROM) | (1L << K_WHERE) | (1L << K_MAX) | (1L << K_MIN) | (1L << K_SUM) | (1L << K_COUNT) | (1L << K_HASR) | (1L << ID))) != 0)) {
				{
				{
				setState(271);
				singleQrySrc();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class QuerySrcContext extends ParserRuleContext {
		public CommaDelimitedQueriesContext commaDelimitedQueries() {
			return getRuleContext(CommaDelimitedQueriesContext.class,0);
		}
		public SpaceDelimitedQueriesContext spaceDelimitedQueries() {
			return getRuleContext(SpaceDelimitedQueriesContext.class,0);
		}
		public QuerySrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySrc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterQuerySrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitQuerySrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitQuerySrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySrcContext querySrc() throws RecognitionException {
		QuerySrcContext _localctx = new QuerySrcContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_querySrc);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				commaDelimitedQueries();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				spaceDelimitedQueries();
				}
				break;
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

	public static class QueryContext extends ParserRuleContext {
		public QuerySrcContext querySrc() {
			return getRuleContext(QuerySrcContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AtlasDSLParser.EOF, 0); }
		public GroupByExpressionContext groupByExpression() {
			return getRuleContext(GroupByExpressionContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public OrderByExprContext orderByExpr() {
			return getRuleContext(OrderByExprContext.class,0);
		}
		public LimitOffsetContext limitOffset() {
			return getRuleContext(LimitOffsetContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasDSLParserListener ) ((AtlasDSLParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasDSLParserVisitor ) return ((AtlasDSLParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			querySrc();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_GROUPBY) {
				{
				setState(282);
				groupByExpression();
				}
			}

			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(285);
				selectClause();
				}
			}

			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDERBY) {
				{
				setState(288);
				orderByExpr();
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(291);
				limitOffset();
				}
			}

			setState(294);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u012b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\5\6i\n\6\5\6k\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\tu\n\t\3"+
		"\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\13\3\13\7\13\u0082\n\13\f\13\16"+
		"\13\u0085\13\13\3\f\3\f\3\f\3\r\3\r\7\r\u008c\n\r\f\r\16\r\u008f\13\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00be\n\27\3\30\3\30\7\30\u00c2\n\30\f\30\16\30\u00c5"+
		"\13\30\3\31\3\31\5\31\u00c9\n\31\3\32\3\32\3\32\5\32\u00ce\n\32\3\33\3"+
		"\33\3\33\7\33\u00d3\n\33\f\33\16\33\u00d6\13\33\3\34\3\34\5\34\u00da\n"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u00e2\n\35\3\36\3\36\3\36\5\36"+
		"\u00e7\n\36\5\36\u00e9\n\36\3\37\3\37\3\37\3 \3 \5 \u00f0\n \3!\3!\3!"+
		"\3\"\3\"\3\"\3#\3#\3#\5#\u00fb\n#\3$\3$\3$\3$\3$\5$\u0102\n$\3%\3%\3%"+
		"\3%\3%\3&\3&\3&\7&\u010c\n&\f&\16&\u010f\13&\3\'\3\'\7\'\u0113\n\'\f\'"+
		"\16\'\u0116\13\'\3(\3(\5(\u011a\n(\3)\3)\5)\u011e\n)\3)\5)\u0121\n)\3"+
		")\5)\u0124\n)\3)\5)\u0127\n)\3)\3)\3)\2\2*\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\b\4\2\17\17\26\33\3\2"+
		"+,\3\2\f\r\3\2\n\13\3\2()\3\2\20\21\2\u0127\2R\3\2\2\2\4T\3\2\2\2\6V\3"+
		"\2\2\2\bX\3\2\2\2\nj\3\2\2\2\fl\3\2\2\2\16o\3\2\2\2\20z\3\2\2\2\22|\3"+
		"\2\2\2\24\177\3\2\2\2\26\u0086\3\2\2\2\30\u0089\3\2\2\2\32\u0090\3\2\2"+
		"\2\34\u0094\3\2\2\2\36\u0098\3\2\2\2 \u009c\3\2\2\2\"\u00a0\3\2\2\2$\u00a5"+
		"\3\2\2\2&\u00aa\3\2\2\2(\u00af\3\2\2\2*\u00b2\3\2\2\2,\u00bd\3\2\2\2."+
		"\u00bf\3\2\2\2\60\u00c6\3\2\2\2\62\u00ca\3\2\2\2\64\u00cf\3\2\2\2\66\u00d9"+
		"\3\2\2\28\u00de\3\2\2\2:\u00e8\3\2\2\2<\u00ea\3\2\2\2>\u00ed\3\2\2\2@"+
		"\u00f1\3\2\2\2B\u00f4\3\2\2\2D\u00f7\3\2\2\2F\u0101\3\2\2\2H\u0103\3\2"+
		"\2\2J\u0108\3\2\2\2L\u0110\3\2\2\2N\u0119\3\2\2\2P\u011b\3\2\2\2RS\7\61"+
		"\2\2S\3\3\2\2\2TU\t\2\2\2U\5\3\2\2\2VW\t\3\2\2W\7\3\2\2\2XY\7\23\2\2Y"+
		"^\7\61\2\2Z[\7\t\2\2[]\7\61\2\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2"+
		"\2\2_a\3\2\2\2`^\3\2\2\2ab\7\25\2\2b\t\3\2\2\2ck\7\b\2\2dk\7\6\2\2ek\7"+
		"\7\2\2fi\7\61\2\2gi\5\b\5\2hf\3\2\2\2hg\3\2\2\2ik\3\2\2\2jc\3\2\2\2jd"+
		"\3\2\2\2je\3\2\2\2jh\3\2\2\2k\13\3\2\2\2lm\7 \2\2mn\7\6\2\2n\r\3\2\2\2"+
		"op\7&\2\2pq\7\6\2\2q\17\3\2\2\2ru\5\2\2\2su\5\n\6\2tr\3\2\2\2ts\3\2\2"+
		"\2u{\3\2\2\2vw\7\22\2\2wx\5.\30\2xy\7\24\2\2y{\3\2\2\2zt\3\2\2\2zv\3\2"+
		"\2\2{\21\3\2\2\2|}\t\4\2\2}~\5\20\t\2~\23\3\2\2\2\177\u0083\5\20\t\2\u0080"+
		"\u0082\5\22\n\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\t\5\2\2\u0087\u0088\5\24\13\2\u0088\27\3\2\2\2\u0089\u008d\5\24"+
		"\13\2\u008a\u008c\5\26\f\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\31\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\u0091\5\30\r\2\u0091\u0092\5\4\3\2\u0092\u0093\5\30\r\2\u0093"+
		"\33\3\2\2\2\u0094\u0095\5\30\r\2\u0095\u0096\t\6\2\2\u0096\u0097\5\2\2"+
		"\2\u0097\35\3\2\2\2\u0098\u0099\5\30\r\2\u0099\u009a\7*\2\2\u009a\u009b"+
		"\5\2\2\2\u009b\37\3\2\2\2\u009c\u009d\7%\2\2\u009d\u009e\7\22\2\2\u009e"+
		"\u009f\7\24\2\2\u009f!\3\2\2\2\u00a0\u00a1\7\"\2\2\u00a1\u00a2\7\22\2"+
		"\2\u00a2\u00a3\5.\30\2\u00a3\u00a4\7\24\2\2\u00a4#\3\2\2\2\u00a5\u00a6"+
		"\7#\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\5.\30\2\u00a8\u00a9\7\24\2\2"+
		"\u00a9%\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\5"+
		".\30\2\u00ad\u00ae\7\24\2\2\u00ae\'\3\2\2\2\u00af\u00b0\t\7\2\2\u00b0"+
		"\u00b1\5,\27\2\u00b1)\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b4\5\2\2\2\u00b4"+
		"+\3\2\2\2\u00b5\u00be\5\32\16\2\u00b6\u00be\5\34\17\2\u00b7\u00be\5\36"+
		"\20\2\u00b8\u00be\5\30\r\2\u00b9\u00be\5 \21\2\u00ba\u00be\5\"\22\2\u00bb"+
		"\u00be\5$\23\2\u00bc\u00be\5&\24\2\u00bd\u00b5\3\2\2\2\u00bd\u00b6\3\2"+
		"\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be-\3\2\2\2"+
		"\u00bf\u00c3\5,\27\2\u00c0\u00c2\5(\25\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4/\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c8\5\f\7\2\u00c7\u00c9\5\16\b\2\u00c8\u00c7\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\61\3\2\2\2\u00ca\u00cd\5.\30\2\u00cb"+
		"\u00cc\7\'\2\2\u00cc\u00ce\5\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\63\3\2\2\2\u00cf\u00d4\5\62\32\2\u00d0\u00d1\7\t\2\2\u00d1"+
		"\u00d3\5\62\32\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\65\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00da\5\2\2\2\u00d8\u00da\5\n\6\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\'\2\2\u00dc\u00dd\5\2\2\2\u00dd"+
		"\67\3\2\2\2\u00de\u00df\7\36\2\2\u00df\u00e1\5.\30\2\u00e0\u00e2\5\6\4"+
		"\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e29\3\2\2\2\u00e3\u00e9"+
		"\5\66\34\2\u00e4\u00e7\5\2\2\2\u00e5\u00e7\5\n\6\2\u00e6\u00e4\3\2\2\2"+
		"\u00e6\u00e5\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9;\3\2\2\2\u00ea\u00eb\7\35\2\2\u00eb\u00ec\5.\30\2\u00ec"+
		"=\3\2\2\2\u00ed\u00ef\5:\36\2\u00ee\u00f0\5<\37\2\u00ef\u00ee\3\2\2\2"+
		"\u00ef\u00f0\3\2\2\2\u00f0?\3\2\2\2\u00f1\u00f2\7\34\2\2\u00f2\u00f3\5"+
		"> \2\u00f3A\3\2\2\2\u00f4\u00f5\7!\2\2\u00f5\u00f6\5\64\33\2\u00f6C\3"+
		"\2\2\2\u00f7\u00fa\5*\26\2\u00f8\u00f9\7\'\2\2\u00f9\u00fb\5\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fbE\3\2\2\2\u00fc\u0102\5@!\2\u00fd"+
		"\u0102\5D#\2\u00fe\u0102\5<\37\2\u00ff\u0102\5> \2\u0100\u0102\5.\30\2"+
		"\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0100\3\2\2\2\u0102G\3\2\2\2\u0103\u0104\7\37\2\2\u0104"+
		"\u0105\7\22\2\2\u0105\u0106\5\64\33\2\u0106\u0107\7\24\2\2\u0107I\3\2"+
		"\2\2\u0108\u010d\5F$\2\u0109\u010a\7\t\2\2\u010a\u010c\5F$\2\u010b\u0109"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"K\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0114\5F$\2\u0111\u0113\5F$\2\u0112"+
		"\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115M\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011a\5J&\2\u0118\u011a"+
		"\5L\'\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011aO\3\2\2\2\u011b\u011d"+
		"\5N(\2\u011c\u011e\5H%\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u0121\5B\"\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0124\58\35\2\u0123\u0122\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\5\60\31\2\u0126\u0125\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\2\2\3\u0129"+
		"Q\3\2\2\2\34^hjtz\u0083\u008d\u00bd\u00c3\u00c8\u00cd\u00d4\u00d9\u00e1"+
		"\u00e6\u00e8\u00ef\u00fa\u0101\u010d\u0114\u0119\u011d\u0120\u0123\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}