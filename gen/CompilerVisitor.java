// Generated from /Users/diegopicazo/Library/CloudStorage/OneDrive-UniversidadReyJuanCarlos/3ºETSII/SegundoCuatrimestre/ProcesadoresLenguajes/PracticaObligatoria/src/Compiler.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CompilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(CompilerParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(CompilerParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(CompilerParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(CompilerParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(CompilerParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(CompilerParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(CompilerParser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#tvoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTvoid(CompilerParser.TvoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#funlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunlist(CompilerParser.FunlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(CompilerParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#funchead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunchead(CompilerParser.FuncheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#typedef1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef1(CompilerParser.Typedef1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#typedef2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef2(CompilerParser.Typedef2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(CompilerParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#mainhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainhead(CompilerParser.MainheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(CompilerParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(CompilerParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(CompilerParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CompilerParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(CompilerParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CompilerParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(CompilerParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#subparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubparamlist(CompilerParser.SubparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(CompilerParser.ExplistContext ctx);
}