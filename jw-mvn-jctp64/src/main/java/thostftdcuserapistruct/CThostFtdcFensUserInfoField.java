package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * Fens\u7528\u6237\u4fe1\u606f<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:7596</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcFensUserInfoField extends StructObject {
	public CThostFtdcFensUserInfoField() {
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
	 * \u7528\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u767b\u5f55\u6a21\u5f0f<br>
	 * C type : TThostFtdcLoginModeType
	 */
	@Field(2) 
	public byte LoginMode() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \u767b\u5f55\u6a21\u5f0f<br>
	 * C type : TThostFtdcLoginModeType
	 */
	@Field(2) 
	public CThostFtdcFensUserInfoField LoginMode(byte LoginMode) {
		this.io.setByteField(this, 2, LoginMode);
		return this;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcFensUserInfoField(Pointer pointer) {
		super(pointer);
	}
}