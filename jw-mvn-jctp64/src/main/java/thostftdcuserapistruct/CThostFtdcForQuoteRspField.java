package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u53d1\u7ed9\u505a\u5e02\u5546\u7684\u8be2\u4ef7\u8bf7\u6c42<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:3638</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcForQuoteRspField extends StructObject {
	public CThostFtdcForQuoteRspField() {
		super();
	}
	/**
	 * \u4ea4\u6613\u65e5<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(1) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u8be2\u4ef7\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(2) 
	public Pointer<Byte > ForQuoteSysID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u8be2\u4ef7\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ForQuoteTime() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u4e1a\u52a1\u65e5\u671f<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(4) 
	public Pointer<Byte > ActionDay() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 5);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcForQuoteRspField(Pointer pointer) {
		super(pointer);
	}
}
