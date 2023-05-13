// Generated from C:/Users/DIEGOPC/Downloads/PracticaPL/src/main/java\Compiler.g4 by ANTLR 4.12.0
package main.java;

    import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, J=20, SPACE=21, CONST_DEF_IDENTIFIER=22, IDENTIFIER=23, 
		NUMERIC_INTEGER_CONST=24, NUMERIC_REAL_CONST=25, STRING_CONST=26, COMMENTS=27;
	public static final int
		RULE_program = 0, RULE_dcllist = 1, RULE_dcllist_R = 2, RULE_dcl = 3, 
		RULE_ctedef = 4, RULE_simpvalue = 5, RULE_varlist = 6, RULE_vardef = 7, 
		RULE_tbas = 8, RULE_tvoid = 9, RULE_funlist = 10, RULE_funlist_R = 11, 
		RULE_funcdef = 12, RULE_funchead = 13, RULE_typedef1 = 14, RULE_typedef2 = 15, 
		RULE_typedef2_R = 16, RULE_sentlist = 17, RULE_mainhead = 18, RULE_code = 19, 
		RULE_code_R = 20, RULE_sent = 21, RULE_return_m = 22, RULE_asig = 23, 
		RULE_exp = 24, RULE_exp_R = 25, RULE_op = 26, RULE_factor = 27, RULE_funccall = 28, 
		RULE_subparamlist = 29, RULE_explist = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcllist", "dcllist_R", "dcl", "ctedef", "simpvalue", "varlist", 
			"vardef", "tbas", "tvoid", "funlist", "funlist_R", "funcdef", "funchead", 
			"typedef1", "typedef2", "typedef2_R", "sentlist", "mainhead", "code", 
			"code_R", "sent", "return_m", "asig", "exp", "exp_R", "op", "factor", 
			"funccall", "subparamlist", "explist"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'#define'", "'='", "'integer'", "'float'", "'string'", 
			"'void'", "'{'", "'}'", "'('", "')'", "','", "'Main'", "'return'", "'+'", 
			"'-'", "'*'", "'DIV'", "'MOD'", "'\\n'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "J", "SPACE", "CONST_DEF_IDENTIFIER", 
			"IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", 
			"COMMENTS"
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
	public String getGrammarFileName() { return "Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    StringBuilder sb = new StringBuilder();
	    String args = "";
	    boolean funlist_finished = false;

	    public void setArgs(String args){
	        this.args = args;
	    }

	public CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public FunlistContext funlist;
		public SentlistContext sentlist;
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public FunlistContext funlist() {
			return getRuleContext(FunlistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			    final String STDIN_NAME = (((args.split("/"))[(args.split("/")).length - 1]).split("\\."))[0];
			    sb.append("<!DOCTYPE html><html><head><title>").append(STDIN_NAME).append("</title>" +
			        "<style>.cte{color:rgb(107, 211, 26);} .palres{color:rgb(0, 0, 0); font-weight: bold;}" +
			        ".ident{color:rgb(77, 77, 255);} .idfunc{color:rgb(26, 26, 255); text-decoration: underline;}</style>" +
			        "</head>").append("<body><h1 id=\"inicio\">").append("Programa: ").append(STDIN_NAME).append("</h1>")
			        .append("<h2>Funciones</h2>").append("<ul>");
			   
			setState(63);
			dcllist();
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(J);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(70);
			((ProgramContext)_localctx).funlist = funlist();
			sb.append(((ProgramContext)_localctx).funlist.v + "<hr/><a id=\"Main\"><h2>Programa Principal</h2>");
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J) {
				{
				{
				setState(72);
				match(J);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			((ProgramContext)_localctx).sentlist = sentlist();

			        sb.append(((ProgramContext)_localctx).sentlist.v + "<a href=\"#Main\">Inicio del programa principal</a> "
			        + " <a href=\"#inicio\">Inicio del programa</a>" + "</a><hr/></body></html>");
			        PrintWriter fich = null;
			        try{
			            final String STDOUT_NAME = "src/main/resources/export/" + STDIN_NAME + ".html";
			            fich = new PrintWriter(new BufferedWriter(new FileWriter(STDOUT_NAME)));
			            fich.print(sb.toString());
			        }
			        catch(IOException e){
			            System.err.println("Bad file creator.\n" + e.getMessage());
			        }
			        finally{
			            if (fich != null)
			                fich.close();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistContext extends ParserRuleContext {
		public Dcllist_RContext dcllist_R() {
			return getRuleContext(Dcllist_RContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			dcllist_R();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dcllist_RContext extends ParserRuleContext {
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public Dcllist_RContext dcllist_R() {
			return getRuleContext(Dcllist_RContext.class,0);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public Dcllist_RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist_R; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDcllist_R(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDcllist_R(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitDcllist_R(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcllist_RContext dcllist_R() throws RecognitionException {
		Dcllist_RContext _localctx = new Dcllist_RContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcllist_R);
		try {
			int _alt;
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				dcl();
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(84);
						match(J);
						}
						} 
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(90);
				dcllist_R();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public CtedefContext ctedef() {
			return getRuleContext(CtedefContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcl);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				ctedef();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				vardef();
				setState(97);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CtedefContext extends ParserRuleContext {
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(CompilerParser.CONST_DEF_IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public TerminalNode J() { return getToken(CompilerParser.J, 0); }
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public CtedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCtedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCtedef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCtedef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtedefContext ctedef() throws RecognitionException {
		CtedefContext _localctx = new CtedefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ctedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__1);
			{
			setState(102);
			match(SPACE);
			}
			setState(103);
			match(CONST_DEF_IDENTIFIER);
			{
			setState(104);
			match(SPACE);
			}
			setState(105);
			simpvalue();
			setState(106);
			match(J);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvalueContext extends ParserRuleContext {
		public String v;
		public Token NUMERIC_INTEGER_CONST;
		public Token NUMERIC_REAL_CONST;
		public Token STRING_CONST;
		public TerminalNode NUMERIC_INTEGER_CONST() { return getToken(CompilerParser.NUMERIC_INTEGER_CONST, 0); }
		public TerminalNode NUMERIC_REAL_CONST() { return getToken(CompilerParser.NUMERIC_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(CompilerParser.STRING_CONST, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpvalue);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST = match(NUMERIC_INTEGER_CONST);
				((SimpvalueContext)_localctx).v =  "<span class=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null)
				    + "</span>";
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).v =  "<span class=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null) + "</span>";
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).v =  "<span class=\"cte\">" + (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null) + "</span>";
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varlist);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				vardef();
				setState(117);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				vardef();
				setState(120);
				match(T__0);
				setState(121);
				varlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VardefContext extends ParserRuleContext {
		public String v;
		public TbasContext tbas;
		public Token SPACE;
		public Token IDENTIFIER;
		public SimpvalueContext simpvalue;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CompilerParser.IDENTIFIER, 0); }
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vardef);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((VardefContext)_localctx).tbas = tbas();
				{
				setState(126);
				((VardefContext)_localctx).SPACE = match(SPACE);
				}
				setState(127);
				((VardefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((VardefContext)_localctx).v =  ((VardefContext)_localctx).tbas.v + (((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null) + "<span class=\"ident\">"
				        + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "</span>";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				((VardefContext)_localctx).tbas = tbas();
				{
				setState(131);
				((VardefContext)_localctx).SPACE = match(SPACE);
				}
				setState(132);
				((VardefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(133);
					((VardefContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(136);
				match(T__2);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(137);
					((VardefContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(140);
				((VardefContext)_localctx).simpvalue = simpvalue();
				((VardefContext)_localctx).v =  ((VardefContext)_localctx).tbas.v + (((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null) + "<span class=\"ident\">"
				        + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "</span>" + ((((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null) == null ? "" : (((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null)) + "=" +
				        ((((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null) == null ? "" : (((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null)) + ((VardefContext)_localctx).simpvalue.v;
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class TbasContext extends ParserRuleContext {
		public String v;
		public TvoidContext tvoid;
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tbas);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__3);
				((TbasContext)_localctx).v =  "<span class=\"palres\">integer</span>";
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__4);
				((TbasContext)_localctx).v =  "<span class=\"palres\">float</span>";
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__5);
				((TbasContext)_localctx).v =  "<span class=\"palres\">string</span>";
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				((TbasContext)_localctx).tvoid = tvoid();
				((TbasContext)_localctx).v =  ((TbasContext)_localctx).tvoid.v;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TvoidContext extends ParserRuleContext {
		public String v;
		public TvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterTvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitTvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTvoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TvoidContext tvoid() throws RecognitionException {
		TvoidContext _localctx = new TvoidContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__6);
			((TvoidContext)_localctx).v =  "<span class=\"palres\">void</span>";
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunlistContext extends ParserRuleContext {
		public String v;
		public Funlist_RContext funlist_R;
		public Funlist_RContext funlist_R() {
			return getRuleContext(Funlist_RContext.class,0);
		}
		public FunlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFunlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFunlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFunlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunlistContext funlist() throws RecognitionException {
		FunlistContext _localctx = new FunlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((FunlistContext)_localctx).funlist_R = funlist_R("<li><a href=\"#Main\">Programa principal</a></li>");
			((FunlistContext)_localctx).v =  ((FunlistContext)_localctx).funlist_R.v;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Funlist_RContext extends ParserRuleContext {
		public String h;
		public String v;
		public FuncdefContext funcdef;
		public Token J;
		public Funlist_RContext funlist_R;
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Funlist_RContext funlist_R() {
			return getRuleContext(Funlist_RContext.class,0);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public Funlist_RContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Funlist_RContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_funlist_R; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFunlist_R(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFunlist_R(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFunlist_R(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funlist_RContext funlist_R(String h) throws RecognitionException {
		Funlist_RContext _localctx = new Funlist_RContext(_ctx, getState(), h);
		enterRule(_localctx, 22, RULE_funlist_R);
		try {
			int _alt;
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				((Funlist_RContext)_localctx).funcdef = funcdef();
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(163);
						((Funlist_RContext)_localctx).J = match(J);
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(169);
				((Funlist_RContext)_localctx).funlist_R = funlist_R(_localctx.h += ((Funlist_RContext)_localctx).funcdef.v + ((((Funlist_RContext)_localctx).J!=null?((Funlist_RContext)_localctx).J.getText():null) == null ? "<br>" : (((Funlist_RContext)_localctx).J!=null?((Funlist_RContext)_localctx).J.getText():null)));
				((Funlist_RContext)_localctx).v =  ((Funlist_RContext)_localctx).funlist_R.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Funlist_RContext)_localctx).v =  _localctx.h;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncdefContext extends ParserRuleContext {
		public String v;
		public FuncheadContext funchead;
		public CodeContext code;
		public FuncheadContext funchead() {
			return getRuleContext(FuncheadContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcdef);
		int _la;
		try {
			int _alt;
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				((FuncdefContext)_localctx).funchead = funchead();
				setState(176);
				match(T__0);
				((FuncdefContext)_localctx).v =  "<li><a href=\"#" + ((FuncdefContext)_localctx).funchead.id + "\">" + ((FuncdefContext)_localctx).funchead.v + "</a></li>";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((FuncdefContext)_localctx).funchead = funchead();
				setState(180);
				match(T__7);
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(181);
						_la = _input.LA(1);
						if ( !(_la==J || _la==SPACE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(187);
				((FuncdefContext)_localctx).code = code();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J || _la==SPACE) {
					{
					{
					setState(188);
					_la = _input.LA(1);
					if ( !(_la==J || _la==SPACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(T__8);
				((FuncdefContext)_localctx).v =  ""; _localctx.v += (funlist_finished ? "" : "</ul>");
				        funlist_finished = true; _localctx.v += "<hr/><a id=\"" + ((FuncdefContext)_localctx).funchead.id + "\">" + ((FuncdefContext)_localctx).funchead.v + "<br>"
				        + "{<div style=\"text-indent: 0.5cm\">" + ((FuncdefContext)_localctx).code.v + "</div>}<br></a>" +
				        "<a href=\"#" + ((FuncdefContext)_localctx).funchead.id + "\">Inicio de la funci&oacute;n</a> " +
				        " <a href=\"#inicio\">Inicio del programa</a>"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncheadContext extends ParserRuleContext {
		public String v;
		public String id;
		public TbasContext tbas;
		public Token SPACE;
		public Token IDENTIFIER;
		public Typedef1Context typedef1;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CompilerParser.IDENTIFIER, 0); }
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public FuncheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funchead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFunchead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFunchead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFunchead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncheadContext funchead() throws RecognitionException {
		FuncheadContext _localctx = new FuncheadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funchead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			((FuncheadContext)_localctx).tbas = tbas();
			{
			setState(200);
			((FuncheadContext)_localctx).SPACE = match(SPACE);
			}
			setState(201);
			((FuncheadContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(202);
				((FuncheadContext)_localctx).SPACE = match(SPACE);
				}
			}

			setState(205);
			match(T__9);
			setState(206);
			((FuncheadContext)_localctx).typedef1 = typedef1();
			setState(207);
			match(T__10);

			    ((FuncheadContext)_localctx).v =  ((FuncheadContext)_localctx).tbas.v + (((FuncheadContext)_localctx).SPACE!=null?((FuncheadContext)_localctx).SPACE.getText():null) + "<span class=\"ident\">" + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) + "</span>" +
			    ((((FuncheadContext)_localctx).SPACE!=null?((FuncheadContext)_localctx).SPACE.getText():null) == null ? "" : (((FuncheadContext)_localctx).SPACE!=null?((FuncheadContext)_localctx).SPACE.getText():null)) + "(" + ((FuncheadContext)_localctx).typedef1.v + ")";
			    ((FuncheadContext)_localctx).id =  (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null);

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

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef1Context extends ParserRuleContext {
		public String v;
		public Typedef2Context typedef2;
		public Typedef2Context typedef2() {
			return getRuleContext(Typedef2Context.class,0);
		}
		public Typedef1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterTypedef1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitTypedef1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTypedef1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typedef1Context typedef1() throws RecognitionException {
		Typedef1Context _localctx = new Typedef1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_typedef1);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((Typedef1Context)_localctx).typedef2 = typedef2();
				((Typedef1Context)_localctx).v =  ((Typedef1Context)_localctx).typedef2.v;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				((Typedef1Context)_localctx).v =  "";
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

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef2Context extends ParserRuleContext {
		public String v;
		public TbasContext tbas;
		public Token SPACE;
		public Token IDENTIFIER;
		public Typedef2_RContext typedef2_R;
		public TvoidContext tvoid;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CompilerParser.IDENTIFIER, 0); }
		public Typedef2_RContext typedef2_R() {
			return getRuleContext(Typedef2_RContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(CompilerParser.SPACE, 0); }
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public Typedef2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterTypedef2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitTypedef2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTypedef2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typedef2Context typedef2() throws RecognitionException {
		Typedef2Context _localctx = new Typedef2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_typedef2);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				((Typedef2Context)_localctx).tbas = tbas();
				{
				setState(217);
				((Typedef2Context)_localctx).SPACE = match(SPACE);
				}
				setState(218);
				((Typedef2Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(219);
				((Typedef2Context)_localctx).typedef2_R = typedef2_R(((Typedef2Context)_localctx).tbas.v + (((Typedef2Context)_localctx).SPACE!=null?((Typedef2Context)_localctx).SPACE.getText():null) + "<span class=\"ident\">"
				        + (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) + "</span>");

				        ((Typedef2Context)_localctx).v =  ((Typedef2Context)_localctx).typedef2_R.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				((Typedef2Context)_localctx).tvoid = tvoid();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					{
					setState(223);
					match(SPACE);
					}
					setState(224);
					((Typedef2Context)_localctx).IDENTIFIER = match(IDENTIFIER);
					}
				}

				((Typedef2Context)_localctx).v =  ((Typedef2Context)_localctx).tvoid.v + ((((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) == null ? "" : (" "+"<span class=\"ident\">"
				        + (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) + "</span>"));
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

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef2_RContext extends ParserRuleContext {
		public String h;
		public String v;
		public Token SPACE;
		public TbasContext tbas;
		public Token IDENTIFIER;
		public Typedef2_RContext typedef2_R;
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CompilerParser.IDENTIFIER, 0); }
		public Typedef2_RContext typedef2_R() {
			return getRuleContext(Typedef2_RContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public Typedef2_RContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Typedef2_RContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_typedef2_R; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterTypedef2_R(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitTypedef2_R(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTypedef2_R(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typedef2_RContext typedef2_R(String h) throws RecognitionException {
		Typedef2_RContext _localctx = new Typedef2_RContext(_ctx, getState(), h);
		enterRule(_localctx, 32, RULE_typedef2_R);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__11);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(232);
					((Typedef2_RContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(235);
				((Typedef2_RContext)_localctx).tbas = tbas();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(236);
					((Typedef2_RContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(239);
				((Typedef2_RContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(240);
				((Typedef2_RContext)_localctx).typedef2_R = typedef2_R(_localctx.h += "," + ((((Typedef2_RContext)_localctx).SPACE!=null?((Typedef2_RContext)_localctx).SPACE.getText():null) == null ? "" : (((Typedef2_RContext)_localctx).SPACE!=null?((Typedef2_RContext)_localctx).SPACE.getText():null)) + ((Typedef2_RContext)_localctx).tbas.v +
				        ((((Typedef2_RContext)_localctx).SPACE!=null?((Typedef2_RContext)_localctx).SPACE.getText():null) == null ? "" : (((Typedef2_RContext)_localctx).SPACE!=null?((Typedef2_RContext)_localctx).SPACE.getText():null)) + "<span class=\"ident\">" + (((Typedef2_RContext)_localctx).IDENTIFIER!=null?((Typedef2_RContext)_localctx).IDENTIFIER.getText():null) + "</span>");
				((Typedef2_RContext)_localctx).v =  ((Typedef2_RContext)_localctx).typedef2_R.v;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				((Typedef2_RContext)_localctx).v =  _localctx.h;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public String v;
		public MainheadContext mainhead;
		public Token J;
		public Token SPACE;
		public CodeContext code;
		public MainheadContext mainhead() {
			return getRuleContext(MainheadContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sentlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((SentlistContext)_localctx).mainhead = mainhead();
			setState(247);
			match(T__7);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					_la = _input.LA(1);
					if ( !(_la==J || _la==SPACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(254);
			((SentlistContext)_localctx).code = code();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J || _la==SPACE) {
				{
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==J || _la==SPACE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(T__8);
			 ((SentlistContext)_localctx).v =  ((SentlistContext)_localctx).mainhead.v + "<br>{" +
			    ((((SentlistContext)_localctx).J!=null?((SentlistContext)_localctx).J.getText():null) == null ? "<br>" : (((SentlistContext)_localctx).J!=null?((SentlistContext)_localctx).J.getText():null)) + ((((SentlistContext)_localctx).SPACE!=null?((SentlistContext)_localctx).SPACE.getText():null) == null ? "" : (((SentlistContext)_localctx).SPACE!=null?((SentlistContext)_localctx).SPACE.getText():null)) +
			    "<div style=\"text-indent: 0.5cm\">" + ((SentlistContext)_localctx).code.v + "</div>" + ((((SentlistContext)_localctx).SPACE!=null?((SentlistContext)_localctx).SPACE.getText():null) == null ? "" : (((SentlistContext)_localctx).SPACE!=null?((SentlistContext)_localctx).SPACE.getText():null)) + "}"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainheadContext extends ParserRuleContext {
		public String v;
		public TvoidContext tvoid;
		public Token SPACE;
		public Typedef1Context typedef1;
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public Typedef1Context typedef1() {
			return getRuleContext(Typedef1Context.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public MainheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterMainhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitMainhead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitMainhead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainheadContext mainhead() throws RecognitionException {
		MainheadContext _localctx = new MainheadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mainhead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			((MainheadContext)_localctx).tvoid = tvoid();
			{
			setState(265);
			((MainheadContext)_localctx).SPACE = match(SPACE);
			}
			setState(266);
			match(T__12);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(267);
				((MainheadContext)_localctx).SPACE = match(SPACE);
				}
			}

			setState(270);
			match(T__9);
			setState(271);
			((MainheadContext)_localctx).typedef1 = typedef1();
			setState(272);
			match(T__10);
			((MainheadContext)_localctx).v =  ((MainheadContext)_localctx).tvoid.v + (((MainheadContext)_localctx).SPACE!=null?((MainheadContext)_localctx).SPACE.getText():null) +
			    "<span class=\"ident\">Main</span>" + ((((MainheadContext)_localctx).SPACE!=null?((MainheadContext)_localctx).SPACE.getText():null) == null ? "" : (((MainheadContext)_localctx).SPACE!=null?((MainheadContext)_localctx).SPACE.getText():null)) + "(" + ((MainheadContext)_localctx).typedef1.v + ")"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public String v;
		public Code_RContext code_R;
		public Code_RContext code_R() {
			return getRuleContext(Code_RContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			((CodeContext)_localctx).code_R = code_R("");
			((CodeContext)_localctx).v =  ((CodeContext)_localctx).code_R.v;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Code_RContext extends ParserRuleContext {
		public String h;
		public String v;
		public SentContext sent;
		public Code_RContext code_R;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Code_RContext code_R() {
			return getRuleContext(Code_RContext.class,0);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public Code_RContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Code_RContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_code_R; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCode_R(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCode_R(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCode_R(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_RContext code_R(String h) throws RecognitionException {
		Code_RContext _localctx = new Code_RContext(_ctx, getState(), h);
		enterRule(_localctx, 40, RULE_code_R);
		int _la;
		try {
			int _alt;
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__13:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((Code_RContext)_localctx).sent = sent();
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(279);
						_la = _input.LA(1);
						if ( !(_la==J || _la==SPACE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(285);
				((Code_RContext)_localctx).code_R = code_R(_localctx.h += "<div>" + ((Code_RContext)_localctx).sent.v + "</div>");
				((Code_RContext)_localctx).v =  ((Code_RContext)_localctx).code_R.v;
				}
				break;
			case T__8:
			case J:
			case SPACE:
				enterOuterAlt(_localctx, 2);
				{
				((Code_RContext)_localctx).v =  _localctx.h;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public String v;
		public AsigContext asig;
		public FunccallContext funccall;
		public VardefContext vardef;
		public Return_mContext return_m;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public Return_mContext return_m() {
			return getRuleContext(Return_mContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sent);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((SentContext)_localctx).asig = asig();
				setState(292);
				match(T__0);
				((SentContext)_localctx).v =  ((SentContext)_localctx).asig.v + ";";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				((SentContext)_localctx).funccall = funccall();
				setState(296);
				match(T__0);
				((SentContext)_localctx).v =  ((SentContext)_localctx).funccall.v + ";";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				((SentContext)_localctx).vardef = vardef();
				setState(300);
				match(T__0);
				((SentContext)_localctx).v =  ((SentContext)_localctx).vardef.v + ";";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				((SentContext)_localctx).return_m = return_m();
				setState(304);
				match(T__0);
				((SentContext)_localctx).v =  ((SentContext)_localctx).return_m.v + ";";
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_mContext extends ParserRuleContext {
		public String v;
		public ExpContext exp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Return_mContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_m; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterReturn_m(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitReturn_m(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitReturn_m(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_mContext return_m() throws RecognitionException {
		Return_mContext _localctx = new Return_mContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return_m);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__13);
			setState(310);
			((Return_mContext)_localctx).exp = exp();
			((Return_mContext)_localctx).v =  "<span class=\"palres\">return</span>" + ((Return_mContext)_localctx).exp.v;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsigContext extends ParserRuleContext {
		public String v;
		public Token IDENTIFIER;
		public Token SPACE;
		public ExpContext exp;
		public TerminalNode IDENTIFIER() { return getToken(CompilerParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_asig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((AsigContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(314);
				((AsigContext)_localctx).SPACE = match(SPACE);
				}
			}

			setState(317);
			match(T__2);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(318);
				((AsigContext)_localctx).SPACE = match(SPACE);
				}
			}

			setState(321);
			((AsigContext)_localctx).exp = exp();
			((AsigContext)_localctx).v =  "<span class=\"ident\">" + (((AsigContext)_localctx).IDENTIFIER!=null?((AsigContext)_localctx).IDENTIFIER.getText():null)
			    + "</span>" + ((((AsigContext)_localctx).SPACE!=null?((AsigContext)_localctx).SPACE.getText():null) == null ? "": (((AsigContext)_localctx).SPACE!=null?((AsigContext)_localctx).SPACE.getText():null)) + "=" + ((((AsigContext)_localctx).SPACE!=null?((AsigContext)_localctx).SPACE.getText():null) == null ? "" : (((AsigContext)_localctx).SPACE!=null?((AsigContext)_localctx).SPACE.getText():null)) + ((AsigContext)_localctx).exp.v;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public String v;
		public FactorContext factor;
		public Token SPACE;
		public Exp_RContext exp_R;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp_RContext exp_R() {
			return getRuleContext(Exp_RContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(CompilerParser.SPACE, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			((ExpContext)_localctx).factor = factor();
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(325);
				((ExpContext)_localctx).SPACE = match(SPACE);
				}
				break;
			}
			setState(328);
			((ExpContext)_localctx).exp_R = exp_R(((ExpContext)_localctx).factor.v + ((((ExpContext)_localctx).SPACE!=null?((ExpContext)_localctx).SPACE.getText():null) == null ? "" : (((ExpContext)_localctx).SPACE!=null?((ExpContext)_localctx).SPACE.getText():null)));
			((ExpContext)_localctx).v =  ((ExpContext)_localctx).exp_R.v;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_RContext extends ParserRuleContext {
		public String h;
		public String v;
		public OpContext op;
		public Token SPACE;
		public ExpContext exp;
		public Exp_RContext exp_R;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_RContext exp_R() {
			return getRuleContext(Exp_RContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(CompilerParser.SPACE, 0); }
		public Exp_RContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Exp_RContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_exp_R; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterExp_R(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitExp_R(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitExp_R(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_RContext exp_R(String h) throws RecognitionException {
		Exp_RContext _localctx = new Exp_RContext(_ctx, getState(), h);
		enterRule(_localctx, 50, RULE_exp_R);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				((Exp_RContext)_localctx).op = op();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(332);
					((Exp_RContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(335);
				((Exp_RContext)_localctx).exp = exp();
				setState(336);
				((Exp_RContext)_localctx).exp_R = exp_R(_localctx.h += ((Exp_RContext)_localctx).op.v + ((((Exp_RContext)_localctx).SPACE!=null?((Exp_RContext)_localctx).SPACE.getText():null) == null ? "" : (((Exp_RContext)_localctx).SPACE!=null?((Exp_RContext)_localctx).SPACE.getText():null))
				    + ((Exp_RContext)_localctx).exp.v);
				((Exp_RContext)_localctx).v =  ((Exp_RContext)_localctx).exp_R.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Exp_RContext)_localctx).v =  _localctx.h;
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public String v;
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(T__14);
				((OpContext)_localctx).v =  "+";
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(T__15);
				((OpContext)_localctx).v =  "-";
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(T__16);
				((OpContext)_localctx).v =  "*";
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				match(T__17);
				((OpContext)_localctx).v =  "DIV";
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				match(T__18);
				((OpContext)_localctx).v =  "MOD";
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public String v;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public FunccallContext funccall;
		public Token IDENTIFIER;
		public Token CONST_DEF_IDENTIFIER;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(CompilerParser.SPACE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CompilerParser.IDENTIFIER, 0); }
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(CompilerParser.CONST_DEF_IDENTIFIER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				((FactorContext)_localctx).simpvalue = simpvalue();
				setState(356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(355);
					match(SPACE);
					}
					break;
				}
				((FactorContext)_localctx).v =  ((FactorContext)_localctx).simpvalue.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(T__9);
				setState(361);
				((FactorContext)_localctx).exp = exp();
				setState(362);
				match(T__10);
				((FactorContext)_localctx).v =  "(" + ((FactorContext)_localctx).exp.v + ")";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				((FactorContext)_localctx).funccall = funccall();
				((FactorContext)_localctx).v =  ((FactorContext)_localctx).funccall.v;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				((FactorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((FactorContext)_localctx).v =  "<span class=\"ident\">" + (((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null) + "</span>";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				((FactorContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
				((FactorContext)_localctx).v =  "<span class=\"cte\">" + (((FactorContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FactorContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "</span>";
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunccallContext extends ParserRuleContext {
		public String v;
		public Token IDENTIFIER;
		public SubparamlistContext subparamlist;
		public Token CONST_DEF_IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(CompilerParser.IDENTIFIER, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(CompilerParser.CONST_DEF_IDENTIFIER, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funccall);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				((FunccallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(375);
				((FunccallContext)_localctx).subparamlist = subparamlist();
				((FunccallContext)_localctx).v =  "<span class=\"ident\">" + (((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null) + "</span>"
				    + ((FunccallContext)_localctx).subparamlist.v;
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				((FunccallContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
				setState(379);
				((FunccallContext)_localctx).subparamlist = subparamlist();
				((FunccallContext)_localctx).v =  (((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + ((FunccallContext)_localctx).subparamlist.v;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubparamlistContext extends ParserRuleContext {
		public String v;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterSubparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitSubparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSubparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubparamlistContext subparamlist() throws RecognitionException {
		SubparamlistContext _localctx = new SubparamlistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subparamlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__9);
			setState(385);
			((SubparamlistContext)_localctx).explist = explist("");
			setState(386);
			match(T__10);
			((SubparamlistContext)_localctx).v =  "(" + ((SubparamlistContext)_localctx).explist.v + ")";
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public String h;
		public String v;
		public ExpContext exp;
		public Token SPACE;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExplistContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist(String h) throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState(), h);
		enterRule(_localctx, 60, RULE_explist);
		int _la;
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				((ExplistContext)_localctx).exp = exp();
				((ExplistContext)_localctx).v =  _localctx.h + ((ExplistContext)_localctx).exp.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				((ExplistContext)_localctx).exp = exp();
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(393);
					((ExplistContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(396);
				match(T__11);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(397);
					((ExplistContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(400);
				((ExplistContext)_localctx).explist = explist(_localctx.h += ((ExplistContext)_localctx).exp.v +
				    ((((ExplistContext)_localctx).SPACE!=null?((ExplistContext)_localctx).SPACE.getText():null) == null ? "" : (((ExplistContext)_localctx).SPACE!=null?((ExplistContext)_localctx).SPACE.getText():null)) + "," + ((((ExplistContext)_localctx).SPACE!=null?((ExplistContext)_localctx).SPACE.getText():null) == null ? "" : (((ExplistContext)_localctx).SPACE!=null?((ExplistContext)_localctx).SPACE.getText():null)));
				((ExplistContext)_localctx).v =  ((ExplistContext)_localctx).explist.v;
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

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u0196\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000B\b\u0000\n\u0000"+
		"\f\u0000E\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000J\b\u0000"+
		"\n\u0000\f\u0000M\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002V\b\u0002\n\u0002\f\u0002"+
		"Y\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002^\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003d\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005s\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0087\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u008b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0090\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u009b\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u00a5\b\u000b\n\u000b\f"+
		"\u000b\u00a8\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00ae\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00b7\b\f\n\f\f\f\u00ba\t\f\u0001\f\u0001\f\u0005\f\u00be\b"+
		"\f\n\f\f\f\u00c1\t\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c6\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00cc\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00d7\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e2\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00e6\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00ea\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ee\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00f5\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00fa"+
		"\b\u0011\n\u0011\f\u0011\u00fd\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0101\b\u0011\n\u0011\f\u0011\u0104\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u010d"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0119"+
		"\b\u0014\n\u0014\f\u0014\u011c\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0122\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0134\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u013c\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0140\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0147\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u014e\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0155\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0161\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0165\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0175\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u017f\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u018b\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u018f\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0194\b\u001e\u0001\u001e\u0000\u0000\u001f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<\u0000\u0001\u0001\u0000\u0014\u0015\u01aa\u0000"+
		">\u0001\u0000\u0000\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004]\u0001"+
		"\u0000\u0000\u0000\u0006c\u0001\u0000\u0000\u0000\be\u0001\u0000\u0000"+
		"\u0000\nr\u0001\u0000\u0000\u0000\f{\u0001\u0000\u0000\u0000\u000e\u008f"+
		"\u0001\u0000\u0000\u0000\u0010\u009a\u0001\u0000\u0000\u0000\u0012\u009c"+
		"\u0001\u0000\u0000\u0000\u0014\u009f\u0001\u0000\u0000\u0000\u0016\u00ad"+
		"\u0001\u0000\u0000\u0000\u0018\u00c5\u0001\u0000\u0000\u0000\u001a\u00c7"+
		"\u0001\u0000\u0000\u0000\u001c\u00d6\u0001\u0000\u0000\u0000\u001e\u00e5"+
		"\u0001\u0000\u0000\u0000 \u00f4\u0001\u0000\u0000\u0000\"\u00f6\u0001"+
		"\u0000\u0000\u0000$\u0108\u0001\u0000\u0000\u0000&\u0113\u0001\u0000\u0000"+
		"\u0000(\u0121\u0001\u0000\u0000\u0000*\u0133\u0001\u0000\u0000\u0000,"+
		"\u0135\u0001\u0000\u0000\u0000.\u0139\u0001\u0000\u0000\u00000\u0144\u0001"+
		"\u0000\u0000\u00002\u0154\u0001\u0000\u0000\u00004\u0160\u0001\u0000\u0000"+
		"\u00006\u0174\u0001\u0000\u0000\u00008\u017e\u0001\u0000\u0000\u0000:"+
		"\u0180\u0001\u0000\u0000\u0000<\u0193\u0001\u0000\u0000\u0000>?\u0006"+
		"\u0000\uffff\uffff\u0000?C\u0003\u0002\u0001\u0000@B\u0005\u0014\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000FG\u0003\u0014\n\u0000GK\u0006\u0000\uffff\uffff\u0000"+
		"HJ\u0005\u0014\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0003\"\u0011\u0000OP\u0006\u0000"+
		"\uffff\uffff\u0000P\u0001\u0001\u0000\u0000\u0000QR\u0003\u0004\u0002"+
		"\u0000R\u0003\u0001\u0000\u0000\u0000SW\u0003\u0006\u0003\u0000TV\u0005"+
		"\u0014\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000Z[\u0003\u0004\u0002\u0000[^\u0001\u0000"+
		"\u0000\u0000\\^\u0001\u0000\u0000\u0000]S\u0001\u0000\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000^\u0005\u0001\u0000\u0000\u0000_d\u0003\b\u0004\u0000"+
		"`a\u0003\u000e\u0007\u0000ab\u0005\u0001\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000c_\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000d\u0007\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0002\u0000\u0000fg\u0005\u0015\u0000\u0000"+
		"gh\u0005\u0016\u0000\u0000hi\u0005\u0015\u0000\u0000ij\u0003\n\u0005\u0000"+
		"jk\u0005\u0014\u0000\u0000k\t\u0001\u0000\u0000\u0000lm\u0005\u0018\u0000"+
		"\u0000ms\u0006\u0005\uffff\uffff\u0000no\u0005\u0019\u0000\u0000os\u0006"+
		"\u0005\uffff\uffff\u0000pq\u0005\u001a\u0000\u0000qs\u0006\u0005\uffff"+
		"\uffff\u0000rl\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000s\u000b\u0001\u0000\u0000\u0000tu\u0003\u000e\u0007"+
		"\u0000uv\u0005\u0001\u0000\u0000v|\u0001\u0000\u0000\u0000wx\u0003\u000e"+
		"\u0007\u0000xy\u0005\u0001\u0000\u0000yz\u0003\f\u0006\u0000z|\u0001\u0000"+
		"\u0000\u0000{t\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000|\r\u0001"+
		"\u0000\u0000\u0000}~\u0003\u0010\b\u0000~\u007f\u0005\u0015\u0000\u0000"+
		"\u007f\u0080\u0005\u0017\u0000\u0000\u0080\u0081\u0006\u0007\uffff\uffff"+
		"\u0000\u0081\u0090\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u0010\b\u0000"+
		"\u0083\u0084\u0005\u0015\u0000\u0000\u0084\u0086\u0005\u0017\u0000\u0000"+
		"\u0085\u0087\u0005\u0015\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u008a\u0005\u0003\u0000\u0000\u0089\u008b\u0005\u0015\u0000\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0003\n\u0005\u0000\u008d"+
		"\u008e\u0006\u0007\uffff\uffff\u0000\u008e\u0090\u0001\u0000\u0000\u0000"+
		"\u008f}\u0001\u0000\u0000\u0000\u008f\u0082\u0001\u0000\u0000\u0000\u0090"+
		"\u000f\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092"+
		"\u009b\u0006\b\uffff\uffff\u0000\u0093\u0094\u0005\u0005\u0000\u0000\u0094"+
		"\u009b\u0006\b\uffff\uffff\u0000\u0095\u0096\u0005\u0006\u0000\u0000\u0096"+
		"\u009b\u0006\b\uffff\uffff\u0000\u0097\u0098\u0003\u0012\t\u0000\u0098"+
		"\u0099\u0006\b\uffff\uffff\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a"+
		"\u0091\u0001\u0000\u0000\u0000\u009a\u0093\u0001\u0000\u0000\u0000\u009a"+
		"\u0095\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009b"+
		"\u0011\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0007\u0000\u0000\u009d"+
		"\u009e\u0006\t\uffff\uffff\u0000\u009e\u0013\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0003\u0016\u000b\u0000\u00a0\u00a1\u0006\n\uffff\uffff\u0000\u00a1"+
		"\u0015\u0001\u0000\u0000\u0000\u00a2\u00a6\u0003\u0018\f\u0000\u00a3\u00a5"+
		"\u0005\u0014\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003\u0016\u000b\u0000\u00aa\u00ab"+
		"\u0006\u000b\uffff\uffff\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ae\u0006\u000b\uffff\uffff\u0000\u00ad\u00a2\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u0017\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0003\u001a\r\u0000\u00b0\u00b1\u0005\u0001\u0000\u0000\u00b1"+
		"\u00b2\u0006\f\uffff\uffff\u0000\u00b2\u00c6\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0003\u001a\r\u0000\u00b4\u00b8\u0005\b\u0000\u0000\u00b5\u00b7"+
		"\u0007\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bf\u0003&\u0013\u0000\u00bc\u00be\u0007"+
		"\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001"+
		"\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005\t\u0000\u0000\u00c3\u00c4\u0006\f"+
		"\uffff\uffff\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00af\u0001"+
		"\u0000\u0000\u0000\u00c5\u00b3\u0001\u0000\u0000\u0000\u00c6\u0019\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0003\u0010\b\u0000\u00c8\u00c9\u0005\u0015"+
		"\u0000\u0000\u00c9\u00cb\u0005\u0017\u0000\u0000\u00ca\u00cc\u0005\u0015"+
		"\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\n\u0000"+
		"\u0000\u00ce\u00cf\u0003\u001c\u000e\u0000\u00cf\u00d0\u0005\u000b\u0000"+
		"\u0000\u00d0\u00d1\u0006\r\uffff\uffff\u0000\u00d1\u001b\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0003\u001e\u000f\u0000\u00d3\u00d4\u0006\u000e\uffff"+
		"\uffff\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d7\u0006\u000e"+
		"\uffff\uffff\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u001d\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003"+
		"\u0010\b\u0000\u00d9\u00da\u0005\u0015\u0000\u0000\u00da\u00db\u0005\u0017"+
		"\u0000\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc\u00dd\u0006\u000f\uffff"+
		"\uffff\u0000\u00dd\u00e6\u0001\u0000\u0000\u0000\u00de\u00e1\u0003\u0012"+
		"\t\u0000\u00df\u00e0\u0005\u0015\u0000\u0000\u00e0\u00e2\u0005\u0017\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0006\u000f\uffff"+
		"\uffff\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00d8\u0001\u0000"+
		"\u0000\u0000\u00e5\u00de\u0001\u0000\u0000\u0000\u00e6\u001f\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e9\u0005\f\u0000\u0000\u00e8\u00ea\u0005\u0015\u0000"+
		"\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0003\u0010\b\u0000"+
		"\u00ec\u00ee\u0005\u0015\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0017\u0000\u0000\u00f0\u00f1\u0003 \u0010\u0000\u00f1"+
		"\u00f2\u0006\u0010\uffff\uffff\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f5\u0006\u0010\uffff\uffff\u0000\u00f4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5!\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0003$\u0012\u0000\u00f7\u00fb\u0005\b\u0000\u0000\u00f8"+
		"\u00fa\u0007\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fe\u0102\u0003&\u0013\u0000\u00ff\u0101"+
		"\u0007\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0005\t\u0000\u0000\u0106\u0107\u0006"+
		"\u0011\uffff\uffff\u0000\u0107#\u0001\u0000\u0000\u0000\u0108\u0109\u0003"+
		"\u0012\t\u0000\u0109\u010a\u0005\u0015\u0000\u0000\u010a\u010c\u0005\r"+
		"\u0000\u0000\u010b\u010d\u0005\u0015\u0000\u0000\u010c\u010b\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005\n\u0000\u0000\u010f\u0110\u0003\u001c\u000e"+
		"\u0000\u0110\u0111\u0005\u000b\u0000\u0000\u0111\u0112\u0006\u0012\uffff"+
		"\uffff\u0000\u0112%\u0001\u0000\u0000\u0000\u0113\u0114\u0003(\u0014\u0000"+
		"\u0114\u0115\u0006\u0013\uffff\uffff\u0000\u0115\'\u0001\u0000\u0000\u0000"+
		"\u0116\u011a\u0003*\u0015\u0000\u0117\u0119\u0007\u0000\u0000\u0000\u0118"+
		"\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0003(\u0014\u0000\u011e\u011f\u0006\u0014\uffff\uffff\u0000\u011f"+
		"\u0122\u0001\u0000\u0000\u0000\u0120\u0122\u0006\u0014\uffff\uffff\u0000"+
		"\u0121\u0116\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000"+
		"\u0122)\u0001\u0000\u0000\u0000\u0123\u0124\u0003.\u0017\u0000\u0124\u0125"+
		"\u0005\u0001\u0000\u0000\u0125\u0126\u0006\u0015\uffff\uffff\u0000\u0126"+
		"\u0134\u0001\u0000\u0000\u0000\u0127\u0128\u00038\u001c\u0000\u0128\u0129"+
		"\u0005\u0001\u0000\u0000\u0129\u012a\u0006\u0015\uffff\uffff\u0000\u012a"+
		"\u0134\u0001\u0000\u0000\u0000\u012b\u012c\u0003\u000e\u0007\u0000\u012c"+
		"\u012d\u0005\u0001\u0000\u0000\u012d\u012e\u0006\u0015\uffff\uffff\u0000"+
		"\u012e\u0134\u0001\u0000\u0000\u0000\u012f\u0130\u0003,\u0016\u0000\u0130"+
		"\u0131\u0005\u0001\u0000\u0000\u0131\u0132\u0006\u0015\uffff\uffff\u0000"+
		"\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0123\u0001\u0000\u0000\u0000"+
		"\u0133\u0127\u0001\u0000\u0000\u0000\u0133\u012b\u0001\u0000\u0000\u0000"+
		"\u0133\u012f\u0001\u0000\u0000\u0000\u0134+\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0005\u000e\u0000\u0000\u0136\u0137\u00030\u0018\u0000\u0137\u0138"+
		"\u0006\u0016\uffff\uffff\u0000\u0138-\u0001\u0000\u0000\u0000\u0139\u013b"+
		"\u0005\u0017\u0000\u0000\u013a\u013c\u0005\u0015\u0000\u0000\u013b\u013a"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0001\u0000\u0000\u0000\u013d\u013f\u0005\u0003\u0000\u0000\u013e\u0140"+
		"\u0005\u0015\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u00030\u0018\u0000\u0142\u0143\u0006\u0017\uffff\uffff\u0000\u0143/\u0001"+
		"\u0000\u0000\u0000\u0144\u0146\u00036\u001b\u0000\u0145\u0147\u0005\u0015"+
		"\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u00032\u0019"+
		"\u0000\u0149\u014a\u0006\u0018\uffff\uffff\u0000\u014a1\u0001\u0000\u0000"+
		"\u0000\u014b\u014d\u00034\u001a\u0000\u014c\u014e\u0005\u0015\u0000\u0000"+
		"\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u00030\u0018\u0000\u0150"+
		"\u0151\u00032\u0019\u0000\u0151\u0152\u0006\u0019\uffff\uffff\u0000\u0152"+
		"\u0155\u0001\u0000\u0000\u0000\u0153\u0155\u0006\u0019\uffff\uffff\u0000"+
		"\u0154\u014b\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000"+
		"\u01553\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u000f\u0000\u0000\u0157"+
		"\u0161\u0006\u001a\uffff\uffff\u0000\u0158\u0159\u0005\u0010\u0000\u0000"+
		"\u0159\u0161\u0006\u001a\uffff\uffff\u0000\u015a\u015b\u0005\u0011\u0000"+
		"\u0000\u015b\u0161\u0006\u001a\uffff\uffff\u0000\u015c\u015d\u0005\u0012"+
		"\u0000\u0000\u015d\u0161\u0006\u001a\uffff\uffff\u0000\u015e\u015f\u0005"+
		"\u0013\u0000\u0000\u015f\u0161\u0006\u001a\uffff\uffff\u0000\u0160\u0156"+
		"\u0001\u0000\u0000\u0000\u0160\u0158\u0001\u0000\u0000\u0000\u0160\u015a"+
		"\u0001\u0000\u0000\u0000\u0160\u015c\u0001\u0000\u0000\u0000\u0160\u015e"+
		"\u0001\u0000\u0000\u0000\u01615\u0001\u0000\u0000\u0000\u0162\u0164\u0003"+
		"\n\u0005\u0000\u0163\u0165\u0005\u0015\u0000\u0000\u0164\u0163\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0006\u001b\uffff\uffff\u0000\u0167\u0175\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0005\n\u0000\u0000\u0169\u016a\u00030"+
		"\u0018\u0000\u016a\u016b\u0005\u000b\u0000\u0000\u016b\u016c\u0006\u001b"+
		"\uffff\uffff\u0000\u016c\u0175\u0001\u0000\u0000\u0000\u016d\u016e\u0003"+
		"8\u001c\u0000\u016e\u016f\u0006\u001b\uffff\uffff\u0000\u016f\u0175\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0005\u0017\u0000\u0000\u0171\u0175\u0006"+
		"\u001b\uffff\uffff\u0000\u0172\u0173\u0005\u0016\u0000\u0000\u0173\u0175"+
		"\u0006\u001b\uffff\uffff\u0000\u0174\u0162\u0001\u0000\u0000\u0000\u0174"+
		"\u0168\u0001\u0000\u0000\u0000\u0174\u016d\u0001\u0000\u0000\u0000\u0174"+
		"\u0170\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175"+
		"7\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u0017\u0000\u0000\u0177\u0178"+
		"\u0003:\u001d\u0000\u0178\u0179\u0006\u001c\uffff\uffff\u0000\u0179\u017f"+
		"\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0016\u0000\u0000\u017b\u017c"+
		"\u0003:\u001d\u0000\u017c\u017d\u0006\u001c\uffff\uffff\u0000\u017d\u017f"+
		"\u0001\u0000\u0000\u0000\u017e\u0176\u0001\u0000\u0000\u0000\u017e\u017a"+
		"\u0001\u0000\u0000\u0000\u017f9\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		"\n\u0000\u0000\u0181\u0182\u0003<\u001e\u0000\u0182\u0183\u0005\u000b"+
		"\u0000\u0000\u0183\u0184\u0006\u001d\uffff\uffff\u0000\u0184;\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u00030\u0018\u0000\u0186\u0187\u0006\u001e\uffff"+
		"\uffff\u0000\u0187\u0194\u0001\u0000\u0000\u0000\u0188\u018a\u00030\u0018"+
		"\u0000\u0189\u018b\u0005\u0015\u0000\u0000\u018a\u0189\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018e\u0005\f\u0000\u0000\u018d\u018f\u0005\u0015\u0000\u0000"+
		"\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0003<\u001e\u0000\u0191"+
		"\u0192\u0006\u001e\uffff\uffff\u0000\u0192\u0194\u0001\u0000\u0000\u0000"+
		"\u0193\u0185\u0001\u0000\u0000\u0000\u0193\u0188\u0001\u0000\u0000\u0000"+
		"\u0194=\u0001\u0000\u0000\u0000)CKW]cr{\u0086\u008a\u008f\u009a\u00a6"+
		"\u00ad\u00b8\u00bf\u00c5\u00cb\u00d6\u00e1\u00e5\u00e9\u00ed\u00f4\u00fb"+
		"\u0102\u010c\u011a\u0121\u0133\u013b\u013f\u0146\u014d\u0154\u0160\u0164"+
		"\u0174\u017e\u018a\u018e\u0193";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}