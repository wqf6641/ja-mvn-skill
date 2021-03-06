package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u94f6\u884c\u8d44\u91d1\u8f6c\u671f\u8d27\u8bf7\u6c42\uff0cTradeCode=202001<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:157</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcTransferBankToFutureReqField extends StructObject {
	public CThostFtdcTransferBankToFutureReqField() {
		super();
	}
	/**
	 * \u671f\u8d27\u8d44\u91d1\u8d26\u6237<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(0) 
	public Pointer<Byte > FutureAccount() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u5bc6\u7801\u6807\u5fd7<br>
	 * C type : TThostFtdcFuturePwdFlagType
	 */
	@Field(1) 
	public byte FuturePwdFlag() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \u5bc6\u7801\u6807\u5fd7<br>
	 * C type : TThostFtdcFuturePwdFlagType
	 */
	@Field(1) 
	public CThostFtdcTransferBankToFutureReqField FuturePwdFlag(byte FuturePwdFlag) {
		this.io.setByteField(this, 1, FuturePwdFlag);
		return this;
	}
	/**
	 * \u5bc6\u7801<br>
	 * C type : TThostFtdcFutureAccPwdType
	 */
	@Array({17}) 
	@Field(2) 
	public Pointer<Byte > FutureAccPwd() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u8f6c\u8d26\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public double TradeAmt() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \u8f6c\u8d26\u91d1\u989d<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public CThostFtdcTransferBankToFutureReqField TradeAmt(double TradeAmt) {
		this.io.setDoubleField(this, 3, TradeAmt);
		return this;
	}
	/**
	 * \u5ba2\u6237\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public double CustFee() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \u5ba2\u6237\u624b\u7eed\u8d39<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public CThostFtdcTransferBankToFutureReqField CustFee(double CustFee) {
		this.io.setDoubleField(this, 4, CustFee);
		return this;
	}
	/**
	 * \u5e01\u79cd\uff1aRMB-\u4eba\u6c11\u5e01 USD-\u7f8e\u5706 HKD-\u6e2f\u5143<br>
	 * C type : TThostFtdcCurrencyCodeType
	 */
	@Array({4}) 
	@Field(5) 
	public Pointer<Byte > CurrencyCode() {
		return this.io.getPointerField(this, 5);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcTransferBankToFutureReqField(Pointer pointer) {
		super(pointer);
	}
}
