// Generated from /home/junrushao/IdeaProjects/Compiler2015/src/Parser/Compiler2015.g4 by ANTLR 4.5


package Compiler2015.Parser;
import Compiler2015.Compiler2015.AST.*;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Compiler2015Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, Identifier=61, Constant=62, DecimalConstant=63, StringLiteral=64, 
		Preprocessing=65, Whitespace=66, Newline=67, BlockComment=68, LineComment=69;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "T__58", "T__59", "Identifier", "IdentifierNondigit", "Nondigit", 
		"Digit", "HexQuad", "Constant", "IntegerConstant", "DecimalConstant", 
		"OctalConstant", "HexadecimalConstant", "HexadecimalPrefix", "NonzeroDigit", 
		"OctalDigit", "HexadecimalDigit", "Sign", "DigitSequence", "CharacterConstant", 
		"CCharSequence", "CChar", "EscapeSequence", "SimpleEscapeSequence", "OctalEscapeSequence", 
		"HexadecimalEscapeSequence", "StringLiteral", "SCharSequence", "SChar", 
		"Preprocessing", "Whitespace", "Newline", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'['", "']'", "'.'", "'->'", "'++'", "'--'", "','", 
		"'sizeof'", "'&'", "'*'", "'+'", "'-'", "'~'", "'!'", "'/'", "'%'", "'<<'", 
		"'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'^'", "'|'", "'&&'", 
		"'||'", "'?'", "':'", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
		"'>>='", "'&='", "'^='", "'|='", "';'", "'typedef'", "'void'", "'char'", 
		"'int'", "'{'", "'}'", "'struct'", "'union'", "'...'", "'if'", "'else'", 
		"'while'", "'for'", "'continue'", "'break'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Identifier", "Constant", "DecimalConstant", "StringLiteral", "Preprocessing", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public Compiler2015Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Compiler2015.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2G\u0230\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)"+
		"\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3"+
		"9\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\7>\u0184\n>\f>\16>\u0187\13>\3?\3?\3@\3@\3A\3A\3B"+
		"\3B\3B\3B\3B\3C\3C\5C\u0196\nC\3D\3D\3D\5D\u019b\nD\3E\3E\7E\u019f\nE"+
		"\fE\16E\u01a2\13E\3F\3F\7F\u01a6\nF\fF\16F\u01a9\13F\3G\3G\6G\u01ad\n"+
		"G\rG\16G\u01ae\3H\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\6M\u01bd\nM\rM\16M"+
		"\u01be\3N\3N\3N\3N\3O\6O\u01c6\nO\rO\16O\u01c7\3P\3P\5P\u01cc\nP\3Q\3"+
		"Q\3Q\5Q\u01d1\nQ\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u01e1\n"+
		"S\3T\3T\3T\3T\6T\u01e7\nT\rT\16T\u01e8\3U\3U\5U\u01ed\nU\3U\3U\3V\6V\u01f2"+
		"\nV\rV\16V\u01f3\3W\3W\5W\u01f8\nW\3X\3X\7X\u01fc\nX\fX\16X\u01ff\13X"+
		"\3X\3X\3X\5X\u0204\nX\3X\3X\3Y\6Y\u0209\nY\rY\16Y\u020a\3Y\3Y\3Z\3Z\5"+
		"Z\u0211\nZ\3Z\5Z\u0214\nZ\3Z\3Z\3[\3[\3[\3[\7[\u021c\n[\f[\16[\u021f\13"+
		"[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\7\\\u022a\n\\\f\\\16\\\u022d\13\\\3\\"+
		"\3\\\3\u021d\2]\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}\2\177\2\u0081\2\u0083\2\u0085@\u0087\2\u0089"+
		"A\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b"+
		"\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9B\u00ab\2\u00ad"+
		"\2\u00afC\u00b1D\u00b3E\u00b5F\u00b7G\3\2\16\6\2&&C\\aac|\3\2\62;\4\2"+
		"ZZzz\3\2\63;\3\2\629\5\2\62;CHch\4\2--//\6\2\f\f\17\17))^^\f\2$$))AA^"+
		"^cdhhppttvvxx\6\2\f\f\17\17$$^^\4\2\f\f\17\17\4\2\13\13\"\"\u0233\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0089\3\2\2\2\2\u00a9\3\2\2\2\2\u00af\3\2\2\2"+
		"\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\3\u00b9"+
		"\3\2\2\2\5\u00bb\3\2\2\2\7\u00bd\3\2\2\2\t\u00bf\3\2\2\2\13\u00c1\3\2"+
		"\2\2\r\u00c3\3\2\2\2\17\u00c6\3\2\2\2\21\u00c9\3\2\2\2\23\u00cc\3\2\2"+
		"\2\25\u00ce\3\2\2\2\27\u00d5\3\2\2\2\31\u00d7\3\2\2\2\33\u00d9\3\2\2\2"+
		"\35\u00db\3\2\2\2\37\u00dd\3\2\2\2!\u00df\3\2\2\2#\u00e1\3\2\2\2%\u00e3"+
		"\3\2\2\2\'\u00e5\3\2\2\2)\u00e8\3\2\2\2+\u00eb\3\2\2\2-\u00ed\3\2\2\2"+
		"/\u00ef\3\2\2\2\61\u00f2\3\2\2\2\63\u00f5\3\2\2\2\65\u00f8\3\2\2\2\67"+
		"\u00fb\3\2\2\29\u00fd\3\2\2\2;\u00ff\3\2\2\2=\u0102\3\2\2\2?\u0105\3\2"+
		"\2\2A\u0107\3\2\2\2C\u0109\3\2\2\2E\u010b\3\2\2\2G\u010e\3\2\2\2I\u0111"+
		"\3\2\2\2K\u0114\3\2\2\2M\u0117\3\2\2\2O\u011a\3\2\2\2Q\u011e\3\2\2\2S"+
		"\u0122\3\2\2\2U\u0125\3\2\2\2W\u0128\3\2\2\2Y\u012b\3\2\2\2[\u012d\3\2"+
		"\2\2]\u0135\3\2\2\2_\u013a\3\2\2\2a\u013f\3\2\2\2c\u0143\3\2\2\2e\u0145"+
		"\3\2\2\2g\u0147\3\2\2\2i\u014e\3\2\2\2k\u0154\3\2\2\2m\u0158\3\2\2\2o"+
		"\u015b\3\2\2\2q\u0160\3\2\2\2s\u0166\3\2\2\2u\u016a\3\2\2\2w\u0173\3\2"+
		"\2\2y\u0179\3\2\2\2{\u0180\3\2\2\2}\u0188\3\2\2\2\177\u018a\3\2\2\2\u0081"+
		"\u018c\3\2\2\2\u0083\u018e\3\2\2\2\u0085\u0195\3\2\2\2\u0087\u019a\3\2"+
		"\2\2\u0089\u019c\3\2\2\2\u008b\u01a3\3\2\2\2\u008d\u01aa\3\2\2\2\u008f"+
		"\u01b0\3\2\2\2\u0091\u01b3\3\2\2\2\u0093\u01b5\3\2\2\2\u0095\u01b7\3\2"+
		"\2\2\u0097\u01b9\3\2\2\2\u0099\u01bc\3\2\2\2\u009b\u01c0\3\2\2\2\u009d"+
		"\u01c5\3\2\2\2\u009f\u01cb\3\2\2\2\u00a1\u01d0\3\2\2\2\u00a3\u01d2\3\2"+
		"\2\2\u00a5\u01e0\3\2\2\2\u00a7\u01e2\3\2\2\2\u00a9\u01ea\3\2\2\2\u00ab"+
		"\u01f1\3\2\2\2\u00ad\u01f7\3\2\2\2\u00af\u01f9\3\2\2\2\u00b1\u0208\3\2"+
		"\2\2\u00b3\u0213\3\2\2\2\u00b5\u0217\3\2\2\2\u00b7\u0225\3\2\2\2\u00b9"+
		"\u00ba\7*\2\2\u00ba\4\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc\6\3\2\2\2\u00bd"+
		"\u00be\7]\2\2\u00be\b\3\2\2\2\u00bf\u00c0\7_\2\2\u00c0\n\3\2\2\2\u00c1"+
		"\u00c2\7\60\2\2\u00c2\f\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4\u00c5\7@\2\2"+
		"\u00c5\16\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7\u00c8\7-\2\2\u00c8\20\3\2\2"+
		"\2\u00c9\u00ca\7/\2\2\u00ca\u00cb\7/\2\2\u00cb\22\3\2\2\2\u00cc\u00cd"+
		"\7.\2\2\u00cd\24\3\2\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1"+
		"\7|\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7h\2\2\u00d4"+
		"\26\3\2\2\2\u00d5\u00d6\7(\2\2\u00d6\30\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8"+
		"\32\3\2\2\2\u00d9\u00da\7-\2\2\u00da\34\3\2\2\2\u00db\u00dc\7/\2\2\u00dc"+
		"\36\3\2\2\2\u00dd\u00de\7\u0080\2\2\u00de \3\2\2\2\u00df\u00e0\7#\2\2"+
		"\u00e0\"\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7\'\2"+
		"\2\u00e4&\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7\7>\2\2\u00e7(\3\2\2\2"+
		"\u00e8\u00e9\7@\2\2\u00e9\u00ea\7@\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7>\2"+
		"\2\u00ec,\3\2\2\2\u00ed\u00ee\7@\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7>\2\2"+
		"\u00f0\u00f1\7?\2\2\u00f1\60\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3\u00f4\7"+
		"?\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7?\2\2\u00f6\u00f7\7?\2\2\u00f7\64"+
		"\3\2\2\2\u00f8\u00f9\7#\2\2\u00f9\u00fa\7?\2\2\u00fa\66\3\2\2\2\u00fb"+
		"\u00fc\7`\2\2\u00fc8\3\2\2\2\u00fd\u00fe\7~\2\2\u00fe:\3\2\2\2\u00ff\u0100"+
		"\7(\2\2\u0100\u0101\7(\2\2\u0101<\3\2\2\2\u0102\u0103\7~\2\2\u0103\u0104"+
		"\7~\2\2\u0104>\3\2\2\2\u0105\u0106\7A\2\2\u0106@\3\2\2\2\u0107\u0108\7"+
		"<\2\2\u0108B\3\2\2\2\u0109\u010a\7?\2\2\u010aD\3\2\2\2\u010b\u010c\7,"+
		"\2\2\u010c\u010d\7?\2\2\u010dF\3\2\2\2\u010e\u010f\7\61\2\2\u010f\u0110"+
		"\7?\2\2\u0110H\3\2\2\2\u0111\u0112\7\'\2\2\u0112\u0113\7?\2\2\u0113J\3"+
		"\2\2\2\u0114\u0115\7-\2\2\u0115\u0116\7?\2\2\u0116L\3\2\2\2\u0117\u0118"+
		"\7/\2\2\u0118\u0119\7?\2\2\u0119N\3\2\2\2\u011a\u011b\7>\2\2\u011b\u011c"+
		"\7>\2\2\u011c\u011d\7?\2\2\u011dP\3\2\2\2\u011e\u011f\7@\2\2\u011f\u0120"+
		"\7@\2\2\u0120\u0121\7?\2\2\u0121R\3\2\2\2\u0122\u0123\7(\2\2\u0123\u0124"+
		"\7?\2\2\u0124T\3\2\2\2\u0125\u0126\7`\2\2\u0126\u0127\7?\2\2\u0127V\3"+
		"\2\2\2\u0128\u0129\7~\2\2\u0129\u012a\7?\2\2\u012aX\3\2\2\2\u012b\u012c"+
		"\7=\2\2\u012cZ\3\2\2\2\u012d\u012e\7v\2\2\u012e\u012f\7{\2\2\u012f\u0130"+
		"\7r\2\2\u0130\u0131\7g\2\2\u0131\u0132\7f\2\2\u0132\u0133\7g\2\2\u0133"+
		"\u0134\7h\2\2\u0134\\\3\2\2\2\u0135\u0136\7x\2\2\u0136\u0137\7q\2\2\u0137"+
		"\u0138\7k\2\2\u0138\u0139\7f\2\2\u0139^\3\2\2\2\u013a\u013b\7e\2\2\u013b"+
		"\u013c\7j\2\2\u013c\u013d\7c\2\2\u013d\u013e\7t\2\2\u013e`\3\2\2\2\u013f"+
		"\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142\7v\2\2\u0142b\3\2\2\2\u0143"+
		"\u0144\7}\2\2\u0144d\3\2\2\2\u0145\u0146\7\177\2\2\u0146f\3\2\2\2\u0147"+
		"\u0148\7u\2\2\u0148\u0149\7v\2\2\u0149\u014a\7t\2\2\u014a\u014b\7w\2\2"+
		"\u014b\u014c\7e\2\2\u014c\u014d\7v\2\2\u014dh\3\2\2\2\u014e\u014f\7w\2"+
		"\2\u014f\u0150\7p\2\2\u0150\u0151\7k\2\2\u0151\u0152\7q\2\2\u0152\u0153"+
		"\7p\2\2\u0153j\3\2\2\2\u0154\u0155\7\60\2\2\u0155\u0156\7\60\2\2\u0156"+
		"\u0157\7\60\2\2\u0157l\3\2\2\2\u0158\u0159\7k\2\2\u0159\u015a\7h\2\2\u015a"+
		"n\3\2\2\2\u015b\u015c\7g\2\2\u015c\u015d\7n\2\2\u015d\u015e\7u\2\2\u015e"+
		"\u015f\7g\2\2\u015fp\3\2\2\2\u0160\u0161\7y\2\2\u0161\u0162\7j\2\2\u0162"+
		"\u0163\7k\2\2\u0163\u0164\7n\2\2\u0164\u0165\7g\2\2\u0165r\3\2\2\2\u0166"+
		"\u0167\7h\2\2\u0167\u0168\7q\2\2\u0168\u0169\7t\2\2\u0169t\3\2\2\2\u016a"+
		"\u016b\7e\2\2\u016b\u016c\7q\2\2\u016c\u016d\7p\2\2\u016d\u016e\7v\2\2"+
		"\u016e\u016f\7k\2\2\u016f\u0170\7p\2\2\u0170\u0171\7w\2\2\u0171\u0172"+
		"\7g\2\2\u0172v\3\2\2\2\u0173\u0174\7d\2\2\u0174\u0175\7t\2\2\u0175\u0176"+
		"\7g\2\2\u0176\u0177\7c\2\2\u0177\u0178\7m\2\2\u0178x\3\2\2\2\u0179\u017a"+
		"\7t\2\2\u017a\u017b\7g\2\2\u017b\u017c\7v\2\2\u017c\u017d\7w\2\2\u017d"+
		"\u017e\7t\2\2\u017e\u017f\7p\2\2\u017fz\3\2\2\2\u0180\u0185\5}?\2\u0181"+
		"\u0184\5}?\2\u0182\u0184\5\u0081A\2\u0183\u0181\3\2\2\2\u0183\u0182\3"+
		"\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"|\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\5\177@\2\u0189~\3\2\2\2\u018a"+
		"\u018b\t\2\2\2\u018b\u0080\3\2\2\2\u018c\u018d\t\3\2\2\u018d\u0082\3\2"+
		"\2\2\u018e\u018f\5\u0095K\2\u018f\u0190\5\u0095K\2\u0190\u0191\5\u0095"+
		"K\2\u0191\u0192\5\u0095K\2\u0192\u0084\3\2\2\2\u0193\u0196\5\u0087D\2"+
		"\u0194\u0196\5\u009bN\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0086\3\2\2\2\u0197\u019b\5\u0089E\2\u0198\u019b\5\u008bF\2\u0199\u019b"+
		"\5\u008dG\2\u019a\u0197\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2"+
		"\2\u019b\u0088\3\2\2\2\u019c\u01a0\5\u0091I\2\u019d\u019f\5\u0081A\2\u019e"+
		"\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u008a\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a7\7\62\2\2\u01a4"+
		"\u01a6\5\u0093J\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u008c\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ac\5\u008fH\2\u01ab\u01ad\5\u0095K\2\u01ac\u01ab\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u008e\3\2\2\2\u01b0"+
		"\u01b1\7\62\2\2\u01b1\u01b2\t\4\2\2\u01b2\u0090\3\2\2\2\u01b3\u01b4\t"+
		"\5\2\2\u01b4\u0092\3\2\2\2\u01b5\u01b6\t\6\2\2\u01b6\u0094\3\2\2\2\u01b7"+
		"\u01b8\t\7\2\2\u01b8\u0096\3\2\2\2\u01b9\u01ba\t\b\2\2\u01ba\u0098\3\2"+
		"\2\2\u01bb\u01bd\5\u0081A\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u009a\3\2\2\2\u01c0\u01c1\7)"+
		"\2\2\u01c1\u01c2\5\u009dO\2\u01c2\u01c3\7)\2\2\u01c3\u009c\3\2\2\2\u01c4"+
		"\u01c6\5\u009fP\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u009e\3\2\2\2\u01c9\u01cc\n\t\2\2\u01ca"+
		"\u01cc\5\u00a1Q\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u00a0"+
		"\3\2\2\2\u01cd\u01d1\5\u00a3R\2\u01ce\u01d1\5\u00a5S\2\u01cf\u01d1\5\u00a7"+
		"T\2\u01d0\u01cd\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1"+
		"\u00a2\3\2\2\2\u01d2\u01d3\7^\2\2\u01d3\u01d4\t\n\2\2\u01d4\u00a4\3\2"+
		"\2\2\u01d5\u01d6\7^\2\2\u01d6\u01e1\5\u0093J\2\u01d7\u01d8\7^\2\2\u01d8"+
		"\u01d9\5\u0093J\2\u01d9\u01da\5\u0093J\2\u01da\u01e1\3\2\2\2\u01db\u01dc"+
		"\7^\2\2\u01dc\u01dd\5\u0093J\2\u01dd\u01de\5\u0093J\2\u01de\u01df\5\u0093"+
		"J\2\u01df\u01e1\3\2\2\2\u01e0\u01d5\3\2\2\2\u01e0\u01d7\3\2\2\2\u01e0"+
		"\u01db\3\2\2\2\u01e1\u00a6\3\2\2\2\u01e2\u01e3\7^\2\2\u01e3\u01e4\7z\2"+
		"\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\5\u0095K\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u00a8\3\2"+
		"\2\2\u01ea\u01ec\7$\2\2\u01eb\u01ed\5\u00abV\2\u01ec\u01eb\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7$\2\2\u01ef\u00aa\3\2"+
		"\2\2\u01f0\u01f2\5\u00adW\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u00ac\3\2\2\2\u01f5\u01f8\n\13"+
		"\2\2\u01f6\u01f8\5\u00a1Q\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8"+
		"\u00ae\3\2\2\2\u01f9\u01fd\7%\2\2\u01fa\u01fc\n\f\2\2\u01fb\u01fa\3\2"+
		"\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0203\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0204\t\f\2\2\u0201\u0202\7\17"+
		"\2\2\u0202\u0204\7\f\2\2\u0203\u0200\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0206\bX\2\2\u0206\u00b0\3\2\2\2\u0207\u0209\t\r"+
		"\2\2\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\bY\2\2\u020d\u00b2\3\2"+
		"\2\2\u020e\u0210\7\17\2\2\u020f\u0211\7\f\2\2\u0210\u020f\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0214\7\f\2\2\u0213\u020e\3\2"+
		"\2\2\u0213\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\bZ\2\2\u0216"+
		"\u00b4\3\2\2\2\u0217\u0218\7\61\2\2\u0218\u0219\7,\2\2\u0219\u021d\3\2"+
		"\2\2\u021a\u021c\13\2\2\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021d\3\2"+
		"\2\2\u0220\u0221\7,\2\2\u0221\u0222\7\61\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\b[\2\2\u0224\u00b6\3\2\2\2\u0225\u0226\7\61\2\2\u0226\u0227\7\61"+
		"\2\2\u0227\u022b\3\2\2\2\u0228\u022a\n\f\2\2\u0229\u0228\3\2\2\2\u022a"+
		"\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2"+
		"\2\2\u022d\u022b\3\2\2\2\u022e\u022f\b\\\2\2\u022f\u00b8\3\2\2\2\32\2"+
		"\u0183\u0185\u0195\u019a\u01a0\u01a7\u01ae\u01be\u01c7\u01cb\u01d0\u01e0"+
		"\u01e8\u01ec\u01f3\u01f7\u01fd\u0203\u020a\u0210\u0213\u021d\u022b\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}