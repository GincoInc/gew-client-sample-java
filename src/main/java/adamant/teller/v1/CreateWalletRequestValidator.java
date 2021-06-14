// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/teller/v1/adamanttellerv1/teller_api.proto

package adamant.teller.v1;

/**
* Validates {@code CreateWalletRequest} protobuf objects.
*/
public class CreateWalletRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.teller.v1.CreateWalletRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.teller.v1.CreateWalletRequest.class)) return new CreateWalletRequestValidator();
		
		return null;
	}
		
	
		
		private final gincoinc.global.v1.Enum.Coin[] COIN__NOT_IN = new gincoinc.global.v1.Enum.Coin[]{
			gincoinc.global.v1.Enum.Coin.forNumber(0),
		};
	
		
		private final adamant.global.v1.Enum.WalletType[] WALLET_TYPE__NOT_IN = new adamant.global.v1.Enum.WalletType[]{
			adamant.global.v1.Enum.WalletType.forNumber(0),
			adamant.global.v1.Enum.WalletType.forNumber(2),
		};
	
		
		private final gincoinc.global.v1.Enum.AddressType[] ADDRESS_TYPE__NOT_IN = new gincoinc.global.v1.Enum.AddressType[]{
			gincoinc.global.v1.Enum.AddressType.forNumber(0),
		};
	
		
		com.google.re2j.Pattern DESTINATION_WALLET_ID__PATTERN = com.google.re2j.Pattern.compile("^$|^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
	
		
		com.google.re2j.Pattern INHERIT_WALLET_ID__PATTERN = com.google.re2j.Pattern.compile("^$|^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
	
	

	public void assertValid(adamant.teller.v1.CreateWalletRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.minLength(".adamant.teller.v1.CreateWalletRequest.wallet_name", proto.getWalletName(), 1);
			io.envoyproxy.pgv.StringValidation.maxLength(".adamant.teller.v1.CreateWalletRequest.wallet_name", proto.getWalletName(), 20);
	
			io.envoyproxy.pgv.EnumValidation.definedOnly(".adamant.teller.v1.CreateWalletRequest.coin", proto.getCoin());
			io.envoyproxy.pgv.CollectiveValidation.notIn(".adamant.teller.v1.CreateWalletRequest.coin", proto.getCoin(), COIN__NOT_IN);
	
			io.envoyproxy.pgv.EnumValidation.definedOnly(".adamant.teller.v1.CreateWalletRequest.wallet_type", proto.getWalletType());
			io.envoyproxy.pgv.CollectiveValidation.notIn(".adamant.teller.v1.CreateWalletRequest.wallet_type", proto.getWalletType(), WALLET_TYPE__NOT_IN);
	
			io.envoyproxy.pgv.EnumValidation.definedOnly(".adamant.teller.v1.CreateWalletRequest.address_type", proto.getAddressType());
			io.envoyproxy.pgv.CollectiveValidation.notIn(".adamant.teller.v1.CreateWalletRequest.address_type", proto.getAddressType(), ADDRESS_TYPE__NOT_IN);
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.teller.v1.CreateWalletRequest.destination_wallet_id", proto.getDestinationWalletId(), DESTINATION_WALLET_ID__PATTERN);
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.teller.v1.CreateWalletRequest.inherit_wallet_id", proto.getInheritWalletId(), INHERIT_WALLET_ID__PATTERN);
	
	}

}
