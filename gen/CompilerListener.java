// Generated from /Users/diegopicazo/Library/CloudStorage/OneDrive-UniversidadReyJuanCarlos/3ºETSII/SegundoCuatrimestre/ProcesadoresLenguajes/PracticaObligatoria/src/Compiler.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CompilerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CompilerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(CompilerParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(CompilerParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(CompilerParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(CompilerParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(CompilerParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(CompilerParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(CompilerParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(CompilerParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(CompilerParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(CompilerParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(CompilerParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(CompilerParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(CompilerParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(CompilerParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#tvoid}.
	 * @param ctx the parse tree
	 */
	void enterTvoid(CompilerParser.TvoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#tvoid}.
	 * @param ctx the parse tree
	 */
	void exitTvoid(CompilerParser.TvoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#funlist}.
	 * @param ctx the parse tree
	 */
	void enterFunlist(CompilerParser.FunlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#funlist}.
	 * @param ctx the parse tree
	 */
	void exitFunlist(CompilerParser.FunlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(CompilerParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(CompilerParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#funchead}.
	 * @param ctx the parse tree
	 */
	void enterFunchead(CompilerParser.FuncheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#funchead}.
	 * @param ctx the parse tree
	 */
	void exitFunchead(CompilerParser.FuncheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#typedef1}.
	 * @param ctx the parse tree
	 */
	void enterTypedef1(CompilerParser.Typedef1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#typedef1}.
	 * @param ctx the parse tree
	 */
	void exitTypedef1(CompilerParser.Typedef1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#typedef2}.
	 * @param ctx the parse tree
	 */
	void enterTypedef2(CompilerParser.Typedef2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#typedef2}.
	 * @param ctx the parse tree
	 */
	void exitTypedef2(CompilerParser.Typedef2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(CompilerParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(CompilerParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#mainhead}.
	 * @param ctx the parse tree
	 */
	void enterMainhead(CompilerParser.MainheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#mainhead}.
	 * @param ctx the parse tree
	 */
	void exitMainhead(CompilerParser.MainheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(CompilerParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(CompilerParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(CompilerParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(CompilerParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(CompilerParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(CompilerParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CompilerParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CompilerParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(CompilerParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(CompilerParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CompilerParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CompilerParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(CompilerParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(CompilerParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubparamlist(CompilerParser.SubparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubparamlist(CompilerParser.SubparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(CompilerParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(CompilerParser.ExplistContext ctx);
}