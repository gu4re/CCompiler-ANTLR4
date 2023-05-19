// Generated from C:/Users/DIEGOPC/Downloads/PracticaPL/src/main/java\Compiler.g4 by ANTLR 4.12.0
package main.java;

    import java.io.*;
    import java.nio.file.Paths;

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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, J=34, SPACE=35, TAB=36, CR=37, CONST_DEF_IDENTIFIER=38, 
		IDENTIFIER=39, NUMERIC_INTEGER_CONST=40, NUMERIC_REAL_CONST=41, STRING_CONST=42, 
		COMMENTS=43;
	public static final int
		RULE_program = 0, RULE_dcllist = 1, RULE_dcllist_R = 2, RULE_dcl = 3, 
		RULE_ctedef = 4, RULE_simpvalue = 5, RULE_struct = 6, RULE_varlist = 7, 
		RULE_vardef = 8, RULE_tbas = 9, RULE_tvoid = 10, RULE_funlist = 11, RULE_funlist_R = 12, 
		RULE_funcdef = 13, RULE_funchead = 14, RULE_typedef1 = 15, RULE_typedef2 = 16, 
		RULE_typedef2_R = 17, RULE_sentlist = 18, RULE_mainhead = 19, RULE_code = 20, 
		RULE_code_R = 21, RULE_sent = 22, RULE_if_ = 23, RULE_else_ = 24, RULE_while_ = 25, 
		RULE_dowhile_ = 26, RULE_for_ = 27, RULE_expcond = 28, RULE_expcond_R = 29, 
		RULE_oplog = 30, RULE_factorcond = 31, RULE_opcomp = 32, RULE_return_m = 33, 
		RULE_asig = 34, RULE_exp = 35, RULE_exp_R = 36, RULE_op = 37, RULE_factor = 38, 
		RULE_funccall = 39, RULE_subparamlist = 40, RULE_explist = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcllist", "dcllist_R", "dcl", "ctedef", "simpvalue", "struct", 
			"varlist", "vardef", "tbas", "tvoid", "funlist", "funlist_R", "funcdef", 
			"funchead", "typedef1", "typedef2", "typedef2_R", "sentlist", "mainhead", 
			"code", "code_R", "sent", "if_", "else_", "while_", "dowhile_", "for_", 
			"expcond", "expcond_R", "oplog", "factorcond", "opcomp", "return_m", 
			"asig", "exp", "exp_R", "op", "factor", "funccall", "subparamlist", "explist"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'#define'", "'struct'", "'{'", "'}'", "'='", "'integer'", 
			"'float'", "'string'", "'void'", "'('", "')'", "','", "'Main'", "'if'", 
			"'else'", "'while'", "'do'", "'for'", "'||'", "'&'", "'!'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'return'", "'+'", "'-'", "'*'", "'DIV'", "'MOD'", 
			"'\\n'", "' '", "'\\t'", "'\\r'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "J", "SPACE", 
			"TAB", "CR", "CONST_DEF_IDENTIFIER", "IDENTIFIER", "NUMERIC_INTEGER_CONST", 
			"NUMERIC_REAL_CONST", "STRING_CONST", "COMMENTS"
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


	    // Where the final HTML is saved
	    private StringBuilder sb = new StringBuilder();
	    // args passed from input main
	    private String args = "";
	    // This variable controls the identation of the code
	    private double ident_tab = 0.5;
	    // check if the funlist declaration is finished
	    private boolean funlist_finished = false;
	    // check if the funccall is made from main
	    private boolean funccall_main = false;
	    // check if it is necessary to color the funclist or not
	    private boolean funclist_color = false;
	    // to set args passed from main
	    public void setArgs(String args){
	        this.args = args;
	    }

	public CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DcllistContext dcllist;
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

			    final String STDIN_NAME = (new File(args)).getName().replaceFirst("[.][^.]+$", "");
			    final String FILE_SEP = System.getProperty("file.separator");
			    final String PATH_VARIABLE = Paths.get(args).getParent().toString() + FILE_SEP;
			    sb.append("<!DOCTYPE html><html><head><title>").append(STDIN_NAME).append("</title>" +
			        "<style>.cte{color:rgb(107, 211, 26);} .palres{color:rgb(0, 0, 0); font-weight: bold;}" +
			        ".ident{color:rgb(77, 77, 255);} .idfunc{color:rgb(26, 26, 255); text-decoration: underline;}</style>" +
			        "</head>").append("<body><h1 id=\"funciones\">").append("Programa: ").append(STDIN_NAME).append("</h1>")
			        .append("<h2>Funciones</h2>").append("<ul>");
			   
			setState(85);
			((ProgramContext)_localctx).dcllist = dcllist("programa_principal");
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(J);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(92);
			((ProgramContext)_localctx).funlist = funlist("funciones");
			sb.append(((ProgramContext)_localctx).funlist.v +
			        (((ProgramContext)_localctx).funlist.v == "<li><a href=\"#programa_principal\">Programa principal</a></li>" ? "</ul>" : "") +
			        "<hr/><a id=\"programa_principal\"><h2>Programa Principal</h2>" + ((ProgramContext)_localctx).dcllist.v + (((ProgramContext)_localctx).dcllist.v == "" ? "" :
			        "<br><br>"));
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J) {
				{
				{
				setState(94);
				match(J);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			((ProgramContext)_localctx).sentlist = sentlist("programa_principal:Main");

			            sb.append(((ProgramContext)_localctx).sentlist.v + "<br><a href=\"#programa_principal\">Inicio del programa principal</a> "
			            + " <a href=\"#funciones\">Inicio del programa</a>" + "</a><hr/></body></html>");
			            PrintWriter fich = null;
			            try{
			                final String STDOUT_NAME = PATH_VARIABLE + STDIN_NAME + ".html";
			                fich = new PrintWriter(new BufferedWriter(new FileWriter(STDOUT_NAME)));
			                fich.print(sb.toString());
			            }
			            catch(IOException e){
			                System.err.println("Bad file creator.\n" + e.getMessage());
			                throw new RuntimeException();
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
		public String a;
		public String v;
		public Dcllist_RContext dcllist_R;
		public Dcllist_RContext dcllist_R() {
			return getRuleContext(Dcllist_RContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DcllistContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final DcllistContext dcllist(String a) throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState(), a);
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((DcllistContext)_localctx).dcllist_R = dcllist_R("", _localctx.a);
			((DcllistContext)_localctx).v =  ((DcllistContext)_localctx).dcllist_R.v;
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
		public String h;
		public String a;
		public String v;
		public DclContext dcl;
		public Token J;
		public Dcllist_RContext dcllist_R;
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
		public Dcllist_RContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dcllist_RContext(ParserRuleContext parent, int invokingState, String h, String a) {
			super(parent, invokingState);
			this.h = h;
			this.a = a;
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

	public final Dcllist_RContext dcllist_R(String h,String a) throws RecognitionException {
		Dcllist_RContext _localctx = new Dcllist_RContext(_ctx, getState(), h, a);
		enterRule(_localctx, 4, RULE_dcllist_R);
		try {
			int _alt;
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((Dcllist_RContext)_localctx).dcl = dcl(_localctx.a);
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(107);
						((Dcllist_RContext)_localctx).J = match(J);
						}
						} 
					}
					setState(112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(113);
				((Dcllist_RContext)_localctx).dcllist_R = dcllist_R(_localctx.h += ((Dcllist_RContext)_localctx).dcl.v + ((((Dcllist_RContext)_localctx).J!=null?((Dcllist_RContext)_localctx).J.getText():null) == null ? "<br>" : (((Dcllist_RContext)_localctx).J!=null?((Dcllist_RContext)_localctx).J.getText():null)), _localctx.a);
				((Dcllist_RContext)_localctx).v =  ((Dcllist_RContext)_localctx).dcllist_R.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Dcllist_RContext)_localctx).v =  _localctx.h;
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
		public String a;
		public String v;
		public CtedefContext ctedef;
		public VardefContext vardef;
		public Token J;
		public CtedefContext ctedef() {
			return getRuleContext(CtedefContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public TerminalNode J() { return getToken(CompilerParser.J, 0); }
		public DclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DclContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final DclContext dcl(String a) throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState(), a);
		enterRule(_localctx, 6, RULE_dcl);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				((DclContext)_localctx).ctedef = ctedef(_localctx.a);
				((DclContext)_localctx).v =  ((DclContext)_localctx).ctedef.v;
				}
				break;
			case T__2:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				((DclContext)_localctx).vardef = vardef(_localctx.a);
				setState(123);
				match(T__0);
				setState(124);
				((DclContext)_localctx).J = match(J);
				((DclContext)_localctx).v =  ((DclContext)_localctx).vardef.v + ";" + (((DclContext)_localctx).J!=null?((DclContext)_localctx).J.getText():null);
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
		public String a;
		public String v;
		public Token SPACE;
		public Token CONST_DEF_IDENTIFIER;
		public SimpvalueContext simpvalue;
		public Token J;
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(CompilerParser.CONST_DEF_IDENTIFIER, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public TerminalNode J() { return getToken(CompilerParser.J, 0); }
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public CtedefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CtedefContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final CtedefContext ctedef(String a) throws RecognitionException {
		CtedefContext _localctx = new CtedefContext(_ctx, getState(), a);
		enterRule(_localctx, 8, RULE_ctedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__1);
			{
			setState(130);
			((CtedefContext)_localctx).SPACE = match(SPACE);
			}
			setState(131);
			((CtedefContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
			{
			setState(132);
			((CtedefContext)_localctx).SPACE = match(SPACE);
			}
			setState(133);
			((CtedefContext)_localctx).simpvalue = simpvalue();
			setState(134);
			((CtedefContext)_localctx).J = match(J);
			((CtedefContext)_localctx).v = 
			    "<span class=\"palres\">#define</span>" + (((CtedefContext)_localctx).SPACE!=null?((CtedefContext)_localctx).SPACE.getText():null) + "<a id=\"" + _localctx.a + ":"
			    + (((CtedefContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtedefContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "\"><span class=\"ident\">" + (((CtedefContext)_localctx).CONST_DEF_IDENTIFIER!=null?((CtedefContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "</span></a>" + (((CtedefContext)_localctx).SPACE!=null?((CtedefContext)_localctx).SPACE.getText():null) + ((CtedefContext)_localctx).simpvalue.v + (((CtedefContext)_localctx).J!=null?((CtedefContext)_localctx).J.getText():null);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_INTEGER_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST = match(NUMERIC_INTEGER_CONST);
				((SimpvalueContext)_localctx).v =  "<span class=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_INTEGER_CONST.getText():null)
				    + "</span>";
				}
				break;
			case NUMERIC_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((SimpvalueContext)_localctx).NUMERIC_REAL_CONST = match(NUMERIC_REAL_CONST);
				((SimpvalueContext)_localctx).v =  "<span class=\"cte\">" + (((SimpvalueContext)_localctx).NUMERIC_REAL_CONST!=null?((SimpvalueContext)_localctx).NUMERIC_REAL_CONST.getText():null) + "</span>";
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
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
	public static class StructContext extends ParserRuleContext {
		public String v;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__2);
			setState(146);
			match(T__3);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J || _la==SPACE) {
				{
				{
				setState(147);
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
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			((StructContext)_localctx).varlist = varlist("");
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J || _la==SPACE) {
				{
				{
				setState(154);
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
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__4);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(161);
				match(SPACE);
				}
				break;
			}
			((StructContext)_localctx).v =  "<br>" +
			    "<span class=\"palres\">struct</span>{<div style=\"text-indent: 0.5cm\">" + ((StructContext)_localctx).varlist.v + "</div>}";
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
		public String h;
		public String v;
		public VardefContext vardef;
		public VarlistContext varlist;
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, String h) {
			super(parent, invokingState);
			this.h = h;
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

	public final VarlistContext varlist(String h) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), h);
		enterRule(_localctx, 14, RULE_varlist);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				((VarlistContext)_localctx).vardef = vardef("programa_principal");
				setState(167);
				match(T__0);
				((VarlistContext)_localctx).v =  _localctx.h + "<div>" + ((VarlistContext)_localctx).vardef.v + ";" + "</div>";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				((VarlistContext)_localctx).vardef = vardef("programa_principal");
				setState(171);
				match(T__0);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J || _la==SPACE) {
					{
					{
					setState(172);
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
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				((VarlistContext)_localctx).varlist = varlist(_localctx.h += "<div>" + ((VarlistContext)_localctx).vardef.v + ";" + "</div>");
				((VarlistContext)_localctx).v =  ((VarlistContext)_localctx).varlist.v;
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
		public String a;
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
		public VardefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VardefContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final VardefContext vardef(String a) throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState(), a);
		enterRule(_localctx, 16, RULE_vardef);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((VardefContext)_localctx).tbas = tbas();
				{
				setState(184);
				((VardefContext)_localctx).SPACE = match(SPACE);
				}
				setState(185);
				((VardefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((VardefContext)_localctx).v =  ((VardefContext)_localctx).tbas.v + (((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null)
				    + "<a id=\"" + _localctx.a + ":" + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "\"><span class=\"ident\">" + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "</span></a>";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				((VardefContext)_localctx).tbas = tbas();
				{
				setState(189);
				((VardefContext)_localctx).SPACE = match(SPACE);
				}
				setState(190);
				((VardefContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(191);
					((VardefContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(194);
				match(T__5);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(195);
					((VardefContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(198);
				((VardefContext)_localctx).simpvalue = simpvalue();
				((VardefContext)_localctx).v =  ((VardefContext)_localctx).tbas.v + (((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null) + "<a id=\"" + _localctx.a + ":"
				        + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "\"><span class=\"ident\">" + (((VardefContext)_localctx).IDENTIFIER!=null?((VardefContext)_localctx).IDENTIFIER.getText():null) + "</span></a>" + ((((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null) == null ? ""
				        : (((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null)) + "=" + ((((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null) == null ? "" : (((VardefContext)_localctx).SPACE!=null?((VardefContext)_localctx).SPACE.getText():null)) + ((VardefContext)_localctx).simpvalue.v;
				    
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
		public StructContext struct;
		public TvoidContext tvoid() {
			return getRuleContext(TvoidContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
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
		enterRule(_localctx, 18, RULE_tbas);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__6);
				((TbasContext)_localctx).v =  (funclist_color ? "integer" : "<span class=\"palres\">integer</span>");
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__7);
				((TbasContext)_localctx).v =  (funclist_color ? "float" : "<span class=\"palres\">float</span>");
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(T__8);
				((TbasContext)_localctx).v =  (funclist_color ? "string" : "<span class=\"palres\">string</span>");
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				((TbasContext)_localctx).tvoid = tvoid();
				((TbasContext)_localctx).v =  ((TbasContext)_localctx).tvoid.v;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				((TbasContext)_localctx).struct = struct();
				((TbasContext)_localctx).v =  ((TbasContext)_localctx).struct.v;
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
		enterRule(_localctx, 20, RULE_tvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__9);
			((TvoidContext)_localctx).v =  (funclist_color ? "void" : "<span class=\"palres\">void</span>");
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
		public String a;
		public String v;
		public Funlist_RContext funlist_R;
		public Funlist_RContext funlist_R() {
			return getRuleContext(Funlist_RContext.class,0);
		}
		public FunlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FunlistContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final FunlistContext funlist(String a) throws RecognitionException {
		FunlistContext _localctx = new FunlistContext(_ctx, getState(), a);
		enterRule(_localctx, 22, RULE_funlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((FunlistContext)_localctx).funlist_R = funlist_R("<li><a href=\"#programa_principal\">Programa principal</a></li>", _localctx.a);
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
		public String a;
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
		public Funlist_RContext(ParserRuleContext parent, int invokingState, String h, String a) {
			super(parent, invokingState);
			this.h = h;
			this.a = a;
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

	public final Funlist_RContext funlist_R(String h,String a) throws RecognitionException {
		Funlist_RContext _localctx = new Funlist_RContext(_ctx, getState(), h, a);
		enterRule(_localctx, 24, RULE_funlist_R);
		try {
			int _alt;
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				((Funlist_RContext)_localctx).funcdef = funcdef(_localctx.a);
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(224);
						((Funlist_RContext)_localctx).J = match(J);
						}
						} 
					}
					setState(229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(230);
				((Funlist_RContext)_localctx).funlist_R = funlist_R(_localctx.h += ((Funlist_RContext)_localctx).funcdef.v + ((((Funlist_RContext)_localctx).J!=null?((Funlist_RContext)_localctx).J.getText():null) == null ? "<br>" : (((Funlist_RContext)_localctx).J!=null?((Funlist_RContext)_localctx).J.getText():null)), _localctx.a);
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
		public String a;
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
		public FuncdefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FuncdefContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final FuncdefContext funcdef(String a) throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState(), a);
		enterRule(_localctx, 26, RULE_funcdef);
		int _la;
		try {
			int _alt;
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				funclist_color = true;
				setState(237);
				((FuncdefContext)_localctx).funchead = funchead(_localctx.a);
				setState(238);
				match(T__0);
				((FuncdefContext)_localctx).v =  "<li><a href=\"#"
				        + _localctx.a + ":" + ((FuncdefContext)_localctx).funchead.id + "\">" + ((FuncdefContext)_localctx).funchead.v + "</a></li>";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				funclist_color = false;
				setState(242);
				((FuncdefContext)_localctx).funchead = funchead(_localctx.a);
				setState(243);
				match(T__3);
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(244);
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
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(250);
				((FuncdefContext)_localctx).code = code(_localctx.a += ":" + ((FuncdefContext)_localctx).funchead.id);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J || _la==SPACE) {
					{
					{
					setState(251);
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
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(T__4);
				((FuncdefContext)_localctx).v =  ""; _localctx.v += (funlist_finished ? ""
				        : "</ul>"); funlist_finished = true; _localctx.v += "<hr/><a id=\"" + _localctx.a + "\">" + ((FuncdefContext)_localctx).funchead.v + "<br>"
				        + "{<div style=\"text-indent: 0.5cm\">" + ((FuncdefContext)_localctx).code.v + "</div>}<br></a>" +
				        "<a href=\"#" + _localctx.a + "\">Inicio de la funci&oacute;n</a> " +
				        " <a href=\"#funciones\">Inicio del programa</a>"; 
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
		public String a;
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
		public FuncheadContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FuncheadContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final FuncheadContext funchead(String a) throws RecognitionException {
		FuncheadContext _localctx = new FuncheadContext(_ctx, getState(), a);
		enterRule(_localctx, 28, RULE_funchead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			((FuncheadContext)_localctx).tbas = tbas();
			{
			setState(263);
			((FuncheadContext)_localctx).SPACE = match(SPACE);
			}
			setState(264);
			((FuncheadContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(265);
				((FuncheadContext)_localctx).SPACE = match(SPACE);
				}
			}

			setState(268);
			match(T__10);
			setState(269);
			((FuncheadContext)_localctx).typedef1 = typedef1(_localctx.a);
			setState(270);
			match(T__11);

			    ((FuncheadContext)_localctx).v =  ((FuncheadContext)_localctx).tbas.v + (((FuncheadContext)_localctx).SPACE!=null?((FuncheadContext)_localctx).SPACE.getText():null) + (funclist_color ? (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null) : "<span class=\"ident\">" + (((FuncheadContext)_localctx).IDENTIFIER!=null?((FuncheadContext)_localctx).IDENTIFIER.getText():null)
			    + "</span>") + ((((FuncheadContext)_localctx).SPACE!=null?((FuncheadContext)_localctx).SPACE.getText():null) == null ? "" : (((FuncheadContext)_localctx).SPACE!=null?((FuncheadContext)_localctx).SPACE.getText():null)) + "(" + ((FuncheadContext)_localctx).typedef1.v + ")";
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
		public String a;
		public String v;
		public Typedef2Context typedef2;
		public Typedef2Context typedef2() {
			return getRuleContext(Typedef2Context.class,0);
		}
		public Typedef1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Typedef1Context(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final Typedef1Context typedef1(String a) throws RecognitionException {
		Typedef1Context _localctx = new Typedef1Context(_ctx, getState(), a);
		enterRule(_localctx, 30, RULE_typedef1);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				((Typedef1Context)_localctx).typedef2 = typedef2(_localctx.a);
				((Typedef1Context)_localctx).v =  ((Typedef1Context)_localctx).typedef2.v;
				}
				break;
			case T__11:
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
		public String a;
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
		public Typedef2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Typedef2Context(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final Typedef2Context typedef2(String a) throws RecognitionException {
		Typedef2Context _localctx = new Typedef2Context(_ctx, getState(), a);
		enterRule(_localctx, 32, RULE_typedef2);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				((Typedef2Context)_localctx).tbas = tbas();
				{
				setState(280);
				((Typedef2Context)_localctx).SPACE = match(SPACE);
				}
				setState(281);
				((Typedef2Context)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(282);
				((Typedef2Context)_localctx).typedef2_R = typedef2_R(((Typedef2Context)_localctx).tbas.v + (((Typedef2Context)_localctx).SPACE!=null?((Typedef2Context)_localctx).SPACE.getText():null) + (funclist_color ?
				        (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) : "<a id=\"" + _localctx.a + ":" + (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) + "\"><span class=\"ident\">" + (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null)
				        + "</span></a>"), _localctx.a);

				        ((Typedef2Context)_localctx).v =  ((Typedef2Context)_localctx).typedef2_R.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				((Typedef2Context)_localctx).tvoid = tvoid();
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					{
					setState(286);
					match(SPACE);
					}
					setState(287);
					((Typedef2Context)_localctx).IDENTIFIER = match(IDENTIFIER);
					}
				}

				((Typedef2Context)_localctx).v =  ((Typedef2Context)_localctx).tvoid.v + ((((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) == null ? "" : (" "+(funclist_color ?
				        (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) : "<span class=\"ident\">" + (((Typedef2Context)_localctx).IDENTIFIER!=null?((Typedef2Context)_localctx).IDENTIFIER.getText():null) + "</span>")));
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
		public String a;
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
		public Typedef2_RContext(ParserRuleContext parent, int invokingState, String h, String a) {
			super(parent, invokingState);
			this.h = h;
			this.a = a;
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

	public final Typedef2_RContext typedef2_R(String h,String a) throws RecognitionException {
		Typedef2_RContext _localctx = new Typedef2_RContext(_ctx, getState(), h, a);
		enterRule(_localctx, 34, RULE_typedef2_R);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(T__12);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(295);
					((Typedef2_RContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(298);
				((Typedef2_RContext)_localctx).tbas = tbas();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(299);
					((Typedef2_RContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(302);
				((Typedef2_RContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(303);
				((Typedef2_RContext)_localctx).typedef2_R = typedef2_R(_localctx.h += "," + ((((Typedef2_RContext)_localctx).SPACE!=null?((Typedef2_RContext)_localctx).SPACE.getText():null) == null ? "" : (((Typedef2_RContext)_localctx).SPACE!=null?((Typedef2_RContext)_localctx).SPACE.getText():null)) + ((Typedef2_RContext)_localctx).tbas.v +
				        ((((Typedef2_RContext)_localctx).SPACE!=null?((Typedef2_RContext)_localctx).SPACE.getText():null) == null ? "" : (((Typedef2_RContext)_localctx).SPACE!=null?((Typedef2_RContext)_localctx).SPACE.getText():null)) + (funclist_color ? (((Typedef2_RContext)_localctx).IDENTIFIER!=null?((Typedef2_RContext)_localctx).IDENTIFIER.getText():null) : "<span class=\"ident\">"
				        + (((Typedef2_RContext)_localctx).IDENTIFIER!=null?((Typedef2_RContext)_localctx).IDENTIFIER.getText():null) + "</span>"), _localctx.a);
				((Typedef2_RContext)_localctx).v =  ((Typedef2_RContext)_localctx).typedef2_R.v;
				}
				break;
			case T__11:
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
		public String a;
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
		public SentlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final SentlistContext sentlist(String a) throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState(), a);
		enterRule(_localctx, 36, RULE_sentlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			((SentlistContext)_localctx).mainhead = mainhead(_localctx.a);
			funccall_main = true;
			setState(311);
			match(T__3);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
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
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(318);
			((SentlistContext)_localctx).code = code(_localctx.a);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J || _la==SPACE) {
				{
				{
				setState(319);
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
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(T__4);
			   ((SentlistContext)_localctx).v =  ((SentlistContext)_localctx).mainhead.v + "<br>{" + ((((SentlistContext)_localctx).J!=null?((SentlistContext)_localctx).J.getText():null) == null ? "<br>" : (((SentlistContext)_localctx).J!=null?((SentlistContext)_localctx).J.getText():null)) + ((((SentlistContext)_localctx).SPACE!=null?((SentlistContext)_localctx).SPACE.getText():null) == null ? "" : (((SentlistContext)_localctx).SPACE!=null?((SentlistContext)_localctx).SPACE.getText():null)) +
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
		public String a;
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
		public MainheadContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MainheadContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final MainheadContext mainhead(String a) throws RecognitionException {
		MainheadContext _localctx = new MainheadContext(_ctx, getState(), a);
		enterRule(_localctx, 38, RULE_mainhead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((MainheadContext)_localctx).tvoid = tvoid();
			{
			setState(329);
			((MainheadContext)_localctx).SPACE = match(SPACE);
			}
			setState(330);
			match(T__13);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(331);
				((MainheadContext)_localctx).SPACE = match(SPACE);
				}
			}

			setState(334);
			match(T__10);
			setState(335);
			((MainheadContext)_localctx).typedef1 = typedef1(_localctx.a);
			setState(336);
			match(T__11);
			((MainheadContext)_localctx).v =  ((MainheadContext)_localctx).tvoid.v + (((MainheadContext)_localctx).SPACE!=null?((MainheadContext)_localctx).SPACE.getText():null) +
			    "<a id=\"" + _localctx.a + ":Main\"><span class=\"ident\">Main</span></a>" + ((((MainheadContext)_localctx).SPACE!=null?((MainheadContext)_localctx).SPACE.getText():null) == null ? "" : (((MainheadContext)_localctx).SPACE!=null?((MainheadContext)_localctx).SPACE.getText():null))
			    + "(" + ((MainheadContext)_localctx).typedef1.v + ")"; 
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
		public String a;
		public String v;
		public Code_RContext code_R;
		public Code_RContext code_R() {
			return getRuleContext(Code_RContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CodeContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final CodeContext code(String a) throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState(), a);
		enterRule(_localctx, 40, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			((CodeContext)_localctx).code_R = code_R("", _localctx.a);
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
		public String a;
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
		public Code_RContext(ParserRuleContext parent, int invokingState, String h, String a) {
			super(parent, invokingState);
			this.h = h;
			this.a = a;
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

	public final Code_RContext code_R(String h,String a) throws RecognitionException {
		Code_RContext _localctx = new Code_RContext(_ctx, getState(), h, a);
		enterRule(_localctx, 42, RULE_code_R);
		int _la;
		try {
			int _alt;
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__14:
			case T__16:
			case T__17:
			case T__18:
			case T__27:
			case CONST_DEF_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				((Code_RContext)_localctx).sent = sent(_localctx.a);
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(343);
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
					setState(348);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(349);
				((Code_RContext)_localctx).code_R = code_R(_localctx.h += "<div>" + ((Code_RContext)_localctx).sent.v + "</div>", _localctx.a);
				((Code_RContext)_localctx).v =  ((Code_RContext)_localctx).code_R.v;
				}
				break;
			case T__4:
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
		public String a;
		public String v;
		public AsigContext asig;
		public FunccallContext funccall;
		public VardefContext vardef;
		public Token J;
		public Return_mContext return_m;
		public If_Context if_;
		public While_Context while_;
		public Dowhile_Context dowhile_;
		public For_Context for_;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public TerminalNode J() { return getToken(CompilerParser.J, 0); }
		public Return_mContext return_m() {
			return getRuleContext(Return_mContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public Dowhile_Context dowhile_() {
			return getRuleContext(Dowhile_Context.class,0);
		}
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final SentContext sent(String a) throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState(), a);
		enterRule(_localctx, 44, RULE_sent);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				((SentContext)_localctx).asig = asig(_localctx.a);
				setState(356);
				match(T__0);
				((SentContext)_localctx).v =  ((SentContext)_localctx).asig.v + ";";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				((SentContext)_localctx).funccall = funccall("funciones");
				setState(360);
				match(T__0);
				((SentContext)_localctx).v =  ((SentContext)_localctx).funccall.v + ";";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				((SentContext)_localctx).vardef = vardef(_localctx.a);
				setState(364);
				match(T__0);
				setState(365);
				((SentContext)_localctx).J = match(J);
				((SentContext)_localctx).v =  ((SentContext)_localctx).vardef.v + ";" + (((SentContext)_localctx).J!=null?((SentContext)_localctx).J.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				((SentContext)_localctx).return_m = return_m(_localctx.a);
				setState(369);
				match(T__0);
				((SentContext)_localctx).v =  ((SentContext)_localctx).return_m.v + ";";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				ident_tab += 0.5;
				setState(373);
				((SentContext)_localctx).if_ = if_(_localctx.a);
				ident_tab -= 0.5;((SentContext)_localctx).v =  ((SentContext)_localctx).if_.v;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				ident_tab += 0.5;
				setState(377);
				((SentContext)_localctx).while_ = while_(_localctx.a);
				ident_tab -= 0.5;((SentContext)_localctx).v =  ((SentContext)_localctx).while_.v;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				ident_tab += 0.5;
				setState(381);
				((SentContext)_localctx).dowhile_ = dowhile_(_localctx.a);
				ident_tab -= 0.5;((SentContext)_localctx).v =  ((SentContext)_localctx).dowhile_.v;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				ident_tab += 0.5;
				setState(385);
				((SentContext)_localctx).for_ = for_(_localctx.a);
				ident_tab -= 0.5;((SentContext)_localctx).v =  ((SentContext)_localctx).for_.v;
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
	public static class If_Context extends ParserRuleContext {
		public String a;
		public String v;
		public Token SPACE;
		public ExpcondContext expcond;
		public Token J;
		public CodeContext code;
		public Else_Context else_;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public If_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_Context(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_(String a) throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState(), a);
		enterRule(_localctx, 46, RULE_if_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__14);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(391);
				((If_Context)_localctx).SPACE = match(SPACE);
				}
			}

			setState(394);
			((If_Context)_localctx).expcond = expcond(_localctx.a);
			setState(395);
			match(T__3);
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(396);
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
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(402);
			((If_Context)_localctx).code = code(_localctx.a);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J || _la==SPACE) {
				{
				{
				setState(403);
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
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			match(T__4);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
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
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(416);
			((If_Context)_localctx).else_ = else_("<span class=\"palres\">if</span>" + ((If_Context)_localctx).expcond.v + "{<br>" +
			    "<div style=\"text-indent: " + String.valueOf(ident_tab) + "cm\">" + ((If_Context)_localctx).code.v + "</div>" + "<div>}"
			    + ((((If_Context)_localctx).SPACE!=null?((If_Context)_localctx).SPACE.getText():null) == null ? "": (((If_Context)_localctx).SPACE!=null?((If_Context)_localctx).SPACE.getText():null)) + ((((If_Context)_localctx).J!=null?((If_Context)_localctx).J.getText():null) == null ? "": "<br>"), _localctx.a);
			((If_Context)_localctx).v =  ((If_Context)_localctx).else_.v;
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
	public static class Else_Context extends ParserRuleContext {
		public String h;
		public String a;
		public String v;
		public Token J;
		public Token SPACE;
		public CodeContext code;
		public If_Context if_;
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
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Else_Context(ParserRuleContext parent, int invokingState, String h, String a) {
			super(parent, invokingState);
			this.h = h;
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitElse_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_(String h,String a) throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState(), h, a);
		enterRule(_localctx, 48, RULE_else_);
		int _la;
		try {
			int _alt;
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(T__15);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J || _la==SPACE) {
					{
					{
					setState(420);
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
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426);
				match(T__3);
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(427);
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
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(433);
				((Else_Context)_localctx).code = code(_localctx.a);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J || _la==SPACE) {
					{
					{
					setState(434);
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
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(440);
				match(T__4);
				((Else_Context)_localctx).v =  _localctx.h + "<span class=\"palres\">else</span>" + ((((Else_Context)_localctx).SPACE!=null?((Else_Context)_localctx).SPACE.getText():null) == null ? "" : (((Else_Context)_localctx).SPACE!=null?((Else_Context)_localctx).SPACE.getText():null))
				    + ((((Else_Context)_localctx).J!=null?((Else_Context)_localctx).J.getText():null) == null ? "": "<br>") + "{</div>" + "<div style=\"text-indent: " + String.valueOf(ident_tab) + "cm\">"
				    + ((Else_Context)_localctx).code.v + "</div>" + "<div>}</div>";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(T__15);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(444);
					match(SPACE);
					}
				}

				setState(447);
				((Else_Context)_localctx).if_ = if_(_localctx.a);
				((Else_Context)_localctx).v =  _localctx.h + "<span class=\"palres\">else</span>" + ((Else_Context)_localctx).if_.v;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((Else_Context)_localctx).v =  _localctx.h;
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
	public static class While_Context extends ParserRuleContext {
		public String a;
		public String v;
		public ExpcondContext expcond;
		public CodeContext code;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
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
		public While_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public While_Context(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitWhile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitWhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_(String a) throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState(), a);
		enterRule(_localctx, 50, RULE_while_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__16);
			setState(454);
			match(T__10);
			setState(455);
			((While_Context)_localctx).expcond = expcond(_localctx.a);
			setState(456);
			match(T__11);
			setState(457);
			match(T__3);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
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
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(464);
			((While_Context)_localctx).code = code(_localctx.a);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J || _la==SPACE) {
				{
				{
				setState(465);
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
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			match(T__4);
			((While_Context)_localctx).v =  "<span class=\"palres\">while</span>" + "(" + ((While_Context)_localctx).expcond.v + ")" + "{<br>" + "<div style=\"text-indent: " +
			    String.valueOf(ident_tab) + "cm\">" + ((While_Context)_localctx).code.v + "</div>" + "<div>}</div>";
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
	public static class Dowhile_Context extends ParserRuleContext {
		public String a;
		public String v;
		public Token J;
		public Token SPACE;
		public CodeContext code;
		public ExpcondContext expcond;
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public Dowhile_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dowhile_Context(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_dowhile_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDowhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDowhile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitDowhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dowhile_Context dowhile_(String a) throws RecognitionException {
		Dowhile_Context _localctx = new Dowhile_Context(_ctx, getState(), a);
		enterRule(_localctx, 52, RULE_dowhile_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(T__17);
			setState(475);
			match(T__3);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(476);
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
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(482);
			((Dowhile_Context)_localctx).code = code(_localctx.a);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J || _la==SPACE) {
				{
				{
				setState(483);
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
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			match(T__4);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J || _la==SPACE) {
				{
				{
				setState(490);
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
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(T__16);
			setState(497);
			match(T__10);
			setState(498);
			((Dowhile_Context)_localctx).expcond = expcond(_localctx.a);
			setState(499);
			match(T__11);
			setState(500);
			match(T__0);
			((Dowhile_Context)_localctx).v =  "<span class=\"palres\">do</span>" + "{<br>" + "<div style=\"text-indent: " +
			    String.valueOf(ident_tab) + "cm\">" + ((Dowhile_Context)_localctx).code.v + "</div>" + "<div>}" + ((((Dowhile_Context)_localctx).SPACE!=null?((Dowhile_Context)_localctx).SPACE.getText():null) == null ? "" :
			    (((Dowhile_Context)_localctx).SPACE!=null?((Dowhile_Context)_localctx).SPACE.getText():null)) + ((((Dowhile_Context)_localctx).J!=null?((Dowhile_Context)_localctx).J.getText():null) == null ? "": "<br>") + "<span class=\"palres\">while</span>" + "(" + ((Dowhile_Context)_localctx).expcond.v + ")"
			    + ";</div>";
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
	public static class For_Context extends ParserRuleContext {
		public String a;
		public String v;
		public Token SPACE;
		public VardefContext vardef;
		public ExpcondContext expcond;
		public AsigContext asig;
		public CodeContext code;
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<AsigContext> asig() {
			return getRuleContexts(AsigContext.class);
		}
		public AsigContext asig(int i) {
			return getRuleContext(AsigContext.class,i);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public List<TerminalNode> J() { return getTokens(CompilerParser.J); }
		public TerminalNode J(int i) {
			return getToken(CompilerParser.J, i);
		}
		public For_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public For_Context(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_for_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFor_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFor_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_Context for_(String a) throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState(), a);
		enterRule(_localctx, 54, RULE_for_);
		int _la;
		try {
			int _alt;
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(T__18);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(504);
					((For_Context)_localctx).SPACE = match(SPACE);
					}
				}

				setState(507);
				match(T__10);
				setState(508);
				((For_Context)_localctx).vardef = vardef(_localctx.a);
				setState(509);
				match(T__0);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(510);
					((For_Context)_localctx).SPACE = match(SPACE);
					}
				}

				setState(513);
				((For_Context)_localctx).expcond = expcond(_localctx.a);
				setState(514);
				match(T__0);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(515);
					((For_Context)_localctx).SPACE = match(SPACE);
					}
				}

				setState(518);
				((For_Context)_localctx).asig = asig(_localctx.a);
				setState(519);
				match(T__11);
				setState(520);
				match(T__3);
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(521);
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
					setState(526);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(527);
				((For_Context)_localctx).code = code(_localctx.a);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J || _la==SPACE) {
					{
					{
					setState(528);
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
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(534);
				match(T__4);
				((For_Context)_localctx).v =  "<span class=\"palres\">for</span>" + "(" + ((For_Context)_localctx).vardef.v + ";" +
				     ((((For_Context)_localctx).SPACE!=null?((For_Context)_localctx).SPACE.getText():null) == null ? "" : (((For_Context)_localctx).SPACE!=null?((For_Context)_localctx).SPACE.getText():null)) + ((For_Context)_localctx).expcond.v + ";" + ((((For_Context)_localctx).SPACE!=null?((For_Context)_localctx).SPACE.getText():null) == null ? "" : (((For_Context)_localctx).SPACE!=null?((For_Context)_localctx).SPACE.getText():null)) + ((For_Context)_localctx).asig.v
				     + ")" + "{<br>" + "<div style=\"text-indent: " + String.valueOf(ident_tab) + "cm\">" + ((For_Context)_localctx).code.v + "</div>"
				     + "<div>}</div>";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(T__18);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(538);
					((For_Context)_localctx).SPACE = match(SPACE);
					}
				}

				setState(541);
				match(T__10);
				setState(542);
				((For_Context)_localctx).asig = asig(_localctx.a);
				setState(543);
				match(T__0);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(544);
					((For_Context)_localctx).SPACE = match(SPACE);
					}
				}

				setState(547);
				((For_Context)_localctx).expcond = expcond(_localctx.a);
				setState(548);
				match(T__0);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(549);
					((For_Context)_localctx).SPACE = match(SPACE);
					}
				}

				setState(552);
				((For_Context)_localctx).asig = asig(_localctx.a);
				setState(553);
				match(T__11);
				setState(554);
				match(T__3);
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(555);
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
					setState(560);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(561);
				((For_Context)_localctx).code = code(_localctx.a);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==J || _la==SPACE) {
					{
					{
					setState(562);
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
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(568);
				match(T__4);
				((For_Context)_localctx).v =  "<span class=\"palres\">for</span>" + ((((For_Context)_localctx).SPACE!=null?((For_Context)_localctx).SPACE.getText():null) == null ? "" : (((For_Context)_localctx).SPACE!=null?((For_Context)_localctx).SPACE.getText():null)) + "(" + ((For_Context)_localctx).asig.v + ";" +
				    ((((For_Context)_localctx).SPACE!=null?((For_Context)_localctx).SPACE.getText():null) == null ? "" : (((For_Context)_localctx).SPACE!=null?((For_Context)_localctx).SPACE.getText():null)) + ((For_Context)_localctx).expcond.v + ";" + ((((For_Context)_localctx).SPACE!=null?((For_Context)_localctx).SPACE.getText():null) == null ? "" : (((For_Context)_localctx).SPACE!=null?((For_Context)_localctx).SPACE.getText():null)) + ((For_Context)_localctx).asig.v
				    + ")" + "{<br>" + "<div style=\"text-indent: " + String.valueOf(ident_tab) + "cm\">" + ((For_Context)_localctx).code.v + "</div>"
				     + "<div>}</div>"; 
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
	public static class ExpcondContext extends ParserRuleContext {
		public String a;
		public String v;
		public FactorcondContext factorcond;
		public Expcond_RContext expcond_R;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond_RContext expcond_R() {
			return getRuleContext(Expcond_RContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpcondContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond(String a) throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState(), a);
		enterRule(_localctx, 56, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			((ExpcondContext)_localctx).factorcond = factorcond("", _localctx.a);
			setState(574);
			((ExpcondContext)_localctx).expcond_R = expcond_R(((ExpcondContext)_localctx).factorcond.v, _localctx.a);
			((ExpcondContext)_localctx).v =  ((ExpcondContext)_localctx).expcond_R.v;
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
	public static class Expcond_RContext extends ParserRuleContext {
		public String h;
		public String a;
		public String v;
		public Token SPACE;
		public OplogContext oplog;
		public ExpcondContext expcond;
		public Expcond_RContext expcond_R;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public Expcond_RContext expcond_R() {
			return getRuleContext(Expcond_RContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public Expcond_RContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expcond_RContext(ParserRuleContext parent, int invokingState, String h, String a) {
			super(parent, invokingState);
			this.h = h;
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_expcond_R; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterExpcond_R(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitExpcond_R(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitExpcond_R(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expcond_RContext expcond_R(String h,String a) throws RecognitionException {
		Expcond_RContext _localctx = new Expcond_RContext(_ctx, getState(), h, a);
		enterRule(_localctx, 58, RULE_expcond_R);
		int _la;
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(577);
					((Expcond_RContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(580);
				((Expcond_RContext)_localctx).oplog = oplog();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(581);
					((Expcond_RContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(584);
				((Expcond_RContext)_localctx).expcond = expcond(_localctx.a);
				setState(585);
				((Expcond_RContext)_localctx).expcond_R = expcond_R(_localctx.h += ((((Expcond_RContext)_localctx).SPACE!=null?((Expcond_RContext)_localctx).SPACE.getText():null) == null ? "" :
				    (((Expcond_RContext)_localctx).SPACE!=null?((Expcond_RContext)_localctx).SPACE.getText():null)) + ((Expcond_RContext)_localctx).oplog.v + ((((Expcond_RContext)_localctx).SPACE!=null?((Expcond_RContext)_localctx).SPACE.getText():null) == null ? "" : (((Expcond_RContext)_localctx).SPACE!=null?((Expcond_RContext)_localctx).SPACE.getText():null)) + ((Expcond_RContext)_localctx).expcond.v, _localctx.a);
				((Expcond_RContext)_localctx).v =  ((Expcond_RContext)_localctx).expcond_R.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Expcond_RContext)_localctx).v =  _localctx.h;
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
	public static class OplogContext extends ParserRuleContext {
		public String v;
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_oplog);
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(T__19);
				((OplogContext)_localctx).v =  "||";
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				match(T__20);
				((OplogContext)_localctx).v =  "&";
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
	public static class FactorcondContext extends ParserRuleContext {
		public String h;
		public String a;
		public String v;
		public ExpContext exp;
		public Token SPACE;
		public OpcompContext opcomp;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CompilerParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CompilerParser.SPACE, i);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorcondContext(ParserRuleContext parent, int invokingState, String h, String a) {
			super(parent, invokingState);
			this.h = h;
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond(String h,String a) throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState(), h, a);
		enterRule(_localctx, 62, RULE_factorcond);
		int _la;
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				((FactorcondContext)_localctx).exp = exp(_localctx.a);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(598);
					((FactorcondContext)_localctx).SPACE = match(SPACE);
					}
				}

				((FactorcondContext)_localctx).v =  ((FactorcondContext)_localctx).exp.v;
				setState(602);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(603);
					((FactorcondContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(606);
				((FactorcondContext)_localctx).exp = exp(_localctx.a);
				_localctx.v += ((((FactorcondContext)_localctx).SPACE!=null?((FactorcondContext)_localctx).SPACE.getText():null) == null
				    ? "" : (((FactorcondContext)_localctx).SPACE!=null?((FactorcondContext)_localctx).SPACE.getText():null)) + ((FactorcondContext)_localctx).opcomp.v + ((((FactorcondContext)_localctx).SPACE!=null?((FactorcondContext)_localctx).SPACE.getText():null) == null ? "" : (((FactorcondContext)_localctx).SPACE!=null?((FactorcondContext)_localctx).SPACE.getText():null)) + ((FactorcondContext)_localctx).exp.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				match(T__10);
				setState(610);
				((FactorcondContext)_localctx).expcond = expcond(_localctx.a);
				setState(611);
				match(T__11);
				((FactorcondContext)_localctx).v =  "(" + ((FactorcondContext)_localctx).expcond.v + ")";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				match(T__21);
				setState(615);
				((FactorcondContext)_localctx).factorcond = factorcond("!", _localctx.a);
				((FactorcondContext)_localctx).v =  ((FactorcondContext)_localctx).factorcond.v;
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
	public static class OpcompContext extends ParserRuleContext {
		public String v;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_opcomp);
		try {
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				match(T__22);
				((OpcompContext)_localctx).v =  "<";
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				match(T__23);
				((OpcompContext)_localctx).v =  ">";
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				match(T__24);
				((OpcompContext)_localctx).v =  "<=";
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(626);
				match(T__25);
				((OpcompContext)_localctx).v =  ">=";
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(628);
				match(T__26);
				((OpcompContext)_localctx).v =  "==";
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
	public static class Return_mContext extends ParserRuleContext {
		public String a;
		public String v;
		public ExpContext exp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Return_mContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Return_mContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final Return_mContext return_m(String a) throws RecognitionException {
		Return_mContext _localctx = new Return_mContext(_ctx, getState(), a);
		enterRule(_localctx, 66, RULE_return_m);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(T__27);
			setState(633);
			((Return_mContext)_localctx).exp = exp(_localctx.a);
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
		public String a;
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
		public AsigContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AsigContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final AsigContext asig(String a) throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState(), a);
		enterRule(_localctx, 68, RULE_asig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			((AsigContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(637);
				((AsigContext)_localctx).SPACE = match(SPACE);
				}
			}

			setState(640);
			match(T__5);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(641);
				((AsigContext)_localctx).SPACE = match(SPACE);
				}
			}

			setState(644);
			((AsigContext)_localctx).exp = exp(_localctx.a);
			((AsigContext)_localctx).v =  "<a href=\"#" + _localctx.a + ":" + (((AsigContext)_localctx).IDENTIFIER!=null?((AsigContext)_localctx).IDENTIFIER.getText():null) + "\">" + "<span class=\"ident\">"
			    + (((AsigContext)_localctx).IDENTIFIER!=null?((AsigContext)_localctx).IDENTIFIER.getText():null) + "</span></a>" + ((((AsigContext)_localctx).SPACE!=null?((AsigContext)_localctx).SPACE.getText():null) == null ? "": (((AsigContext)_localctx).SPACE!=null?((AsigContext)_localctx).SPACE.getText():null)) + "=" + ((((AsigContext)_localctx).SPACE!=null?((AsigContext)_localctx).SPACE.getText():null) == null ? "" : (((AsigContext)_localctx).SPACE!=null?((AsigContext)_localctx).SPACE.getText():null)) + ((AsigContext)_localctx).exp.v;
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
		public String a;
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
		public ExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final ExpContext exp(String a) throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState(), a);
		enterRule(_localctx, 70, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			((ExpContext)_localctx).factor = factor(_localctx.a);
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(648);
				((ExpContext)_localctx).SPACE = match(SPACE);
				}
				break;
			}
			setState(651);
			((ExpContext)_localctx).exp_R = exp_R(((ExpContext)_localctx).factor.v + ((((ExpContext)_localctx).SPACE!=null?((ExpContext)_localctx).SPACE.getText():null) == null ? "" : (((ExpContext)_localctx).SPACE!=null?((ExpContext)_localctx).SPACE.getText():null)), _localctx.a);
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
		public String a;
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
		public Exp_RContext(ParserRuleContext parent, int invokingState, String h, String a) {
			super(parent, invokingState);
			this.h = h;
			this.a = a;
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

	public final Exp_RContext exp_R(String h,String a) throws RecognitionException {
		Exp_RContext _localctx = new Exp_RContext(_ctx, getState(), h, a);
		enterRule(_localctx, 72, RULE_exp_R);
		int _la;
		try {
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				((Exp_RContext)_localctx).op = op();
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(655);
					((Exp_RContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(658);
				((Exp_RContext)_localctx).exp = exp(_localctx.a);
				setState(659);
				((Exp_RContext)_localctx).exp_R = exp_R(_localctx.h += ((Exp_RContext)_localctx).op.v + ((((Exp_RContext)_localctx).SPACE!=null?((Exp_RContext)_localctx).SPACE.getText():null) == null ? "" : (((Exp_RContext)_localctx).SPACE!=null?((Exp_RContext)_localctx).SPACE.getText():null))
				    + ((Exp_RContext)_localctx).exp.v, _localctx.a);
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
		enterRule(_localctx, 74, RULE_op);
		try {
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(T__28);
				((OpContext)_localctx).v =  "<span class=\"palres\">+</span>";
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				match(T__29);
				((OpContext)_localctx).v =  "<span class=\"palres\">-</span>";
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				match(T__30);
				((OpContext)_localctx).v =  "<span class=\"palres\">*</span>";
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(671);
				match(T__31);
				((OpContext)_localctx).v =  "<span class=\"palres\">DIV</span>";
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(673);
				match(T__32);
				((OpContext)_localctx).v =  "<span class=\"palres\">MOD</span>";
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
		public String a;
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
		public FactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final FactorContext factor(String a) throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState(), a);
		enterRule(_localctx, 76, RULE_factor);
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				((FactorContext)_localctx).simpvalue = simpvalue();
				setState(679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(678);
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
				setState(683);
				match(T__10);
				setState(684);
				((FactorContext)_localctx).exp = exp(_localctx.a);
				setState(685);
				match(T__11);
				((FactorContext)_localctx).v =  "(" + ((FactorContext)_localctx).exp.v + ")";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				((FactorContext)_localctx).funccall = funccall((funccall_main ? "funciones" : _localctx.a));
				((FactorContext)_localctx).v =  ((FactorContext)_localctx).funccall.v;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(691);
				((FactorContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((FactorContext)_localctx).v =  "<a href=\"#" + _localctx.a + ":" + (((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null) + "\">" + "<span class=\"ident\">"
				    + (((FactorContext)_localctx).IDENTIFIER!=null?((FactorContext)_localctx).IDENTIFIER.getText():null) + "</span></a>";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(693);
				((FactorContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
				((FactorContext)_localctx).v =  "<a href=\"#" + _localctx.a + ":" + (((FactorContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FactorContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "\">" + "<span class=\"ident\">"
				    + (((FactorContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FactorContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "</span></a>";
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
		public String a;
		public String v;
		public Token IDENTIFIER;
		public SubparamlistContext subparamlist;
		public Token CONST_DEF_IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(CompilerParser.IDENTIFIER, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public TerminalNode CONST_DEF_IDENTIFIER() { return getToken(CompilerParser.CONST_DEF_IDENTIFIER, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FunccallContext(ParserRuleContext parent, int invokingState, String a) {
			super(parent, invokingState);
			this.a = a;
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

	public final FunccallContext funccall(String a) throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState(), a);
		enterRule(_localctx, 78, RULE_funccall);
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				((FunccallContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(698);
				((FunccallContext)_localctx).subparamlist = subparamlist();
				((FunccallContext)_localctx).v =  (funccall_main ? ("<a href=\"#" + _localctx.a + ":" + (((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null) + "\">" + "<span class=\"ident\">"
				    + (((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null) + "</span></a>") : ("<span class=\"ident\">" + (((FunccallContext)_localctx).IDENTIFIER!=null?((FunccallContext)_localctx).IDENTIFIER.getText():null)
				        + "</span>")) + ((FunccallContext)_localctx).subparamlist.v;
				}
				break;
			case CONST_DEF_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				((FunccallContext)_localctx).CONST_DEF_IDENTIFIER = match(CONST_DEF_IDENTIFIER);
				setState(702);
				((FunccallContext)_localctx).subparamlist = subparamlist();
				((FunccallContext)_localctx).v =  (funccall_main ? ("<a href=\"#" + _localctx.a + ":" + (((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "\">" + "<span class=\"ident\">"
				    + (((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "</span></a>") :
				        ("<span class=\"ident\">" + (((FunccallContext)_localctx).CONST_DEF_IDENTIFIER!=null?((FunccallContext)_localctx).CONST_DEF_IDENTIFIER.getText():null) + "</span>")) + ((FunccallContext)_localctx).subparamlist.v;
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
		enterRule(_localctx, 80, RULE_subparamlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__10);
			setState(708);
			((SubparamlistContext)_localctx).explist = explist("");
			setState(709);
			match(T__11);
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
		enterRule(_localctx, 82, RULE_explist);
		int _la;
		try {
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				((ExplistContext)_localctx).exp = exp("programa_principal");
				((ExplistContext)_localctx).v =  _localctx.h + ((ExplistContext)_localctx).exp.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				((ExplistContext)_localctx).exp = exp("programa_principal");
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(716);
					((ExplistContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(719);
				match(T__12);
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(720);
					((ExplistContext)_localctx).SPACE = match(SPACE);
					}
				}

				setState(723);
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
		"\u0004\u0001+\u02d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"X\b\u0000\n\u0000\f\u0000[\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000`\b\u0000\n\u0000\f\u0000c\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0005\u0002m\b\u0002\n\u0002\f\u0002p\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002v\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0080\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0090\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0095\b\u0006\n\u0006"+
		"\f\u0006\u0098\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009c\b\u0006"+
		"\n\u0006\f\u0006\u009f\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a3"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ae\b\u0007\n"+
		"\u0007\f\u0007\u00b1\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00b6\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00c1\b\b\u0001\b\u0001\b\u0003\b\u00c5\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00ca\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00d8\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0005\f\u00e2\b\f\n\f\f\f\u00e5\t\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00eb\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00f6\b\r\n\r\f\r\u00f9\t\r\u0001\r"+
		"\u0001\r\u0005\r\u00fd\b\r\n\r\f\r\u0100\t\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0105\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u010b\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0116\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0121\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0125\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0129\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u012d\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0134"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u013a"+
		"\b\u0012\n\u0012\f\u0012\u013d\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0141\b\u0012\n\u0012\f\u0012\u0144\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u014d"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u0159"+
		"\b\u0015\n\u0015\f\u0015\u015c\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0162\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0185\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0189\b"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u018e\b\u0017\n"+
		"\u0017\f\u0017\u0191\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0195"+
		"\b\u0017\n\u0017\f\u0017\u0198\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u019c\b\u0017\n\u0017\f\u0017\u019f\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u01a6\b\u0018\n\u0018\f\u0018"+
		"\u01a9\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01ad\b\u0018\n\u0018"+
		"\f\u0018\u01b0\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01b4\b\u0018"+
		"\n\u0018\f\u0018\u01b7\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01be\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01c4\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01cc\b\u0019\n"+
		"\u0019\f\u0019\u01cf\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01d3"+
		"\b\u0019\n\u0019\f\u0019\u01d6\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01de\b\u001a\n\u001a"+
		"\f\u001a\u01e1\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01e5\b\u001a"+
		"\n\u001a\f\u001a\u01e8\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01ec"+
		"\b\u001a\n\u001a\f\u001a\u01ef\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u01fa\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0200\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0205\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u020b\b\u001b\n\u001b\f\u001b\u020e\t\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u0212\b\u001b\n\u001b\f\u001b\u0215\t\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u021c\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0222\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0227\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u022d\b\u001b\n\u001b\f\u001b\u0230"+
		"\t\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0234\b\u001b\n\u001b\f\u001b"+
		"\u0237\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u023c\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0003"+
		"\u001d\u0243\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0247\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u024e\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0254\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0258\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u025d\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u026b"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0277\b \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0003"+
		"\"\u027f\b\"\u0001\"\u0001\"\u0003\"\u0283\b\"\u0001\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0003#\u028a\b#\u0001#\u0001#\u0001#\u0001$\u0001$\u0003"+
		"$\u0291\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0298\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u02a4"+
		"\b%\u0001&\u0001&\u0003&\u02a8\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02b8"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u02c2\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u02ce\b)\u0001)\u0001)\u0003)\u02d2\b)\u0001)\u0001)\u0001"+
		")\u0003)\u02d7\b)\u0001)\u0000\u0000*\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPR\u0000\u0001\u0001\u0000\"#\u0311\u0000T\u0001\u0000\u0000\u0000"+
		"\u0002g\u0001\u0000\u0000\u0000\u0004u\u0001\u0000\u0000\u0000\u0006\u007f"+
		"\u0001\u0000\u0000\u0000\b\u0081\u0001\u0000\u0000\u0000\n\u008f\u0001"+
		"\u0000\u0000\u0000\f\u0091\u0001\u0000\u0000\u0000\u000e\u00b5\u0001\u0000"+
		"\u0000\u0000\u0010\u00c9\u0001\u0000\u0000\u0000\u0012\u00d7\u0001\u0000"+
		"\u0000\u0000\u0014\u00d9\u0001\u0000\u0000\u0000\u0016\u00dc\u0001\u0000"+
		"\u0000\u0000\u0018\u00ea\u0001\u0000\u0000\u0000\u001a\u0104\u0001\u0000"+
		"\u0000\u0000\u001c\u0106\u0001\u0000\u0000\u0000\u001e\u0115\u0001\u0000"+
		"\u0000\u0000 \u0124\u0001\u0000\u0000\u0000\"\u0133\u0001\u0000\u0000"+
		"\u0000$\u0135\u0001\u0000\u0000\u0000&\u0148\u0001\u0000\u0000\u0000("+
		"\u0153\u0001\u0000\u0000\u0000*\u0161\u0001\u0000\u0000\u0000,\u0184\u0001"+
		"\u0000\u0000\u0000.\u0186\u0001\u0000\u0000\u00000\u01c3\u0001\u0000\u0000"+
		"\u00002\u01c5\u0001\u0000\u0000\u00004\u01da\u0001\u0000\u0000\u00006"+
		"\u023b\u0001\u0000\u0000\u00008\u023d\u0001\u0000\u0000\u0000:\u024d\u0001"+
		"\u0000\u0000\u0000<\u0253\u0001\u0000\u0000\u0000>\u026a\u0001\u0000\u0000"+
		"\u0000@\u0276\u0001\u0000\u0000\u0000B\u0278\u0001\u0000\u0000\u0000D"+
		"\u027c\u0001\u0000\u0000\u0000F\u0287\u0001\u0000\u0000\u0000H\u0297\u0001"+
		"\u0000\u0000\u0000J\u02a3\u0001\u0000\u0000\u0000L\u02b7\u0001\u0000\u0000"+
		"\u0000N\u02c1\u0001\u0000\u0000\u0000P\u02c3\u0001\u0000\u0000\u0000R"+
		"\u02d6\u0001\u0000\u0000\u0000TU\u0006\u0000\uffff\uffff\u0000UY\u0003"+
		"\u0002\u0001\u0000VX\u0005\"\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0003\u0016\u000b"+
		"\u0000]a\u0006\u0000\uffff\uffff\u0000^`\u0005\"\u0000\u0000_^\u0001\u0000"+
		"\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"de\u0003$\u0012\u0000ef\u0006\u0000\uffff\uffff\u0000f\u0001\u0001\u0000"+
		"\u0000\u0000gh\u0003\u0004\u0002\u0000hi\u0006\u0001\uffff\uffff\u0000"+
		"i\u0003\u0001\u0000\u0000\u0000jn\u0003\u0006\u0003\u0000km\u0005\"\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qr\u0003\u0004\u0002\u0000rs\u0006\u0002\uffff\uffff"+
		"\u0000sv\u0001\u0000\u0000\u0000tv\u0006\u0002\uffff\uffff\u0000uj\u0001"+
		"\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0005\u0001\u0000\u0000"+
		"\u0000wx\u0003\b\u0004\u0000xy\u0006\u0003\uffff\uffff\u0000y\u0080\u0001"+
		"\u0000\u0000\u0000z{\u0003\u0010\b\u0000{|\u0005\u0001\u0000\u0000|}\u0005"+
		"\"\u0000\u0000}~\u0006\u0003\uffff\uffff\u0000~\u0080\u0001\u0000\u0000"+
		"\u0000\u007fw\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u0080"+
		"\u0007\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0002\u0000\u0000\u0082"+
		"\u0083\u0005#\u0000\u0000\u0083\u0084\u0005&\u0000\u0000\u0084\u0085\u0005"+
		"#\u0000\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086\u0087\u0005\"\u0000"+
		"\u0000\u0087\u0088\u0006\u0004\uffff\uffff\u0000\u0088\t\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005(\u0000\u0000\u008a\u0090\u0006\u0005\uffff\uffff"+
		"\u0000\u008b\u008c\u0005)\u0000\u0000\u008c\u0090\u0006\u0005\uffff\uffff"+
		"\u0000\u008d\u008e\u0005*\u0000\u0000\u008e\u0090\u0006\u0005\uffff\uffff"+
		"\u0000\u008f\u0089\u0001\u0000\u0000\u0000\u008f\u008b\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u000b\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0003\u0000\u0000\u0092\u0096\u0005\u0004\u0000"+
		"\u0000\u0093\u0095\u0007\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009d\u0003\u000e\u0007"+
		"\u0000\u009a\u009c\u0007\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005\u0005\u0000"+
		"\u0000\u00a1\u00a3\u0005#\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0006\u0006\uffff\uffff\u0000\u00a5\r\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0003\u0010\b\u0000\u00a7\u00a8\u0005\u0001\u0000\u0000\u00a8"+
		"\u00a9\u0006\u0007\uffff\uffff\u0000\u00a9\u00b6\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0003\u0010\b\u0000\u00ab\u00af\u0005\u0001\u0000\u0000\u00ac"+
		"\u00ae\u0007\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u000e\u0007\u0000\u00b3"+
		"\u00b4\u0006\u0007\uffff\uffff\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a6\u0001\u0000\u0000\u0000\u00b5\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b6\u000f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0012\t\u0000\u00b8"+
		"\u00b9\u0005#\u0000\u0000\u00b9\u00ba\u0005\'\u0000\u0000\u00ba\u00bb"+
		"\u0006\b\uffff\uffff\u0000\u00bb\u00ca\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0003\u0012\t\u0000\u00bd\u00be\u0005#\u0000\u0000\u00be\u00c0\u0005"+
		"\'\u0000\u0000\u00bf\u00c1\u0005#\u0000\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\u0005\u0006\u0000\u0000\u00c3\u00c5\u0005#\u0000"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\n\u0005\u0000"+
		"\u00c7\u00c8\u0006\b\uffff\uffff\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c9\u00b7\u0001\u0000\u0000\u0000\u00c9\u00bc\u0001\u0000\u0000\u0000"+
		"\u00ca\u0011\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0007\u0000\u0000"+
		"\u00cc\u00d8\u0006\t\uffff\uffff\u0000\u00cd\u00ce\u0005\b\u0000\u0000"+
		"\u00ce\u00d8\u0006\t\uffff\uffff\u0000\u00cf\u00d0\u0005\t\u0000\u0000"+
		"\u00d0\u00d8\u0006\t\uffff\uffff\u0000\u00d1\u00d2\u0003\u0014\n\u0000"+
		"\u00d2\u00d3\u0006\t\uffff\uffff\u0000\u00d3\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0003\f\u0006\u0000\u00d5\u00d6\u0006\t\uffff\uffff\u0000"+
		"\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d7\u00cd\u0001\u0000\u0000\u0000\u00d7\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d8\u0013\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\n\u0000\u0000\u00da"+
		"\u00db\u0006\n\uffff\uffff\u0000\u00db\u0015\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0003\u0018\f\u0000\u00dd\u00de\u0006\u000b\uffff\uffff\u0000\u00de"+
		"\u0017\u0001\u0000\u0000\u0000\u00df\u00e3\u0003\u001a\r\u0000\u00e0\u00e2"+
		"\u0005\"\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0003\u0018\f\u0000\u00e7\u00e8\u0006\f"+
		"\uffff\uffff\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00eb\u0006"+
		"\f\uffff\uffff\u0000\u00ea\u00df\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u0019\u0001\u0000\u0000\u0000\u00ec\u00ed\u0006"+
		"\r\uffff\uffff\u0000\u00ed\u00ee\u0003\u001c\u000e\u0000\u00ee\u00ef\u0005"+
		"\u0001\u0000\u0000\u00ef\u00f0\u0006\r\uffff\uffff\u0000\u00f0\u0105\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0006\r\uffff\uffff\u0000\u00f2\u00f3\u0003"+
		"\u001c\u000e\u0000\u00f3\u00f7\u0005\u0004\u0000\u0000\u00f4\u00f6\u0007"+
		"\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fe\u0003(\u0014\u0000\u00fb\u00fd\u0007\u0000"+
		"\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005\u0005\u0000\u0000\u0102\u0103\u0006\r\uffff"+
		"\uffff\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00ec\u0001\u0000"+
		"\u0000\u0000\u0104\u00f1\u0001\u0000\u0000\u0000\u0105\u001b\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0003\u0012\t\u0000\u0107\u0108\u0005#\u0000"+
		"\u0000\u0108\u010a\u0005\'\u0000\u0000\u0109\u010b\u0005#\u0000\u0000"+
		"\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u000b\u0000\u0000"+
		"\u010d\u010e\u0003\u001e\u000f\u0000\u010e\u010f\u0005\f\u0000\u0000\u010f"+
		"\u0110\u0006\u000e\uffff\uffff\u0000\u0110\u001d\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0003 \u0010\u0000\u0112\u0113\u0006\u000f\uffff\uffff\u0000"+
		"\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0116\u0006\u000f\uffff\uffff"+
		"\u0000\u0115\u0111\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000"+
		"\u0000\u0116\u001f\u0001\u0000\u0000\u0000\u0117\u0118\u0003\u0012\t\u0000"+
		"\u0118\u0119\u0005#\u0000\u0000\u0119\u011a\u0005\'\u0000\u0000\u011a"+
		"\u011b\u0003\"\u0011\u0000\u011b\u011c\u0006\u0010\uffff\uffff\u0000\u011c"+
		"\u0125\u0001\u0000\u0000\u0000\u011d\u0120\u0003\u0014\n\u0000\u011e\u011f"+
		"\u0005#\u0000\u0000\u011f\u0121\u0005\'\u0000\u0000\u0120\u011e\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0006\u0010\uffff\uffff\u0000\u0123\u0125"+
		"\u0001\u0000\u0000\u0000\u0124\u0117\u0001\u0000\u0000\u0000\u0124\u011d"+
		"\u0001\u0000\u0000\u0000\u0125!\u0001\u0000\u0000\u0000\u0126\u0128\u0005"+
		"\r\u0000\u0000\u0127\u0129\u0005#\u0000\u0000\u0128\u0127\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u012c\u0003\u0012\t\u0000\u012b\u012d\u0005#\u0000"+
		"\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0005\'\u0000\u0000"+
		"\u012f\u0130\u0003\"\u0011\u0000\u0130\u0131\u0006\u0011\uffff\uffff\u0000"+
		"\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0134\u0006\u0011\uffff\uffff"+
		"\u0000\u0133\u0126\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000"+
		"\u0000\u0134#\u0001\u0000\u0000\u0000\u0135\u0136\u0003&\u0013\u0000\u0136"+
		"\u0137\u0006\u0012\uffff\uffff\u0000\u0137\u013b\u0005\u0004\u0000\u0000"+
		"\u0138\u013a\u0007\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000"+
		"\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0142\u0003(\u0014\u0000\u013f"+
		"\u0141\u0007\u0000\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144"+
		"\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0005\u0000\u0000\u0146"+
		"\u0147\u0006\u0012\uffff\uffff\u0000\u0147%\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0003\u0014\n\u0000\u0149\u014a\u0005#\u0000\u0000\u014a\u014c"+
		"\u0005\u000e\u0000\u0000\u014b\u014d\u0005#\u0000\u0000\u014c\u014b\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0005\u000b\u0000\u0000\u014f\u0150\u0003"+
		"\u001e\u000f\u0000\u0150\u0151\u0005\f\u0000\u0000\u0151\u0152\u0006\u0013"+
		"\uffff\uffff\u0000\u0152\'\u0001\u0000\u0000\u0000\u0153\u0154\u0003*"+
		"\u0015\u0000\u0154\u0155\u0006\u0014\uffff\uffff\u0000\u0155)\u0001\u0000"+
		"\u0000\u0000\u0156\u015a\u0003,\u0016\u0000\u0157\u0159\u0007\u0000\u0000"+
		"\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000"+
		"\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0003*\u0015\u0000\u015e\u015f\u0006\u0015\uffff\uffff"+
		"\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u0162\u0006\u0015\uffff"+
		"\uffff\u0000\u0161\u0156\u0001\u0000\u0000\u0000\u0161\u0160\u0001\u0000"+
		"\u0000\u0000\u0162+\u0001\u0000\u0000\u0000\u0163\u0164\u0003D\"\u0000"+
		"\u0164\u0165\u0005\u0001\u0000\u0000\u0165\u0166\u0006\u0016\uffff\uffff"+
		"\u0000\u0166\u0185\u0001\u0000\u0000\u0000\u0167\u0168\u0003N\'\u0000"+
		"\u0168\u0169\u0005\u0001\u0000\u0000\u0169\u016a\u0006\u0016\uffff\uffff"+
		"\u0000\u016a\u0185\u0001\u0000\u0000\u0000\u016b\u016c\u0003\u0010\b\u0000"+
		"\u016c\u016d\u0005\u0001\u0000\u0000\u016d\u016e\u0005\"\u0000\u0000\u016e"+
		"\u016f\u0006\u0016\uffff\uffff\u0000\u016f\u0185\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0003B!\u0000\u0171\u0172\u0005\u0001\u0000\u0000\u0172\u0173"+
		"\u0006\u0016\uffff\uffff\u0000\u0173\u0185\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0006\u0016\uffff\uffff\u0000\u0175\u0176\u0003.\u0017\u0000\u0176"+
		"\u0177\u0006\u0016\uffff\uffff\u0000\u0177\u0185\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0006\u0016\uffff\uffff\u0000\u0179\u017a\u00032\u0019\u0000"+
		"\u017a\u017b\u0006\u0016\uffff\uffff\u0000\u017b\u0185\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0006\u0016\uffff\uffff\u0000\u017d\u017e\u00034\u001a"+
		"\u0000\u017e\u017f\u0006\u0016\uffff\uffff\u0000\u017f\u0185\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0006\u0016\uffff\uffff\u0000\u0181\u0182\u0003"+
		"6\u001b\u0000\u0182\u0183\u0006\u0016\uffff\uffff\u0000\u0183\u0185\u0001"+
		"\u0000\u0000\u0000\u0184\u0163\u0001\u0000\u0000\u0000\u0184\u0167\u0001"+
		"\u0000\u0000\u0000\u0184\u016b\u0001\u0000\u0000\u0000\u0184\u0170\u0001"+
		"\u0000\u0000\u0000\u0184\u0174\u0001\u0000\u0000\u0000\u0184\u0178\u0001"+
		"\u0000\u0000\u0000\u0184\u017c\u0001\u0000\u0000\u0000\u0184\u0180\u0001"+
		"\u0000\u0000\u0000\u0185-\u0001\u0000\u0000\u0000\u0186\u0188\u0005\u000f"+
		"\u0000\u0000\u0187\u0189\u0005#\u0000\u0000\u0188\u0187\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u00038\u001c\u0000\u018b\u018f\u0005\u0004\u0000\u0000"+
		"\u018c\u018e\u0007\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000"+
		"\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0196\u0003(\u0014\u0000\u0193"+
		"\u0195\u0007\u0000\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195"+
		"\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198"+
		"\u0196\u0001\u0000\u0000\u0000\u0199\u019d\u0005\u0005\u0000\u0000\u019a"+
		"\u019c\u0007\u0000\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c"+
		"\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d"+
		"\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u00030\u0018\u0000\u01a1\u01a2"+
		"\u0006\u0017\uffff\uffff\u0000\u01a2/\u0001\u0000\u0000\u0000\u01a3\u01a7"+
		"\u0005\u0010\u0000\u0000\u01a4\u01a6\u0007\u0000\u0000\u0000\u01a5\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa"+
		"\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ae"+
		"\u0005\u0004\u0000\u0000\u01ab\u01ad\u0007\u0000\u0000\u0000\u01ac\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b5"+
		"\u0003(\u0014\u0000\u01b2\u01b4\u0007\u0000\u0000\u0000\u01b3\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005"+
		"\u0005\u0000\u0000\u01b9\u01ba\u0006\u0018\uffff\uffff\u0000\u01ba\u01c4"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bd\u0005\u0010\u0000\u0000\u01bc\u01be"+
		"\u0005#\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0003"+
		".\u0017\u0000\u01c0\u01c1\u0006\u0018\uffff\uffff\u0000\u01c1\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c4\u0006\u0018\uffff\uffff\u0000\u01c3\u01a3"+
		"\u0001\u0000\u0000\u0000\u01c3\u01bb\u0001\u0000\u0000\u0000\u01c3\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c41\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005"+
		"\u0011\u0000\u0000\u01c6\u01c7\u0005\u000b\u0000\u0000\u01c7\u01c8\u0003"+
		"8\u001c\u0000\u01c8\u01c9\u0005\f\u0000\u0000\u01c9\u01cd\u0005\u0004"+
		"\u0000\u0000\u01ca\u01cc\u0007\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d4\u0003(\u0014"+
		"\u0000\u01d1\u01d3\u0007\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\u0005\u0000"+
		"\u0000\u01d8\u01d9\u0006\u0019\uffff\uffff\u0000\u01d93\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0005\u0012\u0000\u0000\u01db\u01df\u0005\u0004\u0000"+
		"\u0000\u01dc\u01de\u0007\u0000\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000"+
		"\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000"+
		"\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e6\u0003(\u0014\u0000"+
		"\u01e3\u01e5\u0007\u0000\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e8\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01ed\u0005\u0005\u0000\u0000"+
		"\u01ea\u01ec\u0007\u0000\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005\u0011\u0000\u0000"+
		"\u01f1\u01f2\u0005\u000b\u0000\u0000\u01f2\u01f3\u00038\u001c\u0000\u01f3"+
		"\u01f4\u0005\f\u0000\u0000\u01f4\u01f5\u0005\u0001\u0000\u0000\u01f5\u01f6"+
		"\u0006\u001a\uffff\uffff\u0000\u01f65\u0001\u0000\u0000\u0000\u01f7\u01f9"+
		"\u0005\u0013\u0000\u0000\u01f8\u01fa\u0005#\u0000\u0000\u01f9\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0005\u000b\u0000\u0000\u01fc\u01fd\u0003"+
		"\u0010\b\u0000\u01fd\u01ff\u0005\u0001\u0000\u0000\u01fe\u0200\u0005#"+
		"\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0202\u00038\u001c"+
		"\u0000\u0202\u0204\u0005\u0001\u0000\u0000\u0203\u0205\u0005#\u0000\u0000"+
		"\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000"+
		"\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0003D\"\u0000\u0207"+
		"\u0208\u0005\f\u0000\u0000\u0208\u020c\u0005\u0004\u0000\u0000\u0209\u020b"+
		"\u0007\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b\u020e"+
		"\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d"+
		"\u0001\u0000\u0000\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e\u020c"+
		"\u0001\u0000\u0000\u0000\u020f\u0213\u0003(\u0014\u0000\u0210\u0212\u0007"+
		"\u0000\u0000\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0212\u0215\u0001"+
		"\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001"+
		"\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u0213\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0005\u0005\u0000\u0000\u0217\u0218\u0006"+
		"\u001b\uffff\uffff\u0000\u0218\u023c\u0001\u0000\u0000\u0000\u0219\u021b"+
		"\u0005\u0013\u0000\u0000\u021a\u021c\u0005#\u0000\u0000\u021b\u021a\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021d\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0005\u000b\u0000\u0000\u021e\u021f\u0003"+
		"D\"\u0000\u021f\u0221\u0005\u0001\u0000\u0000\u0220\u0222\u0005#\u0000"+
		"\u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0224\u00038\u001c\u0000"+
		"\u0224\u0226\u0005\u0001\u0000\u0000\u0225\u0227\u0005#\u0000\u0000\u0226"+
		"\u0225\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0003D\"\u0000\u0229\u022a"+
		"\u0005\f\u0000\u0000\u022a\u022e\u0005\u0004\u0000\u0000\u022b\u022d\u0007"+
		"\u0000\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0230\u0001"+
		"\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022e\u0001"+
		"\u0000\u0000\u0000\u0231\u0235\u0003(\u0014\u0000\u0232\u0234\u0007\u0000"+
		"\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000"+
		"\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000"+
		"\u0000\u0000\u0236\u0238\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0005\u0005\u0000\u0000\u0239\u023a\u0006\u001b"+
		"\uffff\uffff\u0000\u023a\u023c\u0001\u0000\u0000\u0000\u023b\u01f7\u0001"+
		"\u0000\u0000\u0000\u023b\u0219\u0001\u0000\u0000\u0000\u023c7\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0003>\u001f\u0000\u023e\u023f\u0003:\u001d\u0000"+
		"\u023f\u0240\u0006\u001c\uffff\uffff\u0000\u02409\u0001\u0000\u0000\u0000"+
		"\u0241\u0243\u0005#\u0000\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244"+
		"\u0246\u0003<\u001e\u0000\u0245\u0247\u0005#\u0000\u0000\u0246\u0245\u0001"+
		"\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u00038\u001c\u0000\u0249\u024a\u0003:\u001d"+
		"\u0000\u024a\u024b\u0006\u001d\uffff\uffff\u0000\u024b\u024e\u0001\u0000"+
		"\u0000\u0000\u024c\u024e\u0006\u001d\uffff\uffff\u0000\u024d\u0242\u0001"+
		"\u0000\u0000\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024e;\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0005\u0014\u0000\u0000\u0250\u0254\u0006\u001e"+
		"\uffff\uffff\u0000\u0251\u0252\u0005\u0015\u0000\u0000\u0252\u0254\u0006"+
		"\u001e\uffff\uffff\u0000\u0253\u024f\u0001\u0000\u0000\u0000\u0253\u0251"+
		"\u0001\u0000\u0000\u0000\u0254=\u0001\u0000\u0000\u0000\u0255\u0257\u0003"+
		"F#\u0000\u0256\u0258\u0005#\u0000\u0000\u0257\u0256\u0001\u0000\u0000"+
		"\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000"+
		"\u0000\u0259\u025a\u0006\u001f\uffff\uffff\u0000\u025a\u025c\u0003@ \u0000"+
		"\u025b\u025d\u0005#\u0000\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e"+
		"\u025f\u0003F#\u0000\u025f\u0260\u0006\u001f\uffff\uffff\u0000\u0260\u026b"+
		"\u0001\u0000\u0000\u0000\u0261\u0262\u0005\u000b\u0000\u0000\u0262\u0263"+
		"\u00038\u001c\u0000\u0263\u0264\u0005\f\u0000\u0000\u0264\u0265\u0006"+
		"\u001f\uffff\uffff\u0000\u0265\u026b\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0005\u0016\u0000\u0000\u0267\u0268\u0003>\u001f\u0000\u0268\u0269\u0006"+
		"\u001f\uffff\uffff\u0000\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u0255"+
		"\u0001\u0000\u0000\u0000\u026a\u0261\u0001\u0000\u0000\u0000\u026a\u0266"+
		"\u0001\u0000\u0000\u0000\u026b?\u0001\u0000\u0000\u0000\u026c\u026d\u0005"+
		"\u0017\u0000\u0000\u026d\u0277\u0006 \uffff\uffff\u0000\u026e\u026f\u0005"+
		"\u0018\u0000\u0000\u026f\u0277\u0006 \uffff\uffff\u0000\u0270\u0271\u0005"+
		"\u0019\u0000\u0000\u0271\u0277\u0006 \uffff\uffff\u0000\u0272\u0273\u0005"+
		"\u001a\u0000\u0000\u0273\u0277\u0006 \uffff\uffff\u0000\u0274\u0275\u0005"+
		"\u001b\u0000\u0000\u0275\u0277\u0006 \uffff\uffff\u0000\u0276\u026c\u0001"+
		"\u0000\u0000\u0000\u0276\u026e\u0001\u0000\u0000\u0000\u0276\u0270\u0001"+
		"\u0000\u0000\u0000\u0276\u0272\u0001\u0000\u0000\u0000\u0276\u0274\u0001"+
		"\u0000\u0000\u0000\u0277A\u0001\u0000\u0000\u0000\u0278\u0279\u0005\u001c"+
		"\u0000\u0000\u0279\u027a\u0003F#\u0000\u027a\u027b\u0006!\uffff\uffff"+
		"\u0000\u027bC\u0001\u0000\u0000\u0000\u027c\u027e\u0005\'\u0000\u0000"+
		"\u027d\u027f\u0005#\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280"+
		"\u0282\u0005\u0006\u0000\u0000\u0281\u0283\u0005#\u0000\u0000\u0282\u0281"+
		"\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0284"+
		"\u0001\u0000\u0000\u0000\u0284\u0285\u0003F#\u0000\u0285\u0286\u0006\""+
		"\uffff\uffff\u0000\u0286E\u0001\u0000\u0000\u0000\u0287\u0289\u0003L&"+
		"\u0000\u0288\u028a\u0005#\u0000\u0000\u0289\u0288\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000"+
		"\u028b\u028c\u0003H$\u0000\u028c\u028d\u0006#\uffff\uffff\u0000\u028d"+
		"G\u0001\u0000\u0000\u0000\u028e\u0290\u0003J%\u0000\u028f\u0291\u0005"+
		"#\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000"+
		"\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0293\u0003F#\u0000"+
		"\u0293\u0294\u0003H$\u0000\u0294\u0295\u0006$\uffff\uffff\u0000\u0295"+
		"\u0298\u0001\u0000\u0000\u0000\u0296\u0298\u0006$\uffff\uffff\u0000\u0297"+
		"\u028e\u0001\u0000\u0000\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0298"+
		"I\u0001\u0000\u0000\u0000\u0299\u029a\u0005\u001d\u0000\u0000\u029a\u02a4"+
		"\u0006%\uffff\uffff\u0000\u029b\u029c\u0005\u001e\u0000\u0000\u029c\u02a4"+
		"\u0006%\uffff\uffff\u0000\u029d\u029e\u0005\u001f\u0000\u0000\u029e\u02a4"+
		"\u0006%\uffff\uffff\u0000\u029f\u02a0\u0005 \u0000\u0000\u02a0\u02a4\u0006"+
		"%\uffff\uffff\u0000\u02a1\u02a2\u0005!\u0000\u0000\u02a2\u02a4\u0006%"+
		"\uffff\uffff\u0000\u02a3\u0299\u0001\u0000\u0000\u0000\u02a3\u029b\u0001"+
		"\u0000\u0000\u0000\u02a3\u029d\u0001\u0000\u0000\u0000\u02a3\u029f\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a4K\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a7\u0003\n\u0005\u0000\u02a6\u02a8\u0005#\u0000"+
		"\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000"+
		"\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02aa\u0006&\uffff\uffff"+
		"\u0000\u02aa\u02b8\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005\u000b\u0000"+
		"\u0000\u02ac\u02ad\u0003F#\u0000\u02ad\u02ae\u0005\f\u0000\u0000\u02ae"+
		"\u02af\u0006&\uffff\uffff\u0000\u02af\u02b8\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0003N\'\u0000\u02b1\u02b2\u0006&\uffff\uffff\u0000\u02b2\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005\'\u0000\u0000\u02b4\u02b8\u0006"+
		"&\uffff\uffff\u0000\u02b5\u02b6\u0005&\u0000\u0000\u02b6\u02b8\u0006&"+
		"\uffff\uffff\u0000\u02b7\u02a5\u0001\u0000\u0000\u0000\u02b7\u02ab\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b0\u0001\u0000\u0000\u0000\u02b7\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8M\u0001\u0000"+
		"\u0000\u0000\u02b9\u02ba\u0005\'\u0000\u0000\u02ba\u02bb\u0003P(\u0000"+
		"\u02bb\u02bc\u0006\'\uffff\uffff\u0000\u02bc\u02c2\u0001\u0000\u0000\u0000"+
		"\u02bd\u02be\u0005&\u0000\u0000\u02be\u02bf\u0003P(\u0000\u02bf\u02c0"+
		"\u0006\'\uffff\uffff\u0000\u02c0\u02c2\u0001\u0000\u0000\u0000\u02c1\u02b9"+
		"\u0001\u0000\u0000\u0000\u02c1\u02bd\u0001\u0000\u0000\u0000\u02c2O\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c4\u0005\u000b\u0000\u0000\u02c4\u02c5\u0003"+
		"R)\u0000\u02c5\u02c6\u0005\f\u0000\u0000\u02c6\u02c7\u0006(\uffff\uffff"+
		"\u0000\u02c7Q\u0001\u0000\u0000\u0000\u02c8\u02c9\u0003F#\u0000\u02c9"+
		"\u02ca\u0006)\uffff\uffff\u0000\u02ca\u02d7\u0001\u0000\u0000\u0000\u02cb"+
		"\u02cd\u0003F#\u0000\u02cc\u02ce\u0005#\u0000\u0000\u02cd\u02cc\u0001"+
		"\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d1\u0005\r\u0000\u0000\u02d0\u02d2\u0005#"+
		"\u0000\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d4\u0003R)\u0000"+
		"\u02d4\u02d5\u0006)\uffff\uffff\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d6\u02c8\u0001\u0000\u0000\u0000\u02d6\u02cb\u0001\u0000\u0000\u0000"+
		"\u02d7S\u0001\u0000\u0000\u0000NYanu\u007f\u008f\u0096\u009d\u00a2\u00af"+
		"\u00b5\u00c0\u00c4\u00c9\u00d7\u00e3\u00ea\u00f7\u00fe\u0104\u010a\u0115"+
		"\u0120\u0124\u0128\u012c\u0133\u013b\u0142\u014c\u015a\u0161\u0184\u0188"+
		"\u018f\u0196\u019d\u01a7\u01ae\u01b5\u01bd\u01c3\u01cd\u01d4\u01df\u01e6"+
		"\u01ed\u01f9\u01ff\u0204\u020c\u0213\u021b\u0221\u0226\u022e\u0235\u023b"+
		"\u0242\u0246\u024d\u0253\u0257\u025c\u026a\u0276\u027e\u0282\u0289\u0290"+
		"\u0297\u02a3\u02a7\u02b7\u02c1\u02cd\u02d1\u02d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}