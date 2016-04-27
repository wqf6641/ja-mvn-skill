package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u4f1a\u5458\u7f16\u7801\u548c\u7ecf\u7eaa\u516c\u53f8\u7f16\u7801\u5bf9\u7167\u8868<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:501</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcPartBrokerField extends StructObject {
	public CThostFtdcPartBrokerField() {
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
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u4f1a\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u662f\u5426\u6d3b\u8dc3<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(3) 
	public int IsActive() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \u662f\u5426\u6d3b\u8dc3<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(3) 
	public CThostFtdcPartBrokerField IsActive(int IsActive) {
		this.io.setIntField(this, 3, IsActive);
		return this;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcPartBrokerField(Pointer pointer) {
		super(pointer);
	}
}