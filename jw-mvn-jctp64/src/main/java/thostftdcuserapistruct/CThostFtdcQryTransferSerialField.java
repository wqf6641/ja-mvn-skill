package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u8bf7\u6c42\u67e5\u8be2\u8f6c\u5e10\u6d41\u6c34<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:7028</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcQryTransferSerialField extends StructObject {
	public CThostFtdcQryTransferSerialField() {
		super();
	}
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u6295\u8d44\u8005\u5e10\u53f7<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u94f6\u884c\u7f16\u7801<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(2) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u5e01\u79cd\u4ee3\u7801<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(3) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 3);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcQryTransferSerialField(Pointer pointer) {
		super(pointer);
	}
}