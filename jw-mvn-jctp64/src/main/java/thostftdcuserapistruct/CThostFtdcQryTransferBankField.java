package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u67e5\u8be2\u8f6c\u5e10\u94f6\u884c<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:4137</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcQryTransferBankField extends StructObject {
	public CThostFtdcQryTransferBankField() {
		super();
	}
	/**
	 * \u94f6\u884c\u4ee3\u7801<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(0) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u94f6\u884c\u5206\u4e2d\u5fc3\u4ee3\u7801<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({5}) 
	@Field(1) 
	public Pointer<Byte > BankBrchID() {
		return this.io.getPointerField(this, 1);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcQryTransferBankField(Pointer pointer) {
		super(pointer);
	}
}