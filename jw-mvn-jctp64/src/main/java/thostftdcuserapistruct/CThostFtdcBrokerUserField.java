package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u7ecf\u7eaa\u516c\u53f8\u7528\u6237<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:893</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcBrokerUserField extends StructObject {
	public CThostFtdcBrokerUserField() {
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
	 * \u7528\u6237\u540d\u79f0<br>
	 * C type : TThostFtdcUserNameType
	 */
	@Array({81}) 
	@Field(2) 
	public Pointer<Byte > UserName() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u7528\u6237\u7c7b\u578b<br>
	 * C type : TThostFtdcUserTypeType
	 */
	@Field(3) 
	public byte UserType() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \u7528\u6237\u7c7b\u578b<br>
	 * C type : TThostFtdcUserTypeType
	 */
	@Field(3) 
	public CThostFtdcBrokerUserField UserType(byte UserType) {
		this.io.setByteField(this, 3, UserType);
		return this;
	}
	/**
	 * \u662f\u5426\u6d3b\u8dc3<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(4) 
	public int IsActive() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \u662f\u5426\u6d3b\u8dc3<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(4) 
	public CThostFtdcBrokerUserField IsActive(int IsActive) {
		this.io.setIntField(this, 4, IsActive);
		return this;
	}
	/**
	 * \u662f\u5426\u4f7f\u7528\u4ee4\u724c<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(5) 
	public int IsUsingOTP() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \u662f\u5426\u4f7f\u7528\u4ee4\u724c<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(5) 
	public CThostFtdcBrokerUserField IsUsingOTP(int IsUsingOTP) {
		this.io.setIntField(this, 5, IsUsingOTP);
		return this;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcBrokerUserField(Pointer pointer) {
		super(pointer);
	}
}